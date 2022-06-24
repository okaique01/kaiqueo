-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: kaiqueo
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `candidato`
--

DROP TABLE IF EXISTS `candidato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidato` (
  `idcandidato` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `partido` varchar(100) NOT NULL,
  `numero` int NOT NULL,
  `cargo` varchar(100) NOT NULL,
  PRIMARY KEY (`idcandidato`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidato`
--

LOCK TABLES `candidato` WRITE;
/*!40000 ALTER TABLE `candidato` DISABLE KEYS */;
/*!40000 ALTER TABLE `candidato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eleitor`
--

DROP TABLE IF EXISTS `eleitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eleitor` (
  `ideleitor` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `tituloEleitor` int NOT NULL,
  `cpf` varchar(20) NOT NULL,
  PRIMARY KEY (`ideleitor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eleitor`
--

LOCK TABLES `eleitor` WRITE;
/*!40000 ALTER TABLE `eleitor` DISABLE KEYS */;
/*!40000 ALTER TABLE `eleitor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votos`
--

DROP TABLE IF EXISTS `votos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `votos` (
  `idvotos` int NOT NULL AUTO_INCREMENT,
  `fkcandidato` int DEFAULT NULL,
  `fkeleitor` int DEFAULT NULL,
  PRIMARY KEY (`idvotos`),
  KEY `fkcandidato` (`fkcandidato`),
  KEY `fkeleitor` (`fkeleitor`),
  CONSTRAINT `votos_ibfk_1` FOREIGN KEY (`fkcandidato`) REFERENCES `candidato` (`idcandidato`),
  CONSTRAINT `votos_ibfk_2` FOREIGN KEY (`fkeleitor`) REFERENCES `eleitor` (`ideleitor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votos`
--

LOCK TABLES `votos` WRITE;
/*!40000 ALTER TABLE `votos` DISABLE KEYS */;
/*!40000 ALTER TABLE `votos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'kaiqueo'
--

--
-- Dumping routines for database 'kaiqueo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-24  8:36:54
