
/*Q6. Fetch files whose extension is .png or jpeg etc*/

import java.io.*;
public class FileHandling_FetchFile_WhoseExtensionis_png_jpeg
{
  public static void main(String x[])
  {
     File f=new File("D:\\HTML");
     File l[]=f.listFiles();
     
    for(int i=0 ; i<l.length ; i++)
    {
      if(l[i].isFile()&& l[i].getName().endsWith(".jpg") || l[i].getName().endsWith(".jpeg") )
	  {
	    System.out.println(l[i]);
       }
	 }
	}
  }
       	  