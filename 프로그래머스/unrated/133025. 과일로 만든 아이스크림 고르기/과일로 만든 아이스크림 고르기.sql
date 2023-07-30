-- 코드를 입력하세요
SELECT f.FLAVOR
from first_half f
join ICECREAM_INFO i
on f.FLAVOR = i.FLAVOR
where f.TOTAL_ORDER > 3000 and i.INGREDIENT_TYPE = 'fruit_based'
group by f.FLAVOR
order by f.TOTAL_ORDER desc;