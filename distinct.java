import java.util.Scanner;
class distinct
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in the array");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter element:");
a[i]=sc.nextInt();
}
System.out.println("Original array");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"  ");
}
System.out.println("Distinct array");
for(i=0;i<n;i++)
{
boolean flag=false;
for(j=0;j<i;j++)
{
if(a[i]==a[j])
{
flag=true;
break;
}
}
if(flag!=true)
System.out.print(a[i]+"  ");
}

}
}