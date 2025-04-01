import java.util.*;
class InsertArrEle
{
 int a[],index,value;
void setIntArray(int a[])
{
  this.a=a;
}

void insertValueOnIndex()
{
 for(int i=a.length-1 ; i>index ; i--)
  {
int temp=a[i];
  a[i]=a[i-1];
  a[i-1]=temp;
 
  }
  a[index]=value;
  for(int i=0 ;i<5 ; i++)
  {
  System.out.printf(" %d",a[i]);
  }
 }
}

public class ClassObject_Que7_InsertValueInArray
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],index,value;
a=new int[6];
System.out.println("Enter the array element:");
for(int i=0 ; i<5 ; i++)
{
 a[i]=xyz.nextInt();
}
System.out.println("Enter the Index:");
index=xyz.nextInt();
System.out.println("Enter the value:");
value=xyz.nextInt();

 InsertArrEle a1= new  InsertArrEle();
 a1.setIntArray(a,index,value);
 a1.insertValueOnIndex();
}
}