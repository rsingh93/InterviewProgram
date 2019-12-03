
public class JavaFibonacciSeriesExample {

	public static void main(String[] args) {

		int firstNumber = 0;
		int secondNumber = 1;

		System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");

		for (int i = 0; i < 10; i++) {
			int thirdNumber = firstNumber + secondNumber;

			System.out.print(thirdNumber + " ");

			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}
	}

}
