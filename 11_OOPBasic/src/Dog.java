
// °­¾ÆÁö °´Ã¼¸¦ ¸¸µç´Ù.
public class Dog {
	
	// field ¼±¾ð
	String name;	// member º¯¼ö
	int age;		 
	double weight;  
	
	// ±â´É
	void Bark() {
		System.out.println("¸Û¸Û");
	}
	
	void PrintInfo(String name, int age, double weight) {
		System.out.println("=========ÀÎ½ÄÇ¥=========");
		System.out.println("ÀÌ¸§:"+name+"  ³ªÀÌ:"+age+"  Ã¼Áß:"+weight);
	}
	
	void Sit(String a) {
		if (a.equals("¾É¾Æ")) {
			System.out.println("ÅÐ½â");
		} else {
			System.out.println("¿Õ¿Õ!");
		}
	}
	
}
