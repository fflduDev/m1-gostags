package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue testQueue = new QueueImpl();
		
		testQueue.enQueue("Hello");
		testQueue.enQueue("Whats up");
		testQueue.enQueue("Howdy");
		
		testQueue.display();
		
		testQueue.peek();
	}

}
