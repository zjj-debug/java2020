package chapter3;

public class sw1 {

	public static void main(String[] args) {
	 
        int year=2001;
		
		int month =2;
		//1 3 5 7 8 10 12      31
		// 4 6 9 11            30
		//2     
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8: 
		case 10:
		case 12:
			System.out.println("31��");
	        break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30��");
			break;
		case 2:
			if (year %400==0)
		       {
		    	   System.out.println("29��");
		       }
		       else if(year %4==0 && year%100!=0)
		       {
		    	   System.out.println("29��");
		       }
		       else
		       {
		    	   System.out.println("28��");
		       }
		    break;
		default:
			System.out.println("���벻�Ϸ�");
			break;
		}
		
	}

}
