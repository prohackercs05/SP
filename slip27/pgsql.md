# PostgreSQL Terminal Instructions (Ubuntu Style) - Slip 27

Use these commands to verify table structure for the Metadata program.

### 1. Login and Enter DB

```bash
sudo -i -u postgres
```

```bash
psql testdb
```

### 2. List all Tables

```sql
\dt
```

### 3. Describe a Specific Table (Metadata)

```sql
\d DONAR;
```

_(This shows column names and types, which matches what your Servlet displays)_

### 4. Exit

```sql
\q
```

```bash
exit
```
