import java.util.Scanner;
class Person
{
protected String name;
int code;
}
class Account extends Person
{
 protected float pay;
}
class Admin extends Account
{
private int exp;

public void accept(String s,int c,float p,int e)
{
name=s;
code=c;
pay=p;
exp=e;
}
public void display()
{
System.out.println("Name:"+name+"\nCode:"+code+"\nPay:"+pay+"\nExperience:"+exp);
}
}
class main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name:");
String s=sc.nextLine();
System.out.println("Enter code:");
int c=sc.nextInt();
System.out.println("Enter pay:");
float p=sc.nextFloat();
System.out.println("Enter Experience:");
int e=sc.nextInt();
Admin a=new Admin();
a.accept(s,c,p,e);
System.out.println("Person's  Details");
a.display();
}}