
//NO OVERFLOW UNDERFLOW TEST CASES COVERED
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

import java.util.Queue;
 	 	
class StackusingQueue{
static Queue<Integer> queue1=new LinkedList<Integer>();
static Queue<Integer> queue2=new LinkedList<Integer>();


public static Queue push(int data){
if(queue1.peek()==null){
	queue2.offer(data);
return queue2;
}

else{
	queue1.offer(data);
}

return queue1;
}

public static int pop(){
if(queue1.peek()==null){
int size=queue2.size();

for(int i=0;i<size-1;i++)
queue1.offer(queue2.poll());

return queue2.poll();

}else{

int size=queue1.size();

for(int i=0;i<size-1;i++)
queue2.offer(queue1.poll());

return queue1.poll();

}

	
	
}
public static void print(){}


public static void main(String []args){
int ch=0;
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("Enter Your Choicen\n\t\t1.Push\n2.\t\tPOP\n\t\t3.Display\n\t\t4.EXIT\n");
ch=sc.nextInt();
switch(ch){
case 1:
System.out.println("Enter the data to be inserted");
int data=sc.nextInt();
Queue<Integer> q=push(data);
System.out.println(q);
break;
case 2:
int temp=pop();
System.out.println(temp);
break;
case 3:
print();
break;

case 4:
System.exit(0);


}


}
}
}