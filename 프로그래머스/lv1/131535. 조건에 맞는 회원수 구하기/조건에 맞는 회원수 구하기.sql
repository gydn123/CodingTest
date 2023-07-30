-- 코드를 입력하세요
SELECT count(USER_ID) as USERS
from USER_INFO
where age between 20 and 29 
and JOINED like '2021%'
-- group by USER_ID
-- having count(USER_ID);