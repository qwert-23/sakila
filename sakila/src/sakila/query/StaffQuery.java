package sakila.query;

public class StaffQuery {
	public final static String SELECT_STAF_BY_KEY=
			"SELECT staff_id, username FORM staff WHERE staff_id=? AND password =?";
	
}
