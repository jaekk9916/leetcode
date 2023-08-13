/* Write your PL/SQL query statement below */
SELECT 
    a.machine_id,
    ROUND(SUM(b.timestamp - a.timestamp)/count(a.process_id), 3) AS processing_time
FROM 
    activity a, activity b
WHERE a.machine_id = b.machine_id 
  AND a.process_id = b.process_id 
  AND a.activity_type = 'start' 
  AND b.activity_type = 'end'
GROUP BY 
    a.machine_id
ORDER BY 
    a.machine_id;


