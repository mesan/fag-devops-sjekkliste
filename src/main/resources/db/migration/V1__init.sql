CREATE TABLE todos (
  id        INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
  title     VARCHAR(60) NOT NULL,
  content   VARCHAR(600),
  completed BIT         NOT NULL               DEFAULT 0
);