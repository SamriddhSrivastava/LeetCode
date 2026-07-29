# Write your MySQL query statement below
SELECT d.name as Department,e1.name as Employee,e1.salary as Salary
FROM Employee as e1
LEFT JOIN Department as d
ON e1.departmentID=d.id
WHERE (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e2.departmentId=e1.departmentId
      AND e2.salary>e1.salary
) < 3;