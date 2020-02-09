DELIMITER $$

CREATE TRIGGER readers_update AFTER UPDATE ON readers
FOR EACH ROW
BEGIN
	INSERT INTO readers_aud (event_date, event_type, reader_id, new_firstname, new_lastname,
							new_peselid, new_viplevel, old_firstname, old_lastname, old_peselid, old_viplevel)
					VALUES(CURTIME(), "UPDATE", OLD.reader_id, NEW.firstname, NEW.lastname,
							NEW.peselid, NEW.vip_level, OLD.firstname, OLD.lastname, OLD.pseselid, OLD.vip_level);
END $$

DELIMITER ;