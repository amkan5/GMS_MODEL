package domain;

public class MemberBean {
	protected String memId,name,roll,teamId,age,password,ssn;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "MemberBean [memId=" + memId + ", name=" + name + ", roll=" + roll + ", teamId=" + teamId + ", age="
				+ age + ", password=" + password + "]";
	}

}
