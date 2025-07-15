# Write your MySQL query statement below
select e.employee_id , e.name , count(e.employee_id) as reports_count , 
round(avg(e1.age) , 0)  as average_age
from Employees as e
join Employees as e1
on e.employee_id = e1.reports_to 
group by e.employee_id , e1.reports_to
order by e.employee_id;