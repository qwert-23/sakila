package sakila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sakila.query.*;
import sakila.vo.Stats;

public class StatsDao {
	
	public Stats selectDay(Connection conn, Stats stats)throws Exception{
		Stats returnStats =null;
		
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.SELECT_DAY);
		stmt.setLong(1, stats.getCnt());
		stmt.setString(2, stats.getDay());
		
		ResultSet rs = stmt.executeQuery();
	
		if(rs.next()) {
			returnStats = new Stats();
			
			
		}
		return returnStats;
		
		
		
	}
}
