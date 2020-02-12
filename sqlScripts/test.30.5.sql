USE kodilla_course;

CREATE TABLE stats 
(
	stat_id 	INT(11) AUTO_INCREMENT PRIMARY KEY,
	stat_date 	DATETIME NOT NULL,
	stat 		VARCHAR(20) NOT NULL,
	value INT(11) NOT NULL
);

CREATE VIEW bestsellers_count AS
SELECT COUNT(*) AS bestsellers
FROM books
WHERE bestseller = 1;

DELIMITER $$

CREATE EVENT update_bestsellers_count
	ON SCHEDULE EVERY 1 MINUTE
    DO 
		BEGIN
			CALL UpdateBestsellers();
			INSERT INTO stats (stat_date, stat, value) 
            VALUES (CURRENT_TIMESTAMP, "Bestsellers", (SELECT * FROM bestsellers_count));
            COMMIT;
		END $$

DELIMITER ;

DROP EVENT update_bestsellers_count;