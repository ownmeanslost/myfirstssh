-------------------
--create database
create database myfirstssh character set utf8;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '悟空传');
INSERT INTO `book` VALUES ('2', '水浒传');
INSERT INTO `book` VALUES ('3', '大秦帝国');
INSERT INTO `book` VALUES ('4', '三国演义');
INSERT INTO `book` VALUES ('5', '红楼梦');
INSERT INTO `book` VALUES ('6', '三皇五帝');
INSERT INTO `book` VALUES ('7', '刑法');
INSERT INTO `book` VALUES ('8', '宪法');

-- ----------------------------
-- Table structure for c3p0testtable
-- ----------------------------
DROP TABLE IF EXISTS `c3p0testtable`;
CREATE TABLE `c3p0testtable` (
  `a` char(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c3p0testtable
-- ----------------------------

-- ----------------------------
-- Table structure for educate
-- ----------------------------
DROP TABLE IF EXISTS `educate`;
CREATE TABLE `educate` (
  `Guid` varchar(255) NOT NULL,
  `school` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `graducateTime` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '学历',
  `userguid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of educate
-- ----------------------------

-- ----------------------------
-- Table structure for kill
-- ----------------------------
DROP TABLE IF EXISTS `kill`;
CREATE TABLE `kill` (
  `Guid` varchar(255) NOT NULL,
  `content` text,
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kill
-- ----------------------------

-- ----------------------------
-- Table structure for projectexp
-- ----------------------------
DROP TABLE IF EXISTS `projectexp`;
CREATE TABLE `projectexp` (
  `Guid` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `role` varchar(255) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `lastTime` datetime DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '项目类型',
  `tutor` varchar(255) DEFAULT NULL COMMENT '指导人',
  `content` varchar(255) DEFAULT NULL COMMENT '负责内容',
  `projectcontent` text,
  `userGuid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of projectexp
-- ----------------------------

-- ----------------------------
-- Table structure for scanpolicy
-- ----------------------------
DROP TABLE IF EXISTS `scanpolicy`;
CREATE TABLE `scanpolicy` (
  `Guid` varchar(255) NOT NULL,
  `policyNO` varchar(20) DEFAULT NULL COMMENT '策略编号',
  `cve` varchar(20) DEFAULT NULL COMMENT '公共漏洞编码',
  `desct` text COMMENT '说明',
  `name` varchar(30) DEFAULT NULL COMMENT '漏洞名',
  `type` varchar(30) DEFAULT NULL COMMENT '类型',
  `cvss` varchar(30) DEFAULT NULL COMMENT 'cvss编码',
  `level` int(1) DEFAULT NULL COMMENT '威胁级别',
  `advice` text COMMENT '解决办法',
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scanpolicy
-- ----------------------------

-- ----------------------------
-- Table structure for scanrecord
-- ----------------------------
DROP TABLE IF EXISTS `scanrecord`;
CREATE TABLE `scanrecord` (
  `Guid` varchar(255) NOT NULL,
  `assetGuid` varchar(255) DEFAULT NULL COMMENT '资产guid',
  `taskId` int(11) DEFAULT NULL COMMENT '任务id',
  `policyNO` varchar(20) DEFAULT NULL COMMENT '策略编码',
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scanrecord
-- ----------------------------

-- ----------------------------
-- Table structure for scantask
-- ----------------------------
DROP TABLE IF EXISTS `scantask`;
CREATE TABLE `scantask` (
  `Guid` varchar(255) NOT NULL COMMENT '主键id',
  `id` int(11) DEFAULT NULL COMMENT '任务id',
  `type` varchar(30) DEFAULT NULL COMMENT '类型(手动或自动,once|cycle)',
  `name` varchar(30) DEFAULT NULL COMMENT '任务名',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `lastTime` datetime DEFAULT NULL COMMENT '最近一次完成时间',
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scantask
-- ----------------------------

-- ----------------------------
-- Table structure for uerinfo
-- ----------------------------
DROP TABLE IF EXISTS `uerinfo`;
CREATE TABLE `uerinfo` (
  `Guid` varchar(255) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `intention` varchar(255) DEFAULT NULL COMMENT '意向',
  `address` varchar(255) DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of uerinfo
-- ----------------------------
