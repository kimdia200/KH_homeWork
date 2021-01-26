-- 문제 1. 테이블에서 description 컬럼에 99.99% 라는 글자가 들어있는 행만 추출하세요.

create table tbl_escape_watch(
	watchname   varchar2(40)
	,description    varchar2(200)
);
--drop table tbl_escape_watch;
insert into tbl_escape_watch values('금시계', '순금 99.99% 함유 고급시계');
insert into tbl_escape_watch values('은시계', '고객 만족도 99.99점를 획득한 고급시계');
commit;
select * from tbl_escape_watch;
    
--문제1 답안.
select *
from tbl_escape_watch
where description like '%99.99\%%' ESCAPE '\';
    
    
-- 문제2. 파일경로를 제외하고 파일명만 아래와 같이 출력하세요.
create table tbl_files
(fileno number(3)
,filepath varchar2(500)
);

insert into tbl_files values(1, 'c:\abc\deft\salesinfo.xls');
insert into tbl_files values(2, 'c:\music.mp3');
insert into tbl_files values(3, 'c:\documents\resume.hwp');

commit;
select * 
from tbl_files;

--문제2 답안
select fileno, substr(filepath, instr(filepath,'\',-1)+1)
from tbl_files;
/*
substr(filepath, 어디부터 시작할지)

어디부터 시작할지 index

instr('c:\documents\resume.hwp', '\', -1, 1)
*/




