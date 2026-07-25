# Write your MySQL query statement below
SELECT c1.name as Customers
FROM Customers as c1
LEFT JOIN Orders as c2
ON c1.id=c2.customerId
WHERE c2.customerId IS NULL;