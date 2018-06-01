import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleTest {

	public static void main(String[] args) {
		System.out.println(0.03);
		System.out.println(0.028);
		System.out.println(new BigDecimal(0.03));
		System.out.println(new BigDecimal(0.028));
		System.out.println(0.03 + 0.028);
		System.out.println(new BigDecimal(0.03).add(new BigDecimal(0.028)));
		System.out.println(new BigDecimal(String.valueOf(0.03)).add(new BigDecimal(String.valueOf(0.028))));
		System.out.println(new BigDecimal("0.030").add(new BigDecimal("0.028")));
		System.out.println(new BigDecimal(0.058).subtract(new BigDecimal(0.03).add(new BigDecimal(0.028))));
		
		System.out.println(0.058 - (0.03 + 0.028) < 0.00000001);
		
		
		System.out.println(0.058 - 0.058);
		System.out.println(0.03 - 0.028);
		
		System.out.println(new BigDecimal(String.valueOf("7.8705E-5")));
		
		System.out.println(new BigDecimal(String.valueOf("1212.000002")).scale());
		
		System.out.println(new BigDecimal(1).divide(new BigDecimal(3), 8, RoundingMode.HALF_UP));
		
		System.out.println(new BigDecimal(1).divide(new BigDecimal(Math.pow(10, 8))));
		
		System.out.println(6_000_000L);
		
		System.out.println(Long.parseLong("0000008"));
		
		
//		BigDecimal bg = new BigDecimal(0);
//        bg.add(new BigDecimal(10.0 * 2));
//        System.out.println(bg.doubleValue());
        
        BigDecimal bg = new BigDecimal(0);

        bg = bg.add(new BigDecimal(10.000000000).multiply(new BigDecimal(2)));

        System.out.println(bg.doubleValue());
        
        
        double totalFilledQuantity = new BigDecimal(String.valueOf(0.000001))
				.add(new BigDecimal(String.valueOf(0.001413))).doubleValue();
        System.out.println(totalFilledQuantity);
        
        double remainingQuantity =  new BigDecimal(String.valueOf(0.0014140000000000001))
		.subtract(new BigDecimal(String.valueOf(0.000001))).doubleValue();
        System.out.println(remainingQuantity);
        remainingQuantity =  new BigDecimal(String.valueOf(0.0014140000000000001))
        		.subtract(new BigDecimal(String.valueOf(0.001414))).doubleValue();
        System.out.println(remainingQuantity);
	}

}
