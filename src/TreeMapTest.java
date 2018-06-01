import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "123");
		map.put(3, "123");
		map.put(2, "123");
		map.put(4, "123");
		map.put(5, "123");

		System.out.println(map);
		
		// ps treemap 默认排序规则asc正序排列；如果想倒序，就在comparable中返相反的方向，如a<b?1:a==b?0:-1
	}

}
