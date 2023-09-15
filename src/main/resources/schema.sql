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
