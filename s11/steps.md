# Steps to run S11 (Ubuntu)

### 1. Setup PostgreSQL Database

- Follow the instructions in **`pgsql.md`** in this folder.
- Use username **'postgres'** and password **'root'**.
- Ensure the `testdb` and `DONAR` table are created.

### 2. Compile the Servlet

```bash
cd /opt/tomcat/webapps/servletprograms/s11
```

```bash
javac -cp ".:../lib/*" S11_1_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv S11_1_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/s11/S11_1.html](http://localhost:8080/servletprograms/s11/S11_1.html)
