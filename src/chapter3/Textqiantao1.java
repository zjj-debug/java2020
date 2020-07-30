package chapter3;

public class Textqiantao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int sum=201;;sum++)
    {
    boolean flag=true;//是质数
    for( int i=2;i<sum;i++)
    {
    	if(sum%i==0)
    	{
    		flag=false;
    		break;
    	}
		
    }	
	if(flag)
	{
		System.out.println(sum+"是质数");
		break;
	}
    }
    
    
    
    
	}

}
