-- CREATE DATABASE Business;

-- use Business;

DROP TABLE IF EXISTS CustomerInfo;

CREATE TABLE IF NOT EXISTS CustomerInfo
(
CourseName varchar(55),
PurchaseDate date,
Amount int(50),
Location varchar(50));


-- Seed data
INSERT INTO CustomerInfo VALUES("Selenium",CURRENT_DATE(),120, "Africa");
INSERT INTO CustomerInfo VALUES("Protractor", CURRENT_DATE(),45, "Africa");
INSERT INTO CustomerInfo VALUES("Appium", CURRENT_DATE(),99, "Asia");
INSERT INTO CustomerInfo VALUES("WebServices", CURRENT_DATE(),21, "Asia");
INSERT INTO CustomerInfo VALUES("JMeter", CURRENT_DATE(),76, "Asia");
INSERT INTO CustomerInfo VALUES("Data Engineering", CURRENT_DATE(),250, "Europe");


SELECT  * FROM CustomerInfo
WHERE Location = 'Asia'
AND PurchaseDate = curdate();