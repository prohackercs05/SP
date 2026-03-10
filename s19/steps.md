# Steps to run S19 (Ubuntu)

### 1. Setup PostgreSQL Database

- Follow the instructions in **`pgsql.md`** in this folder.
- Use username **'postgres'** and password **'root'**.
- Ensure the `users` table is created and data is inserted.

### 2. Compile the Servlet

```bash
cd /opt/tomcat/webapps/servletprograms/s19
```

```bash
javac -cp ".:../lib/*" S19_2_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv S19_2_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/s19/S19_2.html](http://localhost:8080/servletprograms/s19/S19_2.html)
