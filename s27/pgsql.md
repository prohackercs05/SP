# PostgreSQL Terminal Instructions - S27

This program displays metadata for existing tables in `testdb`.

### 1. Open Terminal and log in as Postgres User

```bash
sudo -i -u postgres
```

### 2. Connect to the Database

```bash
psql testdb
```

### 3. List Available Tables

To see which tables you can view metadata for:

```bash
\dt
```

_(Usually you will test with the 'DONAR' table from S11 or 'users' table from S19)_

### 4. Create a Test Table (Optional)

If you want to create a new table specifically to test metadata:

```sql
CREATE TABLE METADATA_TEST (
    test_id INT PRIMARY KEY,
    test_name VARCHAR(100),
    test_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

### 5. Exit

- To exit psql: `\q`
- To return to your normal user: `exit`
