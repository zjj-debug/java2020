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
		System.out.println(x^y);//t  ���  ��ͬΪ��
		
		
		System.out.println("==================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//��·����   && ǰΪ��   ������     || ǰΪ��   ������
		boolean flag1 = a<b && b<c;//t
		boolean flag2 = a<b || b++>c;//t
		System.out.println(b);//200
		
		// &   |   ����·
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		boolean b1 = x1 > y1 & y1++ < z1;
		System.out.println(y1);//301
		
		
		//��Ԫ�����
		
		char sex = 'f';
		
		String str = sex =='f'? "Ů":"��";
		System.out.println(str);//Ů
				
		int xx = 10;
		int yy = 20;
		int zz =30;
		int max = xx>=yy?xx:yy;
		 max = max>=zz?max:zz;
		
		
		System.out.println(max);//�����ֵ
		
		
		
		
		
		
		
	}

}
