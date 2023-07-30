-- 코드를 입력하세요
SELECT *
from (select *
     from FOOD_PRODUCT 
     order by price desc limit 1) as FOOD_PRODUCT ;