-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: swing_project_team3
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminId` int NOT NULL AUTO_INCREMENT,
  `adminPw` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`adminId`),
  UNIQUE KEY `adminId_UNIQUE` (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbtiquestion`
--

DROP TABLE IF EXISTS `mbtiquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mbtiquestion` (
  `mqNum` int NOT NULL AUTO_INCREMENT,
  `mqQuestion` varchar(45) DEFAULT NULL,
  `mqType` varchar(10) DEFAULT NULL,
  `mqAnswer1` varchar(10) DEFAULT NULL,
  `mqAnswer2` varchar(10) DEFAULT NULL,
  `mqScore1` varchar(45) DEFAULT NULL,
  `mqScore2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mqNum`),
  UNIQUE KEY `qNum_UNIQUE` (`mqNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbtiquestion`
--

LOCK TABLES `mbtiquestion` WRITE;
/*!40000 ALTER TABLE `mbtiquestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbtiquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbtiresult`
--

DROP TABLE IF EXISTS `mbtiresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mbtiresult` (
  `mbtiNum` int NOT NULL AUTO_INCREMENT,
  `mbtiType` varchar(10) DEFAULT NULL,
  `mbtiName` varchar(12) DEFAULT NULL,
  `mbtiExplain` varchar(1000) DEFAULT NULL,
  `mbtiImage` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mbtiNum`),
  UNIQUE KEY `MbtiNum_UNIQUE` (`mbtiNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbtiresult`
--

LOCK TABLES `mbtiresult` WRITE;
/*!40000 ALTER TABLE `mbtiresult` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbtiresult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quizquestion`
--

DROP TABLE IF EXISTS `quizquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizquestion` (
  `qqNum` int NOT NULL AUTO_INCREMENT,
  `qqQuestion` varchar(45) DEFAULT NULL,
  `qqAnswer1` varchar(10) DEFAULT NULL,
  `qqAnswer2` varchar(10) DEFAULT NULL,
  `qqScore1` varchar(10) DEFAULT NULL,
  `qqScore` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`qqNum`),
  UNIQUE KEY `qqNum_UNIQUE` (`qqNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizquestion`
--

LOCK TABLES `quizquestion` WRITE;
/*!40000 ALTER TABLE `quizquestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `quizquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quizresult`
--

DROP TABLE IF EXISTS `quizresult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quizresult` (
  `quizNum` int NOT NULL AUTO_INCREMENT,
  `quizType` varchar(45) DEFAULT NULL,
  `quizExplain` varchar(45) DEFAULT NULL,
  `quizGrade1` varchar(45) DEFAULT NULL,
  `quizGrade2` varchar(45) DEFAULT NULL,
  `quizGrade3` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`quizNum`),
  UNIQUE KEY `QuizNum_UNIQUE` (`quizNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quizresult`
--

LOCK TABLES `quizresult` WRITE;
/*!40000 ALTER TABLE `quizresult` DISABLE KEYS */;
/*!40000 ALTER TABLE `quizresult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userNum` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(15) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  `userPw` varchar(45) DEFAULT NULL,
  `userEmail` varchar(45) DEFAULT NULL,
  `userResultM` varchar(45) DEFAULT NULL,
  `userResultQ` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userNum`),
  UNIQUE KEY `userNum_UNIQUE` (`userNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-27 17:12:00
