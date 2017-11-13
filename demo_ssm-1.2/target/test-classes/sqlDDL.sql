--drop database if mvc exists;
--create database mvc;

use mvc;
drop table if exists student;    	
create table student (    	
		id varchar(40) not null comment '主键',
		name varchar(20) null comment '姓名',
        sex varchar(4) null  comment '性别',
        age int default 0  comment '年龄',
		primary key (id)    
)comment = '学生信息' ENGINE=InnoDB DEFAULT CHARSET=utf8;   

CREATE TABLE `user_t` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user_t` */  
  
insert  into `user_t`(`id`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24); 