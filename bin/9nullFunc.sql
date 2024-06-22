-- Using IFNULL to replace NULLs in a query
SELECT employee_id, first_name, last_name, IFNULL(email, 'No Email') AS email
FROM employees;

-- Using COALESCE to replace NULLs in a query
SELECT employee_id, first_name, last_name, COALESCE(email, 'No Email') AS email
FROM employees;

-- Using NULLIF to return NULL if two expressions are equal
SELECT employee_id, first_name, last_name, NULLIF(department_id, 3) AS department_id
FROM employees;
