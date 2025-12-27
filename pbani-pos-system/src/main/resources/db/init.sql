-- MySQL Database Setup for POS System
-- Run this script as root user to initialize the database

-- Create the database
CREATE DATABASE IF NOT EXISTS `pos-pb`
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

-- Create a dedicated application user (recommended for production)
-- Uncomment and modify the password as needed:
-- CREATE USER IF NOT EXISTS 'pos_user'@'localhost' IDENTIFIED BY 'your_secure_password';
-- GRANT ALL PRIVILEGES ON `pos-pb`.* TO 'pos_user'@'localhost';
-- FLUSH PRIVILEGES;

-- Verify database was created
SHOW DATABASES LIKE 'pos-pb';

-- Use the database
USE `pos-pb`;
