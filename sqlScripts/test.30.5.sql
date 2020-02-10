USE kodilla_course;

CREATE TABLE stats 
(
	stat_id 	INT(11) AUTO_INCREMENT PRIMARY KEY,
	stat_date 	DATETIME NOT NULL,
	state 		VARCHAR(20) NOT NULL,
	value INT(11) NOT NULL
);

SELECT * FROM stats;

CREATE VIEW bestsellers_count AS
SELECT COUNT(*) AS bestsellers
FROM books
WHERE bestseller = 1;

DROP VIEW bestsellers_count;

COMMIT;

INSERT INTO STATS (state_date, stat, value)
VALUES (CURRENT_TIMESTAMP, "Bestsellers", (SELECT * FROM bestsellers_count));

SELECT * FROM kodilla_course.bestsellers_count;

delimiter $$

CREATE EVENT update_bestsellers_count
	ON SCHEDULE EVERY 1 MINUTE
    DO 
		BEGIN
			CALL UpdateBestsellers();
			INSERT INTO stats (state_date, stat, value) 
            VALUES (CURRENT_TIMESTAMP, "Bestsellers", (SELECT * FROM bestsellers_count));
            COMMIT;
		END $$
        
delimiter ;

DROP EVENT update_bestsellers_count;

COMMIT;

SELECT * FROM kodilla_course.stats;

SELECT * FROM kodilla_course.bestsellers_count;