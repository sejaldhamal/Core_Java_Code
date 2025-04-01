/*Q5. Fetch file whose size is more than 2kb?*/

import java.io.*;
public class FileHandling_FetchFile_WhoseSize_Morethat2kb
{
  public static void main(String x[])
  {
     File f=new File("C://");
     File l[]=f.listFiles();
     
    for(int i=0 ; i<l.length ; i++)
    {
      if(l[i].isFile()&& l[i].length()>2048 )
	  {
	    System.out.println("File Name:" +l[i].getName()+"Size:"+l[i].length()/1024 +"kb");
       }
	 }
	}
  }
       	  