DROP TABLE IF EXISTS students;

create table students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    cognom VARCHAR(100) DEFAULT NULL,
    age INT DEFAULT 0,
    cicle VARCHAR(100) NOT NULL,
    anyo INT DEFAULT 0
)