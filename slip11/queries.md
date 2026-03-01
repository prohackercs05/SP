# Slip 11 Queries

Database Name: `testdb`

### Create Table:

```sql
CREATE TABLE DONAR (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    blood_group VARCHAR(5),
    last_donated DATE
);
```

### Insert Sample Data:

```sql
INSERT INTO DONAR (name, blood_group, last_donated) VALUES
('Chetan Mahajan', 'B+', '2023-12-05'),
('Manish Kshirsagar', 'O+', '2023-11-20'),
('Mayur Khairnar', 'B+', '2024-01-10');
```

### Search Query (used in servlet):

```sql
SELECT * FROM DONAR WHERE blood_group = ?;
```
