-- Create the projects table
CREATE TABLE projects (
    project_id INT AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(100) NOT NULL
);

-- Insert sample data into projects
INSERT INTO projects (project_name) VALUES 
('Project T20'),
('Project ODI'),
('Project Test');

-- Create the employee_projects table
CREATE TABLE employee_projects (
    employee_id INT,
    project_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

-- Insert sample data into employee_projects
INSERT INTO employee_projects (employee_id, project_id) VALUES 
(1, 1),
(1, 2),
(2, 2),
(3, 3),
(4, 1),
(5, 3);
