package chapter3;

public class ianxi {

	public static void main(String[] args) {
		// 4年一闰年   百年不闰   400年再闰
      int year = 2020;
      
       if (year %400==0)
       {
    	   System.out.println(year+"是闰年");
       }
       else if(year %4==0 && year%100!=0)
       {
    	   System.out.println(year+"是闰年");
       }
       else
       {
    	   System.out.println(year+"不是闰年");
       }
	
       
       
       
       int x =20;
       if (x %5 ==0  && x %6==0)
       {
    	   System.out.println(x+"能被5和6整除");
       }
       else if(x%5==0)
       {
    	   System.out.println(x+"能被5整除");
       }
       else if(x%6==0)
       {
    	   System.out.println(x+"能被6整除");
       }
       else
       {
    	   System.out.println(x+"不能被5或6整除");
       }
    	   
       
       
       
       
	}

}
