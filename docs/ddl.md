# SQL data definition language (DDL)

```sqlite
CREATE TABLE IF NOT EXISTS `App`
(
    `app_id`     INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `app_name`       TEXT                              NOT NULL COLLATE NOCASE,
    
);

CREATE UNIQUE INDEX IF NOT EXISTS `index_App_name` ON `App` (`name`);

CREATE INDEX IF NOT EXISTS `index_App_name` ON `App` (`name`);

CREATE TABLE IF NOT EXISTS `BlockApp`
(
    `app_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `blockApp_id`   INTEGER                           NOT NULL,
    FOREIGN KEY (`app_id`) REFERENCES `App` (`app_id`) ON UPDATE NO ACTION ON DELETE CASCADE
);

CREATE INDEX IF NOT EXISTS `index_BlockApp_app_id` ON `BlockApp` (`app_id`);
``` 

[Download](ddl.sql)
