--@실습 문제 : tb_number테이블에 난수(0~999) 100개를 저장하는 익명블럭을 생성하세요
--실행시마다 생성된 모든 난수의 합을 콘솔에 출력할 것.

drop sequence seq_tb_number_no;
drop table tb_number;
--채번할 시퀀스 생성
create sequence seq_tb_number_no
    start with 1
    increment by 1
    nomaxvalue
    nominvalue
    nocycle
    cache 100;

create table tb_number(
    id number, --pk sequence객체로 부터 채번
    num number, --난수
    reg_date date default sysdate,
    constraint pk_tb_number_id primary key(id)
);
commit;
rollback;
declare
    rnd number;
    summ number:=0;
begin
    for n in 1..100 loop
        rnd := trunc(dbms_random.value(0,1000));
        summ := summ+rnd;
        insert into tb_number (id, num)
        values (seq_tb_number_no.nextval, rnd);
        dbms_output.put_line(summ);
        
    end loop;
    
end;
/

select sum(num)
from tb_number;

select *
from tb_number;

desc tb_number;