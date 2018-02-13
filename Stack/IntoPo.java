//Infix to postfix
import java.util.Scanner;
import java.util.Stack;
class IntoPo{

public static void main(String []args){
Stack<Character> stack=new Stack<>();
Stack<Character> operator=new Stack<>();


String s="(A+B)*(C+D)";
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