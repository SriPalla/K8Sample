CREATE DATABASE IF NOT EXISTS `core`;
USE `core`;
CREATE TABLE `core.bic_identifier` (
  `bic_code` char(11) NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`bic_code`)
);
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('ABNANL2AXXX','ABN AMRO BANK N.V.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('ABNYUS33XXX','NEW YORK COMMERCIAL BANK');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('AXISINBB002','AXIS BANK LIMITED');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('BARCGB22XXX','BARCLAYS BANK PLC');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('BNPAFRPPXXX','BNP PARIBAS SA (FORMELY BANQUE NATIONALE DE PARIS S.A.)');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('BOFAUS3NXXX','BANK OF AMERICA, N.A.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('CHASUS33XXX','JPMORGAN CHASE BANK, N.A.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('CITIUS33XXX','CITIBANK N.A.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('COBADEFFXXX','COMMERZBANK AG (BANKING COMMUNICATION SYSTEM)');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('DEUTDEDBPAL','DEUTSCHE BANK PRIVAT-UND GESCHAEFTSKUNDEN AG');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('HSBCUS3MXXX','HSBC PRIVATE BANK INTERNATIONAL');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('ICICUS3NXXX','ICICI BANK LIMITED');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('LOYDGB2LXXX','LLOYDS BANK PLC');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('MIDLGB22XXX','HSBC BANK PLC');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('NTSBDEB1XXX','N26 BANK GMBH (Used for NUMBER26 bank accounts)');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('NWBKGB2LXXX','NATIONAL WESTMINSTER BANK PLC');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('POALILITXXX','BANK HAPOALIM B.M.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('PPALUS66XXX','PAYPAL INC.');
INSERT INTO `core.bic_identifier` (`bic_code`,`description`) VALUES ('WFBIUS6SXXX','WELLS FARGO BANK, N.A.');