package com.neuedu.test;

public class zifu {

	public static void main(String[] args) {
		// 字符数据类型用于存放单个字符，每个字符占用2个字节（16位二进制）的内存空间。
		/* /r  回到行首
		 * /n  换行
		 * 
		 * 0-9: 48
		 * A-Z: 65
		 * a-z: 97
		 * */
		char a =  'a';
		char b =  '萨';
		char c =  '\u36e0';
		char A = '\n';//换行
		char d = '\t';
		char e ='\'';
		char f ='\\';
		String g ="\"";
	//	
		System.out.print(a);
      	System.out.print(A);
		System.out.print(b);
		System.out.print(d);
		System.out.print(c);
		System.out.print(e);
		System.out.println(f);
		System.out.println(g);
		
		
		
		System.out.println("escape\\bchar");
		System.out.println("escape\\tchar");
		System.out.println("escape\\rchar");
		System.out.println("escape\\nchar");
	    System.out.println("\\我在斜线里\\");
		System.out.println("\'我在单引号里\'");
		System.out.println("\"我在双引号里\"");
		System.out.println("我没有双引号");
		
		//布尔数据类型    全小写
		
		
		boolean flag = true;
		boolean flag2 = false;
		
		
			}

	}


