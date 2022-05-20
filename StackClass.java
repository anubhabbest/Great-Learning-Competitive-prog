import java.util.*;
public class StackClass {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	static class Stack{
		Node head=null;
		void push(int data)
		{
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				newNode.next=head;
				head=newNode;
			}
		}
		
		void pop()
		{
			if(head==null)
				{System.out.println("Empty Stack");return;}
			System.out.println(head.data+" has been popped ");
			head=head.next;
			
		}
		
		void peek()
		{
			if(head==null)
			{System.out.println("Empty Stack");return;}
			System.out.println(head.data+" is the top of stack");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		int inp,ele;
		do {
			System.out.println("Enter your choice \n1.push\n2.pop\n3.peek\n4.break");
			inp=sc.nextInt();
		switch(inp) {
		case 1:System.out.println("enter Element to push:");
				ele=sc.nextInt();
				s.push(ele);
				break;
		case 2:s.pop();
				break;
		case 3:s.peek();
				break;
		default:System.out.println("thank you for using my stack");
		
		}
		}while(inp!=4);
	}

}
