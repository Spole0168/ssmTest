drop database if mvc exists;
create database mvc;
use mvc;
drop table if exists student;    	
create table student (    	
		id varchar(40) not null comment '主键',
		name varchar(20) null comment '姓名',
        sex varchar(4) null  comment '性别',
        age int default 0  comment '年龄',
		primary key (id)    
)comment = '学生信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;    	