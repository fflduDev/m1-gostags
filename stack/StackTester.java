package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		stackTester.push("thing in stack");
		System.out.println(stackTester.pop());
		System.out.println(stackTester.isEmpty());
		System.out.println(stackTester.isFull());
		stackTester.push("thing1");
		stackTester.push("thing2");
		stackTester.push("thing3");
		stackTester.push("thing4");
		stackTester.push("thing5");
		stackTester.push("thing6");
		System.out.println(stackTester.isEmpty());
		System.out.println(stackTester.isFull());
		stackTester.push("thing7");
		System.out.println(stackTester.pop());
		stackTester.display();
		
		
	}
	
	public static void runTests(Stack stack) {
	 	
	}

}
