package chapter3;

public class Textfor1 {

	public static void main(String[] args) {
		// ����    ����1�ͱ����ܱ���������
		
		int n=200;
		for(int i=2;i<n;i++)
		{
			if(n%i==0  )
			{
				System.out.println(n+"��������");
			    return;
			}
			
		}
		System.out.println(n+"������");
		
	}

}
