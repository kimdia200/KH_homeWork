--1. 계열 정보를 저장할 카테고리 테이블을 만들려고 한다.
--다음과 같은 테이블을 작성하시오

create table tb_category(
    name varchar2(10),
    use_yn char(1) default 'Y'
);

--2. 과목 구분을 저장할 테이블을 만들려고 한다. 다음과 같은 테이블을 작성하시오
create table tb_class_type(
    no varchar2(5),
    name varchar2(10),
    CONSTRAINT pk_tb_class_type_no primary key(no)
);

--3. TB_CATAGORY 테이블의 NAME 컬럼에 PRIMARY KEY 를 생성하시오.
--(KEY 이름을 생성하지 않아도 무방함.
--만일 KEY 이를 지정하고자 한다면 이름은 본인이 알아서 적당한 이름을 사용한다.)
alter table tb_category
add constraint pk_tb_category_name primary key (name);

--제약조건 검사
select constraint_name,
            uc.table_name,
            ucc.column_name,
            uc.constraint_type,
            uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_CATEGORY';

--4. TB_CLASS_TYPE 테이블의 NAME컬럼에 null값이 들어가지 않도록 속성을 변경
alter table tb_class_type
modify name not null;

--제약조건 검사
select constraint_name,
            uc.table_name,
            ucc.column_name,
            uc.constraint_type,
            uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_CLASS_TYPE';


--5. 두 테이블에서 컬럼 명이 NO 인 것은 기존 타입을 유지하면서 크기는 10 으로,
--컬럼명이 NAME 인 것은 마찬가지로 기존 타입을 유지하면서 크기 20 으로 변경하시오.
select table_name,column_name, data_type
from all_tab_columns
where table_name in ( 'TB_CATEGORY', 'TB_CLASS_TYPE');

alter table tb_category
modify name varchar2(20);
alter table tb_class_type
modify name varchar2(20);
alter table tb_class_type
modify no varchar2(10);


--6. 두 테이블의 NO 컬럼과 NAME 컬럼의 이름을 각 각 TB_ 를 제외한
--테이블 이름이 앞에 붙은 형태로 변경한다.
alter table tb_category
rename column name to category_name;
alter table tb_class_type
rename column name to class_type_name;
alter table tb_class_type
rename column no to class_type_no;


--7. TB_CATEGORY 테이블과 TB_CLASS_TYPE 테이블의
--PRIMARY KEY 이름을 다음과 같이 변경하시오.
--Primary Key 의 이름은 "PK_ + 컬럼이름"으로 지정하시오. (ex. PK_CATEGORY_NAME )

--tb_category
alter table tb_category
drop constraint  pk_tb_category_name;

--제약조건 검사
select constraint_name,
            uc.table_name,
            ucc.column_name,
            uc.constraint_type,
            uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_CATEGORY';

alter table tb_category
add constraint pk_category_name primary key(category_name);


--tb_class_type
alter table tb_class_type
drop constraint  pk_tb_class_type_no;

--제약조건 검사
select constraint_name,
            uc.table_name,
            ucc.column_name,
            uc.constraint_type,
            uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_CLASS_TYPE';

alter table tb_class_type
add constraint pk_class_type_no primary key(class_type_no);


--8. 다음과 같은 INSERT 문을 수행한다.
INSERT INTO TB_CATEGORY VALUES ('공학','Y');
INSERT INTO TB_CATEGORY VALUES ('자연과학','Y');
INSERT INTO TB_CATEGORY VALUES ('의학','Y');
INSERT INTO TB_CATEGORY VALUES ('예체능','Y');
INSERT INTO TB_CATEGORY VALUES ('인문사회','Y');
COMMIT; 

--9.TB_DEPARTMENT 의 CATEGORY 컬럼이 TB_CATEGORY 테이블의 CATEGORY_NAME 컬럼을
--부모값으로 참조하도록 FOREIGN KEY 를 지정하시오.
--이 때 KEY 이름은 FK_테이블이름_컬럼이름으로 지정한다. (ex. FK_DEPARTMENT_CATEGORY )

alter table tb_department
    add constraint fk_department_category foreign key(category)
        references tb_category(category_name);

--제약조건 검사
select constraint_name,
            uc.table_name,
            ucc.column_name,
            uc.constraint_type,
            uc.search_condition
from user_constraints uc
    join user_cons_columns ucc
        using(constraint_name)
where uc.table_name = 'TB_DEPARTMENT';


--10. 춘 기술대학교 학생들의 정보만이 포함되어 있는 학생일반정보 VIEW 를 만들고자 한다.
--아래 내용을 참고하여 적절한 SQL 문을 작성하시오.
--뷰 이름
--VW_학생일반정보
--컬럼
--학번
--학생이름
--주소

select student_no, student_name, student_address
from tb_student;

create view VW_학생일반정보
as
select student_no, student_name, student_address
from tb_student;

select *
from user_views;

--11. 춘 기술대학교는 1 년에 두 번씩 학과별로 학생과 지도교수가 지도 면담을 진행한다.
--이를 위해 사용할 학생이름, 학과이름, 담당교수이름 으로 구성되어 있는 VIEW 를 만드시오.
--이때 지도 교수가 없는 학생이 있을 수 있음을 고려하시오 
--(단, 이 VIEW 는 단순 SELECT 만을 할 경우 학과별로 정렬되어 화면에 보여지게 만드시오.)

create view vw_지도면담
as
select s.student_name 학생이름, 
            (
                select d.department_name
                from tb_department d
                where d.department_no = s.department_no
            ) 학과,
            nvl((
                select p.professor_name
                from tb_professor p
                where p.professor_no = s.coach_professor_no
            ),'지도교수없음') 담당교수이름
from tb_student s
order by 학과;

select *
from user_views;

select * 
from vw_지도면담;

--12. 모든 학과의 학과별 학생 수를 확인할 수 있도록 적절한 VIEW 를 작성해 보자.
create view vw_학과별학생수
as
select 
            (
                select d.department_name
                from tb_department d
                where d.department_no = s.department_no
            ) department_name,
            count(*) count
from tb_student s
group by s.department_no;

select *
from user_views;

select * 
from vw_학과별학생수;

--13. 위에서 생성한 학생일반정보 View 를 통해서 학번이 A213046 인 학생의 이름을 
--본인 이름으로 변경하는 SQL 문을 작성하시오.

select *
from vw_학생일반정보;

update vw_학생일반정보
set student_name = '김윤수'
where student_no = 'A213046';


--14. 13 번에서와 같이 VIEW 를 통해서 데이터가 변경될 수 있는 상황을 막으려면
--VIEW 를 어떻게 생성해야 하는지 작성하시오.

create view VW_학생일반정보
as
select student_no, student_name, student_address
from tb_student
with read only;


--15. 춘 기술대학교는 매년 수강신청 기간만 되면 특정 인기 과목들에 수강 신청이 몰려문제가 되고 있다.
--최근 3 년을 기준으로 수강인원이 가장 많았던 3 과목을 찾는 구문을 작성해보시오.
select *
from (
        select c.class_name, count(*)
        from tb_grade g join tb_class c on g.class_no = c.class_no
        where substr(term_no,1,4) in (
                                                        select *
                                                        from (
                                                                    select distinct(substr(term_no,1,4))
                                                                    from tb_grade
                                                                    order by 1 desc
                                                                 )
                                                        where rownum between 1 and 3
                                                     )
        group by c.class_name
        order by 2 desc
        )
where rownum between 1 and 3;



commit;

