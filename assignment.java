import java.util.*;
class assignment
{
public static void main(String args[] )
{
int i,j,m,n,sum=0;
System.out.println("enter the number of rows:");
Scanner sc= new Scanner(System.in);
m=sc.nextInt();
System.out.println("Enter the number of columns");
n=sc.nextInt();
int a[][] = new int [m][n];
int sumrow[]=new int [m];
int sumcol[]=new int [n];

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println("Enter the detail");
a[i][j]= sc.nextInt();
}}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
sumrow[i]=sumrow[i]+a[i][j];
}
for(j=0;j<n;j++)
{
for(i=0;i<m;i++)
{
sumcol[j]=sumcol[j]+a[i][j];
}
}
for(j=0;j<n;j++)
{
sum=sum+sumcol[j];
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print("  "+a[i][j]);
}
System.out.print("  "+sumrow[i]);
System.out.println("");
}

for(j=0;j<n;j++)
System.out.print(" "+sumcol[j]);
System.out.println(" "+sum);

}}