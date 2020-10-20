package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
       
   //로그인폼 이동

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session =request.getSession();
			if(session.getAttribute ("loginStaff") !=null) {	
				response.sendRedirect(request.getContextPath()+"/auth/IndexServlet");//auth는 로그인 되어있을때만 들어옴
				return;
			}
			
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
		
		
	}

	//Action 이동
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
