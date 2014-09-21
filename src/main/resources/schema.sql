SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

insert into user(username, first_name, last_name, created_date) values ('leeqj', 'lee', 'QJ', now());
insert into user(username, first_name, last_name, created_date) values ('mr.w', 'mr', 'w', now());
insert into user(username, first_name, last_name, created_date) values ('yuyongchang', 'yu', 'yongchang', now());