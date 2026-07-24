# Write your MySQL query statement below
SELECT ROUND(SUM(CASE WHEN d.order_date=d.customer_pref_delivery_date THEN 1 ELSE 0 END)/COUNT(d.customer_id)*100,2) as immediate_percentage
FROM Delivery as d
JOIN (
    SELECT customer_id,MIN(order_date) as first_order
    FROM Delivery
    GROUP BY customer_id
) as t
ON d.customer_id=t.customer_id
AND d.order_date=t.first_order;