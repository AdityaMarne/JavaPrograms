package StaticKeyword;

class StaticMethEx
{
	 int rollno;  
     String name;  
     static String college = "ITS";  
     //static method to change the value of static variable  
     static void change()
     {  
    	 college = "BBDIT";  
     }  
     
   //constructor to initialize the variable  
     StaticMethEx(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }
     
	public static void main(String args[])
	{
		StaticMethEx s1=new StaticMethEx(111,"Adnan");
		StaticMethEx s2=new StaticMethEx(222,"Aditya");
		
		s1.display();
		s2.display();
	}
}