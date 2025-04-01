/*Q1. Create folder using File class */
import java.io.*;
 public class FilehandlingCreateFolder
 {
  public static void main(String x[])
   {
     File f=new File("E:\\IoStream_FileHandling");
	
	  if(f.exists())
      {
	    System.out.println("File is already exists");
	  }
	  
	  else{
	  boolean b=f.mkdir();
	  
	       if(b)
		   {
		     System.out.println("Folder is created");
			 }
			 else{
			   System.out.println("Some Problem");
			    }
			  }
			}
		  }