package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
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
		
		System.out.println(tester.itemCount());
	}

}
