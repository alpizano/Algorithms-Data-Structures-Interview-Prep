/* Write your T-SQL query statement below */
SELECT p.PersonId, p.FirstName, p.LastName, a.City, a.State
FROM Person p
INNER JOIN Address a
ON p.PersonId = a.PersonId