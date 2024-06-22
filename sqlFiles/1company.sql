-- Create the database
CREATE DATABASE company;

USE company;

-- Create the departments table
CREATE TABLE departments (
    department_id INT AUTO_INCREMENT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

-- Insert sample data into departments
INSERT INTO departments (department_name) VALUES 
('Human Resources'),
('Finance'),
('Engineering'),
('Sales');

-- Create the employees table
CREATE TABLE employees (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

-- Insert sample data into employees
INSERT INTO employees (first_name, last_name, email, department_id) VALUES 
('Virat', 'Kohli', 'virat.kohli@example.com', 1),
('Rohit', 'Sharma', 'rohit.sharma@example.com', 2),
('Rishabh', 'Pant', 'rishabh.pant@example.com', 3),
('Jaspreet', 'Bumrah', 'jaspreet.bumrah@example.com', 4),
('Kuldeep', 'yadav', 'kuldeep.yadav@example.com', 3);

-- Create the salaries table
CREATE TABLE salaries (
    employee_id INT,
    salary DECIMAL(10, 2) NOT NULL,
    effective_date DATE NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);

-- Insert sample data into salaries
INSERT INTO salaries (employee_id, salary, effective_date) VALUES 
(1, 50000, '2022-01-01'),
(2, 60000, '2022-01-01'),
(3, 70000, '2022-01-01'),
(4, 80000, '2022-01-01'),
(5, 75000, '2022-01-01');
