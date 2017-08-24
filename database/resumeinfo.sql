/*
Navicat MySQL Data Transfer

Source Server         : WINDOW
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : myfirstssh

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-08-24 19:25:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resumeinfo
-- ----------------------------
DROP TABLE IF EXISTS `resumeinfo`;
CREATE TABLE `resumeinfo` (
  `Guid` varchar(255) NOT NULL,
  `resumeName` varchar(255) DEFAULT NULL,
  `userjavabean` varchar(1) DEFAULT NULL,
  `beanjson` varchar(255) DEFAULT NULL,
  `filename` varchar(255) DEFAULT NULL,
  `filepath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resumeinfo
-- ----------------------------
INSERT INTO `resumeinfo` VALUES ('03ca4f3b-1d91-4e9e-a4d9-b2f1ec01a868', '传统简历', '1', null, '03ca4f3b-1d91-4e9e-a4d9-b2f1ec01a868.jasper', null);
