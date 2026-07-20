# Write your MySQL query statement below
SELECT name,bonus
FROM Employee as e
LEFT JOIN Bonus as b
ON e.empId=b.empid
WHERE bonus<1000 || bonus IS NULL;