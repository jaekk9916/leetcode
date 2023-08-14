/* Write your PL/SQL query statement below */
SELECT e.name, b.bonus
FROM employee e
LEFT JOIN bonus b
ON e.empId = b.empID
WHERE NVL(b.bonus, 0) < 1000
;