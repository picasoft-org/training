--本のリスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable
(book_name, volume_num,author_name,published_date,delete_flag)
VALUES
( 'HUNTER X HUNTER',36,'冨樫義博','2018-10-04',false),
( 'ベルセルク',40,'三浦健太郎','2018-09-28',false),
( 'ドリフターズ',6,'平野耕太','2018-11-30',false),
( '羅生門',1,'芥川龍之介','1915-11-01',false)
;

--本の検索条件リスト初期データ
--idカラムはオートインクリメントなので不要
INSERT INTO booktable_condition
(condition_name, book_name_condition, author_name_condition, published_date_condition, delete_flag)
VALUES
( '本名検索条件', 'HUNTER X HUNTER', NULL, NULL, false),
( '著作者索条件', NULL, '三浦健太郎', NULL, false),
( '著作者索条件', NULL, NULL, '2018-11-30', false)
;