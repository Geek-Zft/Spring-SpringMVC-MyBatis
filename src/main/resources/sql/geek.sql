CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL,
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_user (
  id int(12) not null,
  user_name varchar(60) not null,
  password varchar(60) not null,
  sex char(1) not null,
  mobile varchar(20) not null,
  tel varchar(20),
  email varchar(60),
  note varchar(512),
  PRIMARY KEY (id)
)ENGINE = InnoDB DEFAULT CHARSET=utf8;