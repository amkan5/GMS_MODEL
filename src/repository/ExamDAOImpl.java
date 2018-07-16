package repository;

import java.beans.Statement;
import java.sql.*;
import java.util.List;
import domain.ExamBean;
import enums.*;
import factory.DatabaseFactory;
import pool.DBConstant;
public class ExamDAOImpl implements ExamDAO {
	private static ExamDAO instance = new ExamDAOImpl();
	public static ExamDAO getInstance() {
		return instance;
	}
	private ExamDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertExam(ExamBean bean) {
		System.out.println(bean.toString());
		
	}

	@Override
	public void updateExam(ExamBean exam) {
		
		
	}

	@Override
	public void deleteExam(ExamBean exam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ExamBean> selectAll(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExamBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExamBean selectOne(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		int count = 0;
		return count;
	}

}
