import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1327, "aaaa");
		map.put(2423, "bbbb");
		map.put(1233, "cccc");
		map.put(4323, "dddd");
		map.put(4323, "zzzz");
		map.put(4323, "eeee");
		map.put(2222, "dddd");
		
		System.out.println(map);
		System.out.println(map.containsKey(2222));
		System.out.println(map.containsValue("aaaa"));
		
		Set<Integer> keys=map.keySet();
		for (Integer key : keys) {
			String value= map.get(key);
			System.out.println(value);
		}
		
		map.remove(2222);
		map.replace(1327, "uttam");
		
		Set<Map.Entry<Integer, String>> entries=map.entrySet();
		for(Map.Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
