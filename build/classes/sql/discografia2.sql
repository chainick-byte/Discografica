SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";






DROP DATABASE IF EXISTS discografia3;
CREATE DATABASE discografia3;
USE discografia3;
SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE IF NOT EXISTS `album`  (
  `album_id` bigint(20) UNSIGNED NOT NULL,
  `nombre` varchar(256) NOT NULL,
  `anno` year(4) NOT NULL,
  `imagen` varchar(256) NOT NULL DEFAULT 'logoUFV.png',
  `grupo_musical` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;





SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE IF NOT EXISTS`cancion` (
  `cancion_id` bigint(20) UNSIGNED NOT NULL,
  `nombre_cancion` varchar(256) NOT NULL,
  `descripcion` text NOT NULL,
  `album_num` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;





ALTER TABLE `album`
  ADD PRIMARY KEY (`album_id`),
  ADD UNIQUE KEY `album_id` (`album_id`);


ALTER TABLE `cancion`
  ADD PRIMARY KEY (`cancion_id`),
  ADD UNIQUE KEY `cancion_id` (`cancion_id`,`album_num`),
  ADD KEY `cancion_ibfk_1` (`album_num`);



ALTER TABLE `album`
  MODIFY `album_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;


ALTER TABLE `cancion`
  MODIFY `cancion_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=415;


 ALTER TABLE `cancion`
  ADD CONSTRAINT `cancion_ibfk_1` FOREIGN KEY (`album_num`) REFERENCES `album` (`album_id`) ON DELETE CASCADE ON UPDATE CASCADE;


