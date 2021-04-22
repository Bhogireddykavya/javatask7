class stack<T>
{
T e[];int top;
stack(T[] ia,int n)
{
e=ia[];
top=0;
}
public void push(T ele)
{
if(top<=10)
e[top++]=ele;
else
System.out.println("stack is full");
}
public void pop()
{
if(top==0)
System.out.println("stack is empty");
else
System.out.println("popped element:"+e[--top]);
}
public void display()
{
for(int i=0;i<top;i++)
System.out.print(e[i]+" ");
System.out.print();
}
}
class GSDemo
{
public static void main(String a[])
{
Integer ia[]=new Integer[10];
stack<Integer>s1=new stack<Integer>(ia,10);
character ca[]=new character[10];
stack<character>s2=new stack<character>(ca,10);
s1.pop();
s1.push(10);
s1.push(20);
s1.pop();
s2.push('a');
s2.push('e');
s2.push('i');
s2.push('o');
s2.push('u');
s2.dispaly();
}
}