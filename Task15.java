import java.io.*;
class Task15
{
public static void main(String args[])
{
    File f1 = new File("file1.txt"); // to create new file
    FileOutputStream outfile = null;  // to write data into the file
    byte cities[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A', 'A', 'N', 'D', 'S', 'Z'};
    try
    {
        outfile = new FileOutputStream(f1);
        outfile.write(cities);
    }
    catch (IOException e)
    {
        System.out.println(e);
        System.exit(-1);
    }
    finally
    {
        try
        {
            if (outfile != null)
            {
                outfile.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error closing the file: " + e);
        }
    }
    System.out.println("Write Byte");
    System.out.println("Thank You...!!!");
}
} 
    

