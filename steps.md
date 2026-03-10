# Master Execution Steps for Java Slips (Linux/Ubuntu)

Based on your Ubuntu device, use these exact multi-line commands.

---

## 1. Start Tomcat Server

Open a terminal window:

```bash
export CATALINA_HOME=/opt/tomcat
```

```bash
$CATALINA_HOME/bin/startup.sh
```

---

## 2. Compile and Deploy Servlets

### **S2 (Request Info)**

```bash
cd /opt/tomcat/webapps/servletprograms/s2
```

```bash
javac -cp ".:../lib/servlet-api.jar" S2_2.java
```

```bash
mv S2_2.class ../WEB-INF/classes/
```

### **S11 (Donor Search)**

Ensure the PostgreSQL JDBC driver is in `WEB-INF/lib`.

```bash
cd /opt/tomcat/webapps/servletprograms/s11
```

```bash
javac -cp ".:../lib/*" S11_1_Servlet.java
```

```bash
mv S11_1_Servlet.class ../WEB-INF/classes/
```

### **S15 (Visit Counter)**

```bash
cd /opt/tomcat/webapps/servletprograms/s15
```

```bash
javac -cp ".:../lib/servlet-api.jar" S15_2.java
```

```bash
mv S15_2.class ../WEB-INF/classes/
```

### **S18 (Student Result)**

```bash
cd /opt/tomcat/webapps/servletprograms/s18
```

```bash
javac -cp ".:../lib/servlet-api.jar" S18_2_Servlet.java
```

```bash
mv S18_2_Servlet.class ../WEB-INF/classes/
```

### **S19 (Login)**

Ensure the PostgreSQL JDBC driver is in `WEB-INF/lib`.

```bash
cd /opt/tomcat/webapps/servletprograms/s19
```

```bash
javac -cp ".:../lib/*" S19_2_Servlet.java
```

```bash
mv S19_2_Servlet.class ../WEB-INF/classes/
```

### **S27 (Table Metadata)**

```bash
cd /opt/tomcat/webapps/servletprograms/s27
```

```bash
javac -cp ".:../lib/*" S27_1_Servlet.java
```

```bash
mv S27_1_Servlet.class ../WEB-INF/classes/
```

---

## 3. URLs

- S2: http://localhost:8080/servletprograms/S2_2
- S11: http://localhost:8080/servletprograms/s11/S11_1.html
- S15: http://localhost:8080/servletprograms/S15_2
- S18: http://localhost:8080/servletprograms/s18/S18_2.html
- S19: http://localhost:8080/servletprograms/s19/S19_2.html
- S27: http://localhost:8080/servletprograms/s27/S27_1.html
