create table student(
stuid int,
firstname varchar(25),
lastname varchar(25),
website varchar(25),
city varchar(25),
address varchar(100)
)

insert into student values (1011,'keyur','patel','techonthenet.com','rajkot','A-303 ''Vasant Kunj'', Rajkot')

insert into student values (1022,'hardik','shah','digminecraft.com','Ahmedabad','“Ram Krupa”, Raiya Road')

insert into student values (1033,'kajal','trivedi','bigactivities.com','Baroda','Raj bhavan plot, near garden')

insert into student values (1044,'Bhoomi','Gajera','checkyourmath.com','Ahmedabad','“Jig''s Home”, Narol')

insert into student values (1055,'Harmit','Mitel','@me.darshan.com','rajkot','B-55, Raj Residency')

insert into student values (1066,'Ashok','Jani',null,'baroda','A502, Club House Building')



--1. Display the name of students whose name starts with ‘k’.
--2. Display the name of students whose name consists of five characters.
--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
--4. Display all the students whose last name ends with ‘tel’.
--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.
--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.
--7. Display the name of students having no website and name consists of five characters.
--8. Display all the students whose last name consist of ‘jer’. 
--9. Display all the students whose city name starts with either ‘r’ or ‘b’.
--10. Display all the name students having websites.
--11. Display all the students whose name starts from alphabet A to H.
--12. Display all the students whose name’s second character is vowel.
--13. Display the name of students having no website and name consists of minimum five characters.
--14. Display all the students whose last name starts with ‘Pat’. 
--15. Display all the students whose city name does not starts with ‘b’.
--1
select firstname from student where firstname like 'k%'
--2
select firstname from student where firstname like '_____'
--3
select firstname,lastname from student where city like '_____a'
--4
select * from student where lastname like '%tel'
--5
select * from student where firstname like 'ha%t'
--6
select * from student where firstname like 'k_y%'
--7
select * from student where website is null and firstname like '_____' 
--8
select * from student where lastname like '%jer%'
--9
select * from student where city like '[r,b]%'
--10
select firstname from student where website is not null
--11
select firstname from student where firstname like '[a-h]%'
--12
select firstname from student where firstname like '_[a,e,i,u,o]%'
--13
select firstname from student where website is null and firstname like '_____'
--14
select firstname from student where lastname like 'pat%'
--15
select * from student where city not like 'b%'


--part - b


--1. Display all the students whose name starts from alphabet A or H.
--2. Display all the students whose name’s second character is vowel and of and start with H.
--3. Display all the students whose last name does not ends with ‘a’.
--4. Display all the students whose first name starts with consonant.
--5. Display all the students whose website contains .net


--1
select firstname from student where firstname like '[a-h]%'
--2
select firstname from student where firstname like 'h[a,e,i,u,o]%'
--3
select firstname from student where lastname not like '%a'
--4
select firstname from student where firstname not like '[a,e,i,u,o]%'
--5
select firstname from student where website like '%.net'

--Part – C:
--1. Display all the students whose address consist of -.
--2. Display all the students whose address contains single quote or double quote.
--3. Display all the students whose website contains @.
--4. Display all the names those are either four or five characters

--1
select * from student where address like '%-%'
--2
select * from student where address like '%['',"]%['',"]%'
--3
select * from student where website like '%@%'
--4
select firstname from student where firstname like '_____' or firstname like '____'



