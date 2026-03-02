# Steps to run Slip 27 (Ubuntu)

### 1. Setup PostgreSQL Database

- Connect to `testdb` as per **`pgsql.md`**.
- Use username **'postgres'** and password **'root'**.
- Ensure you have a table like `DONAR` or `users` to test.

### 2. Compile the Servlet

```bash
cd /opt/tomcat/webapps/servletprograms/slip27
```

```bash
javac -cp ".:../lib/*" Slip27_1_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv Slip27_1_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/slip27/Slip27_1.html](http://localhost:8080/servletprograms/slip27/Slip27_1.html)
