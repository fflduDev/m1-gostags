package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		
		linkedlistTestMethod();
 		
		System.out.println("-----S T A C K  T E S T------");

		stackTestMethod();
	 
		System.out.println("----Q U E U E  T E S T-------");
		

		queueTestMethod();
		
	 	}
	public static void linkedlistTestMethod() {
		LinkedList tester = new LinkedListImpl();
		tester.addItem("Town Center");
		tester.addItem("Airport");
		tester.addItem("Saloon");
		tester.addItem("School");
		
		System.out.println("Listing Items:");
		tester.listItems();
		System.out.println("Checking if school exists as a station: " + tester.isItemInList("School"));
		System.out.println("Checking if Stop and Shop exists as a station: " + tester.isItemInList("Stop and Shop"));

		System.out.println("Deleting Airport");
		tester.deleteItem("Airport");
		tester.listItems();
		
		System.out.println("Inserting train station before town center");
		tester.insertBefore("Train Station", "Town Center");
		tester.listItems();
		
		System.out.println("Inserting Starbucks after train station");
		tester.insertAfter("Starbucks","Train Station");
		
		tester.listItems();
		
	}
	public static void queueTestMethod() {
		Queue testQueue = new QueueImpl();
		
		testQueue.enQueue("Jimmy");
		testQueue.enQueue("Harry");
		testQueue.enQueue("Cassidy");
		testQueue.enQueue("John");
		testQueue.enQueue("Tom");
		testQueue.enQueue("Robert");
		
		testQueue.display();

		System.out.println("Peeking at the queue: " + testQueue.peek());
		
		System.out.println("Removing head of queue");
		testQueue.deQueue();
		
		testQueue.display();
		
		System.out.println("Adding two more riders, Kevin and Bob");
		testQueue.enQueue("Bob");
		testQueue.enQueue("Kevin");
		
		System.out.println("Peeking at the queue: " + testQueue.peek());

		testQueue.deQueue();
		System.out.println("removing head of queue");
		
		
		testQueue.display();
	}
	public static void stackTestMethod() {
		Stack stackTester = new StackImpl();
		
		stackTester.push("thing1");
		stackTester.push("thing2");
		stackTester.push("thing3");
		stackTester.push("thing4");
		stackTester.push("thing5");
		stackTester.push("thing6");
		
		stackTester.display();
		
		System.out.println("Peeking at the stack: " + stackTester.peek());
		
		System.out.println("Adding two more riders to stack");
		stackTester.push("Aidan");
		stackTester.push("Chris");
		
		System.out.println("Peeking at the stack: " + stackTester.peek());
		for(int i = 0; i<8; i++) {
			System.out.println("Removing " + stackTester.pop());
		}
		
		System.out.println("Is Stack empty" + stackTester.isEmpty());
		
	}
	

}
