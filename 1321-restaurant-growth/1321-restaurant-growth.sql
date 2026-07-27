# Write your MySQL query statement below
SELECT visited_on,amount,average_amount
FROM (
    SELECT visited_on,
        SUM(amount) OVER (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) AS amount,
        ROUND(SUM(amount) OVER (ORDER BY visited_on RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) / 7, 2) AS average_amount,
        ROW_NUMBER() OVER (ORDER BY visited_on) AS rn
    FROM (
        SELECT visited_on, SUM(amount) AS amount
        FROM Customer
        GROUP BY visited_on
    ) as daily_customers
)as windowed
WHERE rn >= 7
ORDER BY visited_on;