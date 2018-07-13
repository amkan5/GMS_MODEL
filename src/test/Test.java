package test;

import java.util.ArrayList;
import java.util.List;
import test.*;
public class Test {
	public static void main(String[] args) {
		List<String> lst = TestDAOImpl.getInstance().getAge();
		List<String> ssnLst = new ArrayList<>();
		//2017-나이
		//age를 몇년생인지 추출
		///900818-1 
		// 90 + 00(랜덤) + 00(랜덤)
		for(int i=0;i<lst.size();i++) {
			ssnLst.add(
					String.valueOf(119-Integer.parseInt(
							lst.get(i)
					))
					+ String.format("%02d", 
							(int)((Math.random()*12)+1)
					  )
					+ String.format("%02d", 
							(int)((Math.random()*27)+1)
					  )
			);
		}
		System.out.println(ssnLst);
	}

}
