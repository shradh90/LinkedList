package LinkedList;

import java.util.Scanner;

public class LinkedList {
	
	    public static void main(String[] args) {
	    	 LinkedListOperations operations = new LinkedListOperations();

		        Node<Integer> myFirstNode = new Node<>(56);
		        Node<Integer> mySecondNode = new Node<>(30);
		        Node<Integer> myThirdNode = new Node<>(70);
		       

		        operations.addNodeInBeginnig(myFirstNode);
		        operations.addNodeAtEnd(myThirdNode);
		        operations.addNodeInMiddle(mySecondNode);
		        operations.displayNode();


                System.out.println("Enter the data you want to add");
                Scanner input = new Scanner(System.in);
                Integer element = input.nextInt();
                System.out.println("Enter the position where you want to add the data ");
                Scanner input1 = new Scanner(System.in);
                int position = input1.nextInt();
                
                operations.addNodeInPosition(element, position);
	            operations.displayNode();

	          
	                   
	            }
	        }
	    
	    
