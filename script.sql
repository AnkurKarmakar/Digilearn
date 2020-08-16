create table digilearn.project ( project_id varchar(1000) not null,
					  skills varchar(1000) not null, 
					  primary key(project_id) );

insert into digilearn.project values('1','java,database');
insert into digilearn.project values('2','database');
insert into digilearn.project values('3','spring');






create table digilearn.employee ( EmployeeID varchar(10) not null,
								  EmployeeName varchar(1000) not null,
								  Skills varchar(1000) not null,
								  primary key(EmployeeID) );
								  
insert into digilearn.employee values('1','Ankur','java,database');
insert into digilearn.employee values('2','Dhiraj','spring');
insert into digilearn.employee values('3','Debomoy','database');
insert into digilearn.employee values('4','Amit','java');





create table digilearn.course ( Interest varchar(1000) not null,
							    CourseName varchar(1000) not null,
								Link varchar(1000) not null,
								SNO varchar(10) not null,
								primary key(SNO) );
								
insert into digilearn.course values('database','SQL For Beginners','https://cognizant.udemy.com/course/sql-for-beginners-course/learn/lecture/8435488?start=0#overview','1');
insert into digilearn.course values('java','Core Java  Made Easy','https://cognizant.udemy.com/course/corejavamadeeasy/learn/lecture/17985503?start=0#overview','2');
insert into digilearn.course values('spring','Learn Spring Boot in 100 steps','https://cognizant.udemy.com/course/spring-boot-tutorial-for-beginners/learn/lecture/7675492#overview','3');
insert into digilearn.course values('java','Java In Depth','https://cognizant.udemy.com/course/java-in-depth-become-a-complete-java-engineer/learn/lecture/12269926?start=0#overview','4');

