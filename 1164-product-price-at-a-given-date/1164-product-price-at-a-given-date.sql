# Write your MySQL query statement below
SELECT p.product_id,IFNULL(a.new_price,10)as price
FROM (SELECT DISTINCT product_id FROM Products) as p
LEFT JOIN
(
    SELECT product_id,new_price
    FROM Products
    WHERE (product_id,change_date) IN 
    (
       SELECT product_id,MAX(change_date)
       FROM Products
       WHERE change_date<='2019-08-16'
       GROUP BY product_id
    )
) as a 
ON p.product_id=a.product_id;