#include<stdio.h>
#include<conio.h>
int main()
{
	int a[6],i,j,sum,num;

printf("Enter array");
for(i=0 ; i<6 ; i++)
{
	scanf("%d",&a[i]);
}	


printf("Enter the number: ");
scanf("%d",&num);
for(i=0 ; i<6 ; i++)
{
	for(j=i+1 ; j<6 ; j++)
	{
	sum=a[i]+a[j];
	
	if(sum==num)
	{
		printf("Pair of element make the given sum by value of index %d and %d \n",i,j);
		
		}	
	}
}
}