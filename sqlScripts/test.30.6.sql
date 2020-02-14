CREATE INDEX idx_books ON books (title);

CREATE INDEX idx_readers ON readers (firstname, lastname);

EXPLAIN SELECT *
FROM READERS
WHERE FIRSTNAME = 'John';