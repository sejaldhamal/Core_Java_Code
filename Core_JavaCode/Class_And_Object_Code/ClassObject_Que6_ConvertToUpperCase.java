import java.util.*;
class ConvertToUpper
{
  char ch[];
  void setCharArray(char ch[])
  {
    this.ch=ch;
  }
 
  void covertToUpperCase()
  {
    

    for(int i=0 ; i<ch.length ; i++)
    {
       if(ch[i]>=65 && ch[i]<=90)
      {
       System.out.print((char)(ch[i]+32));
      }

   else{
       
       System.out.print((char)(ch[i]-32));
        }
      }
  }
}
 public class ClassObject_Que6_ConvertToUpperCase
 {
   public static void main(String x[])
   {
     Scanner xyz=new Scanner(System.in);
     char ch[]=new char[4];
       for(char i=0 ; i<ch.length ; i++)
       {
          ch[i]=xyz.next().charAt(0);
       }
    
    ConvertToUpper c1= new ConvertToUpper();
     
     c1.setCharArray(ch);
      
     c1.covertToUpperCase();
      }
  }









