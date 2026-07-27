# Write your MySQL query statement below
SELECT CASE WHEN id%2=1 AND id+1 in(SELECT id FROM Seat) then id+1
            WHEN id%2=0 then id-1
            else id end
            as id,student
FROM seat
ORDER BY id;
 