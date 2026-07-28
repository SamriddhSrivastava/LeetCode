# Write your MySQL query statement below
SELECT product_name,SUM(unit) as unit 
FROM Products as p
JOIN Orders as o
ON p.product_id=o.product_id && order_date LIKE '2020-02%'
GROUP BY p.product_id
HAVING SUM(unit)>=100;