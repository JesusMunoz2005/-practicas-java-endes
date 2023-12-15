package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class mayorservlet
 */
public class mayorservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mayorservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
	    doGet(request, response);
	    
	    String num1String = request.getParameter("num1");
	    String num2String = request.getParameter("num2");
	    String num3String = request.getParameter("num3");

	    try {
	        int num1 = Integer.parseInt(num1String);
	        int num2 = Integer.parseInt(num2String);
	        int num3 = Integer.parseInt(num3String);

	        PrintWriter out = response.getWriter();
	        
	        if (num1 < num2 && num3 < num2) {
	            out.println(num2 + " Es el mas grande");
	        } else if (num2 < num3 && num1 < num3) {
	            out.println(num3 + " Es el mas grande");
	        } else if (num1 > num2 && num1 > num3) {
	            out.println(num1 + " Es el mas grande");
	        } else {
	            out.println("Son iguales");
	        }

	    } catch (NumberFormatException e) {
	        System.out.println("Error");
	    }
	}

	}
