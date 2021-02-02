--@실습문제
--
--1. 2020년 12월 25일이 무슨 요일인지 조회하시오.
select to_char(to_date('2020/12/25','yyyy/mm/dd'),'day')
from dual;


--2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원들의 
--사원명, 주민번호, 부서명, 직급명을 조회하시오.
select e.emp_name 사원명,
          e.emp_no 주민번호,
          d.dept_title 부서명,
          j.job_name 직급명
from employee e, department d, job j
where e.dept_code = d.dept_id(+)
    and e.job_code = j.job_code(+)
    and substr(e.emp_no,1,2) BETWEEN '70' and '79'
    and substr(e.emp_no,8,1) in ('2','4') ;


--3. 가장 나이가 적은 직원의 사번, 사원명, 나이, 부서명, 직급명을 조회하시오.
select e.emp_id 사번, e.emp_name 사원명,
          extract(year from sysdate)-
            case
               when substr(emp_no,8,1) in ('1','2') then substr(emp_no,1,2)+1900
               else substr(emp_no,1,2)+2000
               end+1 나이,
          d.dept_title 부서명수정,
          j.job_name 직급명, e.emp_no
from employee e, department d , job j
where e.dept_code = d.dept_id
        and e.job_code = j.job_code
        and e.emp_id = (
                                select emp_id
                                from employee
                                where extract(year from sysdate)-
                                    case
                                    when substr(emp_no,8,1) in ('1','2') then substr(emp_no,1,2)+1900
                                    else substr(emp_no,1,2)+2000
                                    end+1 = (
                                                    select min(extract(year from sysdate)-
                                                        case
                                                        when substr(emp_no,8,1) in ('1','2') then substr(emp_no,1,2)+1900
                                                        else substr(emp_no,1,2)+2000
                                                        end+1)
                                                    from employee
                                                    )
                                );
--3번 강사님 해답
--최소나이(min 이용)를 구하는 한줄짜리 테이블을 만들고 그 한줄을 cross조인한뒤 min값과 현재나이가 같으면 출력하셨음

--4. 이름에 '형'자가 들어가는 직원들의 사번, 사원명, 부서명을 조회하시오.
select emp_id 사번, emp_name 사원명, dept_title 부서명
from employee e, department d
where e.dept_code = d.dept_id
        and e.emp_name like '%형%';


--5. 해외영업팀에 근무하는 사원명, 직급명, 부서코드, 부서명을 조회하시오.
select e.emp_name 사원명, j.job_name 직급명, e.dept_code 부서코드, d.dept_title 부서명
from employee e, job j , department d
where e.job_code = j.job_code(+) and e.dept_code = d.dept_id(+)
    and d.dept_title like '해외영업%';


--6. 보너스포인트를 받는 직원들의 사원명, 보너스포인트, 부서명, 근무지역명을 조회하시오.
select e.emp_name 사원명,
          e.bonus 보너스포인트,
          d.dept_title 부서명,
          l.local_name 근무지역명
from employee e, department d, location l
where e.dept_code = d.dept_id(+)
    and d.location_id = l.local_code(+)
    and e.bonus is not null;


--7. 부서코드가 D2인 직원들의 사원명, 직급명, 부서명, 근무지역명을 조회하시오.
select e.emp_name 사원명,
          j.job_name 직급명,
          d.dept_title 부서명,
          l.local_name 근무지역명
from employee e, department d, location l,  job j
where e.dept_code = d.dept_id(+)
    and e.job_code = j.job_code(+)
    and d.location_id = l.local_code(+)
    and e.dept_code = 'D2';


--8. 급여등급테이블의 등급별 최대급여(MAX_SAL)보다 많이 받는 직원들의 사원명, 직급명, 급여, 연봉을 조회하시오.
--(사원테이블과 급여등급테이블을 SAL_LEVEL컬럼기준으로 동등 조인할 것)
select e.emp_name 사원명,
          e.dept_code 직급명수정,
          to_char(e.salary,'fml9,999,999,999') 급여,
          to_char((e.salary+(e.salary*nvl(e.bonus,0)))*12,'fml9,999,999,999') 연봉
from employee e, sal_grade s
where e.sal_level = s.sal_level
    and e.salary > s.max_sal;


--9. 한국(KO)과 일본(JP)에 근무하는 직원들의 
--사원명, 부서명, 지역명, 국가명을 조회하시오.
select e.emp_name 사원명,
          d.dept_title 부서명,
          l.local_name 지역명,
          n.national_name 국가명
from employee e, department d, location l, nation n
where e.dept_code = d.dept_id(+)
    and d.location_id = l.local_code(+)
    and l.national_code = n.national_code(+)
    and n.national_name in ('한국','일본');


--10. 같은 부서에 근무하는 직원들의 사원명, 부서코드, 동료이름을 조회하시오.
--self join 사용
select e1.emp_name 사원명,
          e1.dept_code 부서코드,
          e2.emp_name 동료이름
from employee e1 join employee e2 on e1.dept_code = e2.dept_code
where e1.emp_name != e2.emp_name
order by e1.emp_name;


--11. 보너스포인트가 없는 직원들 중에서 직급이 차장과 사원인 직원들의 사원명, 직급명, 급여를 조회하시오.
select e.emp_name 사원명,
         j.job_name 직급명,
          e.salary+(e.salary*nvl(e.bonus,0)) 급여
from employee e, job j
where e.job_code = j.job_code(+)
    and e.bonus is null
    and j.job_name in ('차장', '사원');


--12. 재직중인 직원과 퇴사한 직원의 수를 조회하시오.
select sum(decode(quit_yn,'N',1,0)) "재직중인 직원",
           sum(decode(quit_yn,'Y',1,0)) "퇴사한 직원"
from employee;