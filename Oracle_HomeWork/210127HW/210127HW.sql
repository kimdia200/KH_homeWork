--1. 학과테이블에서 계열별 정원의 평균을 조회(정원 내림차순 정렬)
select category 계열,
        trunc(avg(capacity)) "정원의 평균"
from tb_department
group by category
order by "정원의 평균";



--2. 휴학생을 제외하고, 학과별로 학생수를 조회(학과별 인원수 내림차순)
select department_no 학과,
        count(*)
from tb_student
where absence_yn = 'N'
group by department_no
order by 학과 desc;


--3. 과목별 지정된 교수가 2명이상인 과목번호와 교수인원수를 조회
select class_no "과목",
        count(*) "교수 인원수"
from tb_class_professor 
group by class_no
having count(*)>=2
order by 과목;



--4. 학과별로 과목을 구분했을때, 과목구분이 "전공선택"에 한하여 과목수가 10개 이상인 행의 학과번호, 과목구분(class_type), 과목수를 조회(전공선택만 조회)
select department_no 학과번호, class_type 과목구분, count(class_type) 과목수
from tb_class 
group by department_no, class_type
having class_type = '전공선택' and count(class_type)>=10
order by department_no;

select b.department_name 학과, class_type 과목구분, count(class_type) 과목수
from tb_class a inner join tb_department b on a.department_no = b.department_no
group by b.department_name, class_type
having class_type = '전공선택' and count(class_type)>=10
order by 학과;


---------------------------PDF 문제-----------------------------------------
-- 1. 영어영문학과(학과코드 002) 학생들의 학번과 이름, 입학년도를 입학년도 순으로 정렬하여 표시하는 SQL문작성
select student_no 학번, student_name 이름, entrance_date 입학년도
from tb_student
where department_no = '002'
order by entrance_date;

--2. 춘 기술대학교의 교수 중 이름이 세 글자가 아닌 교수가 한 명 있다고 한다. 그 교수의 이름과 주민번호를 화면에 출력하는 SQL문을 작성
select professor_name 교수명, professor_ssn 주민번호
from tb_professor
where professor_name not like '___'; --이름 세글자가 아닌사람은 두명인데?


--3. 춘 기술대학교의 남자 교수들의 이름과 나이를 출력하는 SQL문 작성
--단, 나이가 적은 사람에서 많은 사람 순서로 화면에 출력 되도록 하시오
--(교수중 2000년 이후 출생자는 없다)

select professor_name 교수이름,
        trunc(months_between(
            sysdate, 
            ('19'|| substr(professor_ssn,1,6))
        ) / 12) 만나이
from tb_professor
order by 만나이;

select *
from tb_professor
where professor_name = '제상철';

--4. 교수들의 이름 중 성을 제외한 이름만 출력하는 SQL문장을 작성하시오,
--출력 헤더는'이름'이 찍히도록한다 (성이 2자인 경우는 없다고 가정)
select substr(professor_name,2) 이름
from tb_professor;

--5. 춘 기술대학교의 재수생 입학자를 구하려고 한다. 어떻게 찾아낼 것인가?
--이때 19살에 입학하면 재수를 하지 않은 것으로 간주한다.

select student_no 학생명,
        extract(year from entrance_date)-
        case
        when substr(student_ssn,8,1) in ('1','2') then '19'||substr(student_ssn,1,2)
        else '20'||substr(student_ssn,1,2)
        end "입학당시 나이"
from tb_student
where extract(year from entrance_date)-
        case
        when substr(student_ssn,8,1) in ('1','2') then '19'||substr(student_ssn,1,2)
        else '20'||substr(student_ssn,1,2)
        end > 19;

--6. 2020년 크리스마스는 무슨 요일인가?
select to_char(TO_DATE('2020/12/25','yyyy/mm/dd'), 'day')
from dual;

