-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 30 oct. 2019 à 09:38
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `carrental`
--

-- --------------------------------------------------------

--
-- Structure de la table `booking`
--

DROP TABLE IF EXISTS `booking`;
CREATE TABLE IF NOT EXISTS `booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_id` int(11) NOT NULL,
  `client_id` int(11) NOT NULL,
  `date_end` date DEFAULT NULL,
  `date_start` date DEFAULT NULL,
  `distance_estimated` int(11) NOT NULL,
  `distance_performed` int(11) NOT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `booking`
--

INSERT INTO `booking` (`booking_id`, `car_id`, `client_id`, `date_end`, `date_start`, `distance_estimated`, `distance_performed`) VALUES
(3, 1, 1, '2019-10-29', '2019-10-30', 100, 99),
(4, 1, 1, '2019-10-29', '2019-10-30', 100, 99),
(5, 5, 1, '2019-10-29', '2019-10-30', 100, 99),
(6, 5, 1, '2019-10-29', '2019-10-30', 100, 99),
(7, 7, 123, '2019-10-29', '2019-10-30', 100, 99);

-- --------------------------------------------------------

--
-- Structure de la table `cars`
--

DROP TABLE IF EXISTS `cars`;
CREATE TABLE IF NOT EXISTS `cars` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `marque` varchar(50) NOT NULL,
  `modele` varchar(50) NOT NULL,
  `couleur` varchar(50) NOT NULL,
  `immatriculation` varchar(50) NOT NULL,
  `prix` float NOT NULL,
  `tarif_km` int(10) NOT NULL,
  `CV` varchar(10) NOT NULL,
  `image_url` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `cars`
--

INSERT INTO `cars` (`id`, `marque`, `modele`, `couleur`, `immatriculation`, `prix`, `tarif_km`, `CV`, `image_url`) VALUES
(6, 'AUDI', 'A3', 'NOIR', '542CDB38', 60, 7, '36', ''),
(2, 'PEUGEOT', '307', 'VERT SAPIN', '113AAA69', 55, 5, '20', ''),
(3, 'AUDI', 'A3', 'NOIR', '542CDB38', 60, 7, '36', ''),
(4, 'PEUGEOT', '3070000', 'VERT SAPIN', '113AAA69', 55, 5, '20', ''),
(7, 'AUDI', 'A10', 'NOIR', '542CDB38', 60, 7, '36', ''),
(8, 'PEUGEOT', '308', 'bleu anthracite', '113AAA69', 55, 5, '20', '');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL,
  `date_naissance` datetime(6) DEFAULT NULL,
  `date_obtention_permis` datetime(6) DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `numero_permis` int(11) NOT NULL,
  `prenom` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `date_naissance`, `date_obtention_permis`, `nom`, `numero_permis`, `prenom`) VALUES
(1, '2019-02-04 00:00:00.000000', '2019-10-10 00:00:00.000000', 'Dupontel', 123456, 'Albert'),
(2, '2001-02-04 00:00:00.000000', '2017-10-10 00:00:00.000000', 'DeRachidou', 343434, 'Leonard'),
(5, '2001-02-04 00:00:00.000000', '2017-10-10 00:00:00.000000', 'Rachidouxxxxx', 3434334, 'Leonardo');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(6);

-- --------------------------------------------------------

--
-- Structure de la table `infoclient`
--

DROP TABLE IF EXISTS `infoclient`;
CREATE TABLE IF NOT EXISTS `infoclient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) COLLATE utf8_bin NOT NULL,
  `prenom` varchar(50) COLLATE utf8_bin NOT NULL,
  `date_naissance` date NOT NULL,
  `numero_permis` int(20) NOT NULL,
  `date_obtention_permis` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
