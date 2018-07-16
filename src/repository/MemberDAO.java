package repository;
import java.util.List;

import domain.ExamBean;
import domain.MemberBean;
public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectAll();
	public List<MemberBean> selectSome(String word);
	public MemberBean selectOne(String word);
	public int countMember();
	public void updateMember(MemberBean member);
	public void dropMember(MemberBean member);
	public MemberBean login(MemberBean bean); //비번떔시 객체던짐

}
