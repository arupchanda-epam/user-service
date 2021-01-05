CREATE TABLE IF NOT EXISTS `userdb`.`User` (
  `idUser` INT NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;