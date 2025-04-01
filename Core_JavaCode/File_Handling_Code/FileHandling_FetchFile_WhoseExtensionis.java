/*Q4. Fetch file whose extension is .doc or .txt*/

import java.io.*;
public class FileHandling_FetchFile_WhoseExtensionis
{
  public static void main(String x[])
  {
     File f=new File("D:\\HTML");
     File l[]=f.listFiles();
     
    for(int i=0 ; i<l.length ; i++)
    {
      if(l[i].isFile()&& l[i].getName().endsWith(".html"))
	  {
	    System.out.println(l[i]);
       }
	 }
	}
  }
       	  