import java.util.Scanner;
public class Client 
 {
 public static void main(String[] args) throws MyException
 {   
 int price ;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age");
price=sc.nextInt();
   
   if(price < 0)  
     throw new MyException(price);   
 else 
      System.out.println("Your age is :"+price); 
   } }
 class MyException extends Exception 
 {     
 private int price;   
  public MyException(int price)   
  {        
 this.price = price;    
 }   
 public String toString() 
    {       
  return "Price should not be in negative, you are entered" +price;   
  }  } 