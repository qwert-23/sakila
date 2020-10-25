package sakila.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sakila.service.StaffService;
import sakila.service.StatsService;
import sakila.vo.Stats;
import sakila.vo.Staff;

@WebServlet({"/", "/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private StatsService statsService;
	private StaffService staffService;
	
	// 로그인 폼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 성공시 index 이동
		HttpSession session = request.getSession();
/*
		if(session.getAttribute("loginStaff") != null) {
			response.sendRedirect(request.getContextPath() + "/auth/IndexServlet");
			return;
		}
		*/
		// 오늘 방문자 ,  총 방문자 수 뷰로 보내기 위해 
		statsService = new StatsService();
		Map<String, Object> map = statsService.getStats();
		
		request.setAttribute("todayStats", map.get("todayStats"));
		request.setAttribute("totalStats", map.get("totalStats"));
		
		System.out.println("LoginServlet/doGet/: todayStats=" + request.getAttribute("todayStats")); // 디버그
		System.out.println("LoginServlet/doGet/: totalStats=" + request.getAttribute("totalStats")); // 디버그
		
		// 뷰로 포워딩
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	// 로그인 액션
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String staffEmail = request.getParameter("Email");
		String staffPassword = request.getParameter("password");
		
		System.out.println("LoginServlet/doPost/: staffEmail=" + staffEmail); 
		System.out.println("LoginServlet/doPost/: staffPassword=" + staffPassword); 
		
		staffService = new StaffService();
		Staff staff = new Staff();
		staff.setEmail(staffEmail);
		staff.setPassword(staffPassword);
		
		System.out.println("LoginServlet staff.getEmai=" + staff.getEmail());
		System.out.println("LoginServlet staff.getPassword=" + staff.getPassword()); 
		
		Staff returnStaff = staffService.getStaffByKey(staff);
		
		if(returnStaff != null) {
			System.out.println("LoginServlet/doPost/debug: 로그인 성공"); 
			HttpSession session = request.getSession();
			session.setAttribute("loginStaff", returnStaff);
			response.sendRedirect(request.getContextPath() + "/auth/IndexServlet"); 
			return;
			
		} else {
			System.out.println("LoginServlet/doPost/debug: 로그인 실패"); 
			response.sendRedirect(request.getContextPath() + "/LoginServlet"); 
		}
	}
}
