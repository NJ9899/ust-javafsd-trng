create database org;
show databases;
use org;

create table worker( worker_id int not null primary key,
first_name varchar(50) not null, last_name varchar(50) not null, 
salary varchar(50) not null, 
joining_date datetime not null, department varchar(50) not null);

insert into worker values
(001,'Monika','Arora',100000,'2014-02-20 09:00:00','HR'),
(002,'Niharika','Verma',80000,'2014-06-11 09:00:00','Admin'),
(003,'Vishal','Singhal',300000,'2014-02-20 09:00:00','HR'),
(004,'Amitabh','Singh',500000,'2014-02-20 09:00:00','Admin'),
(005,'Vivek','Bhati',500000,'2014-06-11 09:00:00','Admin'),
(006,'Vipul','Diwan',200000,'2014-06-11 09:00:00','Account'),
(007,'Satish','Kumar',75000,'2014-01-20 09:00:00','Account'),
(008,'Geetika','Chauhan',90000,'2014-04-11 09:00:00','Admin');

create table bonus( 
worker_ref_id int references worker(worker_id),
bonus_date datetime not null,bonus_amount int);

insert into bonus values 
(1,'2016-02-20 00:00:00',5000),
(2,'2016-06-11 00:00:00',3000),
(3,'2016-02-20 00:00:00',4000),
(1,'2016-02-20 00:00:00',4500),
(2,'2016-06-11 00:00:00',3500);

create table title
(worker_ref_id int references worker(worker_id),
worker_title varchar(50) not null,
affected_from datetime not null);

insert into title values
(1,'Manager','2016-02-20 00:00:00'),
(2,'Executive','2016-06-11 00:00:00'),
(8,'Executive','2016-06-11 00:00:00'),
(5,'Manager','2016-06-11 00:00:00'),
(4,'Asst. Manager','2016-06-11 00:00:00'),
(7,'Executive','2016-06-11 00:00:00'),
(6,'Lead','2016-06-11 00:00:00'),
(3,'Lead','2016-06-11 00:00:00');

#Q-1
select first_name as worker_name from worker;

#Q-2
select upper(first_name) from worker;

#Q-3
select distinct department from worker;


#Q-9	not working
select first_name from worker where replace('a',first_name,'A');

#Q-10
select concat(first_name," ",last_name) as complete_name from worker;

#Q-11
select * from worker order by first_name asc;

#Q-12
select * from worker order by first_name asc, department desc;

#Q-13
select * from worker where first_name like 'Vipul'or first_name like 'Satish'
