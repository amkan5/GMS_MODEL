package repository;

import java.util.List;

import domain.SubjectBean;
import service.SubjectService;
import service.SubjectServiceImpl;

public class SubjectDAOImpl implements SubjectDAO {
	private static SubjectDAO instance = new SubjectDAOImpl();
	public static SubjectDAO getInstance() {
		return instance;
	}
	private SubjectDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insertSubject(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectBean> selectAll(SubjectBean Subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectBean selectOne(SubjectBean Subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSubject() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateSubject(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteSubject(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}

}
