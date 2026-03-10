# PostgreSQL Terminal Instructions - S19

Follow these steps to setup the user authentication table for the Login program.

### 1. Open Terminal and log in as Postgres User

```bash
sudo -i -u postgres
```

### 2. Create the Database (if not already created)

```bash
createdb testdb
```

### 3. Connect to the Database

```bash
psql testdb
```

### 4. Setup User Password

Ensure the 'postgres' user has the password 'root' as expected by the Java code:

```sql
ALTER USER postgres WITH PASSWORD 'root';
```

### 5. Create the Table

Run this command inside the `psql` shell:

```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);
```

### 6. Verify Table Structure

- To list tables: `\dt`
- To see the structure of 'users' table: `\d users`

### 7. Insert Sample User Accounts

```sql
INSERT INTO users (username, password) VALUES ('alice', 'password123');
INSERT INTO users (username, password) VALUES ('admin', 'admin@123');
```

### 8. Exit

- To exit psql: `\q`
- To return to your normal user: `exit`