--7.TO_DATE('99/10/11','YY/MM/DD'), TO_DATE('49/10/11','YY/MM/DD') 은 각각 몇 년 몇월 몇 일을 의미할까?
-- 또 TO_DATE('99/10/11','RR/MM/DD'), TO_DATE('49/10/11','RR/MM/DD') 은 각각 몇 년 몇 월 몇 일을 의미할까?
select EXTRACT(year from TO_DATE('99/10/11','YY/MM/DD')) || '년' ||
        EXTRACT(month from TO_DATE('99/10/11','YY/MM/DD')) || '월' ||
        EXTRACT(day from TO_DATE('99/10/11','YY/MM/DD')) || '일' "TO_DATE('99/10/11','YY/MM/DD')",
        
        EXTRACT(year from TO_DATE('49/10/11','YY/MM/DD')) || '년' ||
        EXTRACT(month from TO_DATE('49/10/11','YY/MM/DD')) || '월' ||
        EXTRACT(day from TO_DATE('49/10/11','YY/MM/DD')) || '일' "TO_DATE('49/10/11','YY/MM/DD')",
        
        EXTRACT(year from TO_DATE('99/10/11','RR/MM/DD')) || '년' ||
        EXTRACT(month from TO_DATE('99/10/11','RR/MM/DD')) || '월' ||
        EXTRACT(day from TO_DATE('99/10/11','RR/MM/DD')) || '일' "TO_DATE('99/10/11','RR/MM/DD')",
        
        EXTRACT(year from TO_DATE('49/10/11','RR/MM/DD')) || '년' ||
        EXTRACT(month from TO_DATE('49/10/11','RR/MM/DD')) || '월' ||
        EXTRACT(day from TO_DATE('49/10/11','RR/MM/DD')) || '일' "TO_DATE('49/10/11','RR/MM/DD')"

from dual;

--8.  춘 기술대학교의 2000 년도 이후 입학자들은 학번이 A 로 시작하게 되어있다.
-- 2000년도 이전 학번을 받은 학생들의 학번과 이름을 보여주는 SQL 문장을 작성하시오.
select student_no 학번, student_name 이름
from tb_student
where substr(student_no,1,1) != 'A';

--9.  학번이 A517178 인 한아름 학생의 학점 총 평점을 구하는 SQL 문을 작성하시오. 
--단,이때 출력 화면의 헤더는 "평점" 이라고 찍히게 하고, 
--점수는 반올림하여 소수점 이하 한 자리까지만 표시한다.
select student_no 학번, round(avg(point),1) 평점
from tb_grade
where student_no = 'A517178'
group by student_no;

--10. 학과별 학생수를 구하여 "학과번호", "학생수(명)" 의 형태로
--헤더를 만들어 결과값이 출력되도록 하시오.
select department_no 학과번호, count(*) "학생수(명)"
from tb_student
group by department_no
order by department_no;

--11. 지도 교수를 배정받지 못한 학생의 수는 몇 명 정도 되는 알아내는 SQL 문을작성하시오.
select sum(nvl2(coach_professor_no,0,1))
from tb_student;

select count(*)
from tb_student
where coach_professor_no is null;

--12. 학번이 A112113 인 김고운 학생의 년도 별 평점을 구하는 SQL 문을 작성하시오. 
--단,이때 출력 화면의 헤더는 "년도", "년도 별 평점" 이라고 찍히게 하고,
--점수는 반올림하여 소수점 이하 한 자리까지만 표시한다.
select substr(term_no,1,4) 년도, round(avg(point),1) "년도 별 평점"
from tb_grade
where student_no = 'A112113'
group by substr(term_no,1,4)
order by 년도;

--13. 학과 별 휴학생 수를 파악하고자 한다.
--학과 번호와 휴학생 수를 표시하는 SQL 문장을 작성하시오.
select department_no 학과, sum(decode(absence_yn,'Y',1,0)) "휴학생 수"
from tb_student
group by department_no
order by department_no;

--14. 춘 대학교에 다니는 동명이인 학생들의 이름을 찾고자 한다. 어떤 SQL 문장을 사용하면 가능하겠는가?
select student_name 동일이름, count(*) "동명인 수"
from tb_student
group by student_name
having count(*)>=2
order by student_name;

--15. 학번이 A112113 인 김고운 학생의 년도, 학기 별 평점과 년도 별 누적 평점 , 총평점을 구하는 SQL 문을 작성하시오.
--(단, 평점은 소수점 1 자리까지만 반올림하여 표시한다.)
select substr(term_no,1,4) 년도,
         substr(term_no,5,2) 학기,
        round(avg(point),1) 평점
from tb_grade
where student_no = 'A112113'
group by rollup(substr(term_no,1,4), substr(term_no,5,2))
order by 년도, 학기;






















