package server;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {

    public static final int PEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TESOURA = 3;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int opcaoUsuario = Integer.parseInt(request.getParameter("opcaoUsuario"));

        Random random = new Random();


        int opcaoComputador = random.nextInt(2) + 1;


        switch (opcaoUsuario){
            case PEDRA :

        }

        request.setAttribute("opcaoUsuario", opcaoUsuario);

        RequestDispatcher destino = request.getRequestDispatcher("index.jsp");

        destino.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }


}
