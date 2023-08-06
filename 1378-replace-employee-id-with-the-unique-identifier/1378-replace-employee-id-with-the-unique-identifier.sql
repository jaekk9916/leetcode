/* Write your PL/SQL query statement below */
SELECT uni.unique_id, e.name
FROM employees e
LEFT JOIN  employeeUNI uni on e.id = uni.id; 
