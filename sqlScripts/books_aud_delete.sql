DELIMITER $$

CREATE TRIGGER books_delete AFTER DELETE ON books
FOR EACH ROW
BEGIN
	INSERT INTO books_aud (event_date, event_type, book_id)
					VALUES(CURTIME(), "DELETE", OLD.book_id);
END $$

DELIMITER $$