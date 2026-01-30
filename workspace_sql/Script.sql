SELECT *
FROM emp;

SELECT empno, ename, deptno
FROM emp;

SELECT sal,
       ename,
       123,
       '문자eng123'
FROM emp;

SELECT deptno
FROM emp;
SELECT DISTINCT deptno
FROM emp;
SELECT DISTINCT job
FROM emp;

SELECT ename, sal, sal * 12 + comm, comm
FROM EMP;
SELECT ename, sal, sal * 12 + comm AS "ann sal", comm
FROM EMP;
SELECT ename, sal, sal * 12 + comm AS annsal, comm
FROM EMP;
SELECT ename, sal, sal * 12 + comm annsal, comm
FROM EMP;
SELECT ename name
FROM emp;
SELECT ename as name
FROM emp;
SELECT ename as 이름
FROM emp;

SELECT *
FROM emp
ORDER BY sal;
SELECT *
FROM emp
ORDER BY sal asc;

SELECT *
FROM emp
ORDER BY sal desc;

SELECT *
FROM emp
ORDER BY empno DESC;

SELECT *
FROM emp
ORDER BY deptno, sal, empno;

SELECT *
FROM emp
ORDER BY deptno asc, sal desc, empno;

SELECT DISTINCT job
FROM emp;

SELECT empno AS employee_no,
       ename    employee_name
FROM emp
ORDER BY deptno DESC, ename ASC;

SELECT *
FROM emp
WHERE deptno = 30;

SELECT *
FROM emp
WHERE deptno = 30
  AND job = 'SALESMAN';

SELECT *
FROM emp
WHERE empno = 7499
  AND deptno = 30;

SELECT *
FROM emp
WHERE mgr = 7839
  AND deptno = 20;

SELECT *
FROM emp
WHERE deptno = 30
   OR job = 'CLERK';


-- 한줄 주석
/*
	범위 주석
 */
SELECT *
FROM emp
WHERE
    /*(deptno = 30
    OR deptno = 20)
    AND*/ job = 'CLERK'
ORDER BY deptno;

SELECT *
FROM emp
WHERE sal >= 3000;

SELECT *
FROM emp
WHERE sal >= 2500
  AND job = 'ANALYST';

SELECT *
FROM emp
--WHERE sal != 3000;
WHERE sal <> 3000;

SELECT *
FROM emp
WHERE NOT sal <= 3000;



--문제1
--급여가 1500 이상이고 3000 미만인 사원을 출력
SELECT *
FROM emp
WHERE 1500 <= sal
  AND sal < 3000;

--문제2
--job이 CLERK 이거나 급여가 2000 초과 이면서 부서번호 10번인 사원 출력
SELECT *
FROM emp
WHERE job = 'CLERK'
   OR sal > 2000
    AND deptno = 10;

SELECT *
FROM emp
WHERE job = 'CLERK'
   OR (sal > 2000 AND deptno = 10);

SELECT *
FROM emp
WHERE (job = 'CLERK' OR sal > 2000)
  AND deptno = 10;

--문제3
--deptno가 10 또는 20인 모든 사원
SELECT *
FROM emp
WHERE deptno = 10
   OR deptno = 20;

--문제4
--부서번호가 20또는 30인 사원 중에서 급여가 2000~3000 사이(포함)인 사람의
--연봉이 작은 순으로 출력. 단, 연봉이 같은 경우 이름이 빠른 순으로 정렬하여 출력
SELECT *
FROM emp
WHERE (deptno = 20 OR deptno = 30)
  AND (sal >= 2000 AND sal <= 3000)
ORDER BY sal ASC, ename;

SELECT *
FROM emp
WHERE deptno IN (10, 20);

SELECT *
FROM emp
WHERE deptno not IN (10, 20);

-- 2000 이상이고 3000 이하
-- between은 미만, 초과는 표현할 수 없다
SELECT *
FROM emp
WHERE (sal BETWEEN 2000 AND 3000);

-- 2000 이상이고 3000 이하
-- 2000 >= sal and sal <= 3000
-- 2000 미만이거나 3000 초과
-- not (2000 >= sal and sal <= 3000)
-- 2000 < sal or sal > 3000
SELECT *
FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000);

SELECT *
FROM emp
WHERE (sal NOT BETWEEN 2000 AND 3000)
  AND deptno = 30;

