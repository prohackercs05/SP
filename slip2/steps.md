# Steps to run Slip 2 (Ubuntu)

### 1. Open Terminal and go to folder

```bash
cd /opt/tomcat/webapps/servletprograms/slip2
```

### 2. Compile the Servlet

```bash
javac -cp ".:../lib/servlet-api.jar" Slip2_2.java
```

### 3. Move Class to deployment folder

```bash
mv Slip2_2.class ../WEB-INF/classes/
```

### 4. Run through browser

**URL:** [http://localhost:8080/servletprograms/Slip2_2](http://localhost:8080/servletprograms/Slip2_2)
