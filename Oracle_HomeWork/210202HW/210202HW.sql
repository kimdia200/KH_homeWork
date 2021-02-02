--<DQL종합실습문제> - 계정 KH
--@ 실습 문제
--문제1
--기술지원부에 속한 사람들의 사람의 이름,부서코드,급여를 출력하시오
select *
from (
            select emp_name 이름,
                        (
                            select dept_title
                            from department
                            where dept_id = e.dept_code
                        ) 부서코드,
                        salary 급여
            from employee e
        ) e
where e.부서코드 = '기술지원부';


--문제2
--기술지원부에 속한 사람들 중 가장 연봉이 높은 사람의 이름,부서코드,급여를 출력하시오
select e.이름,
          e.부서코드,
          e.급여
from (
            select emp_name 이름,
                        (
                            select dept_title
                            from department
                            where dept_id = e.dept_code
                        ) 부서코드,
                        salary 급여,
                        rank() over(partition by dept_code order by salary desc) 랭크
            from employee e
        ) e
where e.랭크 = 1;


--문제3
--매니저가 있는 사원중에 월급이 전체사원 평균을 넘고 
--사번,이름,매니저 이름, 월급을 구하시오. 
--    1. JOIN을 이용하시오
select e1.emp_id,
        e1.emp_name,
        e2.emp_name,
        e1.salary
from employee e1 join employee e2 on e1.manager_id = e2.emp_id
--inner join하면 manager_id가 null경우는 어차피 배제됨
where e1.salary > (
                             select avg(salary)
                             from employee
                             );
--    2. JOIN하지 않고, 스칼라상관쿼리(SELECT)를 이용하기
select emp_id,
        emp_name,
        (
            select emp_name
            from employee
            where emp_id = e.manager_id
        ),
        salary
from employee e
--inner join하면 manager_id가 null경우는 어차피 배제됨
where salary > (
                        select avg(salary)
                        from employee
                        )
    and e.manager_id is not null;



--문제4
--같은 직급의 평균급여보다 같거나 많은 급여를 받는 직원의 이름, 직급코드, 급여, 급여등급 조회
select emp_name, job_code, salary, sal_level
from employee e
where salary >= (
                            select avg(salary)
                            from employee
                            where job_code = e.job_code
                        );


--문제5
--부서별 평균 급여가 3000000 이상인 부서명, 평균 급여 조회
--단, 평균 급여는 소수점 버림, 부서명이 없는 경우 '인턴'처리
select nvl((
                select dept_title
                from department
                where dept_id = e.dept_code
            ),'인턴') 부서코드,
          trunc(avg(e.salary)) 평균급여
from employee e
group by e.dept_code
having trunc(avg(e.salary))>=3000000;

select 
        nvl((
            select dept_title
            from department
            where dept_id = e.부서코드
        ),'인턴'),
        e.평균급여
from (
        select nvl(e.dept_code,'인턴') 부서코드,
                  trunc(avg(e.salary)) 평균급여
        from employee e
        group by nvl(e.dept_code,'인턴')
        having trunc(avg(e.salary))>=3000000
        ) e;

--문제6
--직급의 연봉 평균보다 적게 받는 여자사원의
--사원명,직급명,부서명,연봉을 이름 오름차순으로 조회하시오
--연봉 계산 => (급여+(급여*보너스))*12    
select emp_name 사원명,
           (
            select job_name
            from job
            where job_code = e.job_code
           ) 직급명,
           (
            select dept_title
            from department
            where dept_id = e.dept_code
           ) 부서명,
           (salary+(salary*nvl(bonus,0)))*12
from employee e join (
                                    select job_code 직급,
                                              avg((salary+(salary*nvl(bonus,0)))*12) 직급별평균연봉
                                    from employee
                                    group by job_code
                                    )ee on e.job_code = ee.직급
where (salary+(salary*nvl(bonus,0)))*12 < ee.직급별평균연봉;
           
        


---문제7
----다음 도서목록테이블을 생성하고, 공저인 도서만 출력하세요.
create table tbl_books (
book_title  varchar2(50)
,author     varchar2(50)
,loyalty     number(5)
);
insert into tbl_books values ('반지나라 해리포터', '박나라', 200);
insert into tbl_books values ('대화가 필요해', '선동일', 500);
insert into tbl_books values ('나무', '임시환', 300);
insert into tbl_books values ('별의 하루', '송종기', 200);
insert into tbl_books values ('별의 하루', '윤은해', 400);
insert into tbl_books values ('개미', '장쯔위', 100);
insert into tbl_books values ('아지랑이 피우기', '이오리', 200);
insert into tbl_books values ('아지랑이 피우기', '전지연', 100);
insert into tbl_books values ('삼국지', '노옹철', 200);

select *
from tbl_books e
where (
            select count(*)
            from tbl_books
            where book_title = e.book_title
            ) >= 2;