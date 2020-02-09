DELIMITER $$

CREATE TRIGGER readers_delete AFTER DELETE ON readers
FOR EACH ROW
BEGIN
	INSERT INTO readers_aud (event_date, event_type, reader_id)
					VALUES(CURTIME(), "DELETE", OLD.reader_id);
END $$

DELIMITER ;