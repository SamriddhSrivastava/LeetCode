# Write your MySQL query statement below
SELECT sp.name
FROM SalesPerson as sp
WHERE sp.sales_id NOT IN(
    SELECT o.sales_id
    FROM Orders as o
    INNER JOIN Company as c
    ON o.com_id=c.com_id
    WHERE c.name='RED');