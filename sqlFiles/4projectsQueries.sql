-- inner join: will show matching values from both tables

SELECT e.first_name, e.last_name, p.project_name
FROM employees e
INNER JOIN employee_projects ep ON e.employee_id = ep.employee_id
INNER JOIN projects p ON ep.project_id = p.project_id;

-- left join: return all rows from left table with matching values from right table; else displays null 

SELECT e.first_name, e.last_name, p.project_name
FROM employees e
LEFT JOIN employee_projects ep ON e.employee_id = ep.employee_id
LEFT JOIN projects p ON ep.project_id = p.project_id;


-- right join: opposite to left join

SELECT e.first_name, e.last_name, p.project_name
FROM employees e
RIGHT JOIN employee_projects ep ON e.employee_id = ep.employee_id
RIGHT JOIN projects p ON ep.project_id = p.project_id;


-- full join: mysql doesnt explicitly support but they can be simulated by performing union on left and right joins. UNION is used to combine results of two or more SELECT statements

SELECT e.first_name, e.last_name, p.project_name
FROM employees e
LEFT JOIN employee_projects ep ON e.employee_id = ep.employee_id
LEFT JOIN projects p ON ep.project_id = p.project_id
UNION
SELECT e.first_name, e.last_name, p.project_name
FROM employees e
RIGHT JOIN employee_projects ep ON e.employee_id = ep.employee_id
RIGHT JOIN projects p ON ep.project_id = p.project_id;
