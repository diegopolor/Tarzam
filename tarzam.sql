-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-11-2021 a las 01:26:19
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tarzam`
--
 CREATE DATABASE tarzam;
 USE tarzam;
-- -------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `codigo_boleta` int(5) NOT NULL COMMENT 'Clave Primaria',
  `numdocumento_cliente` int(12) NOT NULL COMMENT 'Clave foranea',
  `nroboleta_boleta` varchar(5) COLLATE utf8_spanish2_ci NOT NULL,
  `datealquiler_boleta` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `numdocumento_cliente` int(11) NOT NULL COMMENT 'Clave primaria',
  `nombre_cliente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `apellidos_cliente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `direccion_cliente` varchar(80) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono_cliente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `celular_cliente` varchar(50) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;


-- ................... DATOS INTRODUCIDOS ------------------------------- --
INSERT INTO cliente  VALUES (32234523, "Alvaro", "Rosales Medina", "Calle 54B #34 - 234", 325522, 3203345);
INSERT INTO cliente VALUES (32344423, "Leticia", "Sotomayor Alvarez", "Carrera 23F #33 - 564", 324322, 323345);

SELECT * FROM cliente;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_boleta`
--

CREATE TABLE `detalle_boleta` (
  `codigo_detalleboleta` int(5) NOT NULL COMMENT 'Clave Primaria',
  `codigo_pelicula` int(5) NOT NULL COMMENT 'Clave foranea',
  `precioalquilado_detalleboleta` int(11) NOT NULL,
  `devuelto_detalleboleta` tinyint(1) NOT NULL,
  `datedevuelto_detalleboleta` datetime NOT NULL,
  `diasmora_detalleboleta` int(11) NOT NULL COMMENT 'Dias de retraso de la entrega'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `codigo_pelicula` int(5) NOT NULL  COMMENT 'Clave primaria',
  `titulo_pelicula` varchar(80) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo_pelicula` varchar(15) COLLATE utf8_spanish2_ci NOT NULL COMMENT 'Selección: Comedia, Accion, Terror, etc.',
  `categoria_pelicula` varchar(10) COLLATE utf8_spanish2_ci NOT NULL COMMENT 'Selección: Estreno, normal, clasico',
  `actorprincipal_pelicula` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `precioactual_pelicula` int(11) NOT NULL,
  `stock_pelicula` int(11) NOT NULL,
  `saldo_pelicula` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- -----------------------DATOS INSERTADOS EN PELICULA----------------------------------- --
INSERT INTO pelicula VALUES (1, "Venom", "Acción", "Superheroe", "Tom Hardy", 0, 0, 0);
INSERT INTO pelicula VALUES (2, "Avengers", "Acción", "Superheroe", "No Disponible", 0, 0, 0);


--       
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(5) NOT NULL COMMENT 'Id de usuario',
  `username` varchar(50) NOT NULL COMMENT 'Nombre de usuario',
  `password` varchar(100) NOT NULL COMMENT 'Contraseña'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `username`, `password`) VALUES
(1, 'admin', '123');
INSERT INTO `usuario` (`id_usuario`, `username`, `password`) VALUES
(2, 'diego', '1234');
INSERT INTO `usuario` (`username`, `password`) VALUES
('anderson', '1234');




select * from usuario;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`codigo_boleta`),
  ADD KEY `FOREING` (`numdocumento_cliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`numdocumento_cliente`);

--
-- Indices de la tabla `detalle_boleta`
--
ALTER TABLE `detalle_boleta`
  ADD PRIMARY KEY (`codigo_detalleboleta`),
  ADD KEY `FOREING PELICULA` (`codigo_pelicula`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`codigo_pelicula`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `boleta`
--
ALTER TABLE `boleta`
  MODIFY `codigo_boleta` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria';

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `numdocumento_cliente` int(12) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria';

--
-- AUTO_INCREMENT de la tabla `detalle_boleta`
--
ALTER TABLE `detalle_boleta`
  MODIFY `codigo_detalleboleta` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Clave Primaria';

--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `codigo_pelicula` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria';

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Id de usuario', AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD CONSTRAINT `boleta_ibfk_1` FOREIGN KEY (`numdocumento_cliente`) REFERENCES `cliente` (`numdocumento_cliente`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

