-- view: virtual table created on the result set of a select query
CREATE VIEW employee_details AS
SELECT e.employee_id, e.first_name, e.last_name, e.email, d.department_name
FROM employees e
JOIN departments d ON e.department_id = d.department_id;

-- Select from the view
SELECT * FROM employee_details;

-- NULL values will be displayed as 'No Department'
CREATE VIEW employee_details_null_handling AS
SELECT e.employee_id, e.first_name, e.last_name, e.email, 
COALESCE(d.department_name, 'No Department') AS department_name
FROM employees e
LEFT JOIN departments d ON e.department_id = d.department_id;

-- Select from the view
SELECT * FROM employee_details_null_handling;
