-- Total salary by department
SELECT d.department_name, SUM(s.salary) AS total_salary
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN salaries s ON e.employee_id = s.employee_id
GROUP BY d.department_name;

-- Total salary by department with HAVING to filter groups
SELECT d.department_name, SUM(s.salary) AS total_salary
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN salaries s ON e.employee_id = s.employee_id
GROUP BY d.department_name
HAVING SUM(s.salary) > 100000;
