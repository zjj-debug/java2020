package chapter3;

public class Textfor3 {

	public static void main(String[] args) {
		//1000000   三年   4%  求一个月的利息
		//12个月     0.3%
		double b=1000000;
	    int x=0;
	    for(int i=0;i<3;i++)
	    {
	    	b*=1.04;
	    }
	    double lx1=(b-1000000)/3;
	    System.out.println(lx1);
	    System.out.println("一个月的利息"+lx1/12);
		
		double lx2=1000000*0.003;
	    
		System.out.println(lx2);
		
		double m;
		m=1000000-lx1+lx2;
		System.out.println(m);
				
	

	}

}
