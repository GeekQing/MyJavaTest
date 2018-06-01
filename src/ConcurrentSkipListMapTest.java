import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapTest {

	public static void main(String[] args) {
		ConcurrentSkipListMap<Double, Double> map = new ConcurrentSkipListMap<Double, Double>();
		
		map.put(123D, 456D);
		map.put(123D, 0D);
		map.put(123D, 22D);
		map.put(222D, 22D);
		map.put(123D, 11D);

		System.out.println(map);
	}

}
