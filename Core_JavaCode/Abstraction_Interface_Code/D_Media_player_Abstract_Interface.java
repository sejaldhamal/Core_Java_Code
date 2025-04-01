
import java.util.*;
abstract class Media
{
 abstract void play(String name);
 abstract void stop(String name);
}

interface Playable 
{
  void play(String name);
}
interface Stoppable
{
  void stop(String name);
}
 
 class Song extends Media implements Playable,Stoppable
 {
    
	 public void play(String name)
	  {
	    System.out.println("Playing song: "+name);
	  }
	
	
       public void stop(String name)
		{
		 System.out.println("Stopping song: "+name);
		}
	
  }	
 class Video extends Media implements Playable,Stoppable
  {
    
	 public void play(String name)
	  {
	   System.out.println("Playing video: "+name);
	  }
	
	
	
	    public void stop(String name)
		{
		 System.out.println("Stopping video: "+name);
		}
	
  }
  
  public class D_Media_player_Abstract_Interface
  {
   public static void main(String x[])
   {
	 Media m[]=new Media[2];//Array of abstract class Media 
     m[0]=new Song(); //instance of song 
	 m[0].play("play song");
	 m[0].stop("stop song");
	 
	 m[1]=new Video(); // instance of video
	 m[1].play("play video");
	 m[1].stop("stop video");
   }
  }