SELECT *
FROM emp
WHERE ename LIKE 'S%';

-- N으로 끝나는 이름
SELECT *
FROM emp
WHERE ename LIKE '%N';

SELECT *
FROM emp
WHERE ename LIKE '_L%';

-- 이름이 다섯 글자인 사람
SELECT *
FROM emp
WHERE ename LIKE '_____';

SELECT *
FROM emp
WHERE ename LIKE '%AM%';

SELECT *
FROM emp
WHERE ename NOT LIKE '%A%';

SELECT *
FROM emp
WHERE ename LIKE '%A%S%';


SELECT comm
FROM emp;

SELECT *
FROM emp
WHERE comm = NULL;

SELECT *
FROM emp
WHERE comm IS NULL;

SELECT *
FROM emp
WHERE comm IS NOT NULL;


SELECT *
FROM emp
WHERE ename LIKE '%A%'
  AND deptno IN (10, 20);

SELECT *
FROM EMP
WHERE deptno = 10; -- 3명
SELECT *
FROM EMP
WHERE deptno = 20; -- 5명

SELECT *
FROM EMP
WHERE deptno = 10
union
SELECT *
FROM EMP
WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION
SELECT sal, job, deptno, sal
FROM emp
WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION all
SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10;

-- Q1
SELECT *
FROM emp
WHERE ename LIKE '%S';
-- Q2
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE deptno = 30
  AND job = 'SALESMAN';
-- Q3-1
SELECT empno, ename, job, sal, deptno
FROM emp
WHERE deptno IN (20, 30)
  AND sal > 2000;
-- Q3-2
SELECT empno, ename, job, sal, deptno
FROM emp
WHERE deptno = 20
  AND sal > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno
FROM emp
WHERE deptno = 30
  AND sal > 2000;
-- Q4
SELECT *
FROM emp
WHERE NOT (sal >= 2000 AND sal <= 3000);
-- Q5
SELECT ename, empno, sal, deptno
FROM emp
WHERE ename LIKE '%E%'
  AND deptno = 30
  AND sal NOT BETWEEN 1000 AND 2000;
-- Q6


/* 함수 */
SELECT ename, upper(ename), lower(ename), initcap(ename)
FROM emp;

SELECT 1
FROM dual;
SELECT upper('aBc'), lower(123), upper(lower('aBc'))
FROM dual;

SELECT *
FROM emp
WHERE lower(ename) LIKE lower('%aM%');

SELECT ename, length(ename)
FROM emp;

SELECT *
FROM emp
WHERE length(ename) = 5;

SELECT length('a'), length('한'), lengthb('a'), lengthb('한')
FROM dual;

-- substr(대상, 시작하는 곳, 몇 개)
SELECT job,
       substr(job, 1, 2),
       substr(job, 3, 3),
       substr(job, 5)
FROM emp;
-- 사원 이름을 두번째부터 3글자만 출력
SELECT substr(ename, 2, 3)
FROM emp;
SELECT substr(ename, 2, 3000)
FROM emp; -- 마지막 숫자가 커도 끝까지만 출력
SELECT substr(ename, 20, 3)
FROM emp; -- 실제 길이보다 시작이 크면 null

SELECT ename, substr(ename, -3, 2)
FROM emp;
SELECT ename, substr(ename, -30, 2)
FROM emp;

-- replace(대상, 바뀔 문자, 바꿀 문자)
-- "모든" 바뀔 문자를 바꿀 문자로 변경
SELECT 'a-b-c',
       replace('a-b-c', '-', ' '),
       replace('a-b-c', '-', ';'),
       replace('a-b-c', '-'),
       replace('a-b-c', '-', '')
FROM dual;

-- 사원 이름에 A를 모두 'abc'로 교체
SELECT ename, replace(ename, 'A', 'abc')
FROM emp;

-- lpad, rpad
-- 모자르면 채우고
-- 넘치면 자른다
-- 즉, 두번째 값의 길이로 만들어준다
SELECT lpad(ename, 10, '#'), lpad(ename, 5, '#')
FROM emp;



-- 문제1
--	ename에서 앞에 두 글자만 출력
--	substr, lpad, replace
--	WARD >> WA, SMITH >> SM
SELECT ename,
       substr(ename, 1, 2),
       lpad(ename, 2, ' '),
       -- 원본에서
       -- 3번째 부터 끝까지 문자를
       -- 없애자
       replace(ename, substr(ename, 3), '')
