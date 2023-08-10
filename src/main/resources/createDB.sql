- Creating the table
CREATE TABLE MYTABLE (
    ID INT PRIMARY KEY,
    TITLE VARCHAR(255) NOT NULL,
    DESCRIPTION VARCHAR(255)
);

INSERT INTO MYTABLE (ID, TITLE, DESCRIPTION)
VALUES
(3, 'TestPhone 1', 'This is a test description for TestPhone 1'),
(4, 'TestPhone 2', 'Another test description for TestPhone 2')