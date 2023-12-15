package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DiaSemanaServelet
 */
public class DiaSemanaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaSemanaServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(request.getContextPath());
	
		 String numStr = request.getParameter("num");

	        if (numStr != null && !numStr.isEmpty()) {
	            try {
	                int num = Integer.parseInt(numStr);

	                if (num >= 1 && num <= 7) {
	                    String diaSemana;
	                    switch (num) {
	                        
	                        case 1:
	                            diaSemana = "Lunes";
	                            break;
	                        case 2:
	                            diaSemana = "Martes";
	                            break;
	                        case 3:
	                            diaSemana = "Miércoles";
	                            break;
	                        case 4:
	                            diaSemana = "Jueves";
	                            break;
	                        case 5:
	                            diaSemana = "Viernes";
	                            break;
	                        case 6:
	                            diaSemana = "Sábado";
	                        case 7:
	                            diaSemana = "Domingo";   
	                            break;
	                        default:
	                            diaSemana = "Número fuera de rango (debe estar entre 1 y 7)";
	                            break;
	                    }

	                    PrintWriter out = response.getWriter();
	                    
	                    out.println("Día de la semana correspondiente: " + diaSemana);
	                   
	                } else {
	                    response.getWriter().println("Número fuera de rango (debe estar entre 1 y 7)");
	                }

	            } catch (NumberFormatException e) {
	                response.getWriter().println("Por favor, introduce un número válido.");
	            }
	        } else {
	            response.getWriter().println("Por favor, introduce un número.");
	        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
