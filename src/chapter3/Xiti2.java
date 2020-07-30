package chapter3;

public class Xiti2 {

	public static void main(String[] args) {
		// 有一个不多于5位的正整数，求它是几位数，分别打印出每一位数字。
		int x=6985;
		int i=0;
		while(x!=0)
		{   
			System.out.println(x%10);
			i++;
			x/=10;
		}
		
		System.out.println(i+"位数");
		
	}

}
