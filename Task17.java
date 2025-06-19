import java.io.*; 
import java.util.*; 
public class Task17 
{ 
public static void main(String args[])
{ 
FileOutputStream outfile = null; 
//String s=args[0]; // to input string from command line 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter something to be printed to that file: ");
String s=sc.nextLine(); 
byte b1[] = s.getBytes(); 
try 
{ 
outfile = new FileOutputStream("file1.txt"); 
outfile.write(b1); 
} 
catch(IOException e) 
{ 
System.out.println(e); 
System.exit(-1); 
} 

sc.close();
System.out.println("Write Byte"); 
System.out.println("Thank You...!!!"); 
} 
} 
