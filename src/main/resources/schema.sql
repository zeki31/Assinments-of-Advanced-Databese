-- Account table
DROP TABLE IF EXISTS account;
CREATE TABLE account (
    accountId int NOT NULL AUTO_INCREMENT,
    accountName varchar(10),
    branchId int,
    PRIMARY KEY (accountId)
);

-- Branch table
DROP TABLE IF EXISTS branch;
CREATE TABLE branch (
    branchId int NOT NULL AUTO_INCREMENT,
    branchName varchar(10),
    PRIMARY KEY (branchId)
);

-- Balance table
DROP TABLE IF EXISTS balance;
CREATE TABLE balance (
    accountId int,
    clientId int,
    money int,
    createDate datetime,
    deleteFlg tinyint,
    PRIMARY KEY (accountId)
);
