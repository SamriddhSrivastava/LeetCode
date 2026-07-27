# Write your MySQL query statement below
(SELECT name as results
FROM MovieRating as r
LEFT JOIN Users s
ON r.user_id=s.user_id
GROUP BY r.user_id
ORDER BY COUNT(*) DESC, s.name ASC
LIMIT 1)
UNION ALL
(SELECT title as results
FROM MovieRating as r
LEFT JOIN Movies m
ON r.movie_id=m.movie_id
WHERE created_at LIKE '2020-02%'
GROUP BY r.movie_id
ORDER BY AVG(r.rating) DESC, m.title ASC
LIMIT 1);