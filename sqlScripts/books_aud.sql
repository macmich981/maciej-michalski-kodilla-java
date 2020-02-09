CREATE TABLE books_aud (
	event_id INT(11) NOT NULL AUTO_INCREMENT,
    event_date DATETIME NOT NULL,
    event_type VARCHAR(10) DEFAULT NULL,
    book_id INT(11) NOT NULL,
    old_title VARCHAR(50),
    new_title VARCHAR(50),
    old_pubyear INT(4),
    new_pubyear INT(4),
    old_bestseller BOOLEAN,
    new_bestseller BOOLEAN,
    PRIMARY KEY (`event_id`)
)