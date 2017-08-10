import java.io.*; 
class Month
{
 public static void main(String args[]) throws IOException
{
    int m; 
   BufferedReader br = new BufferedReader (new InputStreamReader     (System.in));    String str;  
  System.out.println("Enter month number:");  
  str=br.readLine();    m=Integer.parseInt(str); 
    try  
  {    
  if(m>12 || m<1)    
  throw new NumberFormatException();     
 System.out.println("Month number entered is "+m);  
  }  
  catch(NumberFormatException ne) 
   {       System.out.println("Invalid month,Exception Thrown");   
 }  
  } } 