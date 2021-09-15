

interface MathTest{
	
	public default void show() {
		
		System.out.println("Mathtest");
	};
}

@FunctionalInterface
interface MathmetiacalOperation extends MathTest{

	int a = 10;

	public default int sum(int a, int b) {

		int result = a + b;
		System.out.println("Sum of two number is.... " + result);

		return result;

	}

	public static void display() {

		System.out.println("Display is calling...");

	}

	public int divisionOfNumber(int a, int b);

}

public class LambdaTesting {

	public static void main(String[] args) {

		LambdaTesting lambdaTesting = new LambdaTesting();
		System.out.println("Inside Main class...");

		MathmetiacalOperation mathmetiacalOperation = (a, b) -> {

			int result = a / b;

			System.out.println("result " + result);
			return result;

		};

		mathmetiacalOperation.divisionOfNumber(20, 10);
		
		
		System.out.println(mathmetiacalOperation.a);
		mathmetiacalOperation.sum(30, 40);
		MathmetiacalOperation.display();
		mathmetiacalOperation.show();
	}
}