FROM emp;

-- 문제2
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 4개의 *로 표시
--	WARD >> WA****, SMITH >> SM****
SELECT substr(ename, 1, 2),
       rpad(substr(ename, 1, 2), 6, '*')
FROM emp;
-- 문제3
--	ename의 앞 두글자만 원본을 출력하고
--	나머지는 *로 출력
-- 	단, 전체 길이는 원래 이름의 길이만큼
--	WARD >> WA**, SMITH >> SM***

SELECT substr(ename, 1, 2),
       rpad(substr(ename, 1, 2), LENGTH(ename), '*')
FROM emp;
-- 문제 4
-- 앞 두글자만 *처리
SELECT ename,
       substr(ename, 3),
       lpad(substr(ename, 3), LENGTH(ename), '*')
FROM emp;

SELECT 'ab' || 'cd' || 'efg'
FROM dual;
SELECT empno || ':' || ename
FROM emp;

SELECT '[' || '  _ _oracle_ _   ' || ']',
       '[' || trim('  _ _oracle_ _   ') || ']'
FROM dual;

SELECT round(14.46),
       round(14.46, 0),
       round(14.46, 1), -- 14.5
       round(14.46, -1)
FROM emp;

SELECT trunc(14.46),
       trunc(14.46, 0),
       trunc(14.46, 1),
       trunc(14.46, -1),
       trunc(-14.46)
FROM emp;

SELECT ceil(3.14),
       floor(3.14),
       ceil(-3.14),
       floor(-3.14),
       trunc(-3.14)
FROM emp;

SELECT mod(15, 6),
       mod(15, 0)
FROM dual;

SELECT 15 / 6, 15 / 0
FROM dual;

SELECT mod(6, 3),
       mod(7, 3),
       mod(8, 3),
       mod(9, 3)
FROM dual;

SELECT sysdate
FROM dual;

SELECT to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss')
FROM dual;
SELECT *
FROM emp;
SELECT to_char(
                       sysdate,
                       'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"'
       )
FROM dual;

SELECT *
FROM emp
WHERE hiredate > to_date('1981/06/01', 'yyyy/mm/dd');

SELECT sal,
       comm,
       nvl(comm, 0),
       sal + nvl(comm, 0),
       sal + comm,
       nvl(to_char(comm), 'N/A')
FROM emp;

SELECT job,
       sal,
       decode(job, -- job이
              'MANAGER', sal * 1.1, -- 정확히 MANAGER라면
              'SALESMAN', sal * 1.05,
              'ANALYST', sal,
              sal * 1.03 -- 위 조건에 없다면
       ) AS upsal
FROM emp;

SELECT job,
       sal,
       CASE job
           WHEN 'MANAGER' THEN sal * 1.1
           WHEN 'SALESMAN' THEN sal * 1.05
           WHEN 'ANALYST' THEN sal
           ELSE sal * 1.03
           END upsal
FROM emp;

SELECT comm,
       CASE
           WHEN comm IS NULL THEN '원래 없어요'
           WHEN comm = 0 THEN '수당 없음'
           WHEN comm > 0 THEN '수당: ' || comm
           END text
FROM emp;

SELECT ename, length(ENAME)
FROM EMP;

SELECT SUM(COMM)
FROM EMP;

SELECT SUM(SAL)
FROM EMP;

SELECT COUNT(SAL)
FROM EMP;
SELECT COUNT(COMM)
FROM EMP;
SELECT COUNT(*)
FROM EMP;

SELECT COUNT(*)
FROM EMP
WHERE DEPTNO = 30;

SELECT MAX(SAL)
FROM EMP;
SELECT MIN(SAL)
FROM EMP;

SELECT MAX(SAL),
       MIN(SAL),
       MIN(HIREDATE),
       MIN(COMM),
       COUNT(*),
       SUM(SAL)
FROM EMP;

SELECT FLOOR(AVG(SAL))
FROM EMP;

-- 이름에 a가 들어가는 사람은 몇명?

SELECT COUNT(*)
FROM EMP
WHERE LOWER(ENAME) LIKE '%a%';

SELECT DISTINCT DEPTNO
FROM EMP;

-- 제약 1. SELECT 에는 GROUP BY에 적은 컬럼 명만 가능하다
-- 제약 2.

