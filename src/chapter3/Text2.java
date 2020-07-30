package chapter3;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int sum=0;
		for(int i=0;i<34;i++)
      {
    	for(int j=0;j<=25;j++)
    	{
    		for(int k=0;k<=200;k++)
    		{
    			if(i+j+k==100  &&  3*i+4*j+0.5*k==100)
    			{
    				System.out.println("Ä¸¼¦"+i+"\t¹«¼¦"+j+"\tÐ¡¼¦"+k);
    				sum++;
    			}
    		}
    	}
    			
      }
		System.out.println(sum);
	}

}
