package Java.Java0818.Question1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class index extends HttpServlet {
    private static final long serialVersionVID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean countExists = false;
        int count = 1;
        Cookie cookie = null;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue()) + 1;
                    cookie = new Cookie("count", String.valueOf(count));

                    cookie.setMaxAge(60 * 60 * 24 * 90);
                    response.addCookie(cookie);
                    countExists = true;
                    break;
                }
            }
        }
        if (!countExists) {
            cookie = new Cookie("count", "1");
            cookie.setMaxAge(60 * 60 * 24 * 90);
            response.addCookie(cookie);
        }
        request.setAttribute("count", String.valueOf(count));

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
        rd.forward(request, response);
    }
}
