import java.util.Scanner;
class maximum
{
void Sort(int b[],int num)
{
int i,j,temp;
for(i=0;i<num;i++)
{
for(j=0;j<num-i-1;j++)
{
if(b[j]<b[j+1])
{
temp=b[j];
b[j]=b[j+1];
b[j+1]=temp;
}
}}
}
void Distinct(int b[],int n)
{
int i,j,p=0;
int c[]=new int[50];
for(i=0;i<n;i++)
{
boolean flag=false;
for(j=0;j<i;j++)
{
if(b[i]==b[j])
{
flag=true;
break;
}
}
if(flag!=true)
{
c[p]=b[i];
p++;
}
}
System.out.println("First largest element is:"+c[0]);
System.out.println("Second largest element is:"+c[1]);
}

public static void main(String args[])
{
int i,n;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter element:");
a[i]=sc.nextInt();
}
maximum obj=new maximum();
obj.Sort(a,n);
obj.Distinct(a,n);
}}