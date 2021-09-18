public class OMain_4 {
	public static void main(String[] args) {
	      
	      //1.품명이 형광펜, 가격이 500원, 원산지가 중국
	      //2.품명이 보드마카, 가격이 1000원, 원산지가 한국
		
	      //쇼핑(제품)
	      Product shopping1 = new Product();
	      //품명
	      shopping1.item = "형광펜";
	      //가격
	      shopping1.price = 500;
	      //원산지
	      shopping1.origin = "중국";
	      
	      //쇼핑(제품)
	      Product shopping2 = new Product();
	      //품명
	      shopping2.item = "보드마카";
	      //가격
	      shopping2.price = 1000;
	      //원산지
	      shopping2.origin = "한국";
	      
	      //상품정보 출력 가능
	      shopping1.printInfo();
	      shopping2.printInfo();

	}
}
