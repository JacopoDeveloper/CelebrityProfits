package Control.Amministratore;

import Model.Amministratore;
import Model.AmministratoreDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String address = "";
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        String pass = request.getParameter("password");

        Amministratore a = AmministratoreDAO.doRetrieveByUserPassword(user, pass);

        if (a != null) {
            session.setAttribute("admin", a);
            //address = "WEB-INF/jsp/amministratore/adminPage.jsp";
            //RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/amministratore/adminPage.jsp");
            address = "/IndexServlet";

        } else {
            request.setAttribute("error-message", "Amministratore non trovato");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/error.jsp");
            dispatcher.forward(request, response);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/IndexServlet");
        dispatcher.forward(request, response);
    }
}
