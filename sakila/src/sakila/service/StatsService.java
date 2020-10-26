package sakila.service;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import sakila.dao.StatsDao;
import sakila.util.DBUtil;
import sakila.vo.Stats;


// 방문자수 구하기
public class StatsService {
	private StatsDao statsDao;
	
	public Stats getToday() { 
		Calendar today = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		String day = formater.format(today.getTime());
		Stats stats = new Stats();
		stats.setDay(day);
		return stats;
	}
	
	public Map<String, Object> getStats() {
		Stats returnStats = null; 
		int totalStats = 0;  
		Map<String, Object> map = null;
		map = new HashMap<String, Object>();
		statsDao = new StatsDao();
		
		Connection conn = null;
		try {
			DBUtil dbUtil = new DBUtil(); 	//DB
			conn = dbUtil.getConnection();
			conn.setAutoCommit(false); 
			
			Stats stats = this.getToday();
			
			returnStats = statsDao.selectDay(conn, stats);
			totalStats = statsDao.selectTotalDay(conn, stats);
			
			if(returnStats != null) { 
				statsDao.updateStats(conn, stats);
			}else { 
				statsDao.insertStats(conn, stats);
			}
			
			map.put("returnStats", returnStats); 
			map.put("totalStats", totalStats); 
			
			conn.commit();
		}catch (Exception e) {
			try { // 예외 발생 시 rollback
				conn.rollback();
			}catch (SQLException e1){
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally { // 무조건 실행
			try {
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	public void countStats() {
		statsDao = new StatsDao();

		Connection conn = null;
		try {
			DBUtil dbUtil = new DBUtil();
			conn = dbUtil.getConnection();
			conn.setAutoCommit(false);
			
			Stats stats = this.getToday();
			
			if(statsDao.selectDay(conn, stats) == null) {
				statsDao.insertStats(conn, stats);
			}else { 
				statsDao.updateStats(conn, stats);
			}
			conn.commit();
		}catch (Exception e) {
			try {
				//예외 발생시 rollback();
				conn.rollback();
			}catch (SQLException e1){
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally { // 무조건 실행
			try {
				conn.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
