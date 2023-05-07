# leetcode 1378
# Write your MySQL query statement below
select eu.unique_id, e.name from Employees e
left join EmployeeUNI as eu ON (e.id = eu.id)