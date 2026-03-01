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

### **Slip 2 (Request Info)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip2
```

```bash
javac -cp ".:../lib/servlet-api.jar" Slip2_2.java
```

```bash
mv Slip2_2.class ../WEB-INF/classes/
```

### **Slip 11 (Donor Search)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip11
```

```bash
javac -cp ".:../lib/*" Slip11_1_Servlet.java
```

```bash
mv Slip11_1_Servlet.class ../WEB-INF/classes/
```

### **Slip 15 (Visit Counter)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip15
```

```bash
javac -cp ".:../lib/servlet-api.jar" Slip15_2.java
```

```bash
mv Slip15_2.class ../WEB-INF/classes/
```

### **Slip 18 (Student Result)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip18
```

```bash
javac -cp ".:../lib/servlet-api.jar" Slip18_2_Servlet.java
```

```bash
mv Slip18_2_Servlet.class ../WEB-INF/classes/
```

### **Slip 19 (Login)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip19
```

```bash
javac -cp ".:../lib/*" Slip19_2_Servlet.java
```

```bash
mv Slip19_2_Servlet.class ../WEB-INF/classes/
```

### **Slip 27 (Table Metadata)**

```bash
cd /opt/tomcat/webapps/servletprograms/slip27
```

```bash
javac -cp ".:../lib/*" Slip27_1_Servlet.java
```

```bash
mv Slip27_1_Servlet.class ../WEB-INF/classes/
```

---

## 3. URLs

- Slip 2: http://localhost:8080/servletprograms/Slip2_2
- Slip 11: http://localhost:8080/servletprograms/slip11/Slip11_1.html
- Slip 15: http://localhost:8080/servletprograms/Slip15_2
- Slip 18: http://localhost:8080/servletprograms/slip18/Slip18_2.html
- Slip 19: http://localhost:8080/servletprograms/slip19/Slip19_2.html
- Slip 27: http://localhost:8080/servletprograms/slip27/Slip27_1.html
