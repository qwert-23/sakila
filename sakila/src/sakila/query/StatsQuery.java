package sakila.query;

public class StatsQuery {
	public static final String SELECT_DAY = "SELECT * FROM stats WHERE day= ?";
	static final public  String  INESET_STATS = "INSERT INTO stats(day, count)VALUES(?,1)";
	final public static String UPDATE_STATS = "UPDATE stats SET cnt=cnt+1 WHERE day = ?";
	
	
}
