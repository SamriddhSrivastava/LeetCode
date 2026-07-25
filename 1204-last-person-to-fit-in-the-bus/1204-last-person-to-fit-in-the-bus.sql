SELECT person_name
FROM (
    SELECT person_name,turn,SUM(weight) OVER (ORDER BY turn) as total_weight
    FROM Queue
) as t
WHERE total_weight<=1000
ORDER BY turn DESC
LIMIT 1;