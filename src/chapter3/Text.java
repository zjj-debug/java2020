package chapter3;

public class Text {

	public static void main(String[] args) {
		// 
       int score =96;
      if(score<0  ||  score>100)
      {
    	System.out.println("���벻�Ϸ�");  
        return;//��������
      }
       switch(score/10)
       {
       case 10:
       case 9:
        System.out.println("����");
        break;
       case 8:
        System.out.println("����");
        break;
       case 7:
        System.out.println("�е�");
        break;
       case 6:
    	   System.out.println("����");
    	   break;
       default:
           System.out.println("������");
           break;
       }
	}

}
