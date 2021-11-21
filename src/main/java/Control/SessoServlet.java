package Control;

import Model.Celebrita;
import Model.CelebritaDAO;
import Model.Varie.Ordinamento;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SessoServlet", value = "/SessoServlet")
public class SessoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String sesso = request.getParameter("sesso");
        List<Celebrita> listSesso = CelebritaDAO.doRetrieveBySesso(sesso);

        /*Ordinamento rank*/
        Ordinamento o = new Ordinamento();
        listSesso.sort(o);

        session.setAttribute("listaSesso", listSesso);

        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/sessoCelebrita.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
