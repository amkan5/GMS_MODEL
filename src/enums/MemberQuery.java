package enums;

public enum MemberQuery {
	LOGIN, INSERT_MEMBER, COUNT_MEMBER, UPDATE_MEMBER, DELETE_MEMBER,
	SELECT_ALL_MEMBER, SELECT_ONE_MEMBER, SELECT_ONE_TEAM, SELECT_SOME_MEMBER;
	@Override //컨트롤+스페이스 toSpring
			 // 얘가 상수처리하는것보다 조금 더 느리긴한데 뺵뺵한거임. 
	public String toString() {
		String query = "";
		switch (this) {
		case LOGIN :
			query = "SELECT "
					+"MEM_ID USERID, PASSWORD, TEAM_ID TEAMID, NAME, AGE, ROLL FROM MEMBER "+
					"WHERE MEM_ID LIKE '%s' "
					+"AND PASSWORD LIKE '%s' ";
			break;
		case INSERT_MEMBER :
			query = "INSERT INTO MEMBER( "
					+"MEM_ID, PASSWORD, NAME, SSN ) "
					+"VALUES "
					+"( '%s', '%s', '%s', '%s' )";
			break;
		case COUNT_MEMBER : 
			query = "SELECT COUNT(*) AS count FROM MEMBER";
			break;
		case UPDATE_MEMBER : 
			query = "UPDATE MEMBER SET PASSWORD = '%s' "
					+ "WHERE MEM_ID LIKE '%s' "
					+ "AND PASSWORD LIKE '%s'";
			break;
		case DELETE_MEMBER : 
			query = "DELETE FROM MEMBER "
					+ "WHERE MEM_ID LIKE '%s' "
					+ "AND PASSWORD LIKE '%s'";
			break;
		case SELECT_ALL_MEMBER :
			query = "SELECT "
					+ "MEM_ID AS USERID,"
					+ "NAME,"
					+ "AGE,"
					+ "ROLL,"
					+ "PASSWORD,"
					+ "SSN,"
					+ "TEAM_ID"
					+ " FROM MEMBER";
			break;
		case SELECT_ONE_MEMBER :
			query = "SELECT "
					+ "MEM_ID AS USERID,"
					+ "NAME,"
					+ "AGE,"
					+ "ROLL,"
					+ "PASSWORD,"
					+ "SSN,"
					+ "TEAM_ID "
					+ " FROM MEMBER "
					+ "WHERE MEM_ID LIKE '%s'";
			break;
		case SELECT_ONE_TEAM :
			query = "SELECT "
					+ "TEAM_ID,"
					+ "TEAM_NAME "
					+ "FROM PROJECT_TEAM "
					+ "WHERE TEAM_NAME LIKE '%s'";
					break;
		case SELECT_SOME_MEMBER :
			query = "SELECT "
					+ "MEM_ID AS USERID,"
					+ "NAME,"
					+ "AGE,"
					+ "ROLL,"
					+ "PASSWORD,"
					+ "SSN,"
					+ "TEAM_ID "
					+ " FROM MEMBER "
					+ "WHERE TEAM_ID LIKE '%s'";
			System.out.println(query);
			break;
		}
		// TODO Auto-generated method stub
		return query;
	}
	
}
