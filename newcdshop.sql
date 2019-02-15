-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 24, 2018 at 08:38 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newcdshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `3d`
--

CREATE TABLE `3d` (
  `3Did` int(11) NOT NULL,
  `movie_title` varchar(255) NOT NULL,
  `genre` text NOT NULL,
  `min` varchar(10) NOT NULL,
  `decription` text NOT NULL,
  `year` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_username` varchar(50) COLLATE latin1_general_cs NOT NULL,
  `passwords` varchar(50) COLLATE latin1_general_cs DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_username`, `passwords`) VALUES
('admin', '123'),
('Sahan', '123');

-- --------------------------------------------------------

--
-- Table structure for table `animation`
--

CREATE TABLE `animation` (
  `animation_movie` int(11) NOT NULL,
  `year` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `anime`
--

CREATE TABLE `anime` (
  `anime` varchar(255) NOT NULL,
  `year` year(4) NOT NULL,
  `seasons` varchar(255) NOT NULL,
  `price` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `box_office_movies`
--

CREATE TABLE `box_office_movies` (
  `hit_movie_no` int(11) NOT NULL,
  `availble` int(11) NOT NULL,
  `movie_name` int(11) NOT NULL,
  `total_gross` int(11) NOT NULL,
  `studio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cartoon`
--

CREATE TABLE `cartoon` (
  `cartoon_name` varchar(255) NOT NULL,
  `cartoon_year` year(4) NOT NULL,
  `seasons` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `cooking_show`
--

CREATE TABLE `cooking_show` (
  `cooking_show` text NOT NULL,
  `since` year(4) NOT NULL,
  `season` varchar(200) NOT NULL,
  `cookingID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(50) COLLATE latin1_general_cs NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

-- --------------------------------------------------------

--
-- Table structure for table `games`
--

CREATE TABLE `games` (
  `title` varchar(50) COLLATE latin1_general_cs NOT NULL,
  `released_year` int(11) DEFAULT NULL,
  `genre` varchar(50) COLLATE latin1_general_cs DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

--
-- Dumping data for table `games`
--

INSERT INTO `games` (`title`, `released_year`, `genre`, `quantity`, `price`) VALUES
('GTA1', 2013, 'dsadas', 20, 321),
('GTA2', 213, 'dsa', 12, 131);

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `invoice_id` int(11) NOT NULL,
  `title` varchar(50) COLLATE latin1_general_cs DEFAULT NULL,
  `category` varchar(50) COLLATE latin1_general_cs DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `customer_name` varchar(50) COLLATE latin1_general_cs DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

--
-- Dumping data for table `invoice`
--

INSERT INTO `invoice` (`invoice_id`, `title`, `category`, `quantity`, `customer_name`) VALUES
(31, 'GTA', 'TV Series', 1, NULL),
(32, 'GTA', 'games', 1, NULL),
(33, 'GTA', 'games', 1, NULL),
(34, 'GTA', 'TV Series', 1, NULL),
(35, 'Vikings', 'TV Series', 1, NULL),
(36, 'GTA', 'games', 1, NULL),
(37, 'GTA1', 'games', 1, NULL),
(38, 'GTA1', 'games', 1, NULL),
(39, 'GTA1', 'games', 1, NULL),
(40, 'GTA1', 'games', 1, NULL),
(41, 'GTA1', 'games', 1, NULL),
(42, 'GTA1', 'games', 1, NULL),
(43, 'GTA1', 'games', 1, NULL),
(44, 'GTA1', 'games', 1, NULL),
(45, 'GTA1', 'games', 2, NULL),
(46, 'GTA1', 'games', 1, NULL),
(47, 'GTA1', 'games', 2, NULL),
(48, 'GTA1', 'games', 5, NULL),
(49, 'GTA1', 'games', 1, NULL),
(50, 'GTA', 'TV Series', 1, NULL),
(51, 'GTA1', 'games', 1, NULL),
(52, 'GTA1', 'games', 1, NULL),
(53, 'GTA', 'TV Series', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `title` varchar(50) COLLATE latin1_general_cs NOT NULL,
  `released_year` int(11) DEFAULT NULL,
  `genre` varchar(50) COLLATE latin1_general_cs DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

-- --------------------------------------------------------

--
-- Table structure for table `onair_songs`
--

CREATE TABLE `onair_songs` (
  `hit_no` int(11) NOT NULL,
  `song_title` int(11) NOT NULL,
  `singer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `romantic_movies`
--

CREATE TABLE `romantic_movies` (
  `movie_title` varchar(255) NOT NULL,
  `year` year(4) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sportgame`
--

CREATE TABLE `sportgame` (
  `sportno` int(11) NOT NULL,
  `sportname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tv`
--

CREATE TABLE `tv` (
  `title` varchar(50) COLLATE latin1_general_cs NOT NULL,
  `released_year` int(11) DEFAULT NULL,
  `genre` varchar(50) COLLATE latin1_general_cs DEFAULT NULL,
  `no_of_seasons` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_cs;

--
-- Dumping data for table `tv`
--

INSERT INTO `tv` (`title`, `released_year`, `genre`, `no_of_seasons`, `quantity`, `price`) VALUES
('GTA', 123, 'dsa', 2, 81, 100),
('Vikings', 2014, 'Action', 5, 9, 100);

-- --------------------------------------------------------

--
-- Table structure for table `tvseries`
--

CREATE TABLE `tvseries` (
  `title` varchar(255) NOT NULL,
  `relyear` year(4) NOT NULL,
  `tvseason` varchar(255) NOT NULL,
  `tvgenre` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `3d`
--
ALTER TABLE `3d`
  ADD PRIMARY KEY (`3Did`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_username`);

--
-- Indexes for table `box_office_movies`
--
ALTER TABLE `box_office_movies`
  ADD PRIMARY KEY (`hit_movie_no`);

--
-- Indexes for table `cooking_show`
--
ALTER TABLE `cooking_show`
  ADD PRIMARY KEY (`cookingID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `games`
--
ALTER TABLE `games`
  ADD PRIMARY KEY (`title`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoice_id`),
  ADD UNIQUE KEY `customer_name` (`customer_name`);

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`title`);

--
-- Indexes for table `onair_songs`
--
ALTER TABLE `onair_songs`
  ADD PRIMARY KEY (`hit_no`);

--
-- Indexes for table `tv`
--
ALTER TABLE `tv`
  ADD PRIMARY KEY (`title`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `3d`
--
ALTER TABLE `3d`
  MODIFY `3Did` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `box_office_movies`
--
ALTER TABLE `box_office_movies`
  MODIFY `hit_movie_no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cooking_show`
--
ALTER TABLE `cooking_show`
  MODIFY `cookingID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `invoice`
--
ALTER TABLE `invoice`
  MODIFY `invoice_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `onair_songs`
--
ALTER TABLE `onair_songs`
  MODIFY `hit_no` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
