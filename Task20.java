import java.io.*; 
class Task20 
{ 
public static void main(String args[]) 
{ 
try 
{ 
    byte b;
    int byteread;
    FileInputStream infile = new FileInputStream("file1.txt");     //file io stream - byte by byte read
    FileOutputStream outfile = new FileOutputStream("outputexample.txt"); 
    while((byteread = infile.read()) != -1) 
    { 
        b = (byte)byteread; 
        outfile.write(b); 
    } 
    infile.close();
    outfile.close();
    System.out.println("Byte Copied From file1.txt to outputexample.txt File"); 
} 
catch(FileNotFoundException e) 
{ 
    System.out.println("Sorry..!! File Not Found...!!!");  
} 
catch(IOException e) 
{ 
    System.out.println(e.getMessage()); 
} 
} 
} 
