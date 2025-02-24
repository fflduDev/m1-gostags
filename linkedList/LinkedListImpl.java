package linkedList;

import java.util.List;
import java.util.*;

public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		ListItem current = head;
		while (current != null) {
			if (current.data.equals(thisItem)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		
		//if head == null, nothing in the list
				//create a new node with the data
				//set that to head
				// return

				if(head == null) {
					head = new ListItem(thisItem);
					return true;
					
				}
				
				//else
				//set head to local Node current
				//step thru each element in the list, checking if the .next of this node is null
				//once found, create a new node out of incoming data & set that to current.next
				
				ListItem current = head;
				while(current.next != null) {
					current = current.next;
				}
				current.next = new ListItem(thisItem);
		return true;
	}

	@Override
	public Integer itemCount() {
		int count = 0;
		ListItem tmp = head;
		while (tmp != null) {
			
			count++;
			tmp = tmp.next;
	}
		
		return count;
	}

	@Override
	public void listItems() {
		ListItem tmp = head;
		while (tmp != null) {
			
			System.out.println(tmp.data);
			tmp = tmp.next;
	}}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		if(head == null)
			return true;

		//if head.data == incoming data
		// set head = the node head points to.  return.
		
		//else
		//create a new local node with the head
		//step thru each element in the list.  if the next is non null
		//check if that data == the data we want to delete
		//if yes, this is the element to delete.  
		//do that by setting current.next = current.next.next
		//else, set current to the next element in the list
		
		ListItem current = head;
		while(current.next != null) {
			if(current.next.data == thisItem)
				current.next = current.next.next;
			else
				current = current.next;
		}
		
		return true;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		
		if (head == null) 
			return false;

        if (head.data.equals(itemToInsertBefore)) {
            ListItem newNode = new ListItem(newItem);
            newNode.next = head;
            head = newNode;
            return true;
        }

        ListItem current = head;
        while (current.next != null) {
            if (current.next.data.equals(itemToInsertBefore)) {
                ListItem newNode = new ListItem(newItem);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
        }
        return false;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head;
		while (current != null) {
			if(current.data.equals(itemToInsertAfter)) {
				ListItem newNode = new ListItem(newItem);
				newNode.next = current.next;
				current.next = newNode;
				return true;
			}
			current = current.next;
		}
		return false;
		
	}

	@Override
	public void sort() {
		if (head == null || head.next == null) 
			return;

        List<String> dataList = new ArrayList<>();
        ListItem current = head;
        while (current != null) {
            dataList.add(current.data);
            current = current.next;
        }

        Collections.sort(dataList);

        current = head;
        for (String data : dataList) {
            current.data = data;
            current = current.next;
    }
}
}
