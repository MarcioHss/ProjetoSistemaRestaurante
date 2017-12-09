-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: projetosistemarestaurante
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cadclientes`
--

DROP TABLE IF EXISTS `cadclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cadclientes` (
  `cod_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cliente` char(100) DEFAULT NULL,
  `cpf_cliente` char(11) DEFAULT NULL,
  `rg_cliente` char(20) DEFAULT NULL,
  `cep_cliente` char(10) DEFAULT NULL,
  `cidade_cliente` char(100) DEFAULT NULL,
  `endereco_cliente` char(100) DEFAULT NULL,
  `uf_cliente` varchar(2) DEFAULT NULL,
  `sexo_cliente` char(10) DEFAULT NULL,
  `estadocivil_cliente` char(8) DEFAULT NULL,
  `opcaoservico_cliente` char(100) DEFAULT NULL,
  PRIMARY KEY (`cod_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadclientes`
--

LOCK TABLES `cadclientes` WRITE;
/*!40000 ALTER TABLE `cadclientes` DISABLE KEYS */;
INSERT INTO `cadclientes` VALUES (1,'cristhian','112','112','112','112','1','GO','Feminino','Solteiro','Self-Service'),(2,'1','1','1','1','1','1','GO','Feminino','Solteiro','Self-Service'),(3,'Marcio Henrique de Souza Soares','77777','77777','77777','Rio Verde','Rua Betel Quadra 16 Lote 26','GO','Masculino','Solteiro','Self-Service');
/*!40000 ALTER TABLE `cadclientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-09 17:10:32
