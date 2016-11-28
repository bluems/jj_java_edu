package bonus1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class HV {
	public static Vector<String> hashToVector(HashMap<String, String> h, int n) {
		Vector<String> v = new Vector<String>(n);
		Set<String> s = h.keySet();
		
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			v.add(h.get(key));
		}
		return v;
	}

	public static void main(String[] args) {
		HashMap<String,String> h = new HashMap<String,String>();
		
		h.put("범죄", "112");
		h.put("화재", "119");
		h.put("전화번호", "114");
		h.put("간첩신고", "113");
		h.put("뭐든지", "106");
		
		Vector<String> v = hashToVector(h, h.size());
		
		for(int n = 0; n<v.size();n++)
			System.out.println(v.get(n) + " ");

	}

}
