package repository;

import java.util.List;
import domain.RecordBean;

public interface RecordDAO {
	public void insertRecord(RecordBean record);
	public List<RecordBean> selectAll(RecordBean Record);
	public List<RecordBean> selectSome(String word);
	public RecordBean selectOne(RecordBean Record);
	public int countRecord();
	public void updateRecord(RecordBean record);
	public void delteRecord(RecordBean record);
	public String selectFirstRownum(); //넣는순서에 따라서니까 방금넣은거 가져오려면. 
}
