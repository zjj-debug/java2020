package chapter3;

public class Xiti2 {

	public static void main(String[] args) {
		// ��һ��������5λ���������������Ǽ�λ�����ֱ��ӡ��ÿһλ���֡�
		int x=6985;
		int i=0;
		while(x!=0)
		{   
			System.out.println(x%10);
			i++;
			x/=10;
		}
		
		System.out.println(i+"λ��");
		
	}

}
