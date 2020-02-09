DELIMITER $$

CREATE TRIGGER readers_insert AFTER INSERT ON readers
FOR EACH ROW
BEGIN
	INSERT INTO readers_aud (event_date, event_type, reader_id, new_firstname, new_lastname,
							new_peselid)
					VALUES(CURTIME(), "INSERT", NEW.reader_id, NEW.firstname, NEW.lastname,
							NEW.peselid);
END $$

DELIMITER ;