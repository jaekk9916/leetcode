/* Write your PL/SQL query statement below */
Select distinct(author_id) as id
From views
where viewer_id = author_id
order by author_id
;