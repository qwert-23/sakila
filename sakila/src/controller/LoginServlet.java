package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sakila.service.StaffService;
import sakila.service.StatsService;
import sakila.vo.Staff;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
		private StatsService statsService;
		private StaffService staffService;
		
		
   //로그인폼 
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
	
			staffService = new StaffService();
			Staff staff =new Staff();
			Staff returnStaff = staffService.getStaffByKey(staff);
			
			if(returnStaff != null) {
				
				
				return; 
			}
			response.sendRedirect(request.getContextPath()+"/LoginServlet");
	}

}
