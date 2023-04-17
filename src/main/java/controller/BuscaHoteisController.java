package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/buscaHoteis")
public class BuscaHoteisController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hotel = request.getParameter("hotel");

        String mensagem = "";

        if (hotel != null && !hotel.isEmpty()) {
            mensagem = HotelController.buscarHotel(hotel);
        }

        if (mensagem.isEmpty()) {
            mensagem = "Hotel não encontrado.";
        }

        request.setAttribute("mensagem", mensagem);

        request.getRequestDispatcher("/resultadoBusca.jsp").forward(request, response);
    }
}

