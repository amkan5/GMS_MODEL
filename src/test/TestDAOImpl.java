package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import pool.DBConstant;
public class TestDAOImpl {
	private static TestDAOImpl instance = new TestDAOImpl();
	public static TestDAOImpl getInstance() {
		return instance;
	}
	private TestDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getAge(){
		List<String> lst = new ArrayList<>();
		try {
			Class.forName(DBConstant.ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(DBConstant.CONNECTION_URL
		            ,DBConstant.USERNAME,DBConstant.PASSWORD);
			Statement stmt =  conn.createStatement();
			String sql = "SELECT MEM_ID USERID, AGE,SSN FROM MEMBER";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				lst.add(rs.getString("AGE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lst);
		return lst;
	}
}
