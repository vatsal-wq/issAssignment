-- running some basic queries on 3 tables created in company database

-- select query
SELECT * FROM employees;

-- select distinct query
SELECT DISTINCT department_id FROM employees;

-- where clause
SELECT * FROM employees WHERE department_id = 3;

-- where + and clause
SELECT * FROM employees WHERE department_id = 3 AND first_name = 'Rishabh';

-- where + or clause
SELECT * FROM employees WHERE department_id = 3 OR department_id = 4;

-- order by (default is asc)
SELECT * FROM employees ORDER BY last_name;
SELECT * FROM employees ORDER BY last_name DESC;

-- update query
UPDATE employees SET email = 'pant.rishabh@example.com' WHERE employee_id = 3;

-- delete query
-- DELETE FROM employees WHERE employee_id = 5;

-- injection command (1=1 is always true resulting in OR clause always returning 1)
SELECT * FROM employees WHERE first_name = 'John' OR '1'='1';

-- select top (LIMIT)
SELECT * FROM employees LIMIT 3;

-- like clause
SELECT * FROM employees WHERE first_name LIKE 'R%';

-- wildcards
SELECT * FROM employees WHERE email LIKE '%@example.com';

-- in
SELECT * FROM employees WHERE department_id IN (1,3);

-- betwwen
SELECT * FROM salaries WHERE salary BETWEEN 60000 AND 80000

-- aliases
SELECT first_name AS fname, last_name AS lname FROM employees;

--select into: this creates a new table using the result set of the query
SELECT * INTO employees_new FROM employees;
SELECT * FROM employees_new;