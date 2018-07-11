package repository;
import java.util.List;
import domain.RecordBean;

public class RecordDAOImpl implements RecordDAO {
	private static RecordDAO instnace = new RecordDAOImpl();
	public static RecordDAO getInstance() {
		return instnace;
	}
	private RecordDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void insertRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteRecord(RecordBean record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecordBean> selectAll(RecordBean Record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecordBean selectOne(RecordBean Record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countRecord() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String selectFirstRownum() {
		// TODO Auto-generated method stub
		return null;
	}

}