SELECT DEPTNO, COUNT(*), SUM(SAL)
FROM EMP
GROUP BY DEPTNO, DEPTNO;

SELECT DEPTNO, JOB
FROM EMP
GROUP BY DEPTNO, JOB;


SELECT DEPTNO, JOB, COUNT(*)
FROM EMP
GROUP BY DEPTNO, JOB;

/*
SELECT *
FROM EMP
WHERE AVG(SAL) < SAL;
 */

SELECT DEPTNO, JOB
FROM EMP
WHERE DEPTNO = 10
GROUP BY DEPTNO, JOB;

SELECT DEPTNO, JOB
FROM EMP
-- WHERE DEPTNO = 10
GROUP BY DEPTNO, JOB
HAVING DEPTNO = 10;

SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
GROUP BY DEPTNO, JOB;

SELECT DEPTNO, JOB, AVG(SAL)
FROM EMP
GROUP BY DEPTNO, JOB
HAVING AVG(SAL) > 2000;


-- JOB 별로 3명 이상인 JOB과 COUNT(*)를 표시
SELECT JOB, COUNT(*)
FROM EMP
GROUP BY JOB
HAVING COUNT(JOB) >= 3;

SELECT *
FROM DEPT;

SELECT *
FROM EMP,
     DEPT
ORDER BY EMPNO;

-- EMP 에서 SMITH의 DEPTNO만 출력

SELECT DEPTNO
FROM EMP
WHERE ENAME LIKE 'SMITH';
SELECT *
FROM DEPT
WHERE DEPTNO = 20;

SELECT *
FROM EMP,
     DEPT
WHERE EMP.DEPTNO = DEPT.DEPTNO;

SELECT *
FROM EMP e,
     DEPT d
WHERE e.DEPTNO = d.DEPTNO;

SELECT ENAME
FROM EMP E,
     DEPT D
WHERE E.DEPTNO = D.DEPTNO;

SELECT *
FROM SALGRADE;

SELECT SAL
FROM EMP
WHERE ENAME = 'SMITH';

SELECT ENAME, SAL, GRADE, LOSAL, HISAL
FROM EMP E,
     SALGRADE S
WHERE E.SAL >= S.LOSAL
  AND E.SAL <= S.HISAL;

SELECT MGR
FROM EMP
WHERE ENAME = 'SMITH';
SELECT *
FROM EMP
WHERE EMPNO = 7902;

SELECT E1.EMPNO, E1.ENAME, E1.MGR, E2.EMPNO, E2.ENAME, E2.MGR
FROM EMP E1,
     EMP E2
WHERE E1.MGR = E2.EMPNO;

SELECT *
FROM EMP E
         NATURAL JOIN DEPT D;

SELECT DEPTNO
FROM EMP E
         NATURAL JOIN DEPT D;

SELECT *
FROM EMP E
         JOIN DEPT D USING (DEPTNO);

SELECT DEPTNO, E.EMPNO, DNAME
FROM EMP E
         JOIN DEPT D USING (DEPTNO);

SELECT D.DEPTNO, D.*
FROM EMP E
         JOIN DEPT D ON (E.DEPTNO = D.DEPTNO)
WHERE SAL <= 2000;

SELECT *
FROM EMP E1
         JOIN EMP E2 ON (E1.MGR = E2.EMPNO);

SELECT *
FROM EMP E1
         LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO);

SELECT *
FROM EMP E1
         FULL OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO);

-- 퀴즈 각 부서별로 ~~~
SELECT MAX(SAL), MIN(SAL), MAX(SAL) - MIN(SAL), DEPTNO
FROM EMP
GROUP BY DEPTNO;


-- 퀴즈 1
SELECT D1.DEPTNO, D1.DNAME, E1.EMPNO, E1.ENAME, E1.SAL
FROM EMP E1
         LEFT OUTER JOIN DEPT D1 ON (E1.DEPTNO = D1.DEPTNO)
WHERE SAL > 2000;

-- 퀴즈 2
SELECT E1.DEPTNO, D1.DNAME, FLOOR(AVG(SAL)), MAX(SAL), MIN(SAL), COUNT(*)
FROM EMP E1
         LEFT OUTER JOIN DEPT D1 ON (E1.DEPTNO = D1.DEPTNO)
GROUP BY E1.DEPTNO, D1.DNAME;

