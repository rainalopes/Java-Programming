import java.util.Enumeration;

import java.util.Vector;

import java.util.Scanner;


class vector3

{

Vector vct=  new Vector();
void add()
{
String a;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the item");
a= obj.nextLine();
vct.addElement(a);
}
void delete()
{
String a;
Scanner obj=new Scanner(System.in);
if(vct.isEmpty())
{
System.out.println("NO ELEMENTS");
}
else
{
System.out.println("Enter the item");
a= obj.nextLine();
if(vct.contains(a))
{
vct.removeElement(a);
}
else
{
System.out.println("Element not present");
}}
}
void print()
{
Enumeration enm=vct.elements();
if(vct.isEmpty())
{
System.out.println("NO ELEMENTS");
}
else
{
System.out.println("Elements in the list are:");
while(enm.hasMoreElements())
{
System.out.println(enm.nextElement());
}}
}
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);


vector3 v=new vector3();
int choice,c;
do
{
System.out.println("Enter 1 to add items to the list.\nEnter 2 to delete an item from the list\nEnter 3 to print the items in the list");
System.out.println("Enter your choice");
choice=sc.nextInt();
switch(choice)
{
case 1: v.add();
              v.print();
break;
case 2:v.delete();
             v.print();
break;
case 3: v.print();
break;
default:System.out.println("INVALID CHOICE");
}
System.out.println("To continue enter any number else enter 0");
c=sc.nextInt();
}
while(c!=0);
}
}