SELECT animal_id, name, 
  CASE
    WHEN SUBSTRING_INDEX(sex_upon_intake, ' ', 1) = 'Neutered' THEN 'O'
    WHEN SUBSTRING_INDEX(sex_upon_intake, ' ', 1) = 'Spayed' THEN 'O'
    ELSE 'X'
  END AS 중성화
FROM animal_ins;