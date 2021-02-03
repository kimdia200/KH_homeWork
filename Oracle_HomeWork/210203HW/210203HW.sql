--chun 계정에서 실행--

--1. 학생이름과 주소지를 표시하시오. 단, 출력 헤더는 "학생 이름", "주소지"로 하고,
--정렬은 이름으로 오름차순 표시하도록 한다.

select student_name "학생 이름",
            student_address 주소지
from tb_student;

--2. 휴학중인 학생들의 이름과 주민번호를 나이가 적은 순서로 화면에 출력하시오.
select student_name, student_ssn
from tb_student s1
where absence_yn = 'Y'
order by extract(year from sysdate)-(substr(student_ssn,1,2)+decode(substr(student_ssn,8,1),'1',1901,'2',1901,2001));

--3. 주소지가 강원도나 경기도인 학생들 중 1900 년대 학번을 가진 학생들의 
--이름과 학번,주소를 이름의 오름차순으로 화면에 출력하시오. 
--단, 출력헤더에는 "학생이름","학번","거주지 주소" 가 출력되도록 한다.

select student_name 학생이름,
          student_no 학번,
          student_address "거주지 주소"
from tb_student
where student_no not like 'A%'
    and (student_address like '경기도%'
            or student_address like '강원도%');

--4. 현재 법학과 교수 중 가장 나이가 많은 사람부터 이름을 확인할 수 있는 SQL 문장을작성하시오.
--(법학과의 '학과코드'는 학과 테이블(TB_DEPARTMENT)을 조회해서 찾아내도록 하자)

select professor_name,
           professor_ssn
from tb_professor
where department_no = (
                                        select department_no
                                        from tb_department
                                        where department_name = '법학과'
                                     )
order by extract(year from sysdate)-(substr(professor_ssn,1,2)+decode(substr(professor_ssn,8,1),'1',1901,'2',1901,2001)) desc;

--5. 2004 년 2 학기에 'C3118100' 과목을 수강한 학생들의 학점을 조회하려고 한다.
--학점이 높은 학생부터 표시하고, 학점이 같으면 학번이 낮은 학생부터 표시하는 구문을작성해보시오.
select student_no,
          to_char(point,'0.00')
from tb_grade
where term_no=200402 and class_no = 'C3118100'
order by point desc;

--6. 학생 번호, 학생 이름, 학과 이름을 학생 이름으로 
--오름차순 정렬하여 출력하는 SQL문을 작성하시오.
select student_no, 
            student_name,
            (
             select department_name
             from tb_department d
             where d.department_no = e.department_no
             ) DEPARTMENT_NAME
from tb_student e;

--7. 춘 기술대학교의 과목 이름과 과목의 학과 이름을 출력하는 SQL 문장을 작성하시오.
select class_name,
           (
             select department_name
             from tb_department d
             where d.department_no = c.department_no
             ) DEPARTMENT_NAME
from tb_class c;

--8. 과목별 교수 이름을 찾으려고 한다.
--과목 이름과 교수 이름을 출력하는 SQL 문을 작성하시오
select c.class_name,
            p.professor_name
from tb_class c, tb_class_professor cp,tb_professor p
where c.class_no = cp.class_no and cp.professor_no = p.professor_no;

--9. 8 번의 결과 중 ‘인문사회’ 계열에 속한 과목의 교수 이름을 찾으려고 한다.
--이에 해당하는 과목 이름과 교수 이름을 출력하는 SQL 문을 작성하시오.
select c.class_name,
            p.professor_name
from tb_class c, tb_class_professor cp,tb_professor p,
            tb_department d
where c.class_no = cp.class_no and cp.professor_no = p.professor_no
            and p.department_no = d.department_no
            and d.category = '인문사회';


--10. ‘음악학과’ 학생들의 평점을 구하려고 한다.
--음악학과 학생들의 "학번", "학생 이름","전체 평점"을 출력하는 SQL 문장을 작성하시오.
--(단, 평점은 소수점 1 자리까지만 반올림하여 표시한다.)

select s.student_no,
           s.student_name,
           round(avg(g.point),1)
from tb_grade g, tb_student s, tb_department d
where g.student_no = s.student_no 
        and s.department_no = d.department_no
        and d.department_name = '음악학과'
group by s.student_no, s.student_name
order by s.student_no;


