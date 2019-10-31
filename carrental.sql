-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 31 oct. 2019 à 10:51
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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `booking`
--

INSERT INTO `booking` (`booking_id`, `car_id`, `client_id`, `date_end`, `date_start`, `distance_estimated`, `distance_performed`) VALUES
(5, 1, 1, '2019-11-02', '2019-11-02', 100, 99),
(6, 2, 2, '2019-11-02', '2019-11-01', 100, 99),
(7, 3, 3, '2019-11-22', '2019-11-04', 100, 99),
(8, 4, 4, '2019-11-07', '2019-11-06', 100, 23),
(9, 5, 5, '2019-11-11', '2019-11-08', 100, 99),
(10, 6, 6, '2019-11-29', '2019-11-10', 100, 200);

-- --------------------------------------------------------

--
-- Structure de la table `cars`
--

DROP TABLE IF EXISTS `cars`;
CREATE TABLE IF NOT EXISTS `cars` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `marque` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `modele` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `couleur` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `immatriculation` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `prix` float NOT NULL,
  `tarif_km` int(10) NOT NULL,
  `cv` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `image_url` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `cars`
--

INSERT INTO `cars` (`id`, `marque`, `modele`, `couleur`, `immatriculation`, `prix`, `tarif_km`, `cv`, `image_url`) VALUES
(1, 'PEUGEOT', '308', 'bleu anthracite', '113AAA69', 55, 5, '20', ''),
(2, 'PEUGEOT', '307', 'VERT SAPIN', '113AAA69', 55, 5, '20', ''),
(3, 'AUDI', 'A4', 'NOIR', '542CDB38', 60, 7, '36', ''),
(4, 'PEUGEOT', '407', 'VERT SAPIN', '113AAA69', 55, 5, '20', ''),
(5, 'AUDI', 'A8', 'NOIR', '542CDB38', 60, 7, '36', ''),
(6, 'AUDI', 'A3', 'NOIR', '542CDB38', 60, 7, '36', '');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id` int(11) NOT NULL,
  `date_naissance` date DEFAULT NULL,
  `date_obtention_permis` date DEFAULT NULL,
  `nom` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `numero_permis` int(11) NOT NULL,
  `prenom` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `date_naissance`, `date_obtention_permis`, `nom`, `numero_permis`, `prenom`) VALUES
(1, '2019-02-04', '2019-10-10', 'Dupontel', 123456, 'Albert'),
(2, '2001-02-04', '2017-10-10', 'DeRachidou', 343434, 'Leonard'),
(5, '2001-02-04', '2017-10-10', 'Rachidouxxxxx', 3434334, 'Leonardo');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
