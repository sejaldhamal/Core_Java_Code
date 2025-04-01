#include<stdio.h>
int main()
{
	int i,j,a[2][2],b[2][2];
	
	printf("Enter the Array Element: ");
	for(i=0;i<2;i++)
	{
		for(j=0 ; j<2 ; j++)
		{
			scanf("%d",&a[i][j]);
			
		}
	}
	printf("Display the array element:\n");
	for(i=0 ; i<2 ; i++)
	{
		for(j=0 ; j<2 ; j++)
		{
		b[j][i]=a[i][j];
		}
		
}
	printf("Transpose matrix is:\n");
	for(i=0 ; i<2 ; i++)
	{
		for(j=0 ; j<2 ; j++)
		{
			printf("%d",b[i][j]);
		}
		printf("\n");
	}
}