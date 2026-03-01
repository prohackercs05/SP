# Slip 19 Queries

Database Name: `testdb`

### Create Table:

```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);
```

### Insert Sample Data:

```sql
INSERT INTO users (username, password) VALUES
('chetan', 'password123'),
('admin', 'admin@123');
```

### Authentication Query (used in servlet):

```sql
SELECT * FROM users WHERE username = ? AND password = ?;
```
