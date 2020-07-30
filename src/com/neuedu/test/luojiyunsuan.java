package com.neuedu.test;

public class luojiyunsuan {

	public static void main(String[] args) {
		// 
		
		boolean x = true;
		boolean y = false;
		System.out.println(x&&y);//f
		System.out.println(x||y);//t
		System.out.println(!x);//f
		System.out.println(!y);//t
		System.out.println(x^y);//t  异或  不同为真
		
		
		System.out.println("==================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//短路运算   && 前为假   后不运算     || 前为真   后不运算
		boolean flag1 = a<b && b<c;//t
		boolean flag2 = a<b || b++>c;//t
		System.out.println(b);//200
		
		// &   |   不短路
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		boolean b1 = x1 > y1 & y1++ < z1;
		System.out.println(y1);//301
		
		
		//三元运算符
		
		char sex = 'f';
		
		String str = sex =='f'? "女":"男";
		System.out.println(str);//女
				
		int xx = 10;
		int yy = 20;
		int zz =30;
		int max = xx>=yy?xx:yy;
		 max = max>=zz?max:zz;
		
		
		System.out.println(max);//求最大值
		
		
		
		
		
		
		
	}

}
