package chapter3;

public class xunhuan {

	public static void main(String[] args) {
		// 1到100  求和

		
		int x =1,sum=0;
		while (x<=100)
		{
			sum+=x;
			x++;
		}
		System.out.println("sum="+sum);
		
		
		
		int s=1;
		int i=8;
		while (i>=1)
		{
			s*=i;
			i--;
		}
		System.out.println("8的阶乘是"+s);
	
	
	
	
	//1   1/2   ......1/100
		double su =0;
		double j =1;
		while(j<=100)
		{
			su+=1/j;
			j++;
		}
		
		System.out.println(su);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
    
	
}
