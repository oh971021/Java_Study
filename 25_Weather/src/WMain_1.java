import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WMain_1 {
	public static void main(String[] args) {

		// 도시에 따른 날씨 데이터 출력
		
		// API : 간단히 말하면 다른 사람이 개발해놓은 기능이나 작성해놓은 데이터를 사용하는 것.
		
		Scanner s = null;
		HttpsURLConnection huc = null;
		
		try {
			s = new Scanner(System.in);
			System.out.println("city : ");
			String str = s.next();
			
			// ===================== URL 넣는 방법 ================== //
			
			// api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
			// key값 : e7b1a57cd2158c8d195bfb24b7597bad

			// api.openweathermap.org/data/2.5/weather?q=seoul&appid=e7b1a57cd2158c8d195bfb24b7597bad
			String url = "https://api.openweathermap.org/data/2.5/weather?q="+ str +
					"&appid=e7b1a57cd2158c8d195bfb24b7597bad";
			
			URL u = new URL(url);
			huc = (HttpsURLConnection) u.openConnection();
			
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			// ==================================================== //
			
			// ===================== 파싱 셋팅 ====================== //
			
			// json 데이터 받은거 파싱하게 jsonparser 객체 필요.
			// Parsing : 수많은 데이터 덩어리 중 내가 원하는 데이터만 뽑아서 쓰는 작업
			// 오픈 라이브러리에서 API를 가져온다.
			JSONParser jp = new JSONParser();
			
			// 만든 객체로 isr (받은 데이터 뭉치)를 넣어서 파싱을 준비한다.
			// jp에다가 isr 뭉치를 넣어서 원하는 데이터를 뽑을 준비 끝.
			JSONObject weatherData = (JSONObject) jp.parse(isr);
			
			// ==================================================== //
			
			// ================== 원하는 데이터 뽑기 ================== //
			
			// 온도
			JSONObject main = (JSONObject) weatherData.get("main");
			System.out.println("현재 온도 : " + main.get("temp"));
			
			// 국가
			JSONObject sys = (JSONObject) weatherData.get("sys");
			System.out.println("국가 : " + sys.get("country"));
			
			// 도시
			System.out.println("도시 : " + weatherData.get("name"));
			
			// ==================================================== //
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
