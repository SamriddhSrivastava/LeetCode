# Write your MySQL query statement below
SELECT *
FROM(
    SELECT employee_id
FROM Employees
UNION 
SELECT employee_id
FROM Salaries

EXCEPT

SELECT employee_id
FROM Employees
INTERSECT
SELECT employee_id
FROM Salaries
) as T1
ORDER BY T1.employee_id;
