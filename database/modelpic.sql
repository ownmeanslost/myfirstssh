/*
Navicat MySQL Data Transfer

Source Server         : WINDOW
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : myfirstssh

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-08-24 19:36:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for modelpic
-- ----------------------------
DROP TABLE IF EXISTS `modelpic`;
CREATE TABLE `modelpic` (
  `Guid` varchar(255) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `resuumeGuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Guid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of modelpic
-- ----------------------------
INSERT INTO `modelpic` VALUES ('80c98532-3c91-4e3f-988a-be15dd1663cc', 'file/resumeimg/2017-08-20_110030.png', '03ca4f3b-1d91-4e9e-a4d9-b2f1ec01a868');
