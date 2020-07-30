package com.neuedu.test;

public class yunsuanfu {

	public static void main(String[] args) {
		// 
		
		int a = 5;
		int b = 2;
		
		int c = a/b;//2
		
		double d = (double)a/b;//2.5
		
		System.out.println(c);
		
		System.out.println("a+b的和是"+(a+b));//a+b的和是7
		
		//打印出XX是班长
		
		String str = "毛毛";
		
		System.out.println(str + "是班长");//毛毛是班长
	
	    int money = 5000;
	    
	    System.out.println("我有"+ money +"钱");//我有5000钱
	
	    //除法中的负数
	    System.out.println(5/2);//2
        System.out.println(5/-2);//-2
        System.out.println(-5/2);//-2
        System.out.println(-5/-2);//2
        
        System.out.println("=======================");
        
        System.out.println(5%2);//1
        System.out.println(5%-2);//1
        System.out.println(-5%2);//-1
        System.out.println(-5%-2);//-1
        
        
        //自增，自减
        int x = 1;
        //x++;先用后加
        //++x;先加后用
        
        int y = x++;
        int y3 = ++x;
        System.out.println(x);//3
        System.out.println(y);//1
        System.out.println(y3);//3
        
        
        int x1 = 3, y1 = 5;
        int x2 = 3, y2 = 5;
        int r1, r2;
        r1 = x1++ + x1*y1;
        r2 = ++x2 + x2*y2;
        System.out.println("x1="+x1+" y1="+y1+" r1="+r1);//23
        System.out.println("x2="+x2+" y2="+y2+" r2="+r2);//24
                         
        char c0 = 'a';
        String s = "hello";
        int i = 100;
        float f = 2.15f;
        double d0 = 5.7;
        boolean b0 = true;
        System.out.println("c0=" + c0);//c0=a
        System.out.println("s=" + s);//s=hello
        System.out.println("i=" + i);//i=100
        System.out.println("f=" + f);//f=2.15
        System.out.println("d0=" + d0);//d0=5.7
        System.out.println("b0=" + b0);//b0=true

        
        
        
        
        
        
        
        
        
        
	    
	    
	    
	    
	}

}
