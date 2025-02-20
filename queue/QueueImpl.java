package queue;

public class QueueImpl implements Queue {
	String[] names = new String[6];
	int front = -1;
	int back = -1;
	@Override
	public boolean isFull() {
	     //first array: Index 0, last array index: 5. 
	     if(back == 5) {
	    	 return true;
	     } else {
	    	 return false;
	     }
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == -1 && back == -1) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Queue is full");
			
		} else if (front == -1 && back ==-1) {
			front = back = 0;
			names[back] = element;
		} else {
			back++;
			names[back] = element;
		}
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty. Nothing to see here");
			
		} else if (front==back) {
			front = back = -1;
		} else {
			front++;
		}
		return null;
	}

	@Override
	public void display() {
		
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			
		} else {
			for (int i = front; i<= back; i++) {
				System.out.println(names[i]);
			}
		}
	}

	@Override
	public String peek() {
		System.out.println("Front value is: " + names[front]);
		return null;
	}

}
