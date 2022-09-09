/*
 Navicat Premium Data Transfer

 Source Server         : localmysql
 Source Server Type    : MySQL
 Source Server Version : 50646
 Source Host           : localhost:3306
 Source Schema         : todo_test

 Target Server Type    : MySQL
 Target Server Version : 50646
 File Encoding         : 65001

 Date: 09/09/2022 22:02:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for todo_items
-- ----------------------------
DROP TABLE IF EXISTS `todo_items`;
CREATE TABLE `todo_items`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `done` tinyint(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
