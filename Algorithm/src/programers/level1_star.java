package programers;

// 직사각형 별찍기

import java.util.Scanner;
import java.util.stream.IntStream;

public class level1_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println(); // 사각형 모양 유지
        }
        
        // 다른 해석법
        StringBuilder sb = new StringBuilder(); // 스트링빌더에 담아서 작성
        IntStream.range(0, a).forEach(s -> sb.append("*")); // a에 맞는 친구들은 별을 찍음
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString())); // b에 따라 \n을 찍어줌
    }
}
