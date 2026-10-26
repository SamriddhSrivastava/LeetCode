# Write your MySQL query statement below
SELECT  day,emp_id,SUM(T1.total) as total_time
FROM (
    SELECT event_day as day,emp_id,(out_time-in_time) as total
    FROM Employees as e
) as T1
GROUP BY day,emp_id;