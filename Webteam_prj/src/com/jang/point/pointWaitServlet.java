package com.jang.point;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class pointWaitServlet
 */
@WebServlet("/pointWaitServlet")
public class pointWaitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PointDAO dao = new PointDAO();
		int wait = dao.selectWait(4);
		Gson gson= new Gson();
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println(wait);
		out.println(wait);
	}

}
