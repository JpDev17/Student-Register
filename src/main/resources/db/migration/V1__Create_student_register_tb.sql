CREATE TABLE tb_student_register (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    registration INT NOT NULL,
    major VARCHAR(255) NOT NULL,
    grade FLOAT NOT NULL
);