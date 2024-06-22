-- Dropping a table
DROP TABLE IF EXISTS employees_new;

-- Dropping a view
DROP VIEW IF EXISTS employee_details;

-- Altering a table to add a new column
ALTER TABLE employees ADD COLUMN date_of_birth DATE;
SELECT * FROM employees;

-- Altering a table to drop a column
ALTER TABLE employees DROP COLUMN date_of_birth;
SELECT * FROM employees;