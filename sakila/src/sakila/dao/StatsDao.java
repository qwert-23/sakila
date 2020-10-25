package sakila.dao;

import java.sql.*;
import java.sql.PreparedStatement;


import sakila.query.StatsQuery;
import sakila.vo.Stats;

public class StatsDao {
	// 오늘 날짜에 방문자가 있는지(insert을 사용해야하는지 update를 사용해야하는지) 판단
	// 방문자가 있으면 true, 없으면 false 출력
	public Stats selectDay(Connection conn, Stats stats) throws Exception{
		System.out.println("debug : selectDay 실행");
		Stats returnStats = null;
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.SELECT_DAY);
		stmt.setString(1, stats.getDay());
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			returnStats = new Stats();
			returnStats.setDay(rs.getString("day"));
			System.out.println("debug : day(" + rs.getString("day") + ")");
			returnStats.setCount(rs.getLong("count"));
			System.out.println("debug : count(" + rs.getLong("count") + ")");
		}
		return returnStats; // false -> 방문자가 없으면 insert 실행
	}
	
	// 첫 방문자  카운터+1
	public void insertStats(Connection conn, Stats stats) throws Exception{
		System.out.println("debug : insertStats 실행");
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.INSERT_STATS);
		stmt.setString(1, stats.getDay());
		stmt.executeUpdate();
	}
	
	// 방문자수 +1
	public void updateStats(Connection conn, Stats stats) throws Exception{
		System.out.println("debug : updateStats 실행");
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.UPDATE_STATS);
		stmt.setString(1, stats.getDay());
		stmt.executeUpdate();
	}
	
	// 총 방문자
	public int selectTotalDay(Connection conn, Stats stats) throws Exception{
		System.out.println("debug : selectTotalDay 실행");
		int returnStats = 0;
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.SELECT_TOTAL_COUNT);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			returnStats = rs.getInt("SUM(count)");
			System.out.println("debug : SUM(count)(" + rs.getLong("SUM(count)") + ")");
		}
		return returnStats;
	}
}
