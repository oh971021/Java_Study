import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WMain_1 {
	public static void main(String[] args) {

		// ���ÿ� ���� ���� ������ ���
		
		// API : ������ ���ϸ� �ٸ� ����� �����س��� ����̳� �ۼ��س��� �����͸� ����ϴ� ��.
		
		Scanner s = null;
		HttpsURLConnection huc = null;
		
		try {
			s = new Scanner(System.in);
			System.out.println("city : ");
			String str = s.next();
			
			// ===================== URL �ִ� ��� ================== //
			
			// api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
			// key�� : e7b1a57cd2158c8d195bfb24b7597bad

			// api.openweathermap.org/data/2.5/weather?q=seoul&appid=e7b1a57cd2158c8d195bfb24b7597bad
			String url = "https://api.openweathermap.org/data/2.5/weather?q="+ str +
					"&appid=e7b1a57cd2158c8d195bfb24b7597bad";
			
			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			// ==================================================== //
			
			// ===================== �Ľ� ���� ====================== //
			
			// json ������ ������ �Ľ��ϰ� jsonparser ��ü �ʿ�.
			// Parsing : ������ ������ ��� �� ���� ���ϴ� �����͸� �̾Ƽ� ���� �۾�
			// ���� ���̺귯������ API�� �����´�.
			JSONParser jp = new JSONParser();
			
			// ���� ��ü�� isr (���� ������ ��ġ)�� �־ �Ľ��� �غ��Ѵ�.
			// jp���ٰ� isr ��ġ�� �־ ���ϴ� �����͸� ���� �غ� ��.
			JSONObject weatherData = (JSONObject) jp.parse(isr);
			
			// ==================================================== //
			
			// ================== ���ϴ� ������ �̱� ================== //
			
			// �µ�
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println("���� �µ� : " + main.get("temp"));
			
			// ����
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println("���� : " + sys.get("country"));
			
			// ����
			System.out.println("���� : " + weatherData.get("name"));
			
			// ==================================================== //
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
