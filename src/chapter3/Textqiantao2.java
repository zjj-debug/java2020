package chapter3;

public class Textqiantao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=8;
     int y=12;
  
     int min= x<y?x:y;
     int result=min;
		for(int i=min;i>=1;i--)
     {
    	 if(x%i==0  && y%i==0)
    	 {
    		 result=i;
    		 break;
    	 }
     }
		System.out.println(x+"和"+y+"的最大公约数是"+result);
	}

}
