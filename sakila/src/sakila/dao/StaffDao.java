package sakila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sakila.query.*;
import sakila.vo.Staff;

public class StaffDao {
	public Staff selectStaffByKey(Connection conn, Staff staff)throws Exception{
		
		Staff returnStaff =null;
		
		PreparedStatement stmt = conn.prepareStatement(StaffQuery.SELECT_STAF_BY_KEY);
		stmt.setString(1, staff.getEmall());
		stmt.setString(2, staff.getPassword());
		
		ResultSet rs = stmt.executeQuery();		
		
		if (rs.next()) {
			returnStaff = new Staff();
			returnStaff.setEmall(rs.getString("email"));
			returnStaff.setUsername(rs.getString("username"));
			
		}
		
	
		return returnStaff;	
	}
}
