
public class SeriesNum
{
public static void main(String x[])
{
int i,j=1,k=0;
for(i=1;i<=12;i++)
{
if(i%2==1)
{
System.out.printf(" %d",j);
j++;
}
else{
k=k+2;
System.out.printf(" %d",k);
}
}
}
}