과제 제출 주소 : https://github.com/kimdia200/KH_classTime/tree/master/jdbc_workSpace/03_Properties_ExceptionHandling

##@실습문제
회원탈퇴(delete)시 탈퇴회원테이블MEMBER_DEL에 회원정보를 insert하는 trigger 생성한후,
메인메뉴에서 7.탈퇴회원조회 기능을 추가하세요.
(탈퇴회원 조회시에는 탈퇴일이 출력되야 함.)
탈퇴회원테이블 MEMBER_DEL
기존 MEMBER테이블에 DEL_DATE컬럼만 추가
* MEMBER_ID
* PASSWORD  
* MEMBER_NAME
* GENDER CK:M/F만 허용    
* AGE       
* EMAIL     
* PHONE     
* ADDRESS   
* HOBBY     
* ENROLL_DATE
* DEL_DATE DATE DEFAULT SYSDATE
    --member 삭제 테이블 생성
    --기존 컬럼에서 del_date컬럼 추가
    create table member_del
    as
    select member.*, sysdate del_date from member
    where 1=0;
    --drop table member_del;
    desc member_del;
