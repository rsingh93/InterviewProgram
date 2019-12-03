
public class StringSwap {

	public static void main(String[] args) {
	
		
		String a = "Rahul";
		String b = "Singh";
		String c = "Bangalore";
		
		
		System.out.println("before swaping : ");
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is :" + b);
		
		//1. append a and b:
		
		a = a+b; //RahulSingh
		
		//2. Store initial String a in String b :
		
		b = a.substring(0,a.length()-b.length());
		
		//3. Store initial String b in String b :
		
		a = a.substring(b.length());
		
		System.out.println("the value of a and b After swaping : ");
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is :"+ b);
		
	}

}
