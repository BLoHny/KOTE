SELECT animal_id, name
from animal_ins
where name like '%el%' and lower(animal_type) = 'Dog'
order by name