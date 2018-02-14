import java.util.Scanner;
import java.util.Stack;
class ExpressionEvaluation{

public static void main(String []args){


String a="((1+2*3)-5)";
Stack<Character> stack=new Stack<>();Stack<Integer> evaluate=new Stack<>();
stack=postFix(a);
String post="";
for(int i=0;!stack.empty();i++){
post+=stack.pop();
}

String reverse="";
//System.out.println(post+"exp"+reverse+ "before");
for(int i=post.length()-1;i>=0;i--)
reverse+=post.charAt(i);

post=reverse;
//System.out.println(post+"exp"+reverse);
int op1=0,op2=0;
for(int i=0;i<post.length();i++){
if(post.charAt(i)=='+'){
op1=evaluate.pop();
op2=evaluate.pop();
evaluate.push(op1+op2);
}
else if(post.charAt(i)=='-'){

op1=evaluate.pop();
op2=evaluate.pop();
evaluate.push(op1-op2);

}
else if(post.charAt(i)=='*'){

op1=evaluate.pop();
op2=evaluate.pop();
evaluate.push(op1*op2);
}
else if(post.charAt(i)=='/'){

op1=evaluate.pop();
op2=evaluate.pop();
evaluate.push(op1/op2);
}
else{
evaluate.push(Integer.parseInt(post.charAt(i)+""));
}



}

System.out.println(evaluate.pop());
}
public static Stack postFix(String s){

Stack<Character> stack=new Stack<>();
Stack<Character> operator=new Stack<>();
s="("+s+")";
System.out.println(s);
for(int i=0;i<s.length();i++){

if(s.charAt(i)=='(')
{
operator.push(s.charAt(i));
}else if(s.charAt(i)=='+'){

if(operator.empty()==true||precision(operator.peek())<precision('+')){
operator.push(s.charAt(i));
}else{
while(operator.peek()!='('){
stack.push(operator.pop());
}operator.push(s.charAt(i));
}

}
else if(s.charAt(i)=='-'){
if(operator.empty()==true||precision(operator.peek())<precision('-')){
operator.push(s.charAt(i));
}else{
while(operator.peek()!='('){
stack.push(operator.pop());
}operator.push(s.charAt(i));
}



}
else if(s.charAt(i)=='*'){
if(operator.empty()==true||precision(operator.peek())<precision('*')){
operator.push(s.charAt(i));
}else{
while(operator.peek()!='('){
stack.push(operator.pop());
}
operator.push(s.charAt(i));
}


}
else if(s.charAt(i)=='/'){
if(operator.empty()==true||precision(operator.peek())<precision('/')){
operator.push(s.charAt(i));
}else{
while(operator.peek()!='('){
stack.push(operator.pop());
}
operator.push(s.charAt(i));
}

}
else if(s.charAt(i)=='^'){
if(operator.empty()==true||precision(operator.peek())<precision('^')){
operator.push(s.charAt(i));
}else{
while(operator.peek()!='('){
stack.push(operator.pop());
}
operator.push(s.charAt(i));
}

}
else if(s.charAt(i)==')'){

System.out.println(operator.peek());

while(operator.peek()!='('){
stack.push(operator.pop());
}
if(operator.peek()=='(')
operator.pop();

}

else{
System.out.println(s.charAt(i)+" ");
stack.push(s.charAt(i));
}
}
System.out.println(stack); 	
return stack;
}

public static int precision(Character ch){
int score=0;
switch(ch){

case '+':
case '-':
	score=1;
break;
case '*':
case '/':
	score=2;
break;
case '^':
	score=3;break;


}
return score;
}


}