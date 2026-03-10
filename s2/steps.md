# Steps to run S2 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/s2
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" S2_2.java
```

### 3. Move Class to deployment folder

```bash
mv S2_2.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/S2_2](http://localhost:8080/servletprograms/S2_2)
