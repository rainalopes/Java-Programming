interface X
{
public void myMethod();
}
interface Y
{
public void myMethod();
}
class Demo1 implements X, Y
{
public void myMethod()
{
System.out.println(" Multiple inheritance example using interfaces");
}
}

class Demo extends Demo1
{
public static void main(String args[])
{
Demo d=new Demo();
d.myMethod();
}}