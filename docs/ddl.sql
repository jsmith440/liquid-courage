CREATE TABLE IF NOT EXISTS `App`

    `app_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `name`   TEXT                              NOT NULL COLLATE NOCASE,
);
CREATE UNIQUE INDEX IF NOT EXISTS `index_App_id` ON `App` (`name`);
CREATE TABLE IF NOT EXISTS `${App}`
(
    `app_id`   INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    `app_name` TEXT                              NOT NULL
);


CREATE UNIQUE INDEX `index_App_app_name` ON `${App}` (`app_name`)

