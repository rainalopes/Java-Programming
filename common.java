import java.util.Scanner;

class common

{

void Distinct(int a[],int n)
{
int i,j;
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
public static void main(String args[])

{

int n,m,i,j,k,p=0,count=0;

System.out.println("Enter the number of elements you want to enter in the first array");

Scanner sc=new Scanner(System.in);

n=sc.nextInt();

int a[]=new int[n];
System.out.println("Enter elements in first array");

for(i=0;i<n;i++)

{

System.out.println("Enter element:");

a[i]=sc.nextInt();

}

System.out.println("Enter the number of elements you want to enter in the second array");

m=sc.nextInt();

int b[]=new int[m];
System.out.println("Enter elements in second array");

for(i=0;i<m;i++)

{

System.out.println("Enter element:");

b[i]=sc.nextInt();
}



int c[]=new int[50];

for(j=0;j<n;j++)

{

for(k=0;k<m;k++)

{

if(a[j]==b[k])

{

c[p]=a[j];

p++;

count++;

}

else

continue;

}}

if(count>0)

{

System.out.println("Common elemnts are:");

common obj=new common();
obj.Distinct(c,count);
}

else

System.out.println("No Common Element");

}}
