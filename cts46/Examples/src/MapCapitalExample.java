import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class MapCapitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		ArrayList<String> ar=new ArrayList<String>();
		m.put(1001,"van");
		m.put(1002,"moni");
		m.put(1003,"nav");
		m.put(1004,"ram");
		m.put(1005,"srav");
		m.put(1006,"appu");
		Set key=m.entrySet();
		Iterator itr=key.iterator();
		while(itr.hasNext()) {
		Map.Entry entry=(Map.Entry)itr.next();
		String str=(String) entry.getValue();
		if(str.charAt(0)>=97&&str.charAt(0)<=123&& str.charAt(str.length()-1)>=65&& str.charAt(str.length()-1)<=90)
		{
			ar.add(str);
			
		}
		}
		System.out.println("the name satisfying conditions are");
		for(String c:ar)
		{
			System.out.println(c);
		}
	
}
		
                                                     
	}

}
 