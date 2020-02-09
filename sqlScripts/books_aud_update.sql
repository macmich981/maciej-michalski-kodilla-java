DELIMITER $$

CREATE TRIGGER books_update AFTER UPDATE ON books
FOR EACH ROW
BEGIN
	INSERT INTO books_aud (event_date, event_type, book_id, new_title, new_pubyear, new_bestseller,
							old_title, old_pubyear, old_bestseller)
					VALUES(CURTIME(), "UPDATE", OLD.book_id, NEW.title, NEW.pubyear, NEW.bestseller,
							OLD.title, OLD.pubyear, OLD.bestseller);
END $$

DELIMITER ;