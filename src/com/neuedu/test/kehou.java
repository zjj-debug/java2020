package com.neuedu.test;

public class kehou {

	public static void main(String[] args) {
//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a=1,b=2,c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);


//2.����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
    int x=564;
    int x1=x/100%10;
    int x2=x/10%10;
    int x3=x%10;
    int x4=x/1000;
    int y=x1+x2+x3+x4;
    System.out.println(y);

//3.�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ�
    //�����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
    double s=32.5,h= s*9/5+32;
    System.out.println(h);
    double h1=100,s1=(h1-32)*5/9;
    System.out.println(s1);
    


//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
    char dd='Z',xx;
    xx=(char)(dd+32);
    System.out.println(xx);
    



	}

}
