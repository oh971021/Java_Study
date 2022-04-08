package programers;

public class level1_strToInt {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

/*
 - 공부가 된 다른사람 코드
 
	public int getStrToInt(String str) {
	    boolean Sign = true;
	    int result = 0;
	
		for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (ch == '-')
	            Sign = false;
	        else if(ch !='+')
	            result = result * 10 + (ch - '0');
	    }
	    return Sign?1:-1 * result;
	}

*/
 