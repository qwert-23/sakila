package sakilra.filter;

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

import jdk.internal.dynalink.support.ClassLoaderGetterContextProvider;
//웹브라우저 요청만처리

@WebFilter("/auth/*")//auth 로 시작하는 모든 가로채기
public class LoginFilter implements Filter {

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("EncodingFilter 실행: session 검사");
	HttpSession session = ((HttpServletRequest)request).getSession();
	if(session.getAttribute("loginStaff")==null) {
		System.out.println("로그인 후접근!");
		((HttpServletResponse)response).sendRedirect(request.getServletContext().getContextPath());
			
				
				return ;
		}
	
		chain.doFilter(request, response);
	}
	public LoginFilter() {}
	public void destory() {}
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
