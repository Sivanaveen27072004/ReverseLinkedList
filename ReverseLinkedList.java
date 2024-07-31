

class Node{
	int value;
	Node next;
	Node(int value)
	{
		this.value=value;
		this.next=null;
	}
}
class LinkedList{
	Node head;
	
	void append(int value)
	{  
		if(head==null)
			head=new Node(value);
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=new Node(value);
     	}
    }
	void printList()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.value+"->");
			current=current.next;
		}
		System.out.println("null");
	}
	 void reverse()
		{
			Node pre=null;
			Node current=head;
			Node next=null;
			while(current!=null)
			{
				next=current.next;
				current.next=pre;
				pre=current;
				current=next;
				
			}
			head=pre;	
		}
	
		
	}
 

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.append(3);
		list.append(5);
		list.append(7);
		list.append(9);
		System.out.println("Original");
		list.printList();
		
		list.reverse();
		System.out.println("Reverse");
		list.printList();
		
		
	}
	
}
