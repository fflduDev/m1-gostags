package stack; 

public class StackImpl implements Stack {
	int length = 6;
	String[] names = new String[length];
	int size = 0;
	int top = -1;
	@Override
	public void push(String s) {
		if(size <= length-1) {
			names[size] = s;
			size+=1;
			top+=1;
			System.out.println("thing i added to stack: " + s);
		}
		else {
			System.out.println("The array is full");
		}
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		String temp;
		if(top!=-1) {
			temp = names[top];
			names[top] = null;
			size-=1;
			top-=1;
			return temp;
		}
		else {
			System.out.println("The stack is empty");
			return null;
		}
		
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		if(top == length-1) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return names[size-1];
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		names = new String[size];
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(String s: names) {
			System.out.println(s);
		}
	}
 

}
