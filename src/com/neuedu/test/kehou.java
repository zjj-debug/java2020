package com.neuedu.test;

public class kehou {

	public static void main(String[] args) {
//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a=1,b=2,c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);


//2.给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
    int x=564;
    int x1=x/100%10;
    int x2=x/10%10;
    int x3=x%10;
    int x4=x/1000;
    int y=x1+x2+x3+x4;
    System.out.println(y);

//3.华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
    //将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
    double s=32.5,h= s*9/5+32;
    System.out.println(h);
    double h1=100,s1=(h1-32)*5/9;
    System.out.println(s1);
    


//4.给定一个任意的大写字母A~Z，转换为小写字母。
    char dd='Z',xx;
    xx=(char)(dd+32);
    System.out.println(xx);
    



	}

}
