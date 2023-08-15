/* Write your PL/SQL query statement below */
SELECT e.employee_id,
    CASE
        WHEN MOD(e.employee_id, 2) = 1 AND SUBSTR(e.name, 1, 1) != 'M' THEN e.salary
        ELSE 0
    END AS bonus
FROM employees e
ORDER BY e.employee_id;