package service;
import java.util.List;
import domain.*;
public interface ExamService {
	public void createExam(ExamBean exam);
	public List<ExamBean> list();
	public List<ExamBean> selectSome(String word);
	public ExamBean selectOne(String word);
	public int countExam();
	public void updateExam(ExamBean exam);
	public void deleteExam(ExamBean exam);
}
