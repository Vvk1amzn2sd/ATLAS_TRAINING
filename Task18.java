import java.io.*; 
class Task18 
{ 
public static void main(String args[]) 
{ 
File f1=new File("filreaderexample.txt"); 
FileWriter fw = null; 
try 
{ 
fw=new FileWriter(f1); 
fw.write("Nainital \n"); 
fw.write(" Mussorie \n"); 
fw.close(); 
} 
catch(FileNotFoundException e) 
{ 
System.out.println("Sorry..!! File Not Found...!!!");  
} 
catch(IOException e) 
{ 
System.out.println(e.getMessage()); 
} 
System.out.println("write operation done!!"); 
} 
} 
