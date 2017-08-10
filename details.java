import java.util.Scanner;
class employee
{
String empname;
int empid;
String desig;
float salary;

void get_employee()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the name, id, designation and salary");
empname=sc.next();
empid=sc.nextInt();
desig=sc.next();
salary=sc.nextFloat();
}


void show_employee()
{
System.out.println(empname+"\t\t\t\t\t\t"+empid+"\t\t\t\t\t\t"+desig+"\t\t\t\t\t\t"+salary);
}}

class details
{
public static void main(String args[])
{
int n;
System.out.println("Enter the number of employees");
Scanner obj= new Scanner(System.in);
n=obj.nextInt();
employee e[]=new employee[n];
int i;
for(i=0;i<n;i++)
{
e[i]=new employee();
e[i].get_employee();
}
employee temp=new employee();
System.out.println("NAME\t\t\t\t\t\tID\t\t\t\t\t\tDESIGNATION\t\t\t\t\t\tSALARY");
for(i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(e[j].salary<e[j+1].salary)
{
temp=e[j];
e[j]=e[j+1];
e[j+1]=temp;
}
}}
for(i=0;i<n;i++)
{
e[i].show_employee();
}
}
}
/*
C:\Users\Mr.Lopes\Desktop>java details
Enter the number of employees
5
Enter the name, id, designation and salary
Khan
101
principal
100000
Enter the name, id, designation and salary
Samir
206
assistProfessor
30000
Enter the name, id, designation and salary
Vrushali
201
Professor
50000
Enter the name, id, designation and salary
Shane
105
HOD
80000
Enter the name, id, designation and salary
Rajesh
600
Clerk
20000
NAME                                                   ID                       DESIGNATION                                         SALARY
Khan                                                   101                       principal                                                     100000.0

Shane                                                105                           HOD                                                        80000.0
Vrushali                                              201                        Professor                                                   50000.0

Samir                                                 206                       assistProfessor                                           30000.0
Rajesh                                                600                           Clerk                                                        20000.0
*/