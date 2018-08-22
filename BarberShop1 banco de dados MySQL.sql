-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.41-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para db_barbershop
DROP DATABASE IF EXISTS `db_barbershop`;
CREATE DATABASE IF NOT EXISTS `db_barbershop` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_barbershop`;

-- Copiando estrutura para tabela db_barbershop.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_barbershop.hibernate_sequence: 1 rows
DELETE FROM `hibernate_sequence`;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Copiando estrutura para tabela db_barbershop.tbl_fornecedores
DROP TABLE IF EXISTS `tbl_fornecedores`;
CREATE TABLE IF NOT EXISTS `tbl_fornecedores` (
  `forn_id` int(11) NOT NULL,
  `forn_bairro` varchar(25) NOT NULL,
  `forn_celular` varchar(15) NOT NULL,
  `forn_cnpj` varchar(14) NOT NULL,
  `forn_email` varchar(30) NOT NULL,
  `forn_endereco` varchar(30) NOT NULL,
  `forn_nome_fornecedor` varchar(30) NOT NULL,
  `forn_telefone_comercial` varchar(14) NOT NULL,
  `forn_nome_` varchar(20) NOT NULL,
  PRIMARY KEY (`forn_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_barbershop.tbl_fornecedores: 3 rows
DELETE FROM `tbl_fornecedores`;
/*!40000 ALTER TABLE `tbl_fornecedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_fornecedores` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
