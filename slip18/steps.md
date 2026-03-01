# Steps to run Slip 18 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/slip18
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" Slip18_2_Servlet.java
```

### 3. Move Class to deployment folder

```bash
mv Slip18_2_Servlet.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/slip18/Slip18_2.html](http://localhost:8080/servletprograms/slip18/Slip18_2.html)
