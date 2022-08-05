#ランチメニューテーブル
CREATE TABLE lunchmenu(id int, name VARCHAR(20), price INT, limited INT);

#ランチメニューテーブルにデータを入力
INSERT INTO lunchmenu VALUES(1, 'A', 700, 20);
INSERT INTO lunchmenu VALUES(2, 'B', 800, 20);
INSERT INTO lunchmenu VALUES(3, 'C', 600, null);
INSERT INTO lunchmenu VALUES(4, 'D', 700, 50);