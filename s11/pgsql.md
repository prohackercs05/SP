# PostgreSQL Terminal Instructions - S11

Follow these steps to setup the database and table for the Donor Search program.

### 1. Open Terminal and log in as Postgres User

```bash
sudo -i -u postgres
```

### 2. Create the Database

You can create the database from the command line:

```bash
createdb testdb
```

_Note: If it already exists, you can skip this step or use `dropdb testdb` to start fresh._

### 3. Connect to the Database

To "use" the database in PostgreSQL, you connect to it directly:

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
CREATE TABLE DONAR (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    blood_group VARCHAR(5),
    last_donated DATE
);
```

### 6. Verify Table and Database

- To see the current database name: `\conninfo`
- To list all tables: `\dt`
- To see the structure of the DONAR table: `\d DONAR`

### 7. Insert Data

```sql
INSERT INTO DONAR (name, blood_group, last_donated) VALUES ('Alice', 'B+', '2023-12-05');
INSERT INTO DONAR (name, blood_group, last_donated) VALUES ('Joe', 'O+', '2023-11-20');
INSERT INTO DONAR (name, blood_group, last_donated) VALUES ('Bob', 'B+', '2024-01-10');
```

### 8. Exit

- To exit psql: `\q`
- To return to your normal user: `exit`
