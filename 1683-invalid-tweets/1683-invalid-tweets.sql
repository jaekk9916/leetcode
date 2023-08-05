/* Write your PL/SQL query statement below */
Select tweet_id
From tweets
Where length(content) > 15
;