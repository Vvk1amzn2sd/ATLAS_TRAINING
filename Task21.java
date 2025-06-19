import java.io.*; 
class Task21
{ 
public static void main(String args[]) 
{ 
    try 
    { 
        FileInputStream file1 = new FileInputStream("t21_file1.txt"); 
        FileInputStream file2 = new FileInputStream("t21_file2.txt"); 
        SequenceInputStream file3 = new SequenceInputStream(file1, file2); 
        BufferedInputStream br1 = new BufferedInputStream(file3);    // this is reading from file 3 after merge
        BufferedOutputStream br2 = new BufferedOutputStream(System.out); 
        FileOutputStream fileOutput = new FileOutputStream("t21_merged_file.txt");
        BufferedOutputStream br3 = new BufferedOutputStream(fileOutput);

        int ch; 
        while((ch = br1.read()) != -1) 
        { 
            br2.write(ch); 
            br3.write(ch); 
        } 
        br2.flush(); 
        br3.flush(); 
        br1.close(); 
        br2.close(); 
        br3.close(); 
        file1.close(); 
        file2.close(); 
        fileOutput.close();
        System.out.println("Merge Two Files Successfully"); 
    } 
    catch(IOException e) 
    { 
        System.out.println("Sorry..!! File Not Found...!!!"); 
        e.printStackTrace(); 
    } 
} 
} 
