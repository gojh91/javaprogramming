//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args){
		Map<String, String> st=new HashMap<String, String>();
		st.put("0001", "���缮");
		st.put("0002", "�ŵ���");
		st.put("0003", "��ȣ��");
		
		System.out.println(st);
		
		st.remove("0002");
		System.out.println("���� ��: " + st);
		st.put("0003", "�̰��");
		System.out.println("��ġ ��: " + st);
		System.out.println(st.get("0003"));
		System.out.println("----Map ����----");
		for (Map.Entry<String, String> s : st.entrySet()) {
			String key = s.getKey();
			String value= s.getValue();
			System.out.println(key + "," + value);
			
			
		}

	}
}