-- 퀴즈 3
SELECT D1.DEPTNO, D1.DNAME, E1.EMPNO, E1.ENAME, E1.JOB, E1.SAL
FROM EMP E1
         FULL OUTER JOIN DEPT D1 ON (E1.DEPTNO = D1.DEPTNO)
GROUP BY D1.DEPTNO, D1.DNAME, E1.EMPNO, E1.ENAME, E1.JOB, E1.SAL
ORDER BY D1.DEPTNO ASC, E1.ENAME ASC;

-- 퀴즈 4
SELECT D1.DEPTNO,
       D1.DNAME,
       E1.EMPNO,
       E1.ENAME,
       E1.MGR,
       E1.SAL,
       E1.DEPTNO AS DEPTNO_1,
       S1.LOSAL,
       S1.HISAL,
       S1.GRADE,
       E2.EMPNO  AS MGR_EMPNO,
       E2.ENAME  AS MGR_ENAME
FROM EMP E1
         LEFT OUTER JOIN DEPT D1 ON (E1.DEPTNO = D1.DEPTNO)
         LEFT OUTER JOIN SALGRADE S1 ON (E1.SAL >= S1.LOSAL AND E1.SAL <= S1.HISAL)
         LEFT OUTER JOIN EMP E2 ON (E1.MGR = E2.EMPNO)
--     ,EMP E2IOIOIO
-- WHERE E1.MGR = E2.EMPNO
GROUP BY D1.DEPTNO, D1.DNAME, E1.EMPNO, E1.ENAME, E1.MGR, E1.SAL, E1.DEPTNO, S1.LOSAL, S1.HISAL, S1.GRADE, D1.DEPTNO,
         D1.DNAME, E2.EMPNO, E2.ENAME
ORDER BY DEPTNO ASC, EMPNO DESC;

-------------------------
-------- 서브쿼리 ---------
-------------------------

SELECT *
FROM EMP
-- WHERE SAL > 2975;
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME = 'JONES');

SELECT *
FROM EMP
WHERE HIREDATE < (SELECT HIREDATE
                  FROM EMP
                  WHERE ENAME = 'SCOTT');

SELECT *
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP);

SELECT *
FROM EMP
-- 문제 발생 !.!
WHERE SAL IN (SELECT MAX(SAL)
              FROM EMP
              GROUP BY DEPTNO);

SELECT *
FROM (SELECT * FROM EMP WHERE DEPTNO = 10) E10,
     DEPT D1
WHERE E10.DEPTNO = D1.DEPTNO;

SELECT JOB,
       COUNT(*)
FROM EMP
GROUP BY JOB
HAVING COUNT(*) >= 3;

SELECT *
FROM (SELECT JOB, COUNT(*) CNT FROM EMP GROUP BY JOB) E1
WHERE CNT >= 3;

SELECT ROWNUM, E1.*
FROM (SELECT * FROM EMP ORDER BY SAL) E1;

SELECT *
FROM (SELECT ROWNUM RNUM, E.*
      FROM (SELECT *
            FROM EMP
            ORDER BY SAL) E)
WHERE RNUM BETWEEN 3 AND 6;

WITH E10 AS (SELECT *
             FROM EMP
             WHERE DEPTNO = 10)
SELECT ENAME
FROM E10;

SELECT SAL,
       ENAME,
       (SELECT GRADE
        FROM SALGRADE
        WHERE SAL BETWEEN LOSAL AND HISAL) AS "GRADE"
FROM EMP
ORDER BY GRADE ASC, SAL ASC;

-- 문제 1
-- comm이 NULL인 사원을 급여 내림차순으로 정렬

SELECT SAL, COMM
FROM EMP
WHERE COMM IS NULL
ORDER BY SAL DESC;

-- 문제 2
-- 급여 등급 별 사원 수를 등급 오름차순으로 정렬

SELECT GRADE, COUNT(*)
FROM EMP
         LEFT OUTER JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
GROUP BY GRADE
ORDER BY GRADE ASC;

-- 문제 3
-- 출력 : 이름, 급여, 급여 등급, 부서 이름
-- 급여 등급 3 이상, 급여 등급 내림차순,
-- 급여 등급이 같은 경우 급여 내림차순

SELECT ENAME, SAL, GRADE, DNAME
FROM EMP
         LEFT OUTER JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
         LEFT OUTER JOIN DEPT ON (EMP.DEPTNO = DEPT.DEPTNO)
