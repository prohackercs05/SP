# Steps to run Slip 11 (Ubuntu)

### 1. Setup PostgreSQL Database

- Follow the instructions in **`pgsql.md`** in this folder.
- Use username **'postgres'** and password **'root'**.
- Ensure the `testdb` and `DONAR` table are created.

### 2. Compile the Servlet

```bash
cd /opt/tomcat/webapps/servletprograms/slip11
```

```bash
javac -cp ".:../lib/*" Slip11_1_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv Slip11_1_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/slip11/Slip11_1.html](http://localhost:8080/servletprograms/slip11/Slip11_1.html)
