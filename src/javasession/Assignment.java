package javasession;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Question 1
		System.out.println("Hello\nRajashekhar Managoli");// with new line in the string it self
		System.out.println("Hello");
		System.out.println("Rajashekhar Managoli");
		//Question 2
		byte x = 74;
		byte y = 36;
		int sum = x + y;
		System.out.println(sum);
		System.out.println(74+36);// direct numbers

		//Question 3
		System.out.println("43\n16\n19\n13");//single line with new line charector 
		System.out.println(43);
		System.out.println(16);
		System.out.println(19);
		System.out.println(13);
		
		//Question 4 
		float a = 25.5f,b = 3.5f,c = 40.5f,d = 4.5f;
		System.out.println((double)(a*b-b*b)/(c-d));
		
		//Question 5
		System.out.println("Hello Selenium"+"t");
		
		//Question 6
		int m = 100,n = 200, o = 3400;
		System.out.println("Your Total amout is "+(m+n+o));
		
		//Question 7 
		char ch = 'h';
		int asciivalue1 = ch;
		System.out.println("The ASCII value of " + ch + " is: " + asciivalue1);  
		
		//Question 8 
		
		char ch1 = 'd';
		int sumToAscii = ch1+3;
		System.out.println("The ASCII value of d is " + (int)ch1 + " is: " + sumToAscii);
		
		//Question 9 
		float number =3.9f;
		System.out.println("The square of number is " + number * number);
		
		
		//Incremental/Decremental Operation
		
		//Expression 1
		
		int i = 11;
		
		i = i++ + ++i;
		
		System.out.println("value of i is" + i); // 24
		
		// Expression 2
		
		int p = 11, q = 22, r;
		
		r = p + q + p++ + q++ + ++p + ++q;
		//  11 + 22 + 11 + 22 + 13 + 24
		System.out.println("Valume of r is : " + r);
		
		//Expresion 3
		
		int x1 = 0;
		x1 = x1++ + --x1 + ++x1 - x1++;
		//   0 + 0 + 1 - 1 
		System.out.println("Valume of x1 is : " + x1);
		
		//Expression 4
		
		boolean b1 = true;
		//b1++;  // you can't apply the increment or decrement operation on boolean 
		
		System.out.println("Valume of b1 is : " + b1);
		
		//Expression 5
		
		int j = 1,k = 2,l=3;
		 
		int m1 = j-- - k-- - l--;
		//       1 - 2 - 3
		
		System.out.println("j value is "+j);//0
		System.out.println("k value is "+k);//1
		System.out.println("l value is "+l);//2
		System.out.println("m1 value is "+m1);//-4
		
		//Expression 6
		
		int a2=1, b2=2;

		int i1=1, j1=2, k1=3;

		int m2 = i1-- - j1-- - k1--;
		//       1 - 2 - 3

		System.out.println("i1="+i1); //0

		System.out.println("j1="+j1); //1

		System.out.println("k1="+k1); //2

		System.out.println("m2="+m2); //-4

		System.out.println(--b2 - ++a2 + ++b2 - --a2);
		//                   1 - 2 + 2 - 1 = 0
		
		//Expression 7
		
		int i3=19, j3=29, k3;
		k3 = i3-- - i3++ + --j3 - ++j3 + --i3 - j3-- + ++i3 - j3++; //-20
		System.out.println("i3="+i3);//19
		System.out.println("j3="+j3);//29
		System.out.println("k3="+k3);//-20
		
		//Expression 8
		int i4 = 11;
		//int j4 = --(i4++);  // its not allowed in java to send the parameter as increment operator  
		
		// Expression 9
		int m4 = 0, n4 = 0;
		int p4 = --m4 * --n4 * n4-- * m4--;
		System.out.println(p4);//1
		
		// Expression 10
		int a5=1;
		a5 = a5++ + ++a5 * --a5 - a5--;
		System.out.println(a5);//5
		
		// Expression 11
		//int a6 = 11++;// you can send the parameter as constant to Increment or Decrement operators 
		//System.out.println(a6);
		
		// Expression 12
		
		int ch2 = 'A';
		System.out.println(ch2++);//65
		
		
		
		// Expression 13
		char ch3 = 'A';
		System.out.println(++ch3);//B
		
		// Expression 14
		double d6 = 1.5, D=2.5;
		System.out.println(d6++ + ++D);//5.0
		
	}

}
