-- 코드를 입력하세요
SELECT f.factory_id,f.FACTORY_NAME, f.ADDRESS from food_factory f where f.ADDRESS like '%강원도%' order by f.factory_id asc