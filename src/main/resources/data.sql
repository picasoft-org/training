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

INSERT INTO customer
(cname, founded_on, capital, address, telno, note)
VALUES
('株式会社NTTデータ', '2022/11/1', 142520000000, '東京都江東区豊洲3-3-3 豊洲センタービル', '03-5546-8202', 'メイン取引'),
('富士通株式会社', '1935/6/20', 325638181205, '東京都港区東新橋1-5-2 汐留シティセンター', '044-777-1111', 'メイン取引')
;

INSERT INTO bill
(bname, bill_limit_date, bill_acount, bill_to, bill_info, transfer_bank, transfer_name, transfer_account, note)
VALUES
('Nttdata様への9月SES案件Aの請求書', '2023/10/15', 9000000, '株式会社NTTデータ', '9月SES案件Aの請求書', 'みずほ銀行', '株式会社ピカソフト', '12345678', 'メイン口座に振込請求'),
('富士通様への9月SES案件Bの請求書', '2023/10/15', 9900000, '富士通株式会社', '9月SES案件Bの請求書', '三井住友銀行', '株式会社ピカソフト', '87654321', 'サブ口座に振込請求')
;