package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("an item to add");
		tester.addItem("Hello");
		
		tester.deleteItem("Hello");

		tester.listItems();
		
		System.out.println(tester.itemCount());
	}

}
