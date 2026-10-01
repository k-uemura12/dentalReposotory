-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- ホスト: 127.0.0.1
-- 生成日時: 2026-10-01 14:00:05
-- サーバのバージョン： 10.4.32-MariaDB
-- PHP のバージョン: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- データベース: `dental_board_db`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `appointment_db`
--

CREATE TABLE `appointment_db` (
  `id` bigint(20) NOT NULL,
  `appointment_date` date NOT NULL,
  `appointment_time` time(5) DEFAULT NULL,
  `patient_id` varchar(255) DEFAULT NULL,
  `patient_name` varchar(255) DEFAULT NULL,
  `treatment` varchar(255) DEFAULT NULL,
  `is_completed` bit(1) DEFAULT NULL,
  `is_extra_points` bit(1) DEFAULT NULL,
  `is_inspected` bit(1) DEFAULT NULL,
  `is_panorama` bit(1) DEFAULT NULL,
  `is_splint` bit(1) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- テーブルのデータのダンプ `appointment_db`
--

INSERT INTO `appointment_db` (`id`, `appointment_date`, `appointment_time`, `patient_id`, `patient_name`, `treatment`, `is_completed`, `is_extra_points`, `is_inspected`, `is_panorama`, `is_splint`, `memo`) VALUES
(2, '2026-09-13', '09:00:00.00000', 'P0001', '山崎 裕子', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(3, '2026-09-13', '09:30:00.00000', 'P0002', '森田 恒一', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(4, '2026-09-13', '10:00:00.00000', 'P0003', '池田 里奈', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(5, '2026-09-13', '10:30:00.00000', 'P0004', '橋本 和也', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(6, '2026-09-13', '11:00:00.00000', 'P0005', '阿部 恵', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(7, '2026-09-13', '11:30:00.00000', 'P0006', '石川 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(8, '2026-09-13', '12:00:00.00000', 'P0007', '前田 麻衣', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(9, '2026-09-13', '12:30:00.00000', 'P0008', '藤田 恒一', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(10, '2026-09-13', '13:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(11, '2026-09-13', '13:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(12, '2026-09-13', '14:00:00.00000', 'P0009', '長谷川 真紀', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(13, '2026-09-13', '14:30:00.00000', 'P0010', '藤井 美奈', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(14, '2026-09-13', '15:00:00.00000', 'P0011', '西村 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(15, '2026-09-13', '15:30:00.00000', 'P0012', '福田 亜紀', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(16, '2026-09-13', '16:00:00.00000', 'P0013', '太田 恒一', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(17, '2026-09-13', '16:30:00.00000', 'P0014', '三浦 玲子', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(18, '2026-09-13', '17:00:00.00000', 'P0015', '岡本 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(19, '2026-09-13', '17:30:00.00000', 'P0016', '松田 由紀', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(20, '2026-09-13', '18:00:00.00000', 'P0017', '中川 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(21, '2026-09-14', '09:00:00.00000', 'P0018', '佐藤 花子', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(22, '2026-09-14', '09:30:00.00000', 'P0019', '鈴木 一郎', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(23, '2026-09-14', '10:00:00.00000', 'P0020', '高橋 美咲', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(24, '2026-09-14', '10:30:00.00000', 'P0021', '田中 健太', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(25, '2026-09-14', '11:00:00.00000', 'P0022', '伊藤 陽子', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(26, '2026-09-14', '11:30:00.00000', 'P0023', '渡辺 翔太', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(27, '2026-09-14', '12:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(28, '2026-09-14', '12:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(29, '2026-09-14', '13:00:00.00000', 'P0024', '小林 彩', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(30, '2026-09-14', '13:30:00.00000', 'P0025', '加藤 大輔', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(31, '2026-09-14', '14:00:00.00000', 'P0026', '吉田 真由美', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(32, '2026-09-14', '14:30:00.00000', 'P0027', '山田 直樹', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(33, '2026-09-14', '15:00:00.00000', 'P0028', '佐々木 香織', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(34, '2026-09-14', '15:30:00.00000', 'P0029', '山口 雄太', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(35, '2026-09-14', '16:00:00.00000', 'P0030', '松本 由美', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(36, '2026-09-14', '16:30:00.00000', 'P0031', '井上 恒一', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(37, '2026-09-14', '17:00:00.00000', 'P0032', '木村 麻衣', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(38, '2026-09-14', '17:30:00.00000', 'P0033', '林 大樹', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(39, '2026-09-14', '18:00:00.00000', 'P0034', '清水 里奈', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(40, '2026-09-15', '09:00:00.00000', 'P0035', '山崎 裕子', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(41, '2026-09-15', '09:30:00.00000', 'P0036', '森 健一', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(42, '2026-09-15', '10:00:00.00000', 'P0037', '池田 美穂', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(43, '2026-09-15', '10:30:00.00000', 'P0038', '橋本 和也', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(44, '2026-09-15', '11:00:00.00000', 'P0039', '阿部 さゆり', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(45, '2026-09-15', '11:30:00.00000', 'P0040', '石川 達也', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(46, '2026-09-15', '12:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(47, '2026-09-15', '12:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(48, '2026-09-15', '13:00:00.00000', 'P0041', '前田 亜紀', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(49, '2026-09-15', '13:30:00.00000', 'P0042', '藤田 浩二', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(50, '2026-09-15', '14:00:00.00000', 'P0043', '小川 真理', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(51, '2026-09-15', '14:30:00.00000', 'P0044', '後藤 翔', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(52, '2026-09-15', '15:00:00.00000', 'P0045', '岡田 恵', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(53, '2026-09-15', '15:30:00.00000', 'P0046', '長谷川 誠', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(54, '2026-09-15', '16:00:00.00000', 'P0047', '村上 由香', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(55, '2026-09-15', '16:30:00.00000', 'P0048', '近藤 裕介', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(56, '2026-09-15', '17:00:00.00000', 'P0049', '石井 直子', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(57, '2026-09-15', '17:30:00.00000', 'P0050', '坂本 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(58, '2026-09-15', '18:00:00.00000', 'P0051', '遠藤 美奈', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(59, '2026-09-16', '09:00:00.00000', 'P0052', '青木 拓海', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(60, '2026-09-16', '09:30:00.00000', 'P0053', '藤井 愛子', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(61, '2026-09-16', '10:00:00.00000', 'P0054', '西村 和彦', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(62, '2026-09-16', '10:30:00.00000', 'P0055', '福田 千尋', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(63, '2026-09-16', '11:00:00.00000', 'P0056', '太田 修', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(64, '2026-09-16', '11:30:00.00000', 'P0057', '三浦 明美', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(65, '2026-09-16', '12:00:00.00000', 'P0058', '藤原 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(66, '2026-09-16', '12:30:00.00000', 'P0059', '岡本 麻衣子', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(67, '2026-09-16', '13:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(68, '2026-09-16', '13:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(69, '2026-09-16', '14:00:00.00000', 'P0060', '中野 恒一', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(70, '2026-09-16', '14:30:00.00000', 'P0061', '原田 里美', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(71, '2026-09-16', '15:00:00.00000', 'P0062', '小野 健', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(72, '2026-09-16', '15:30:00.00000', 'P0063', '竹内 美咲', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(73, '2026-09-16', '16:00:00.00000', 'P0064', '金子 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(74, '2026-09-16', '16:30:00.00000', 'P0065', '和田 佳奈', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(75, '2026-09-16', '17:00:00.00000', 'P0066', '中山 大介', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(76, '2026-09-16', '17:30:00.00000', 'P0067', '石田 陽一', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(77, '2026-09-16', '18:00:00.00000', 'P0068', '上田 真紀', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(78, '2026-09-17', '09:00:00.00000', 'P0069', '森田 拓也', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(79, '2026-09-17', '09:30:00.00000', 'P0070', '原 由美子', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(80, '2026-09-17', '10:00:00.00000', 'P0071', '柴田 恒一', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(81, '2026-09-17', '10:30:00.00000', 'P0072', '酒井 彩香', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(82, '2026-09-17', '11:00:00.00000', 'P0073', '工藤 恒一', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(83, '2026-09-17', '11:30:00.00000', 'P0074', '横山 直美', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(84, '2026-09-17', '12:00:00.00000', 'P0075', '宮崎 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(85, '2026-09-17', '12:30:00.00000', 'P0076', '宮本 香奈', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(86, '2026-09-17', '13:00:00.00000', 'P0077', '内田 隆', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(87, '2026-09-17', '13:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(88, '2026-09-17', '14:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(89, '2026-09-17', '14:30:00.00000', 'P0078', '島田 由佳', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(90, '2026-09-17', '15:00:00.00000', 'P0079', '谷口 大輔', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(91, '2026-09-17', '15:30:00.00000', 'P0080', '大野 恵美', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(92, '2026-09-17', '16:00:00.00000', 'P0081', '丸山 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(93, '2026-09-17', '16:30:00.00000', 'P0082', '今井 千夏', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(94, '2026-09-17', '17:00:00.00000', 'P0083', '河野 健太', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(95, '2026-09-17', '17:30:00.00000', 'P0084', '藤本 陽子', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(96, '2026-09-17', '18:00:00.00000', 'P0085', '村田 翔', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(97, '2026-09-18', '09:00:00.00000', 'P0086', '武田 由紀', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(98, '2026-09-18', '09:30:00.00000', 'P0087', '上野 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(99, '2026-09-18', '10:00:00.00000', 'P0088', '杉山 美奈', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(100, '2026-09-18', '10:30:00.00000', 'P0089', '増田 和也', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(101, '2026-09-18', '11:00:00.00000', 'P0090', '小島 愛', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(102, '2026-09-18', '11:30:00.00000', 'P0091', '大塚 直樹', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(103, '2026-09-18', '12:00:00.00000', 'P0092', '平野 真由', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(104, '2026-09-18', '12:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(105, '2026-09-18', '13:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(106, '2026-09-18', '13:30:00.00000', 'P0093', '松井 拓也', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(107, '2026-09-18', '14:00:00.00000', 'P0094', '岩崎 美智子', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(108, '2026-09-18', '14:30:00.00000', 'P0095', '野口 翔太', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(109, '2026-09-18', '15:00:00.00000', 'P0096', '新井 佳奈', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(110, '2026-09-18', '15:30:00.00000', 'P0097', '桜井 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(111, '2026-09-18', '16:00:00.00000', 'P0098', '大西 麻衣', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(112, '2026-09-18', '16:30:00.00000', 'P0099', '野村 健一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(113, '2026-09-18', '17:00:00.00000', 'P0100', '菊地 美咲', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(114, '2026-09-18', '17:30:00.00000', 'P0101', '佐野 恒一', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(115, '2026-09-18', '18:00:00.00000', 'P0102', '荒木 由美', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(116, '2026-09-19', '09:00:00.00000', 'P0103', '浜田 拓郎', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(117, '2026-09-19', '09:30:00.00000', 'P0104', '川口 陽子', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(118, '2026-09-19', '10:00:00.00000', 'P0105', '星野 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(119, '2026-09-19', '10:30:00.00000', 'P0106', '黒田 彩香', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(120, '2026-09-19', '11:00:00.00000', 'P0107', '平田 大樹', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(121, '2026-09-19', '11:30:00.00000', 'P0108', '山下 奈緒', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(122, '2026-09-19', '12:00:00.00000', 'P0109', '中島 亮', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(123, '2026-09-19', '12:30:00.00000', 'P0110', '高木 美穂', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(124, '2026-09-19', '13:00:00.00000', 'P0111', '安藤 恒一', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(125, '2026-09-19', '13:30:00.00000', 'P0112', '上村佳奈', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(126, '2026-09-19', '14:00:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(127, '2026-09-19', '14:30:00.00000', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL),
(128, '2026-09-19', '15:00:00.00000', 'P0113', '斉藤由美子', '検査１', NULL, NULL, NULL, NULL, NULL, NULL),
(129, '2026-09-19', '15:30:00.00000', 'P0114', '松田 翔平', '検査２', NULL, NULL, NULL, NULL, NULL, NULL),
(130, '2026-09-19', '16:00:00.00000', 'P0115', '中川 由紀', 'メンテナンス', NULL, NULL, NULL, NULL, NULL, NULL),
(131, '2026-09-19', '16:30:00.00000', 'P0116', '山本 愛', 'SRP', NULL, NULL, NULL, NULL, NULL, NULL),
(132, '2026-09-19', '17:00:00.00000', 'P0117', '中村 拓也', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(133, '2026-09-19', '17:30:00.00000', 'P0118', '菅原 恒一', '検査３', NULL, NULL, NULL, NULL, NULL, NULL),
(134, '2026-09-19', '18:00:00.00000', 'P0119', '久保 里奈', '検査１', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- テーブルの構造 `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- テーブルのデータのダンプ `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_GENERAL');

-- --------------------------------------------------------

--
-- テーブルの構造 `staffs`
--

CREATE TABLE `staffs` (
  `id` int(11) NOT NULL,
  `staff_id` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `staff_name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- テーブルのデータのダンプ `staffs`
--

INSERT INTO `staffs` (`id`, `staff_id`, `password`, `staff_name`, `role`) VALUES
(0, 'DH001', '$2a$10$ZP5hmfWAzXJl9EKOM8CceulK0h3c0Erl58GwrH3cH35a64NtO06NW', '上村佳奈', 'ROLE_ADMIN');

--
-- ダンプしたテーブルのインデックス
--

--
-- テーブルのインデックス `appointment_db`
--
ALTER TABLE `appointment_db`
  ADD PRIMARY KEY (`id`),
  ADD KEY `appointment_date` (`appointment_date`),
  ADD KEY `appointment_time` (`appointment_time`);

--
-- テーブルのインデックス `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `idx_staff_id` (`name`);

--
-- テーブルのインデックス `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `login_id` (`staff_id`),
  ADD KEY `FK4bfrsjp5ojwcqhtyrd8wsy5xc` (`role`);

--
-- ダンプしたテーブルの AUTO_INCREMENT
--

--
-- テーブルの AUTO_INCREMENT `appointment_db`
--
ALTER TABLE `appointment_db`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=269;

--
-- テーブルの AUTO_INCREMENT `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- ダンプしたテーブルの制約
--

--
-- テーブルの制約 `staffs`
--
ALTER TABLE `staffs`
  ADD CONSTRAINT `FK4bfrsjp5ojwcqhtyrd8wsy5xc` FOREIGN KEY (`role`) REFERENCES `roles` (`name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
