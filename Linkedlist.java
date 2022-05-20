//package gl.packageExample;

public class Linkedlist {
	Node head;
	Node tail;
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	void addFirst(String data)
	{	
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	void addLast(String data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	void traverse()
	{	Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.println("Null");
	}
	
	void delete(int x)
	{
		int flag=0;
		if(head==null)
			{System.out.println("list is empty");return;}
		if(x==0)
		{
			head=head.next;
		}
		else if(x<0)
		{
			System.out.println("-ve index");
			return;
		}
		else
		{
			Node curr=head;
			int i=1;
			while(i<x)
			{	
				curr=curr.next;
				i++;
				if(curr==null)
					{System.out.println("given index is grater than size of list");flag=1;break;}
			}
			if(flag==0)curr.next=curr.next.next;
		}
	}
	
	void reverseIterate() {
		if(head==null||head.next==null)
			return;
		Node prevNode=head;
		Node currNode=head.next;
		Node nextNode;
		while(currNode!=null)
		{
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		tail=head;
		tail.next=null;
		head=prevNode;
	}
	
	Node reverseRecursive(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node newhead=reverseRecursive(head.next);
		head.next.next=head;
		head.next=null;
		return newhead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll=new Linkedlist();
		
		ll.addFirst("I");
		ll.addLast("am");
		ll.addLast("inevitable");
		//ll.traverse();
		ll.addFirst("Hi,");
		ll.traverse();
		ll.reverseIterate();
		ll.traverse();
		ll.head=ll.reverseRecursive(ll.head);
		ll.traverse();
	}

}
