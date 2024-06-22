-- index: by default created on primary keys and unique constrainst
SHOW INDEX FROM employees;

-- explicit index: manual creation of index. index can also be composite
CREATE INDEX index_last_name ON employees(last_name);
CREATE INDEX index_full_name ON employees(first_name,last_name);

-- viewing the indices
SHOW INDEX FROM employees;