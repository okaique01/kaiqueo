/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Script;

/*
create database kaiqueo;
use kaiqueo;

CREATE TABLE `candidato` (
  `idcandidato` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `partido` varchar(100) NOT NULL,
  `numero` int NOT NULL,
  `cargo` varchar(100) NOT NULL,
  PRIMARY KEY (`idcandidato`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `eleitor` (
  `ideleitor` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `tituloEleitor` int NOT NULL,
  `cpf` varchar(20) NOT NULL,
  PRIMARY KEY (`ideleitor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `votos` (
  `idvotos` int NOT NULL AUTO_INCREMENT,
  `fkcandidato` int DEFAULT NULL,
  `fkeleitor` int DEFAULT NULL,
  PRIMARY KEY (`idvotos`),
  KEY `fkcandidato` (`fkcandidato`),
  KEY `fkeleitor` (`fkeleitor`),
  CONSTRAINT `votos_ibfk_1` FOREIGN KEY (`fkcandidato`) REFERENCES `candidato` (`idcandidato`),
  CONSTRAINT `votos_ibfk_2` FOREIGN KEY (`fkeleitor`) REFERENCES `eleitor` (`ideleitor`)
) 
*/