package chapter3;

public class ianxi {

	public static void main(String[] args) {
		// 4��һ����   ���겻��   400������
      int year = 2020;
      
       if (year %400==0)
       {
    	   System.out.println(year+"������");
       }
       else if(year %4==0 && year%100!=0)
       {
    	   System.out.println(year+"������");
       }
       else
       {
    	   System.out.println(year+"��������");
       }
	
       
       
       
       int x =20;
       if (x %5 ==0  && x %6==0)
       {
    	   System.out.println(x+"�ܱ�5��6����");
       }
       else if(x%5==0)
       {
    	   System.out.println(x+"�ܱ�5����");
       }
       else if(x%6==0)
       {
    	   System.out.println(x+"�ܱ�6����");
       }
       else
       {
    	   System.out.println(x+"���ܱ�5��6����");
       }
    	   
       
       
       
       
	}

}
