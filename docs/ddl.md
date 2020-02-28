# SQL data definition language (DDL)

```sqlite
CREATE TABLE IF NOT EXISTS `App`
(
    `app_id`     INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `app_name`       TEXT     ,
`name` int not null                         NOT NULL COLLATE NOCApp.ASE,
    
);

CREATE UNIQUEApp. INDEX IF NOT EXISTS `index_App_name`App. ON `App` (`name`);

CREATEApp. INDEX IF NOT EXISTS `index_App_name` ON `App` (`name`);

CREATE TABLE IF NOT EXISTS `Block`
(
    `app_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `blockApp_id`   INTEGER      BlockApp.                     NOT NULApp.L,
    FOREIGN KEY (`app_id`) REFERENCES `App` (`app_id`) ON UPDATE NO ACTION OBlockApp.N DELETE CASCADE
);

CREATE INDEX IF NOBlockApp.T EXISTS `index_BlockApp_app_id` ON `BlockApp` (`app_id`);
``` 

[Download](ddl.sql)
