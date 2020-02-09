CREATE TABLE READERS_AUD (
	event_id INT(11) NOT NULL AUTO_INCREMENT,
    event_date DATETIME NOT NULL,
    event_type VARCHAR(10) DEFAULT NULL,
    reader_id INT(11) NOT NULL,
    old_firstname VARCHAR(50),
    new_firstname VARCHAR(50),
    old_lastname VARCHAR(50),
    new_lastname VARCHAR(50),
    old_peselid VARCHAR(11),
    new_peselid VARCHAR(11),
    new_viplevel VARCHAR(20),
    old_viplevel VARCHAR(20),
    PRIMARY KEY (`event_id`)
)