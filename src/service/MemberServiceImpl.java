package service;
import domain.*;
import java.util.List;
import domain.MemberBean;
import repository.MemberDAOImpl;
public class MemberServiceImpl implements MemberService {
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {
		return instance;
	}
	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void createMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MemberBean> selectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MemberBean selectOne(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean loginB(MemberBean bean) {
		return (MemberDAOImpl.getInstance().login(bean)!=null);
	}
	@Override
	public MemberBean login(MemberBean bean) {
		return MemberDAOImpl.getInstance().login(bean);
	}
}
