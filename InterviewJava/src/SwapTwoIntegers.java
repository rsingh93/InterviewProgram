
public class SwapTwoIntegers {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
//		1. with using third var : t
//		int t;
		
//		t= x;
//		x = y;
//		y = t;
		
//		2.without using third vat : using + operator
		
//		x = x+y;
//		y = x-y;
//		x = x-y;
		
//		3.without using third vat : using * operator
		
//		x = x*y;
//		y = x/y;
//		x = x/y;
		
//		4. using xor operator
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		

	}

}
