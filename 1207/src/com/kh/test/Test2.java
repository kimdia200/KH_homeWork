package com.kh.test;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("A = "+ ('A'+0));
		//char(A)+int(0)
		//int(65)+int(0)
		//int 65
        
        System.out.println("0 =" + ('0' + 0) );
        //char(0)+int(0)
        //int(48)+int(0)
        //int(48)
        
        System.out.println("(char)65 = " + (char)65);
        //char(int(65))
        //char(A)
        
        byte bt1 = 125;
        char ch1 = 'C';
        int it1 = bt1 - ch1;
        //byte(125) - char(C)
        //int(125) - int(67)
        //it1 = 58
        System.out.println("it1 = "+it1);
        
        
        boolean bool = false;
        
        bool = (2.0 == 5/2);
        //double(2.0) == (int(5)/int(2))
        //double(2.0) == int(2)
        //double(2.0) == double(2.0)
        //bool = true
        System.out.println("bool = " + bool);
        
        bool = ('C' == 67);
        //char(C) == int(67)
        //int(67) == int(67)
        //bool = true
        System.out.println("bool = " + bool);
        
        bool = ('A' == 'B'-1);
        //char(A) == (char(B) - int(1))
        //char(A) == (int(66)-int(1))
        //char(A) == int(65)
        //int(65) == int(65)
        //bool = true
        System.out.println("bool = " + bool);
        
        bool = ('a' != 97 );//부정연산자
        //char(a) != int(97)
        //int(97) != int(97)
        //bool = false
        System.out.println("bool = " + bool);

		
		
	}

}
