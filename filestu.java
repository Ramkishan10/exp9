package project_24;
import java.io.*;
import java.util.*;
class Student
{
   int no;
   Student(int n)
   {
       no=n;
   }
   String stu_name[]=new String[10];
   String stu_address[]=new String[10];
   byte name[];
   byte add[];
   void putstuddetails()throws Exception
   {
            Scanner s=new Scanner(System.in);
            for(int i=0;i<no;i++)
            {
                System.out.println("Enter stu_name and stu_address");
                stu_name[i]=s.nextLine();
                stu_address[i]=s.nextLine();
            }
            FileOutputStream fout=new FileOutputStream("infile.txt");
            for(int i=0;i<no;i++)
            {
                 name=stu_name[i].getBytes();
                 add=stu_address[i].getBytes();
                 fout.write(name);
                 fout.write(add);
            }
            System.out.println("successfully written");
            fout.close();
   }
   void contoanofile()throws Exception
   {
       FileInputStream fin=new FileInputStream("infile");
       FileOutputStream fout=new FileOutputStream("outfile.txt");
       int read;
       String c="";
       while((read=fin.read())!=-1)
       {
           c+=((char)read);
       }
       c=c.toLowerCase();
       byte b[]=c.getBytes();
       fout.write(b);
       fin.close();
       fin.close();
   }
}
public class filestu
{
    public static void main(String[] args)throws Exception
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many students");
        n=s.nextInt();
        Student st=new Student(n);
        st.putstuddetails();
        st.contoanofile();   
    }
}
