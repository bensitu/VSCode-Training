package Java.Java0819.Question1;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mora-result")
public class mora extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

        RequestDispatcher rd = req.getRequestDispatcher("/mora.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String[] game = { "グー", "チョキ", "パー" };

        req.setCharacterEncoding("utf-8");
        String gameString = req.getParameter("mora");
        int user = Integer.parseInt(gameString);
        int pc = new Random().nextInt(game.length);

        String result;
        int defeat = (user + 3 - pc) % 3;
        if (defeat == 0) {
            result = "One more time!";
        } else if (defeat == 2) {
            result = "You are win!";
        } else {
            result = "You are lose!";
        }
        req.setAttribute("user", game[user]);
        req.setAttribute("pc", game[pc]);
        req.setAttribute("result", result);
        doGet(req, resp);
    }

}
