import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OKExSpider {

	public static void main(String[] args) {
		{
			try {
				Matcher matcher = crawByPattern("https://github.com/okcoin-okex/API-docs-OKEx.com/blob/master/%E5%B8%81%E5%B8%81%E6%9C%80%E5%B0%8F%E4%BA%A4%E6%98%93%E9%87%8F(min_trade_size%20for%20spot).md", "<tr>\n<td align=\"center\">(\\d+)</td>\n<td align=\"center\">(\\S+)</td>\n<td align=\"center\">(\\d*\\.?\\d*)</td>\n<td align=\"center\">(\\d*\\.?\\d*)</td>\n</tr>");
				
				HashSet<String> currencyList = new HashSet<String>();
				while (matcher.find()) {
//					System.out.println(matcher.group(0));
					System.out.println(matcher.group(1));
					System.out.println(matcher.group(2));
					currencyList.add(matcher.group(2).split("_")[1]);
					System.out.println(matcher.group(3));
					System.out.println(matcher.group(4));
				}
				System.out.println(currencyList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
//			Pattern p = Pattern.compile("<tr>\n<td align=\"center\">(\\d+)</td>\n<td align=\"center\">(\\S+)</td>\n<td align=\"center\">(\\d*\\.?\\d*)</td>\n<td align=\"center\">(\\d*\\.?\\d*)</td>\n</tr>");
//			Matcher matcher = p.matcher(result);
//			while (matcher.find()) {
//				System.out.println(matcher.group(0));
//				System.out.println(matcher.group(1));
//				System.out.println(matcher.group(2));
//				System.out.println(matcher.group(3));
//				System.out.println(matcher.group(4));
//			}
		}
	}
	
	public static Matcher crawByPattern(String targetUrl, String regex) throws Exception {
		BufferedReader in = null;
		StringBuilder result = new StringBuilder();
		try {
			URL realUrl = new URL(targetUrl);
			URLConnection connection = realUrl.openConnection();
			connection.connect();
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				result.append(line + "\n");
			}
		} finally {
			if (in != null) {
				in.close();
			}
		}
		
		Pattern p = Pattern.compile(regex);
		return p.matcher(result.toString());
	}
}
