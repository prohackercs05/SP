# S27 SQL Queries (PostgreSQL)

### 1. Database Commands

**Connect to/Use Database:**

```sql
\c testdb;
```

### 2. Table Commands

**Show All Tables:**

```sql
\dt
```

**Show Specific Table Structure (Metadata):**

```sql
\d DONAR;
```

### 3. Metadata Query (used in Java)

This query is used to get the `ResultSetMetaData` object in the servlet:

```sql
SELECT * FROM DONAR LIMIT 1;
```

_(The servlet allows you to enter any table name, and it runs this query to fetch column names, types, and sizes)_
