# S11 SQL Queries (PostgreSQL)

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
CREATE TABLE DONAR (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    blood_group VARCHAR(5),
    last_donated DATE
);
```

**Show Table Structure:**

```sql
\d DONAR;
```

### 3. Data Commands

**Insert Sample Data:**

```sql
INSERT INTO DONAR (name, blood_group, last_donated)
VALUES ('Alice', 'B+', '2023-12-05'),
       ('Joe', 'O+', '2023-11-20'),
       ('Bob', 'B+', '2024-01-10');
```

**Fetch/Search Data (used in Java):**

```sql
SELECT * FROM DONAR WHERE blood_group = 'B+';
```

_(In Java, 'B+' is replaced by ? in a PreparedStatement)_
