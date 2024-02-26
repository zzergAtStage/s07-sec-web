CREATE TABLE IF NOT EXISTS _users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(100),
    last_name VARCHAR(100),
    user_email VARCHAR(255),
    user_role VARCHAR(50),
    user_password VARCHAR(255)
);