SELECT * FROM employee WHERE dept = 20;
SELECT * FROM employee WHERE salary > 2500;
SELECT * FROM employee WHERE jobType = 'software developer';
SELECT * FROM employee WHERE dept IN(10,20,40);
SELECT * FROM employee WHERE name LIKE 'S%';
SELECT * FROM employee WHERE name LIKE '_L%';
SELECT * FROM employee WHERE Fname LIKE '%A%A%';
SELECT * FROM employee WHERE Lname LIKE 'E_%';
SELECT * FROM employee WHERE Lname LIKE '_____';
SELECT * FROM employee WHERE salary BETWEEN 20000 AND 30000;