WHERE (GRADE >= 3)
ORDER BY GRADE DESC, SAL DESC;

-- 문제 4

SELECT SAL
FROM EMP E1
         LEFT OUTER JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
         LEFT OUTER JOIN DEPT ON (DEPT.DEPTNO = E1.DEPTNO)
WHERE DNAME = 'SALES'
  AND GRADE BETWEEN 2 AND 3
ORDER BY SAL DESC;

SELECT JOB, EMPNO, ENAME, SAL, EMP.DEPTNO, DNAME
FROM EMP
         LEFT OUTER JOIN DEPT ON (DEPT.DEPTNO = EMP.DEPTNO)
WHERE JOB = (SELECT JOB
             FROM EMP
             WHERE ENAME = 'ALLEN');

SELECT EMPNO, ENAME, DNAME, HIREDATE, LOC, SAL, GRADE
FROM EMP
         LEFT OUTER JOIN DEPT ON (EMP.DEPTNO = DEPT.DEPTNO)
         LEFT OUTER JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
WHERE SAL > (SELECT AVG(SAL)
             FROM EMP)
ORDER BY SAL DESC, EMPNO ASC;

SELECT *
FROM (SELECT EMPNO, ENAME, JOB, EMP.DEPTNO, DNAME, LOC
      FROM EMP
               LEFT OUTER JOIN DEPT
                               ON (EMP.DEPTNO = DEPT.DEPTNO)
      WHERE EMP.DEPTNO = 10)
WHERE JOB NOT IN (SELECT JOB
                  FROM EMP
                  WHERE DEPTNO = 30);

SELECT EMPNO, ENAME, SAL, GRADE
FROM EMP
         LEFT OUTER JOIN SALGRADE ON (SAL BETWEEN LOSAL AND HISAL)
WHERE SAL > (SELECT MAX(SAL)
             FROM EMP
             WHERE JOB = 'SALESMAN')
ORDER BY EMPNO ASC;

-- DESC EMP;
SELECT *
FROM EMP;

CREATE TABLE EMP_DDL
(

    EMPNO    NUMBER(4),
    ENAME    VARCHAR2(10),
    JOB      VARCHAR2(9),
    MGR      NUMBER(4),
    HIREDATE DATE,
    SAL      NUMBER(7, 2),
    COMM     NUMBER(7, 2),
    DEPTNO   NUMBER(2)
);
SELECT *
FROM EMP_DDL;

CREATE TABLE DEPT_DDL
AS
SELECT *
FROM DEPT;

SELECT *
FROM DEPT_DDL;

CREATE TABLE EMP_DDL_30
AS
SELECT *
FROM EMP
WHERE DEPTNO = 30;

SELECT *
FROM EMP_DDL_30;

CREATE TABLE EMPDEPT_DDL
AS
SELECT EMPNO, ENAME, JOB AS "JOB2", DEPT.DEPTNO, DNAME
FROM EMP
         LEFT OUTER JOIN dept on (EMP.DEPTNO = dept.DEPTNO)
WHERE 1 <> 1;

SELECT *
FROM EMPDEPT_DDL;

CREATE TABLE EMP_ALTER
AS
SELECT *
FROM EMP;

SELECT *
FROM EMP_ALTER;

ALTER TABLE EMP_ALTER
    ADD HP VARCHAR2(20);

SELECT *
FROM EMP_ALTER;

ALTER TABLE EMP_ALTER
    RENAME COLUMN HP TO TEL;

SELECT *
FROM EMP_ALTER;

ALTER TABLE EMP_ALTER
    MODIFY EMPNO NUMBER(5);

ALTER TABLE EMP_ALTER
    DROP COLUMN TEL;

SELECT *
FROM EMP_ALTER;

RENAME EMP_ALTER TO EMP_RENAME;
SELECT *
FROM EMP_RENAME;

TRUNCATE TABLE EMP_RENAME;

SELECT *
FROM EMP_RENAME;

DROP TABLE EMP_RENAME;

SELECT *
FROM EMP_RENAME;

---------------------------------------
-------------- 10 장 ------------------
---------------------------------------

CREATE TABLE DEPT_TEMP
AS
SELECT *
FROM DEPT;

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
VALUES (50, 'DATABASE', 'SEOUL');
SELECT *
FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP
VALUES (60, 'NETWORK', 'BUSAN');
SELECT *
FROM DEPT_TEMP;

