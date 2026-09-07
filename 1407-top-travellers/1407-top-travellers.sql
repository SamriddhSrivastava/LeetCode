# Write your MySQL query statement below
SELECT a.name,COALESCE(SUM(b.distance),0) as travelled_distance
FROM Users as a
LEFT JOIN Rides as b
ON a.id=b.user_id
GROUP BY b.user_id
ORDER BY travelled_distance DESC , a.name ASC;