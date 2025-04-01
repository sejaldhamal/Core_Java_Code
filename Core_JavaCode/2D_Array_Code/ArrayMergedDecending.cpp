#include<stdio.h>
#include<conio.h>
int main()
{
	int a[3],b[3],c[6],i,j,k=0;

printf("Enter first array");
for(i=0 ; i<3 ; i++)
{
	scanf("%d",&a[i]);
	c[k]=a[i];
	k++;

	}	
printf("Enter second array");
for(i=0 ; i<3 ; i++)
{
	scanf("%d",&b[i]);
	c[k]=b[i];
	k++;

}




for(i=0 ; i<6 ; i++)
{
	for(j=i+1 ; j<6 ; j++)
	{
		if(c[i]<c[j])
		{
			int temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		
		
	  }
   }
   for(i=0 ; i<6 ; i++)
{
printf(" %d",c[i]);
}
   
}


