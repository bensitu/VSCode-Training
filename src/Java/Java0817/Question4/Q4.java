package Java.Java0817.Question4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Q4")
public class Q4 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        String ope = request.getParameter("ope");
        int result = 0;
        String opeStr = "";
        switch (ope) {
            case "plus":
                result = x + y;
                opeStr = "和";
                break;
            case "minus":
                result = x - y;
                opeStr = "差";
                break;
            case "multi":
                result = x * y;
                opeStr = "積";
                break;
        }
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8' />");
        out.println("<title>Q4</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(String.format("<p>%dと%dの%sは%dです。</p>", x, y, opeStr, result));
        out.println("<p><a href='index.jsp'>戻る</a></p>");
        out.println("</body>");
        out.println("</html>");
    }

}