INSERT INTO DEPT_TEMP
VALUES (70, 'WEB', NULL);
SELECT *
FROM DEPT_TEMP;

CREATE TABLE EMP_TEMP
AS
SELECT *
FROM EMP
WHERE 1 <> 1;

SELECT *
FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, HIREDATE)
VALUES (999, '홍길동', '2026/01/27');
SELECT *
FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, HIREDATE)
VALUES (7051, '강사님', TO_DATE('2026-01-27', 'YYYY-MM-DD'));

SELECT *
FROM EMP_TEMP;

INSERT INTO EMP_TEMP (EMPNO, ENAME, HIREDATE)
VALUES (3111, '심청이', SYSDATE);

SELECT *
FROM EMP_TEMP;

INSERT INTO EMP_TEMP
SELECT *
FROM EMP
WHERE DEPTNO = 10;

INSERT ALL
    INTO EMP_TEMP (EMPNO, ENAME, HIREDATE)
VALUES (3112, '심청이2', SYSDATE)
SELECT *
FROM DUAL;

-----------------------------
--------- UPDATE -----------
-----------------------------

CREATE TABLE DEPT_TEMP2
AS
SELECT *
FROM DEPT;

SELECT *
FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2
SET LOC = ('SEOUL');

SELECT *
FROM DEPT_TEMP2;

ROLLBACK;

SELECT *
FROM DEPT_TEMP2;


-- UPDATE , DELETE 실행 하기 전에
-- WHERE를 무조건 검증해보기!!
SELECT *
FROM DEPT_TEMP2
WHERE DEPTNO = 40;

UPDATE DEPT_TEMP2
SET LOC   = 'SEOUL',
    DNAME = 'DATABASE'
WHERE DEPTNO = 40;

SELECT *
FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2
SET DNAME = (SELECT DNAME
             FROM DEPT
             WHERE DEPTNO = 40),
    LOC   = (SELECT LOC
             FROM DEPT
             WHERE DEPTNO = 40)
WHERE DEPTNO = 40;

SELECT *
FROM DEPT_TEMP2;

CREATE TABLE EMP_TMP
AS
SELECT *
FROM EMP;

SELECT *
FROM EMP_TMP;

SELECT SAL
FROM EMP_TMP
WHERE SAL < 1000;

UPDATE EMP_TMP
SET SAL = SAL * 1.08
WHERE SAL < 1000;

SELECT E1.SAL AS "인상 전", E2.SAL AS "인상 후"
FROM EMP E1
         LEFT OUTER JOIN EMP_TMP E2 ON (E1.EMPNO = E2.EMPNO);

CREATE TABLE EMP_TEMP2
AS
SELECT *
FROM EMP;

SELECT *
FROM EMP_TEMP2;

DELETE
FROM EMP_TEMP2
WHERE JOB = 'MANAGER';

SELECT *
FROM EMP_TEMP2
WHERE JOB = 'MANAGER';

DELETE
FROM EMP_TEMP2;

SELECT *
FROM EMP_TEMP2;

ROLLBACK;

SELECT *
FROM EMP_TEMP2;

DELETE
FROM EMP_TEMP2
WHERE JOB = 'MAMAGER';

COMMIT;

SELECT *
FROM EMP_TEMP2;

ROLLBACK;

-------------------------------------
------------- 13장 -----------
-------------------------------------

SELECT *
FROM DICT;
SELECT *
FROM USER_TABLES;

---------- 인덱스 ----------

CREATE INDEX IDX_EMP_SAL_DESC
    ON EMP (SAL DESC);

DROP INDEX IDX_EMP_SAL_DESC;

SELECT *
FROM USER_INDEXES;
SELECT *
FROM USER_IND_COLUMNS;

SELECT /*+ INDEX(E IDX_EMP_SAL)*/ -- 강제 힌트
    ENAME,
    SAL
FROM EMP E
WHERE SAL = 3000;

CREATE VIEW VW_EMP30
AS
(
SELECT EMPNO, ENAME, JOB, DEPTNO
FROM EMP
WHERE DEPTNO = 20
    );

SELECT *
FROM VW_EMP30;

SELECT *
FROM VW_EMP30
WHERE JOB = 'CLERK';

