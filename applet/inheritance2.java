import java.util.Scanner;
class base
{
protected int r;
public void accept(int a)
{
r=a;
}}

class area extends base
{
float result;
public void cal()
{
result=3.14f*r*r;
System.out.println("Area of Circle is:"+result);
}}

class vol extends area
{
 float volume;
public void calculate()
{
volume=4/3*3.14f*r*r*r;
System.out.println("Volume of the sphere is:"+volume);
}}

class inheritance2
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius:");
a=sc.nextInt();
vol v=new vol();
v.accept(a);
v.cal();
v.calculate();
}}
