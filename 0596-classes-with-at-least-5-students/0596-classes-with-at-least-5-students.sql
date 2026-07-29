# Write your MySQL query statement below
SELECT Class
FROM COURSES
GROUP BY class
HAVING COUNT(student)>=5;