CREATE TABLE DEPT_SEQ
AS
SELECT *
FROM DEPT
WHERE 1 <> 1;

SELECT *
FROM DEPT_SEQ;

CREATE SEQUENCE SEQ_DEPT;

SELECT *
FROM USER_SEQUENCES;

-- 다음 값
SELECT SEQ_DEPT.nextval
FROM DUAL;

-- 현재 값
-- 생성 후에 nextval 한번은 실행하고나서
-- currval 사용 가능
SELECT SEQ_DEPT.currval
FROM DUAL;

CREATE SEQUENCE SEQ_DEPT_10
    START WITH 10
    INCREMENT BY 10;

SELECT SEQ_DEPT_10.nextval
FROM DUAL;
SELECT SEQ_DEPT_10.nextval
FROM DUAL;

select SEQ_DEPT_10.currval
FROM DUAL;

DROP
    SEQUENCE SEQ_DEPT_10;

INSERT INTO DEPT_SEQ (DEPTNO, DNAME, LOC)
VALUES (SEQ_DEPT_10.nextval, 'DATABASE', 'SEOUL');

SELECT *
FROM DEPT_SEQ;

------------------ 제약 조건 ----------------------
CREATE TABLE TABLE_PK
(
    LOGIN_ID VARCHAR2(20) PRIMARY KEY,
    LOGIN_PW VARCHAR2(20) NOT NULL,
    TEL      VARCHAR2(20)
);

SELECT *
FROM TABLE_PK;

SELECT *
FROM USER_INDEXES;

INSERT INTO TABLE_PK
VALUES ('ID1', 'PW1', NULL);


INSERT INTO TABLE_PK
VALUES ('ID1', 'PW1', NULL);


INSERT INTO TABLE_PK
VALUES ('ID2', NULL, NULL);

INSERT INTO TABLE_PK (LOGIN_ID)
VALUES ('ID2');

INSERT INTO TABLE_PK (LOGIN_ID)
VALUES (NULL);

SELECT *
FROM TABLE_PK;

-- PK나 NOT NULL을 NULL로 변경
UPDATE TABLE_PK
SET LOGIN_ID = NULL
WHERE LOGIN_ID = 'ID1';

INSERT INTO TABLE_PK
VALUES ('ID2', 'PW2', NULL);
SELECT *
FROM TABLE_PK;

-- x --
UPDATE TABLE_PK
SET LOGIN_ID = 'ID1'
WHERE LOGIN_ID = 'ID2';

-- 방법 2 ?
CREATE TABLE TABLE_PK2
(
    LOGIN_ID VARCHAR2(20),
    LOGIN_PW VARCHAR2(20),
    TEL      VARCHAR2(20),

    PRIMARY KEY (LOGIN_ID, LOGIN_PW)
);


CREATE TABLE TABLE_PK3
(
    LOGIN_ID VARCHAR2(20),
    LOGIN_PW VARCHAR2(20),
    TEL      VARCHAR2(20)
);
ALTER TABLE TABLE_PK3
    ADD PRIMARY KEY (LOGIN_ID, LOGIN_PW);

ALTER TABLE TABLE_PK3
    MODIFY LOGIN_ID PRIMARY KEY;

-- FOREIGN KEY : 참조하고 있을 때 어떠한 방법을 써도 사라지지 않는다.

CREATE TABLE DEPT_FK
(
    DEPTNO NUMBER(2) PRIMARY KEY,
    DNAME  VARCHAR2(14),
    LOC    VARCHAR2(13)
);
CREATE TABLE EMP_FK
(
    EMPNO  NUMBER(4) PRIMARY KEY,
    ENAME  VARCHAR2(10),
    DEPTNO NUMBER(2) REFERENCES DEPT_FK (DEPTNO)
);
INSERT INTO EMP_FK
VALUES (2, 'NAME2', 1);
-- NULL은 들어갈 수 있다.
SELECT *
FROM EMP_FK;

INSERT INTO DEPT_FK
VALUES (10, '부서', '위치');
SELECT *
FROM DEPT_FK;

INSERT INTO EMP_FK
VALUES (2, '이름2', 10);

UPDATE EMP_FK
SET DEPTNO = 20
WHERE DEPTNO = 10;

DELETE DEPT_FK
WHERE DEPTNO = 10;

DROP TABLE DEPT_FK;

SELECT *
FROM EMP;