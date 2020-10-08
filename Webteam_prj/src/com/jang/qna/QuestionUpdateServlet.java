package com.jang.qna;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jang.order.OrderDAO;
import com.jang.order.orderVO;

/**
 * Servlet implementation class QuestionUpdateServlet
 */
@WebServlet("/QuestionUpdateServlet")
public class QuestionUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mseq=Integer.parseInt(request.getParameter("qseq"));
		System.out.println(mseq);
		QuetionDAO qdao = new QuetionDAO();
		QuestionVO qvo = qdao.selectOne(mseq);
		request.setAttribute("RES_VO",qvo);
		request.getRequestDispatcher("questionUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String qText = request.getParameter("questionText");
		int qSeq = Integer.parseInt(request.getParameter("qSeq"));
		
		QuestionVO qvo= new QuestionVO();
		qvo.setmSeq(qSeq);
		qvo.setqText(qText);
		
		QuestionVO qdao= new QuestionVO();		
			System.out.println("Update Done.....");
			response.sendRedirect("/questionDetail?seq="+qvo.getqSeq());		
	}

}
