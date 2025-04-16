CREATE DATABASE mental_health_app;
USE mental_health_app;

CREATE TABLE Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);

CREATE TABLE StressReports (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    level INT,
    timestamp DATETIME,
    FOREIGN KEY (user_id) REFERENCES Users(id)
);

CREATE TABLE StressLevels (
    level_id INT PRIMARY KEY,
    level_name VARCHAR(50),
    description TEXT
);

CREATE TABLE StressActions (
    level_id INT,
    suggestion_type VARCHAR(50),
    suggestion TEXT,
    FOREIGN KEY (level_id) REFERENCES StressLevels(level_id)
);

CREATE TABLE Professionals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    type VARCHAR(50),
    contact_info TEXT
);

INSERT INTO StressLevels VALUES 
(1, 'Mild', 'Basic stress with manageable symptoms'),
(2, 'Moderate', 'Talk with friends or peers'),
(3, 'Significant', 'Online therapy/counselor suggested'),
(4, 'High', 'Professional help recommended'),
(5, 'Severe', 'Contact psychiatrist or helpline');

INSERT INTO Professionals (name, type, contact_info) VALUES
('Dr. Aarti Mehta', 'Psychiatrist', 'dr.aarti@example.com'),
('Wellness Helpline', 'Helpline', '1800-123-456');