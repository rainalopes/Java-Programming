import java.util.Scanner;
class student
{
int sub1;
int sub2;
int sub3;
int rollno;
int total;

void get_details()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter rollno");
rollno=sc.nextInt();
System.out.println("Enter marks in subject1");
sub1=sc.nextInt();
System.out.println("Enter marks in subject2");
sub2=sc.nextInt();
System.out.println("Enter marks in subject3");
sub3=sc.nextInt();
}

void calculate()
{
total=sub1+sub2+sub3;
}

void display()
{
System.out.println(rollno+"\t\t"+sub1+"\t\t"+sub2+"\t\t"+sub3+"\t\t"+total);
}}
class info
{
public static void main(String args[])
{
int i;
student s[]=new student[5];
for(i=0;i<5;i++)
{
s[i]=new student();
s[i].get_details();
s[i].calculate();
}
System.out.println("Rollno\t\tSub1\t\tSub2\t\tSub3\t\tTotal");
for(i=0;i<5;i++)
{
s[i].display();
}
student temp=new student();
for(i=0;i<5;i++)
{
for(int j=0;j<5-i-1;j++)
{
if(s[j].total<s[j+1].total)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
System.out.println("Student obtaining highest total marks:");
s[0].display();
}}
/*
C:\Users\Mr.Lopes\Desktop>java info
Enter rollno
1
Enter marks in subject1
20
Enter marks in subject2
22
Enter marks in subject3
25
Enter rollno
2
Enter marks in subject1
20
Enter marks in subject2
17
Enter marks in subject3
16
Enter rollno
3
Enter marks in subject1
15
Enter marks in subject2
30
Enter marks in subject3
18
Enter rollno
4
Enter marks in subject1
25
Enter marks in subject2
26
Enter marks in subject3
23
Enter rollno
5
Enter marks in subject1
28
Enter marks in subject2
15
Enter marks in subject3
16
Rollno          Sub1            Sub2            Sub3            Total
     1             20                 22                 25                67
     2             20                 17                 16                53
     3             15                 30                 18                63
     4             25                 26                 23                74
     5             28                 15                 16                59
Student obtaining highest total marks:
     4             25                 26                 23                74
*/