/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50509
Source Host           : localhost:3306
Source Database       : platform

Target Server Type    : MYSQL
Target Server Version : 50509
File Encoding         : 65001

Date: 2014-07-11 13:58:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_u_r_ref`
-- ----------------------------
DROP TABLE IF EXISTS `t_u_r_ref`;
CREATE TABLE `t_u_r_ref` (
  `uid` int(32) DEFAULT NULL,
  `rid` int(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_u_r_ref
-- ----------------------------
INSERT INTO `t_u_r_ref` VALUES ('1', '1');
