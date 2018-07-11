package repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import domain.ExamBean;
import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO {
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {
		return instance;
	}
	private MemberDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertMember(MemberBean member) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
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
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  try {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
				            ,"KAN","1253");
				Statement stmt = conn.createStatement();
				String sql = String.format("SELECT "
						+"MEM_ID USERID, PASSWORD, TEAM_ID TEAMID, NAME, AGE, ROLL FROM MEMBER "+
						"WHERE MEM_ID LIKE '%s' "
						+"AND PASSWORD LIKE '%s' ",
						bean.getMemId(),
						bean.getPassword());
				ResultSet rs= stmt.executeQuery(sql);
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

}
