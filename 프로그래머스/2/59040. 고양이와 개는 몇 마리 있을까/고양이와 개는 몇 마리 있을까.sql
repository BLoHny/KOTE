SELECT ANIMAL_TYPE, count(animal_type) as count
FROM ANIMAL_INS
GROUP BY Animal_TYPE
Order by animal_type