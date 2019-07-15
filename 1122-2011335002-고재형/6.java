//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args){
		Map<String, String> st=new HashMap<String, String>();
		st.put("0001", "유재석");
		st.put("0002", "신동엽");
		st.put("0003", "강호동");
		
		System.out.println(st);
		
		st.remove("0002");
		System.out.println("삭제 후: " + st);
		st.put("0003", "이경규");
		System.out.println("대치 후: " + st);
		System.out.println(st.get("0003"));
		System.out.println("----Map 내용----");
		for (Map.Entry<String, String> s : st.entrySet()) {
			String key = s.getKey();
			String value= s.getValue();
			System.out.println(key + "," + value);
			
			
		}

	}
}
