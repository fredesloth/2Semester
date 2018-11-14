package opgave1;

public class SortedLinkedList {
	private Node first;

	public SortedLinkedList() {
		first = null;
	}

	public void addFirst(String element) {
		Node newNode = new Node();
		newNode.next = first;
		first = newNode;
	}

//	Compare to 
	public void addElement(String element) {
		if (first != null) {
			if (first.text.equals(element)) {
				first = first.next;
			} else {
				Node temp = first;
				boolean found = false;
				while (!found && temp.next != null) {
					if(element.compareTo(temp.text) < 0) {
						Node newNode = new Node(); 
						newNode.text = element;
						newNode.next = first;
					}
				}
			}
		}
	}

	public void removePerson(String element) {
		if (first != null) {
			if (first.text.equals(element)) {
				first = first.next;
			} else {
				Node temp = first;
				boolean found = false;
				while (!found && temp.next != null) {
					if (temp.next.text.equals(element)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					Node temp2 = temp.next;
					temp.next = temp2.next;
					temp2.next = null;
				}
			}
		}
	}

}

class Node {
	public String text;
	public Node next;
}
