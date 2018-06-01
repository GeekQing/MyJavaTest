import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class TimeUpdate {

	public static void main(String[] args) {
		try {
			long beginTime = System.currentTimeMillis();
			URLConnection conn = new URL("http://www.baidu.com/").openConnection();
			long spanTime1 = System.currentTimeMillis();
			// System.out.println(conn.getHeaderField("Date"));
			// System.out.println(new Date(new Date(conn.getDate()).getTime() -
			// 2000));
			// System.out.println(new Date(System.currentTimeMillis()));
			Date date = new Date(conn.getDate());
			long spanTime2 = System.currentTimeMillis();
			Date systemdate = new Date();
			long spanTime3 = System.currentTimeMillis();
			System.out.println(
					"net time : " + date + ", system time : " + systemdate + ", time1:" + (spanTime1 - beginTime)
							+ "ms, time2:" + (spanTime2 - spanTime1) + "ms, time3:" + (spanTime3 - spanTime2) + "ms");

			//			SimpleDateFormat simdate = new SimpleDateFormat("yyyy-MM-dd");
//			SimpleDateFormat simtime = new SimpleDateFormat("HH:mm:ss");
//			String stime = simtime.format(date);
//			String sdate = simdate.format(date);
//			//
//			// String osName = System.getProperty("os.name");
//			// System.out.println(osName);
//			// if (osName!=null && osName..startsWith("win")) {
//
			Process process = Runtime.getRuntime().exec("cmd /c w32tm /resync /nowait");
//			Process process = Runtime.getRuntime().exec("cmd /c time 17:20:00");
//			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
//			String line = null;
//			while ((line = br.readLine()) !=null) {
//				System.out.println(line);
//			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			String line = null;
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
//			String cmd = "cmd /c time " + stime + " && date " + sdate + " >> 1.log";
//			System.out.println(cmd);
//
//			run.exec(cmd);
//			
//			System.out.println(System.currentTimeMillis() - beginTime + "ms");
			// } else {
			//
			// run.exec("date -s '" + sdate + " " + stime + "'");
			// }

			// System.out.println(new Date(System.currentTimeMillis()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
