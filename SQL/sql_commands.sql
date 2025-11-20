-- How to change the database
use virtusa;

-- Display all tables in the DB
show tables;

-- Display Info. about Emp table
Desc Emp;

-- Display Info. about Dept table
Desc Dept;

-- Display all records from Emp table
Select * from Emp;

--  Display specific attributes
select empno, ename, job, mgr
from Emp;

-- WHERE clause : used to display records based on the condition
select * from Emp where job = 'CLERK';

-- Between...AND : used to diplay records form start to end
-- works with only 2 operators number and
select * from Emp where sal between 1000 and 3000;

select * from Emp where sal not between 1000 and 3000;

-- IN clause : used to check multiple values of a particular attribute
select * from Emp where job in('CLERK', 'MANAGER','PRESIDENT');

-- LIKE operator : used to display data wrt wild cards
select * from Emp where ename like '%S';

-- ORDER BY : used to display data in ascending and descending order
select * from emp
order by ename;

select * from emp
order by sal desc;

select * from emp
order by job, ename;

