package LinkedList;

public class LinkedListOperations {
	  INode head;
	    INode tail;
	    int size;

	    public void addNodeInBeginnig(Node newNode) {
	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            INode temp = head;
	            head = newNode;
	            head.setNext(temp);
	        }
	    }

	    public void addNodeAtEnd(Node newNode) {
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            tail.setNext(newNode);
	            tail = newNode;
	        }
	        size++;
	    }

	    public void addNodeInMiddle(Node newNode) {

	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            INode temp, current = null;
	            int count = (size % 2 == 0) ? (size/2) : ((size + 1) / 2);
	            temp = head;
	            //current = null;
	            for(int i=0; i<count; i++) {
	                current = temp;
	                temp = temp.getNext();
	            }
	            current.setNext(newNode);
	            newNode.setNext(temp);
	        }
	        size++;
	    }


	  

	    public void displayNode() {
	        INode current = head;
	        if(head == null)
	            System.out.println("Linked List is empty");
	        System.out.print("Nodes are: " );
	        while (current != null) {
	            if(current.getNext() != null) {
	                System.out.print(current.getKey() + " -> ");
	                current = current.getNext();
	            }
	            else {
	                System.out.println(current.getKey());
	                current = current.getNext();
	            }
	        }
	    }
	    
	    public void searchElement() {
	        if(head == null)
	            System.out.println("Linked List is empty");
	        else{
	            INode currentNode = head;
	            int position = 0;
	            while (currentNode != null){
	                position++;
	                if(currentNode.getKey().equals(30)){
	                    System.out.println("Key value 30 is present at position "+position+" in list");
	                }
	                currentNode = currentNode.getNext();
	            }
	        }
	   
	      }
	   
}