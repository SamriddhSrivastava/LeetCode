# Write your MySQL query statement below
SELECT ROUND(COUNT(*)/(SELECT COUNT(DISTINCT player_id)FROM Activity),2) as fraction
FROM (
    SELECT player_id,MIN(event_date) as event_date
    FROM Activity
    GROUP BY player_id
)as a1
JOIN Activity as a2
ON a1.player_id=a2.player_id
WHERE a1.event_date=a2.event_date-INTERVAL 1 DAY
