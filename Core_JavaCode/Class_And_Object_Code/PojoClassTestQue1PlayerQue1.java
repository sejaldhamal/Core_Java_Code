/*Q1. Create a class called "Player" with members jersyno, name, run, and matches. 
 Write a java program to store the input data for five player, display their all player 
information, and delete record in specific index then display record ascending orders by 
matches.
*/

import java.util.*;

//Here we Create pojo class using setter and getter method
class Player
{
  int jersyno;
  String name;
  int run;
  int matches;
  void setJersyno(int jersyno)
  {
    this.jersyno=jersyno;
  }
  int getJersyno()
  {
    return jersyno;
  }
  void setName(String name)
  {
    this.name=name;
  }
  String getName()
  {
    return name;
  }
  void setRun(int run)
  {
     this.run=run;
  }
  int getRun()
  {
    return run;
  }
  void setMatches(int matches)
  {
    this.matches=matches;
  }
  int getMatches()
  {
     return matches;
  }
}
class PlayerApp
{
   Player p[];                      //accept the palyer array
   void setPlayer(Player...p)
   { 
      this.p=p;                   
   }
   void showPlayerInfo()           //show all information of palyer 
   {
     System.out.println("Jersyno"+"\t"+"Name:\t"+"Run:\t"+"Matches:\n");
     for(int i=0;i<p.length;i++)
     {
        System.out.println(p[i].getJersyno()+p[i].getName()+"\t"+p[i].getRun()+"\t"+p[i].getMatches()+"\n");
     }
   }
   void showDeleteUsingIndex()
   {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter index to delete the data:");
      int index=xyz.nextInt();
      for(int i=index;i<p.length-1;i++)
      {
          p[i]=p[i+1]; 
      }
   }
   void showDataAscendingOrder()
   {
     for(int i=0;i<p.length-1;i++)
     {
        for(int j=i+1;j<p.length-1;j++)
        {
             if(p[i].getMatches()>p[j].getMatches())
             {
               Player temp=p[i];
               p[i]=p[j];
               p[j]=temp;
             }
        }
     }
     System.out.println("The Data in ascending order after delete:");
     System.out.println("Jersyno"+" "+"Name:\t"+"Run:\t"+"Matches:\n");
     for(int i=0;i<p.length-1;i++)
     {
        System.out.println(p[i].getJersyno()+"\t"+p[i].getName()+"\t"+p[i].getRun()+"\t"+p[i].getMatches());
     }

   }

}
public class PojoClassTestQue1PlayerQue1
{
 public static void main(String x[])
 {
    Scanner xyz=new Scanner(System.in);
    PlayerApp ap=new PlayerApp();
    Player p[]=new Player[5];
    for(int i=0;i<p.length;i++)
    {
      p[i]=new Player();
      System.out.println("Enter jersy number:");
      int jersyno=xyz.nextInt();
      System.out.println("Enter Name:");
      xyz.nextLine();
      String name=xyz.nextLine();
      System.out.println("Enter Run:");
      int run=xyz.nextInt();
      System.out.println("Enter matches:");
      int matches=xyz.nextInt();

      p[i].setJersyno(jersyno);
      p[i].setName(name);
      p[i].setRun(run);
      p[i].setMatches(matches);
    }
    ap.setPlayer(p);
    ap.showPlayerInfo();
    ap.showDeleteUsingIndex();
    ap.showDataAscendingOrder();
 }
}