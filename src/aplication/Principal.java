package aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import modelo.entidade.Department;

public class Principal {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			
			
			conn = DB.getConnection();
	        st = conn.createStatement();
	        
	        
			/*rs = st.executeQuery("select * from department");
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			*/
			
			Department obj1 = new Department(1, "Books");
			System.out.println(obj1);
			
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
