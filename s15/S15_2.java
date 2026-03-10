import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class S15_2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        int count = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        count++;
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(count));
        visitCookie.setMaxAge(24 * 60 * 60);
        response.addCookie(visitCookie);

        out.println("<html><body>");
        if (count == 1) {
            out.println("<h2>Welcome! This is your first visit.</h2>");
        } else {
            out.println("<h2>Welcome back! This is your visit number: " + count + "</h2>");
        }
        out.println("</body></html>");
    }
}
