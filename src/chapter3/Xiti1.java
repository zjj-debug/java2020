package chapter3;

public class Xiti1 {

	public static void main(String[] args) {
		// 分解质因数
		int x=1200;
		System.out.print(x+"=");
		for(int i=2;i<=x;i++)
		{   
			
			while(x%i==0)//for(;;)
			{		
				x/=i;
				if(x==1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+"*");
					System.out.print(i+"*");
					
				}
				
			}
		}
	}

}
