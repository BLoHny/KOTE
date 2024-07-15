select d.id, d.email, d.first_name, d.last_name
from skillcodes s join developers d
where s.code & d.skill_code and s.category = 'Front End'
group by d.id, d.email, d.first_name, d.last_name
order by d.id