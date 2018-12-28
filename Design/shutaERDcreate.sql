-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`user_information`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`user_information` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NULL,
  `phone_number` VARCHAR(13) NULL,
  `fullname` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`lecture`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`lecture` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_information_id` INT NOT NULL,
  PRIMARY KEY (`id`, `user_information_id`),
  CONSTRAINT `fk_lecture_user_information1`
    FOREIGN KEY (`user_information_id`)
    REFERENCES `mydb`.`user_information` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_lecture_user_information1_idx` ON `mydb`.`lecture` (`user_information_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`studen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`studen` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_information_id` INT NOT NULL,
  PRIMARY KEY (`id`, `user_information_id`),
  CONSTRAINT `fk_studen_user_information1`
    FOREIGN KEY (`user_information_id`)
    REFERENCES `mydb`.`user_information` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_studen_user_information1_idx` ON `mydb`.`studen` (`user_information_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`course` (
  `code` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `lecture_id` INT NOT NULL,
  `studen_id` INT NOT NULL,
  PRIMARY KEY (`code`, `lecture_id`, `studen_id`),
  CONSTRAINT `fk_course_lecture1`
    FOREIGN KEY (`lecture_id`)
    REFERENCES `mydb`.`lecture` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_course_studen1`
    FOREIGN KEY (`studen_id`)
    REFERENCES `mydb`.`studen` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_course_lecture1_idx` ON `mydb`.`course` (`lecture_id` ASC);

CREATE INDEX `fk_course_studen1_idx` ON `mydb`.`course` (`studen_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`class`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`class` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `room` VARCHAR(45) NULL,
  `course_code` INT NOT NULL,
  `course_lecture_id` INT NOT NULL,
  `course_studen_id` INT NOT NULL,
  PRIMARY KEY (`id`, `course_code`, `course_lecture_id`, `course_studen_id`),
  CONSTRAINT `fk_class_course1`
    FOREIGN KEY (`course_code` , `course_lecture_id` , `course_studen_id`)
    REFERENCES `mydb`.`course` (`code` , `lecture_id` , `studen_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_class_course1_idx` ON `mydb`.`class` (`course_code` ASC, `course_lecture_id` ASC, `course_studen_id` ASC);


-- -----------------------------------------------------
-- Table `mydb`.`authentication`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`authentication` (
  `id` INT NOT NULL,
  `hash_password` VARCHAR(45) NULL,
  `reset` VARCHAR(45) NULL,
  `user_information_id` INT NOT NULL,
  PRIMARY KEY (`id`, `user_information_id`),
  CONSTRAINT `fk_authentication_user_information1`
    FOREIGN KEY (`user_information_id`)
    REFERENCES `mydb`.`user_information` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_authentication_user_information1_idx` ON `mydb`.`authentication` (`user_information_id` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
