package chapter3;

public class Textfor1 {

	public static void main(String[] args) {
		// 质数    除了1和本身不能被其他整除
		
		int n=200;
		for(int i=2;i<n;i++)
		{
			if(n%i==0  )
			{
				System.out.println(n+"不是素数");
			    return;
			}
			
		}
		System.out.println(n+"是素数");
		
	}

}
