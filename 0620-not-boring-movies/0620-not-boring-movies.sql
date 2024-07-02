# Write your MySQL query statement below
select c.id, c.movie, c.description, c.rating
from cinema c
where mod(c.id,2) = 1 and c.description not in ('boring')
order by c.rating desc
;