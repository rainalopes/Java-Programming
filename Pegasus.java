 class Horse
 {  
public String IdentifyMyself() 
 { 
return( "I am a horse."); 
  }
}
interface Flyer
 { 
 String IdentifyMyself();
}
 interface Mythical 
{ 
String IdentifyMyself();
}
 class Pegasus extends Horse  implements Flyer, Mythical 
 {
 public static void main(String  args[])
 {
 Pegasus myApp = new Pegasus();
System.out.println(myApp.IdentifyMyself());
 }
}