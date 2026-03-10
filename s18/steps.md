# Steps to run S18 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/s18
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" S18_2_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv S18_2_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/s18/S18_2.html](http://localhost:8080/servletprograms/s18/S18_2.html)
