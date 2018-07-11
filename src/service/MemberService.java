package service;
import domain.*;
import java.util.List;

import com.sun.swing.internal.plaf.metal.resources.metal;

import domain.*;
public interface MemberService {
	public void createMember(MemberBean member);
	public List<MemberBean> list();
	public List<MemberBean> selectSome(String word);
	public MemberBean selectOne(String word);
	public int countMember();
	public void updateMember(MemberBean member);
	public void delteMember(MemberBean member);
	public boolean loginB(MemberBean bean); 
	public MemberBean login(MemberBean bean);
}
