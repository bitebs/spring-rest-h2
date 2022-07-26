drop table if exists users;

CREATE TABLE users (
                         id int NOT NULL AUTO_INCREMENT,
                         username varchar(45) NOT NULL,
                         password varchar(64) NOT NULL,
                         email varchar(45) NOT NULL,
                         PRIMARY KEY (id)
);