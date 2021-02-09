--kh에서

--@실습문제 : 
--emp_copy에서 사원을 삭제할 경우, emp_copy_del 테이블로 데이터를 이전시키는 trigger를 생성
--quit_date에 현재날짜를 기록할 것
drop table emp_copy_del;
create table  emp_copy_del
as
select E.*
from emp_copy E
where 1=2; --모양,형식만 따감

--drop trigger emp_copy_del_log;
--트리거 생성
create or replace trigger emp_copy_del_log
    before
    delete on emp_copy
    for each row
    
begin
    insert into emp_copy_del
    values (:old.emp_id, :old.emp_name, :old.emp_no, :old.email, :old.phone, :old.dept_code, :old.job_code,:old.sal_level,:old.salary,
    :old.bonus, :old.manager_id, :old.hire_date, sysdate, 'Y');
    --이걸 한줄로 줄이는 방법 찾아보기
end;
/

commit;
rollback;

delete from emp_copy
where emp_id = '201';

select * from emp_copy;
select * from emp_copy_del;

desc emp_copy;