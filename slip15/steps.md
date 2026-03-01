# Steps to run Slip 15 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/slip15
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" Slip15_2.java
```

### 3. Move Class to deployment folder

```bash
mv Slip15_2.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/Slip15_2](http://localhost:8080/servletprograms/Slip15_2)
_(Refresh the page to see cookie count increase)_
