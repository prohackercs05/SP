# Steps to run Slip 19 (Ubuntu)

### 1. Setup PostgreSQL Database

- Follow the instructions in **`pgsql.md`** in this folder.
- Use username **'postgres'** and password **'root'**.
- Ensure the `users` table is created and data is inserted.

### 2. Compile the Servlet

```bash
cd /opt/tomcat/webapps/servletprograms/slip19
```

```bash
javac -cp ".:../lib/*" Slip19_2_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv Slip19_2_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/slip19/Slip19_2.html](http://localhost:8080/servletprograms/slip19/Slip19_2.html)
