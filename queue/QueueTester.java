package queue;

public class QueueTester {

	public static void main(String[] args) {
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

}
