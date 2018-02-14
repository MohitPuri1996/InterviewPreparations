import java.util.Scanner;

class Node{
int data;
Node next;


Node(int data){
this.data=data;
next=null;
}
}
class PairWiseSwap{
static Node head=null,curr=null;
public static void main(String []args){
	
head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
head.next.next.next.next=new Node(5);
head.next.next.next.next.next=new Node(6);
head.next.next.next.next.next.next=new Node(7);
head.next.next.next.next.next.next.next=new Node(8);
head.next.next.next.next.next.next.next.next=new Node(9);
head.next.next.next.next.next.next.next.next.next=new Node(10);

curr=head;Node prev=null;
while(curr!=null&&curr.next!=null){

int tempdata=curr.data;
curr.data=curr.next.data;
curr.next.data=tempdata;
curr=curr.next.next;

}


Node temp=head;
System.out.println("before");
while(temp!=null)
{
System.out.print(temp.data+"->");
temp=temp.next;
}

	
	
}
}
