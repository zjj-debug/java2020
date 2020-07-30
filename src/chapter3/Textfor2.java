package chapter3;

public class Textfor2 {

	public static void main(String[] args) {
		// 大于2000的最小质数
    
        for(int i=201;;i++)
        {
        	boolean b=true;
        	for(int j=2;j<i;j++)
        	{
        		if(i%j==0)
        		{
        			b=false;
        			break;
        		}
        		
        	}
        	if(b)
        	{
        		System.out.println(i+"是大于200的最小质数");
        		return;
        	}
        	
        }
        	
	
	
	
	}

}
