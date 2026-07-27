# Write your MySQL query statement below
SELECT e1.employee_id
FROM Employees as e1
LEFT Join Employees as e2
ON e1.manager_id=e2.employee_id
WHERE e1.manager_id IS NOT NULL && e2.employee_id IS NULL && e1.salary<30000 
ORDER BY employee_id;