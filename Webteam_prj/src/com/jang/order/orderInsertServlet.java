package com.jang.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class orderInsertServlet
 */
@WebServlet("/orderInsertServlet")
public class orderInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderInsertServlet() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String orderTitle = request.getParameter("orderTitle");
		String orderPoint = request.getParameter("orderPoint");
		String placename = request.getParameter("placename");
		String lat = request.getParameter("lat");
		String lng = request.getParameter("lng");
		String orderText = request.getParameter("orderText");
		
		orderVO ovo= new orderVO();
		ovo.setoTitle(orderTitle);
		ovo.setoPoint(Integer.parseInt(orderPoint));
		ovo.setoAddress(placename);
		ovo.setoLat(Double.parseDouble(lat));
		ovo.setoLng(Double.parseDouble(lng));
		ovo.setoText(orderText);
		
		OrderDAO odao= new OrderDAO();
		if(odao.orderInsert(ovo)==1)
		{
			System.out.println("insert Done.....");
			response.sendRedirect("orderBoarder.jsp");
		}
	}

}
