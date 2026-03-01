# Slip 27 Queries

Database Name: `testdb`

This program retrieves metadata (column names, types, sizes) for any existing table. You can use the tables created for other slips for testing:

### Example Tables to test:

- `DONAR` (created in Slip 11)
- `users` (created in Slip 19)

### Generic Query (used in servlet):

```sql
SELECT * FROM TableName LIMIT 1;
```

_(Used to retrieve the ResultSetMetaData object)_
