package service;
import java.util.List;
import domain.RecordBean;
public interface RecordService {
	public void createRecord(RecordBean bean);
	public List<RecordBean> list();
	public List<RecordBean> selectSome(String word);
	public RecordBean selectOne(String word);
	public int countService();
	public void updateRecord(RecordBean bean);
	public void deleteRecord(RecordBean bean);
}
