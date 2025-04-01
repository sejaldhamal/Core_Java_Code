import java.util.*;
public class ArrayOccurence
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
int a[],i,j,temp,c=0;
a=new int[7];


System.out.printf("Enter the Array: ");
for(i=0 ; i<a.length-1 ;i++)
{
 a[i]=xyz.nextInt();
}


for(i=0 ; i<a.length-1 ; i++)
{
for(j=i+1 ; j<a.length-1 ; j++)
{
if(a[i]>a[j])
{
 temp=a[i];
 a[i]=a[j];
 a[j]=temp;
}
}
}

System.out.printf("Array in Ascending order: ");
for(i=0 ; i<a.length-1 ;i++)
{
System.out.println(a[i]);
}
for(i=0 ; i<a.length-1 ;i++)
{ 
if(a[i]==a[i+1])
{
++c;
}
else{
++c;

System.out.println(a[i]+"----->"+c);
c=0;
}
}
}
}








