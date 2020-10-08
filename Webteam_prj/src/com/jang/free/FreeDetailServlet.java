package com.jang.free;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

/**
 * Servlet implementation class FreeDetailServlet
 */
@WebServlet("/freeDetail")
public class FreeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FreeDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fseq=Integer.parseInt(request.getParameter("seq"));
		System.out.println(fseq);
		FreeDAO fDAO= new FreeDAO();
		FreeVO res= new FreeVO();
		res=fDAO.selectOne(fseq);
		FreeCDAO fCDAO= new FreeCDAO();
		ArrayList<FreeComVO> list= new ArrayList<FreeComVO>();

		list=fCDAO.selectList(fseq); //null fseq=1
		request.setAttribute("RES_VO", res);
		request.setAttribute("KEY_LIST", list);
		request.getRequestDispatcher("freeDetail.jsp").forward(request, response);
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
