create database phd_data;
use phd_data;

create table teacher
(
f_name varchar(20),
l_name varchar(20),
t_id varchar(20),
pwd varchar(20),
primary key(t_id),
gender varchar(20),
phn varchar(12)
);
drop table teacher;
select * from teacher;

create table student
(
f_name varchar(20),
l_name varchar(20),
s_id varchar(20),
pwd varchar(20),
primary key(s_id),
gender varchar(20),
phn varchar(12)
);
drop table student;
select * from student;

create table assign
(
student varchar(20),
teacher varchar(20)
);
drop table assign;
select * from assign;





create table upload
(
studentname varchar(20),
teachername varchar(20),
upload varchar(30)
);
select * from upload;
drop table upload;

create table remark
(
roll varchar(20),
file varchar(20),
des varchar(1000)
);
select * from remark;