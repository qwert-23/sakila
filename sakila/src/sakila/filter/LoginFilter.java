package sakila.filter;



import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebFilter("/auth/*")

public class LoginFilter implements Filter {
    public LoginFilter() {

    }

	public void destroy() {


	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		System.out.println("LoginFilter 실행");
		HttpSession session = httpRequest.getSession();

		if(session.getAttribute("loginStaff") == null) {
			httpResponse.sendRedirect(httpRequest.getContextPath() + "/LoginServlet");
			return;

		}
		chain.doFilter(request, response);

	}
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
