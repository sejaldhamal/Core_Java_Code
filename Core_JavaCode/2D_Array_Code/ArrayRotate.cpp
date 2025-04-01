#include<stdio.h>
#include<conio.h>
int main()
{
	int a[11],i,r,j;

printf("Enter the Array Element: ");
for(i=0;i<11;i++)
{
scanf("%d",&a[i]);
}

printf("Enter rotate position of an array: ");
scanf("%d",&r);

for(i=0 ; i<r ; i++)
{
	int temp=a[0];
	for(j=0;j<11;j++)
	{
		a[j]=a[j+1];
		
	}
	a[10]=temp;
}
for(i=0; i<11; i++)
{
	printf(" %d",a[i]);
}

}