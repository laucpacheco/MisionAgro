-- MySQL Script generated by MySQL Workbench
-- Wed Sep 14 21:35:26 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`usuario` (
  `usuario_id` INT NOT NULL,
  `nombre_usuario` VARCHAR(50) NOT NULL,
  `correo_usuario` VARCHAR(255) NOT NULL,
  `telefono_usuario` INT NOT NULL,
  `contraseña_usuario` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`usuario_id`),
  UNIQUE INDEX `nombre_completo_UNIQUE` (`nombre_usuario` ASC),
  UNIQUE INDEX `correo_UNIQUE` (`correo_usuario` ASC),
  UNIQUE INDEX `contraseña_UNIQUE` (`contraseña_usuario` ASC));


-- -----------------------------------------------------
-- Table `mydb`.`categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`categoria` (
  `categoria_id` INT NOT NULL,
  `nombre_categoria` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`categoria_id`),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre_categoria` ASC));


-- -----------------------------------------------------
-- Table `mydb`.`imagen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`imagen` (
  `imagen_id` INT NOT NULL,
  `nombre_imagen` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`imagen_id`),
  UNIQUE INDEX `imagen_id_UNIQUE` (`imagen_id` ASC)  );


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`producto` (
  `producto_id` INT NOT NULL,
  `nombre_producto` VARCHAR(45) NOT NULL,
  `descripción_producto` TEXT(500) NOT NULL,
  `imagen_producto` INT NOT NULL,
  `productor` INT NOT NULL,
  `categoria_producto` INT NOT NULL,
  PRIMARY KEY (`producto_id`),
  INDEX `productor_idx` (`productor` ASC),
  INDEX `tipo_idx` (`categoria_producto` ASC),
  INDEX `imagen_producto_idx` (`imagen_producto` ASC),
  CONSTRAINT `productor`
    FOREIGN KEY (`productor`)
    REFERENCES `mydb`.`usuario` (`usuario_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `categoria_producto`
    FOREIGN KEY (`categoria_producto`)
    REFERENCES `mydb`.`categoria` (`categoria_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `imagen_producto`
    FOREIGN KEY (`imagen_producto`)
    REFERENCES `mydb`.`imagen` (`imagen_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`login` (
  `login_id` INT NOT NULL,
  `correo_usuario_login` VARCHAR(255) NOT NULL,
  `contraseña_usuario_login` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`login_id`),
  UNIQUE INDEX `correo_usuario_UNIQUE` (`correo_usuario_login` ASC),
  UNIQUE INDEX `contraseña_UNIQUE` (`contraseña_usuario_login` ASC),
  CONSTRAINT `correo_usuario_login`
    FOREIGN KEY (`correo_usuario_login`)
    REFERENCES `mydb`.`usuario` (`correo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `contraseña_usuario_login`
    FOREIGN KEY (`contraseña_usuario_login`)
    REFERENCES `mydb`.`usuario` (`contraseña_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
