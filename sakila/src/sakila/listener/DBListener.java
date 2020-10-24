package sakila.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class DBListener implements ServletContextListener {

	
    public void contextDestroyed(ServletContextEvent arg0)  { 
        
    }


    public void contextInitialized(ServletContextEvent arg0)  { //시작시 호출
       
    	try {
    		
    		Class.forName("org.mariadb.jdbc.Driver");
    		System.out.println("org.mariadb.jdbc.Driver 성공");
    	}catch(Exception e){
    		e.printStackTrace();
    		System.out.println("org.mariadb.jdbc.Driver 실패");
    		
    	}
    	
    	
    }
	
}
