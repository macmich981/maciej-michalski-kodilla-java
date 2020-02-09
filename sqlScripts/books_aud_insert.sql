DELIMITER $$

CREATE TRIGGER books_insert AFTER INSERT ON books
FOR EACH ROW
BEGIN
	INSERT INTO books_aud (event_date, event_type, book_id, new_title, new_pubyear, new_bestseller)
					VALUES(CURTIME(), "INSERT", NEW.book_id, NEW.title, NEW.pubyear, NEW.bestseller);
END $$

DELIMITER ;