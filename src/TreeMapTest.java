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
		
		// ps treemap Ĭ���������asc�������У�����뵹�򣬾���comparable�з��෴�ķ�����a<b?1:a==b?0:-1
	}

}
