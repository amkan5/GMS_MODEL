package service;

import java.util.List;

import domain.SubjectBean;

public class SubjectServiceImpl implements SubjectService{
	private static SubjectService instance = new SubjectServiceImpl();
	public static SubjectService getInstance() {
		return instance;
	}
	private SubjectServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createSubject(SubjectBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SubjectBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectBean selectOne(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countService() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifySubject(SubjectBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject(SubjectBean bean) {
		// TODO Auto-generated method stub
		
	}

}
