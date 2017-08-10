import java.util.Scanner;
class base
{
protected int a,b;
public void read(int x, int y)
{
a=x;
b=y;
}}

class sum extends base
{
private int sum;
public void add()
{
sum=a+b;
}
public void display()
{
System.out.println("Sum is:"+sum);
}}

class inheritance1
{
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers:");
x=sc.nextInt();
y=sc.nextInt();
sum s=new sum();
s.read(x,y);
s.add();
s.display();

}}
