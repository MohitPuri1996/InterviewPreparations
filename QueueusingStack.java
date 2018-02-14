//overflow underflow not covered
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class QueueusingStack{
static Stack<Integer> stack1=new Stack<>();
static Stack<Integer> stack2=new Stack<>();

public static Stack Push(int data){

stack1.push(data);
return stack1;
}
public static int pop(){
while(!stack1.empty()){
stack2.push(stack1.pop());
}
int temp=stack2.pop();
while(!stack2.empty()){
stack1.push(stack2.pop());
}
return temp;
}

public static void main(String []args){
Scanner sc=new Scanner(System.in);int ch=0;
while(true){
System.out.println("Enter your choice\n1.push\n2.pop\n3.exit");
ch=sc.nextInt();
switch(ch){
case 1:
int data=sc.nextInt();
Stack<Integer> stack=Push(data);
System.out.println(stack);
break;
case 2:
int d=pop();
System.out.println("popped "+d);

break;

case 3:
System.exit(0);
break;

}
}

}
}