package com.neuedu.test;

public class zhuanhuan {

	public static void main(String[] args) {
		
		// a Ŀ������    100 Դ����	
		double a = 100;//��ʽ����ת��
		
		int x = 100;
		long y = 200;//��ʽ����ת��
		double z = 12.34;
		//����ʱҲ������ת��
		System.out.println(x+y+z);//��ʽ����ת��  314.24
		
		int i = 129;
		
		//�������
		byte j = (byte)i;//ǿ������ת��
		
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
	    double d1 = (i1 + i2) * 1.0;//ϵͳ��ת��Ϊdouble������
	    System.out.println(d1);//57.0
	    /*�Զ�����ת��*/
	    float f3 = 12.3f;//�����f
	    long l1 = 12300;
	    long l2 = 300000L;//�����l
	    float f = l1 + l2 + f3;//ϵͳ��ת��Ϊfloat�ͼ���
	    System.out.println(f);//3.12312.3
	    String s;
	    byte m1=1;
	    byte m2=3;
	    byte m = (byte)(m1+m2);
	    /*ǿ������ת��*/
	    long l = (long)f;//ǿ��ת������ȥС�����֣������������룩
	    System.out.println(l);//312312
	    /*ǿ������ת��*/
	    byte b1 = 67;
	    byte b2 = 89;
	    byte b3 = (byte)(b1 + b2);//ϵͳ��ת��Ϊint�����㣬��Ҫǿ��ת����
	    System.out.println(b3);//-100

	    char d = 'a';
	    char b = 'b';
	    
	    int e = d+b;
	    
	    System.out.println(e);//97+98
	    
	}

}
