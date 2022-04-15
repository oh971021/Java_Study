package programers;

// ������ �ݾ� ����ϱ�

// ���� ���� ���̱ⱸ�� �αⰡ �ſ� ���� ���� ������ �ʽ��ϴ�. 
// �� ���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. 
// ��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 200, 3��°���� 300���� ����� �λ�˴ϴ�.
// ���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� �󸶰� ���ڶ������ return �ϵ��� solution �Լ��� �ϼ��ϼ���.
// ��, �ݾ��� �������� ������ 0�� return �ϼ���.

public class level1_countingMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for (int i = 0; i <= count; i++) {
            answer += price * i;
        }     
        
        return answer > money ? answer - money : 0;
    }
}
