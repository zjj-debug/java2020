package chapter3;

public class Textfor2 {

	public static void main(String[] args) {
		// ����2000����С����
    
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
        		System.out.println(i+"�Ǵ���200����С����");
        		return;
        	}
        	
        }
        	
	
	
	
	}

}
