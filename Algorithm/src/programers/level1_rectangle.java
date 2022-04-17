package programers;

// 최소 직사각형

// 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 
// 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 
// 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

public class level1_rectangle {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            } // w 보다 h 가 클 경우 가로로 넣을 수 있다는 가정하에
              // 두 값의 위치를 바꿔준다. w와 h의 위치 변경
            
            if (sizes[i][0] > w) {
                w = sizes[i][0];
            } // 인덱스 [0] = w 중 가장 큰 값을 변수 w 대입
            
            if (sizes[i][1] > h) {
                h = sizes[i][1];
            } // 인덱스 [1] = h 중 가장 큰 값을 변수 h 대입
            
        }
        
        return w * h;
    }
}
