package service;
import java.util.List;
import domain.SubjectBean;
public interface SubjectService {
	public void createSubject(SubjectBean bean);
	public List<SubjectBean> list();
	public List<SubjectBean> selectSome(String word);
	public SubjectBean selectOne(String word);
	public int countService();
	public void modifySubject(SubjectBean bean);
	public void deleteSubject(SubjectBean bean);
}
