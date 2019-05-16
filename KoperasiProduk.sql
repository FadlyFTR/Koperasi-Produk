-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.1.37-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.5.0.5442
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for koperasiproduk
CREATE DATABASE IF NOT EXISTS `koperasiproduk` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `koperasiproduk`;

-- Dumping structure for table koperasiproduk.customer
CREATE TABLE IF NOT EXISTS `customer` (
  `id_cust` int(10) NOT NULL AUTO_INCREMENT,
  `nama_cust` varchar(30) NOT NULL,
  `username_cust` varchar(30) NOT NULL,
  `password_cust` varchar(30) NOT NULL,
  `telp_cust` varchar(13) NOT NULL,
  PRIMARY KEY (`id_cust`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table koperasiproduk.customer: ~0 rows (approximately)
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;

-- Dumping structure for table koperasiproduk.detail
CREATE TABLE IF NOT EXISTS `detail` (
  `id_produk` varchar(10) NOT NULL,
  `id_order` int(11) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  KEY `FK_detail_produk` (`id_produk`),
  KEY `FK_detail_order` (`id_order`),
  CONSTRAINT `FK_detail_order` FOREIGN KEY (`id_order`) REFERENCES `order` (`id_order`) ON UPDATE CASCADE,
  CONSTRAINT `FK_detail_produk` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table koperasiproduk.detail: ~0 rows (approximately)
/*!40000 ALTER TABLE `detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail` ENABLE KEYS */;

-- Dumping structure for table koperasiproduk.order
CREATE TABLE IF NOT EXISTS `order` (
  `id_order` int(11) NOT NULL AUTO_INCREMENT,
  `id_cust` int(11) NOT NULL,
  `tgl_order` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` enum('Y','N') NOT NULL DEFAULT 'Y',
  PRIMARY KEY (`id_order`),
  KEY `FK_order_customer` (`id_cust`),
  CONSTRAINT `FK_order_customer` FOREIGN KEY (`id_cust`) REFERENCES `customer` (`id_cust`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table koperasiproduk.order: ~0 rows (approximately)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

-- Dumping structure for table koperasiproduk.pegawai
CREATE TABLE IF NOT EXISTS `pegawai` (
  `id_peg` varchar(10) NOT NULL,
  `id_produk` varchar(10) NOT NULL,
  `id_customer` int(11) NOT NULL,
  `id_order` int(11) NOT NULL,
  `nama_peg` varchar(30) NOT NULL,
  `email_peg` varchar(30) NOT NULL,
  `User_peg` varchar(50) NOT NULL,
  `password_cust` varchar(30) NOT NULL,
  `alamat_peg` varchar(50) NOT NULL,
  `telp_peg` varchar(13) NOT NULL,
  PRIMARY KEY (`id_peg`),
  KEY `FK_pegawai_produk` (`id_produk`),
  KEY `FK_pegawai_order` (`id_order`),
  KEY `FK_pegawai_customer` (`id_customer`),
  CONSTRAINT `FK_pegawai_customer` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_cust`) ON UPDATE CASCADE,
  CONSTRAINT `FK_pegawai_order` FOREIGN KEY (`id_order`) REFERENCES `order` (`id_order`) ON UPDATE CASCADE,
  CONSTRAINT `FK_pegawai_produk` FOREIGN KEY (`id_produk`) REFERENCES `produk` (`id_produk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table koperasiproduk.pegawai: ~0 rows (approximately)
/*!40000 ALTER TABLE `pegawai` DISABLE KEYS */;
/*!40000 ALTER TABLE `pegawai` ENABLE KEYS */;

-- Dumping structure for table koperasiproduk.produk
CREATE TABLE IF NOT EXISTS `produk` (
  `id_produk` varchar(10) NOT NULL,
  `nama_produk` varchar(30) NOT NULL,
  `harga_produk` int(11) NOT NULL,
  `Stok` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table koperasiproduk.produk: ~1 rows (approximately)
/*!40000 ALTER TABLE `produk` DISABLE KEYS */;
INSERT INTO `produk` (`id_produk`, `nama_produk`, `harga_produk`, `Stok`) VALUES
	('1', 'adad', 1, 1),
	('AA001', 'Garpit', 16000, NULL);
/*!40000 ALTER TABLE `produk` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
