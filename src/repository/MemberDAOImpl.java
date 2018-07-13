package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import enums.MemberQuery;
import enums.Vendor;
import domain.ExamBean;
import domain.MemberBean;
import factory.*;
import pool.DBConstant;

public class MemberDAOImpl implements MemberDAO {
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {
		return instance;
	}
	private Statement stmt;
	private MemberDAOImpl() {
		try {
			ResultSet rs = DatabaseFactory.createDatabase(
					Vendor.ORACLE, 
					DBConstant.USERNAME, 
					DBConstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery("")
					;
			//이걸풀면 ResultSet rs= stmt.executeQuery(sql); 
			// stmt<에들어가야할게 conn.createStatement니까. 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertMember(MemberBean bean) {
		try {//void일때는 int로 받기. select나 이런건 
			 int rs = DatabaseFactory.createDatabase(Vendor.ORACLE, //애플.아이폰 이런느낌
						DBConstant.USERNAME, 
						DBConstant.PASSWORD)
						.getConnection()
						.createStatement()
						.executeUpdate(String.format(
								MemberQuery.INSERT_MEMBER.toString(),
								bean.getMemId(),bean.getPassword(),
								bean.getName(),bean.getSsn()));
			 System.out.println(bean.toString());
			 System.out.println("가입결과: "+ rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean> selectAll(MemberBean Member) {
		List<MemberBean> lst = null;
		return lst;
	}

	@Override
	public MemberBean selectOne(MemberBean Member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean login(MemberBean bean) {
		MemberBean member = null;
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  try {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
				            ,"KAN","1253");
				Statement stmt = conn.createStatement();*/
		
		
		try {	ResultSet rs = DatabaseFactory.createDatabase(
						Vendor.ORACLE, 
						DBConstant.USERNAME, 
						DBConstant.PASSWORD)
						.getConnection()
						.createStatement()
						.executeQuery(String.format(
								MemberQuery.LOGIN.toString(),
								bean.getMemId(),
								bean.getPassword()));
				if(rs.next()){
		                do{  member = new MemberBean();
		                	 member.setMemId(rs.getString("USERID"));
		                	 member.setPassword(rs.getString("PASSWORD"));
		                	 member.setTeamId(rs.getString("TEAMID"));
		                	 member.setName(rs.getString("NAME"));
		                	 member.setAge(rs.getString("AGE"));
		                	 member.setRoll(rs.getString("ROLL"));
			                }while(rs.next());
		                }
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return member;
	}
}
