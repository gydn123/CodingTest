-- 코드를 입력하세요
SELECT a.ANIMAL_ID, a.NAME
from ANIMAL_INS a
where a.INTAKE_CONDITION != "aged"
order by a.ANIMAL_ID asc