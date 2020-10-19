package sakilra.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// list 동적배열  set 중복허용x 동적배열  Map
//list ArrayList Map hashMap
//1. filter  2.servlet  3.Listener 이벤트처리 
//

@WebFilter("/*")// /*모든요청에대한끼어들기 UTF-8
public class EncodingFilter implements Filter {

   
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//체인을 따라 다음에존재하는 필터로 이동 체인의 가장마지막에 있는 클라이언트가 요청한 최종자원이 위치
		System.out.println("EncodingFilter 실행: request utf-8 인코딩");// dofilter을 이용하여 요청을 필터링
		request.setCharacterEncoding("utf-8");  //어떤걸 실행해도 먼저 실행됨
		chain.doFilter(request, response); //체인의 다음 필터처리
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// 필터 초기화
	}

}
