

create table emp(
eid int,
ename varchar(50),
department varchar(50),
salary int,
joiningdate date,
city varchar(50) 
)

insert into emp values(101,'rahul','admin',56000,'1-jan-90','rajkot')
insert into emp values(102,'Hardik','IT',18000,'25-Sep-90','Ahmedabad')
insert into emp values(103,'Bhavin','HR',25000,'14-May-91','baroda')
insert into emp values(104,'Bhoomi','admin',39000,'8-Feb-91','rajkot')
insert into emp values(105,'Rohit','IT',17000,'23-Jul-90','Jamnagar')
insert into emp values(106,'Priya','IT',9000,'18-Oct-90','Ahmedabad')
insert into emp values(107,'Bhoomi','HR',34000,'25-Dec-91','rajkot')


--part_a

--1.
--Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
select max(salary) as max_sal,min(salary) as min_sal from emp

--2.
--Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal, respectively.
select sum(salary) as tot_sal,avg(salary) as avg_sal from emp 

--3.
--Find total number of employees of EMPLOYEE table.
select count(eid) as count_emp from emp

--4.
--Find highest salary from Rajkot city.
select max(salary) as max_sal from emp where city='rajkot'

--5.
--Give maximum salary from IT department.
select max(salary) as max_sal from emp where department='it'

--6.
--Count employee whose joining date is after 8-feb-91.
select count(eid) as count_emp from emp where joiningdate > '8-feb-91'

--7.
--Display average salary of Admin department.
select avg(salary) as avg_sal from emp where department='admin'

--8.
--Display total salary of HR department.
select sum(salary) as tot_sal from emp where department='hr'

--9.
--Count total number of cities of employee without duplication.
select count(distinct(city)) from emp

--10.
--Count unique departments.
select count(distinct(department)) from emp

--11.
--Give minimum salary of employee who belongs to Ahmedabad.
select min(salary) as min_sal from emp where city='Ahmedabad'

--12.
--Find city wise highest salary.
select max(salary) as max_sal,city from emp group by city

--13.
--Find department wise lowest salary.
select min(salary) as min_sal,department from emp group by department

--14.
--Display city with the total number of employees belonging to each city.
select count(eid) as emp_num,city from emp group by city

--15.
--Give total salary of each department of EMP table.
select sum(salary) as tot_sal,department from emp group by department

--16.
--Give average salary of each department of EMP table without displaying the respective department name.
select avg(salary) as avg_sal from emp group by department


--part_b


--1.
--Count the number of employees living in Rajkot.
select count(eid) as emp_num from emp where city='rajkot'

--2.
--Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
select max(salary)-min(salary) as DIFFERENCE from emp

--3.
--Display the total number of employees hired before 1st January, 1991.
select count(eid) as count_emp from emp where joiningdate < '1-Jan-1991'


--part-c

--1.
--Count the number of employees living in Rajkot or Baroda.
select count(eid) as emp_num from emp where city='rajkot' or city='baroda'

--2.
--Display the total number of employees hired before 1st January, 1991 in IT department.
select count(eid) as count_emp from emp where joiningdate < '1-Jan-1991' and department='it'

--3.
--Find the Joining Date wise Total Salaries.
select sum(salary) as sum_sal ,joiningdate from emp group by joiningdate

--4.
--Find the Maximum salary department & city wise in which city name starts with ‘R’.
select max(salary) as max_sal from emp where city like 'r%' group by department,city 