#人テーブル
CREATE TABLE peopleA(id INT, name VARCHAR(20), department VARCHAR(20), interest1 VARCHAR(20), interest2 VARCHAR(20), interest3 VARCHAR(20));

#人テーブルにデータを入力
INSERT INTO peopleA VALUES(1, '杉山 圭佑', '営業部','サッカー','ドライブ','映画鑑賞');
INSERT INTO peopleA VALUES(2, '佐藤 結菜', '人事部','映画鑑賞','旅行','インスタ');
INSERT INTO peopleA VALUES(3, '高橋 絵里', '経理部','ゲーム', NULL, NULL);
INSERT INTO peopleA VALUES(4, '早川 良太', '人事部','ドライブ','料理',NULL);
INSERT INTO peopleA VALUES(5, '佐藤 一弥', '経理部',NULL,NULL,NULL);
INSERT INTO peopleA VALUES(6, '佐藤 優穂', '営業部','インスタ','TikTok',NULL);

#1
SELECT * FROM peopleA WHERE interest1='映画鑑賞' OR interest2='映画鑑賞' OR interest3='映画鑑賞';

#2
SELECT name, interest1 AS hobby FROM peopleA
UNION ALL
select name, interest2 FROM peopleA
UNION ALL
SELECT name, interest3 FROM peopleA;

#3
SELECT name, COUNT(interest1)+COUNT(interest2)+COUNT(interest3) AS count_interest FROM peopleA WHERE name LIKE '佐藤%' GROUP BY name;

#OR
SELECT name, 
		CASE WHEN interest1 IS NOT NULL THEN 1 ELSE 0 END+
    CASE WHEN interest2 IS NOT NULL THEN 1 ELSE 0 END+
    CASE WHEN interest3 IS NOT NULL THEN 1 ELSE 0 END AS count_interest
FROM peopleA 
WHERE name LIKE '佐藤%';


#4
SELECT
    hobby,
    GROUP_CONCAT(name ORDER BY id separator ', ') AS name_list
FROM (
    SELECT id, name, interest1 AS hobby FROM peopleA
    UNION ALL
    SELECT id, name, interest2 FROM peopleA
    UNION ALL
    SELECT id, name, interest3 FROM peopleA
) hobby_table
WHERE
    hobby IS NOT NULL
GROUP BY
    hobby
HAVING
    COUNT(*) > 1;
