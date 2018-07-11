package repository;
import java.util.List;
import domain.*;
public interface ExamDAO {
  public void insertExam(ExamBean exam);
  public List<ExamBean> selectAll(ExamBean exam);
  public List<ExamBean> selectSome(String word);
  public ExamBean selectOne(ExamBean exam);
  public int countMember();
  public void updateExam(ExamBean exam);
  public void deleteExam(ExamBean exam);
}
