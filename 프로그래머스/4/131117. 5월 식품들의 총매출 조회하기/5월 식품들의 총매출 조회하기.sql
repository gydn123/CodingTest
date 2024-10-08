-- 코드를 입력하세요
-- 생산일자가 22년5월 식품 
/*
SELECT FP.PRODUCT_ID,FP.PRODUCT_NAME
,FP.PRICE * FO.AMOUNT AS TOTAL_SALES
FROM FOOD_PRODUCT FP
INNER JOIN FOOD_ORDER FO ON FP.PRODUCT_ID = FO.PRODUCT_ID
WHERE 1=1
AND FO.PRODUCE_DATE	LIKE '2022-05%' 
ORDER BY TOTAL_SALES DESC, FP.PRODUCT_ID ASC 
*/
SELECT A.PRODUCT_ID,
       A.PRODUCT_NAME,
       (A.PRICE*SUM(B.AMOUNT)) AS TOTAL_SALES
FROM FOOD_PRODUCT AS A
INNER JOIN FOOD_ORDER AS B
ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE B.PRODUCE_DATE LIKE "2022-05%"
GROUP BY A.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, PRODUCT_ID ASC;