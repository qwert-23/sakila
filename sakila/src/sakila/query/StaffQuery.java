

package sakila.query;



public class StaffQuery {
	//  email , password 일치 시  email ,username  관리자 로그인
	public final static String SELECT_STAFF_BY_KEY = "select email, username from staff where email = ? and password = password(?)";

	}