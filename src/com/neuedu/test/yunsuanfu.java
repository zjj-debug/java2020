package com.neuedu.test;

public class yunsuanfu {

	public static void main(String[] args) {
		// 
		
		int a = 5;
		int b = 2;
		
		int c = a/b;//2
		
		double d = (double)a/b;//2.5
		
		System.out.println(c);
		
		System.out.println("a+b�ĺ���"+(a+b));//a+b�ĺ���7
		
		//��ӡ��XX�ǰ೤
		
		String str = "ëë";
		
		System.out.println(str + "�ǰ೤");//ëë�ǰ೤
	
	    int money = 5000;
	    
	    System.out.println("����"+ money +"Ǯ");//����5000Ǯ
	
	    //�����еĸ���
	    System.out.println(5/2);//2
        System.out.println(5/-2);//-2
        System.out.println(-5/2);//-2
        System.out.println(-5/-2);//2
        
        System.out.println("=======================");
        
        System.out.println(5%2);//1
        System.out.println(5%-2);//1
        System.out.println(-5%2);//-1
        System.out.println(-5%-2);//-1
        
        
        //�������Լ�
        int x = 1;
        //x++;���ú��
        //++x;�ȼӺ���
        
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
