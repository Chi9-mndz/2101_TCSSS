-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2024 at 04:05 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coffeeshopinventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`category_id`, `category_name`) VALUES
(1, 'Hot Coffees'),
(2, 'Lattes'),
(3, 'Cappuccinos'),
(4, 'Flat Whites');

-- --------------------------------------------------------

--
-- Table structure for table `combo_meals`
--

CREATE TABLE `combo_meals` (
  `combo_id` int(11) NOT NULL,
  `combo_name` varchar(150) NOT NULL,
  `description` text DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `combo_meals`
--

INSERT INTO `combo_meals` (`combo_id`, `combo_name`, `description`, `quantity`) VALUES
(1, 'Christmas Tree Cookie with White Chocolate Cream', 'A festive Christmas Tree Cookie paired with rich White Chocolate Cream.', 100),
(2, 'Chocolate Chip Cookie with Java Chip Frappuccino', 'Classic Chocolate Chip Cookie served with a refreshing Java Chip Frappuccino.', 100),
(3, 'Baked Mango Croissants with Iced Vanilla Latte', 'Delicious Baked Mango Croissants paired with a creamy Iced Vanilla Latte.', 100),
(4, 'Blueberry Cupcake with Iced Shaken Espresso', 'A tangy Blueberry Cupcake accompanied by a bold Iced Shaken Espresso.', 100),
(5, 'Red Velvet Cupcake with Chocolate Cookie Crumble', 'A decadent Red Velvet Cupcake paired with a Chocolate Cookie Crumble Frappuccino.', 100);

-- --------------------------------------------------------

--
-- Table structure for table `frappuccino_categories`
--

CREATE TABLE `frappuccino_categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `frappuccino_categories`
--

INSERT INTO `frappuccino_categories` (`category_id`, `category_name`) VALUES
(1, 'Coffee Frappuccino'),
(2, 'Creme Frappuccino');

-- --------------------------------------------------------

--
-- Table structure for table `frappuccino_products`
--

CREATE TABLE `frappuccino_products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `frappuccino_products`
--

INSERT INTO `frappuccino_products` (`product_id`, `product_name`, `category_id`, `quantity`) VALUES
(1, 'Mocha Cookie Crumble', 1, 100),
(2, 'Caffe Vanilla', 1, 100),
(3, 'Java Chip', 1, 100),
(4, 'Mocha', 1, 100),
(5, 'Strawberry Creme', 2, 100),
(6, 'Chocolate Cookie Crumble', 2, 100),
(7, 'White Chocolate Creme', 2, 100),
(8, 'Caramel Creme Frappuccino', 2, 100);

-- --------------------------------------------------------

--
-- Table structure for table `iced_categories`
--

CREATE TABLE `iced_categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `iced_categories`
--

INSERT INTO `iced_categories` (`category_id`, `category_name`) VALUES
(1, 'Iced Americanos'),
(2, 'Iced Mochas'),
(3, 'Iced Coffees'),
(4, 'Iced Lattes'),
(5, 'Iced Macchiatos');

-- --------------------------------------------------------

--
-- Table structure for table `iced_products`
--

CREATE TABLE `iced_products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `iced_products`
--

INSERT INTO `iced_products` (`product_id`, `product_name`, `category_id`, `quantity`) VALUES
(1, 'Iced Caffe Americano', 1, 100),
(2, 'Iced White Chocolate Mocha', 2, 100),
(3, 'Iced Coffee', 3, 100),
(4, 'Iced Shaken Espresso', 3, 100),
(5, 'Iced Caramel Latte', 4, 100),
(6, 'Iced Vanilla Latte', 4, 100),
(7, 'Iced Caramel Macchiato', 5, 100);

-- --------------------------------------------------------

--
-- Table structure for table `milktea_categories`
--

CREATE TABLE `milktea_categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `milktea_categories`
--

INSERT INTO `milktea_categories` (`category_id`, `category_name`) VALUES
(1, 'Milk Teas');

-- --------------------------------------------------------

--
-- Table structure for table `milktea_products`
--

CREATE TABLE `milktea_products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `milktea_products`
--

INSERT INTO `milktea_products` (`product_id`, `product_name`, `category_id`, `quantity`) VALUES
(1, 'Dark Choco Trio', 1, 100),
(2, 'Brown Sugar Velvet', 1, 100),
(3, 'Sueno de Matcha', 1, 100),
(4, 'Luxe Creme Delight', 1, 100),
(5, 'Crisp and Creme Delight', 1, 100);

-- --------------------------------------------------------

--
-- Table structure for table `pastry_categories`
--

CREATE TABLE `pastry_categories` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pastry_categories`
--

INSERT INTO `pastry_categories` (`category_id`, `category_name`) VALUES
(1, 'Breakfast Sandwich'),
(2, 'Bakery'),
(3, 'Croissants'),
(4, 'Cupcakes');

-- --------------------------------------------------------

--
-- Table structure for table `pastry_products`
--

CREATE TABLE `pastry_products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pastry_products`
--

INSERT INTO `pastry_products` (`product_id`, `product_name`, `category_id`, `quantity`) VALUES
(1, 'Egg Pesto and Mozzarella', 1, 100),
(2, 'Santa\'s Cookie', 2, 100),
(3, 'Double Chocolate Brownies', 2, 100),
(4, 'Christmas Tree Cookie', 2, 100),
(5, 'Chocolate Chip Cookie', 2, 100),
(6, 'Baked Mango Croissants', 3, 100),
(7, 'Butter Croissants', 3, 100),
(8, 'Chocolate Croissants', 3, 100),
(9, 'Red Velvet Cupcake', 4, 100),
(10, 'Blueberry Cupcake', 4, 100);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT 100
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`product_id`, `product_name`, `category_id`, `quantity`) VALUES
(1, 'Caffe Americano', 1, 100),
(2, 'Caffe Latte', 2, 100),
(3, 'Vanilla Latte', 2, 100),
(4, 'Caramel Macchiato', 2, 100),
(5, 'Espresso Macchiato', 2, 100),
(6, 'Cappuccino', 3, 100),
(7, 'Flat White', 4, 100),
(8, 'Honey Almond Milk', 4, 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `combo_meals`
--
ALTER TABLE `combo_meals`
  ADD PRIMARY KEY (`combo_id`);

--
-- Indexes for table `frappuccino_categories`
--
ALTER TABLE `frappuccino_categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `frappuccino_products`
--
ALTER TABLE `frappuccino_products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `iced_categories`
--
ALTER TABLE `iced_categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `iced_products`
--
ALTER TABLE `iced_products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `milktea_categories`
--
ALTER TABLE `milktea_categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `milktea_products`
--
ALTER TABLE `milktea_products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `pastry_categories`
--
ALTER TABLE `pastry_categories`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `pastry_products`
--
ALTER TABLE `pastry_products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `combo_meals`
--
ALTER TABLE `combo_meals`
  MODIFY `combo_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `frappuccino_categories`
--
ALTER TABLE `frappuccino_categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `frappuccino_products`
--
ALTER TABLE `frappuccino_products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `iced_categories`
--
ALTER TABLE `iced_categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `iced_products`
--
ALTER TABLE `iced_products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `milktea_categories`
--
ALTER TABLE `milktea_categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `milktea_products`
--
ALTER TABLE `milktea_products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pastry_categories`
--
ALTER TABLE `pastry_categories`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pastry_products`
--
ALTER TABLE `pastry_products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `frappuccino_products`
--
ALTER TABLE `frappuccino_products`
  ADD CONSTRAINT `frappuccino_products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `frappuccino_categories` (`category_id`);

--
-- Constraints for table `iced_products`
--
ALTER TABLE `iced_products`
  ADD CONSTRAINT `iced_products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `iced_categories` (`category_id`);

--
-- Constraints for table `milktea_products`
--
ALTER TABLE `milktea_products`
  ADD CONSTRAINT `milktea_products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `milktea_categories` (`category_id`);

--
-- Constraints for table `pastry_products`
--
ALTER TABLE `pastry_products`
  ADD CONSTRAINT `pastry_products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `pastry_categories` (`category_id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
