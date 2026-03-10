# S19 SQL Queries (PostgreSQL)

### 1. Database Commands

**Create Database:**

```sql
CREATE DATABASE testdb;
```

**Connect to/Use Database:**

```sql
\c testdb;
```

### 2. Table Commands

**Create Table:**

```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);
```

**Show Table Structure:**

```sql
\d users;
```

### 3. Data Commands

**Insert Sample Data:**

```sql
INSERT INTO users (username, password)
VALUES ('alice', 'password123'),
       ('admin', 'admin@123');
```

**Authenticate Query (used in Java):**

```sql
SELECT * FROM users WHERE username = 'admin' AND password = 'admin@123';
```

_(In Java, values are replaced by ? in a PreparedStatement)_
