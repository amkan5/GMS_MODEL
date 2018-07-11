package service;

import java.util.List;
import domain.RecordBean;
public class RecordServiceImpl implements RecordService {
	private static RecordService instance = new RecordServiceImpl();
	public static RecordService getInstance() {
		return instance;
	}
	private RecordServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void updateRecord(RecordBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord(RecordBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecordBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRecord(RecordBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecordBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecordBean selectOne(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countService() {
		// TODO Auto-generated method stub
		return 0;
	}


}
