USE college;
CREATE TABLE students(
	id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT
);

INSERT INTO students VALUES
(1,'Sathwika',20),
(2,'Surya',25),
(3,'sathya',28),
(4,'Akshitha',21),
(5,'Sahithi',22);
SELECT * FROM students;