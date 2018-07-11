package repository;

import java.util.List;
import domain.SubjectBean;
public interface SubjectDAO {
	public void insertSubject(SubjectBean Subject);
	public List<SubjectBean> selectAll(SubjectBean Subject);
	public List<SubjectBean> selectSome(String word);
	public SubjectBean selectOne(SubjectBean Subject);
	public int countSubject();
	public void updateSubject(SubjectBean Subject);
	public void delteSubject(SubjectBean Subject);
}
