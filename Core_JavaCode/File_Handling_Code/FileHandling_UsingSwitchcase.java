
import java.io.*;
public class FileHandling_UsingSwitchcase
{
  public static void main(String x[])
  {
     File f=new File("D:\\HTML");
     File l[]=f.listFiles();
     
    for(int i=0 ; i<l.length ; i++)
    {
      if(l[i].isFile()&& l[i].getName().startsWith("b"))
	  {
	    System.out.println(l[i]);
       }
	 }
	}
  }
       	  