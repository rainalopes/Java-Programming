import java.util.Scanner;
class binary
{
public static void main(String args[])
{
int low,high,mid,n,i,j,temp,found=0,key;
System.out.println("Enter the number of elements you want to enter");
Scanner sc=new Scanner(System.in);
n=sc.nextInt(); 
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter the element:");
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the element you want to search");
key=sc.nextInt();
low=0;
high=n-1;
while(high>=low && low>=0 && high<n)
{
mid=(low+high)/2;
if(a[mid]==key)
{
found++;
break;
}
else if(key<a[mid])
{
high=mid-1;
}
else if(key>a[mid])
low=mid+1;
}
if(found>0)
{
System.out.println("Element  found");
}
else
System.out.println("Element not found ");
}
}