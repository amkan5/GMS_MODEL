package service;
import java.util.List;
import java.util.Set;

import domain.ExamBean;
import domain.RecordBean;
import domain.SubjectBean;
import repository.*;

public class ExamServiceImpl implements ExamService {
	private static ExamService instance = new ExamServiceImpl();
	public static ExamService getInstance() {
		return instance;
	}
	private ExamServiceImpl() {
		
	}
	@Override
	public void createExam(ExamBean exam) {
		String marks[] = exam.getScore().split(",");
		String subjects[] = {"JAVA","SQL","R","HTML5","PYTHON"};
		//성적표를 미리 만들어줌.? 
		int total = Integer.parseInt(marks[0])+Integer.parseInt(marks[1])+
				Integer.parseInt(marks[2])+Integer.parseInt(marks[3])+Integer.parseInt(marks[4]);
		RecordBean rec = new RecordBean();
		rec.setGrade("");
		rec.setAverage("");
		RecordDAOImpl.getInstance().insertRecord(rec);
		for(int i=0;i<5;i++) {
			exam.setSubSeq(SubjectDAOImpl.getInstance().selectSome(
					subjects[i]
							).get(0).getSubSeq()
					);
			exam.setScore(marks[i]);
			exam.setRecordSeq(RecordDAOImpl.getInstance().selectFirstRownum());
			ExamDAOImpl.getInstance().insertExam(exam);
		}
	}

	@Override
	public void updateExam(ExamBean exam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExam(ExamBean exam) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<ExamBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ExamBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ExamBean selectOne(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countExam() {
		// TODO Auto-generated method stub
		return 0;
	}


}