--11. 학번이 A313047 인 학생이 학교에 나오고 있지 않다. 
--지도 교수에게 내용을 전달하기 위한 학과 이름, 학생 이름과 지도 교수 이름이 필요하다.
--이때 사용할 SQL 문을작성하시오.
--단, 출력헤더는 "학과이름", "학생이름", "지도교수이름"으로 출력되도록 한다.
select 
            (
            select department_name
            from tb_department
            where department_no=s.department_no
            ) 학과이름,
            s.student_name 학생이름,
            (
            select professor_name
            from tb_professor
            where s.coach_professor_no = professor_no
            ) 지도교수이름
from tb_student s
where s.student_no = 'A313047';


--12. 2007 년도에 '인간관계론' 과목을 수강한 학생을 찾아
--학생이름과 수강학기를 표시하는 SQL 문장을 작성하시오.
select 
            (
            select student_name
            from tb_student
            where g.student_no = student_no
            ) STUDENT_NAME, 
            g.term_no
from tb_grade g , tb_class c
where g.class_no = c.class_no
    and g.term_no like '2007%'
    and c.class_name = '인간관계론';


--13. 예체능 계열 과목 중 과목 담당교수를 한 명도 배정받지 못한 과목을 찾아
--그 과목 이름과 학과 이름을 출력하는 SQL 문장을 작성하시오.

select c.class_name, d.department_name
from tb_class c, tb_department d, tb_class_professor cp
where c.department_no = d.department_no
    and c.class_no = cp.class_no(+)
    and d.category = '예체능'
    and cp.professor_no is null;


--14. 춘 기술대학교 서반아어학과 학생들의 지도교수를 게시하고자 한다.
--학생이름과 지도교수 이름을 찾고 만일 지도 교수가 없는 학생일 경우
--"지도교수 미지정"으로 표시하도록 하는 SQL 문을 작성하시오.
--단, 출력헤더는 "학생이름", "지도교수"로 표시하며 고학번 학생이 먼저 표시되도록 한다.

select
          s.student_name 학생이름,
          nvl((
            select p.professor_name
            from tb_professor p
            where p.professor_no = s.coach_professor_no            
          ),'지도교수 미지정') 지도교수
from tb_student s, tb_department d
where s.department_no = d.department_no
    and d.department_name = '서반아어학과'
order by s.student_no;

--15. 휴학생이 아닌 학생 중 평점이 4.0 이상인 학생을 찾아 
--그 학생의 학번, 이름, 학과이름, 평점을 출력하는 SQL 문을 작성하시오.
--(동명이인 있어서 조심)

select s.student_name, avg(g.point)
from tb_student s , tb_grade g
where s.student_no = g.student_no(+)
    and s.absence_yn = 'N'
group by s.student_no,s.student_name
having avg(g.point) >= 4.0;

--16. 환경조경학과 전공과목들의 과목 별 평점을 파악할 수 있는 SQL 문을 작성하시오.
select c.class_no, c.class_name, avg(g.point)
from tb_class c, tb_department d, tb_grade g
where c.department_no = d.department_no
    and c.class_no = g.class_no
    and c.class_type like '전공%'
    and d.department_name = '환경조경학과'
group by c.class_no, c.class_name
order by c.class_no;


--17. 춘 기술대학교에 다니고 있는 최경희 학생과 
--같은 과 학생들의 이름과 주소를 출력하는SQL 문을 작성하시오.

select student_name, student_address
from tb_student
where department_no = (
                                        select department_no
                                        from tb_student
                                        where student_name = '최경희'
                                     );

--18. 국어국문학과에서 총 평점이 가장 높은 학생의 이름과 학번을 표시하는 SQL 문을작성하시오.
select *
from (
            select s.student_name, s.student_no
            from tb_student s, tb_department d, tb_grade g
            where s.department_no = d.department_no
                and s.student_no = g.student_no
                and d.department_name = '국어국문학과'
            group by s.student_name, s.student_no
            order by avg(g.point) desc
        )
where rownum = 1;


--19. 춘 기술대학교의 "환경조경학과"가 속한 같은 계열 학과들의 학과 별 전공과목 평점을
--파악하기 위한 적절한 SQL 문을 찾아내시오.
--단, 출력헤더는 "계열 학과명","전공평점"으로 표시되도록 하고,
--평점은 소수점 한 자리까지만 반올림하여 표시되도록 한다.

select d.department_name, round(avg(g.point),1)
from tb_department d, tb_class c , tb_grade g
where d.category = (
                            select category
                            from tb_department
                            where department_name = '환경조경학과'
                            )
    and d.department_no = c.department_no
    and c.class_no = g.class_no
group by d.department_name;






























