package enums;

public enum MemberQuery {
	LOGIN, INSERT_MEMBER;

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
		}
		// TODO Auto-generated method stub
		return query;
	}
	
}
