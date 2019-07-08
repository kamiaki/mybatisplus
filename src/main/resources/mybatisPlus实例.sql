/*
SQLyog Ultimate v9.63 
MySQL - 5.5.21 : Database - testdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`testdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `testdb`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phoneNum` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `remark` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`userName`,`userAge`,`birthday`,`phoneNum`,`address`,`remark`) values ('1','aaa',0,'2019-07-09',NULL,NULL,NULL),('2','qqq',0,NULL,NULL,NULL,NULL),('3','0.26845572140708973',0,NULL,321321,'34324','3232r'),('5','0.20495985908586245',1,NULL,0,'ewrwe','rew'),('6','0.41771152508442466',0,NULL,0,'ewrew',NULL),('7','0.6365116452564009',0,NULL,NULL,'rwe','ewwer'),('8','0.1332128810850547',0,NULL,0,'rew',NULL),('9','0.6906378258410595',1,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
