
-- 用户表
CREATE TABLE IF NOT EXISTS users
(
    user_id    INT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(255) NOT NULL,
    email      VARCHAR(255) NOT NULL,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 任务表
CREATE TABLE IF NOT EXISTS tasks
(
    task_id     INT AUTO_INCREMENT PRIMARY KEY,
    task_name   VARCHAR(255) NOT NULL,
    description TEXT,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 用户任务表
CREATE TABLE IF NOT EXISTS user_tasks
(
    id           INT AUTO_INCREMENT PRIMARY KEY,
    user_id      INT NOT NULL,
    task_id      INT NOT NULL,
    is_completed BOOLEAN   DEFAULT FALSE,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (task_id) REFERENCES tasks (task_id)
);

-- 打卡记录表
CREATE TABLE IF NOT EXISTS check_in_records
(
    record_id      INT AUTO_INCREMENT PRIMARY KEY,
    user_id        INT NOT NULL,
    task_id        INT NOT NULL,
    check_in_time  TIMESTAMP,
    check_out_time TIMESTAMP,
    date           DATE,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (task_id) REFERENCES tasks (task_id)
);

-- 管理员表
CREATE TABLE IF NOT EXISTS admins
(
    admin_id   INT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(255) NOT NULL,
    email      VARCHAR(255) NOT NULL,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 管理员操作日志表
CREATE TABLE IF NOT EXISTS admin_logs
(
    log_id    INT AUTO_INCREMENT PRIMARY KEY,
    admin_id  INT          NOT NULL,
    operation VARCHAR(255) NOT NULL,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (admin_id) REFERENCES admins (admin_id)

);
