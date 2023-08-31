-- 코드를 입력하세요
SELECT A.FLAVOR FROM(
SELECT F.FLAVOR
from first_half f
join july j
on f.FLAVOR = j.FLAVOR
GROUP BY F.FLAVOR
ORDER BY SUM(f.total_order + j.total_order) DESC LIMIT 3) A

-- SELECT f.flavor
-- FROM first_half f
-- JOIN july j
-- ON (f.flavor = j.flavor)
-- GROUP BY f.flavor
-- ORDER BY SUM(f.total_order + j.total_order) DESC LIMIT 3; 