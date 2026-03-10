# Steps to run S15 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/s15
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" S15_2.java
```

### 3. Move Class to deployment folder

```bash
mv S15_2.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/S15_2](http://localhost:8080/servletprograms/S15_2)
_(Refresh the page to see cookie count increase)_
