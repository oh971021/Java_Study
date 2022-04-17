package programers;

// �ּ� ���簢��

// ���� ������ ����� ȸ�翡�� ������ ũ�⸦ ���Ϸ��� �մϴ�. 
// �پ��� ���� ũ���� ���Ե��� ��� ������ �� �����鼭, �۾Ƽ� ��� �ٴϱ� ���� ������ ������ �մϴ�. 
// �̷��� ����� �����ϴ� ������ ����� ���� ���������� ��� ������ ���� ���̿� ���� ���̸� �����߽��ϴ�.

public class level1_rectangle {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            } // w ���� h �� Ŭ ��� ���η� ���� �� �ִٴ� �����Ͽ�
              // �� ���� ��ġ�� �ٲ��ش�. w�� h�� ��ġ ����
            
            if (sizes[i][0] > w) {
                w = sizes[i][0];
            } // �ε��� [0] = w �� ���� ū ���� ���� w ����
            
            if (sizes[i][1] > h) {
                h = sizes[i][1];
            } // �ε��� [1] = h �� ���� ū ���� ���� h ����
            
        }
        
        return w * h;
    }
}
