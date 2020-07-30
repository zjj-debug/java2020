package com.neuedu.test;

public class zhuanhuan {

	public static void main(String[] args) {
		
		// a 目标类型    100 源类型	
		double a = 100;//隐式类型转换
		
		int x = 100;
		long y = 200;//隐式类型转换
		double z = 12.34;
		//运算时也有类型转换
		System.out.println(x+y+z);//隐式类型转换  314.24
		
		int i = 129;
		
		//数据溢出
		byte j = (byte)i;//强制类型转换
		
		System.out.println(j);//-127
		
		char c = 'a';
		
		int k = c;
		System.out.println(k);//97
		
		int kk = 97;
		
		char cc = (char)kk;
		
		System.out.println(cc);//a
		
		long xx = 88;
		int yy = (int)xx;
		
		
		
		int i1 = 12;
	    int i2 = 45;
	    double d1 = (i1 + i2) * 1.0;//系统将转换为double型运算
	    System.out.println(d1);//57.0
	    /*自动类型转换*/
	    float f3 = 12.3f;//必须加f
	    long l1 = 12300;
	    long l2 = 300000L;//必须加l
	    float f = l1 + l2 + f3;//系统将转换为float型计算
	    System.out.println(f);//3.12312.3
	    String s;
	    byte m1=1;
	    byte m2=3;
	    byte m = (byte)(m1+m2);
	    /*强制类型转换*/
	    long l = (long)f;//强制转换会舍去小数部分（不是四舍五入）
	    System.out.println(l);//312312
	    /*强制类型转换*/
	    byte b1 = 67;
	    byte b2 = 89;
	    byte b3 = (byte)(b1 + b2);//系统将转换为int型运算，需要强制转换符
	    System.out.println(b3);//-100

	    char d = 'a';
	    char b = 'b';
	    
	    int e = d+b;
	    
	    System.out.println(e);//97+98
	    
	}

}
