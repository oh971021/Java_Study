import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UMain_2 {
	public static void main(String[] args) {
		
		// 시간과 날짜 (Datetype)
		// java.util에 있는거
		Date d = new Date();
		System.out.println(d); // 현재의 정보
		
		/*
			Date -> String
			y(연) M(월) d(일) a(오전/오후) h(시) m(분) s(초)
		
		*/
		
		// 월 일 시 분 
		SimpleDateFormat sdf = new SimpleDateFormat("MMMdd일 hh시 mm분");
		System.out.println(sdf.format(d));
		
		String string = sdf.format(d);
		System.out.println(string);
		
		System.out.println("============================");
		
		// Test
		
		// 1. sdf2는 시:분:초
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf2.format(d));
		
		// String -> date 타입으로 변경
		String ds = "94-03-02";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd");
		
		// String에서 Date로 변환할 때, 예외처리를 사용한다.
		try {
			Date d2 = sdf3.parse(ds);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
