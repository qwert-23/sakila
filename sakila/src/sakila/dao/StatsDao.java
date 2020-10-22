package sakila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import sakila.query.*;
import sakila.vo.Stats;

public class StatsDao {
	
	public Stats selectDay(Connection conn, Stats stats)throws Exception{
		Stats returnStats =null;
		
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.SELECT_DAY);
		stmt.setString(1, .getDay());
		
		
		
		
	}
}
