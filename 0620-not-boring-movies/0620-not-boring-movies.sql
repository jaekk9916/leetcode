/* Write your PL/SQL query statement below */
SELECT id, movie, description, rating
FROM cinema
WHERE mod(id, 2) = 1 AND description != 'boring'
ORDER BY rating DESC
;