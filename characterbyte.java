package project_24;
import java.io.*;
import java.util.*;
public class characterbyte
{
    public static void main(String[] args)throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        FileInputStream fb1=new FileInputStream("infile.txt");
        FileWriter fc1=new FileWriter("charbyte1.txt");
        FileReader fc2=new FileReader("outfile.txt");
        String str;
        int read;
        System.out.println("This is for FileWriter class");
        System.out.println("Enter your information to write in files");
        str=dis.readLine();
        fc1.write(str);
        fc1.flush();
        System.out.println("\n\n*****************************************************************************\n\n");
        System.out.println("This is for FileInputStream class");
        while((read=fb1.read())!=-1)
        {
            System.out.print((char)read);
        }
        System.out.println("\n****************************************************************");
        System.out.println("This is for chararrayreader class");
        String s="welcome to files concept";
        char c[]=s.toCharArray();
        char c1[]={'s','t','u','d','e','n','t','s'};
        
        CharArrayReader ca=new CharArrayReader(c);
        while((read=ca.read())!=-1)
        {
            System.out.print((char)read);
        }
        System.out.println("\n\n\n****************************************************************");
        System.out.println("This is for filereader class");
        while((read=fc2.read())!=-1)
        {
            System.out.println((char)read);
        }
        dis.close();
        fb1.close();
        fc1.close();
        fc2.close();
        
    }
    
}
