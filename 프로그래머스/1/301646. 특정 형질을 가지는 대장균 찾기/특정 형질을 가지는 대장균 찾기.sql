-- 코드를 작성해주세요
select count(*) as count
from ecoli_data
WHERE (GENOTYPE & 2) = 0
  AND ((GENOTYPE & 1) = 1 OR (GENOTYPE & 4) = 4);
