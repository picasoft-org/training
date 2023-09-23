--booktableがあれば削除
DROP TABLE IF EXISTS booktable;

--booktableがなければ新しく作成
CREATE TABLE IF NOT EXISTS booktable(
id INT AUTO_INCREMENT,
book_name VARCHAR(50) NOT NULL,
volume_num INT NOT NULL,
author_name VARCHAR(50) NOT NULL,
published_date DATE NOT NULL,
delete_flag boolean,
PRIMARY KEY(id)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

--booktable検索条件があれば削除
DROP TABLE IF EXISTS booktable_condition;

--booktableがなければ新しく作成
CREATE TABLE IF NOT EXISTS booktable_condition(
id INT AUTO_INCREMENT,
condition_name VARCHAR(50) NOT NULL,
book_name_condition VARCHAR(50),
author_name_condition VARCHAR(50),
published_date_condition DATE,
delete_flag boolean,
PRIMARY KEY(id)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

--customer検索条件があれば削除
DROP TABLE IF EXISTS customer;

--customerがなければ新しく作成
CREATE TABLE IF NOT EXISTS customer (
    cid int AUTO_INCREMENT, 
    cname varchar(300) NOT NULL, 
    founded_on date , 
    capital numeric(20) DEFAULT 0, 
    address varchar(500), 
    telno varchar(100), 
    note varchar(1000), 
    PRIMARY KEY (cid)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

--bill検索条件があれば削除
DROP TABLE IF EXISTS bill;

--billがなければ新しく作成
CREATE TABLE IF NOT EXISTS bill (
    bid int AUTO_INCREMENT, 
    bname varchar(300) NOT NULL, 
    bill_limit_date date , 
    bill_acount numeric(10) DEFAULT 0, 
    bill_to varchar(300), 
    bill_info varchar(100), 
    transfer_bank varchar(300), 
    transfer_name varchar(300), 
    transfer_account varchar(8), 
    note varchar(1000), 
    PRIMARY KEY (bid)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;