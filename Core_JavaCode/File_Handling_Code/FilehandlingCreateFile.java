/*Q2. Create File using File class?*/

import java.io.*;
public class FilehandlingCreateFile
{
  public static void main(String x[])
  {
    File f=new File("E:\\IoStream_FileHandling\\iostreamfile");
	if(f.exists())
	{
	  System.out.println("File Already exists");
	 }
	 else{
	    boolean b=f.mkdir();
	  if(b)
	  {
	     System.out.println("File Created..");
		 }
	   else{
	    System.out.println("Some Problem");
		}
	  }
	}
  }