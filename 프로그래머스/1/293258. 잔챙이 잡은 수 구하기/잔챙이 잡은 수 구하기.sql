-- 코드를 작성해주세요
SELECT count(*) as FISH_COUNT
from fish_info
where length <= 10 or length is null