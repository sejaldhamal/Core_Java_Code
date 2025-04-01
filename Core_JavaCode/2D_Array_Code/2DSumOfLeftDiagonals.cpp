#include<stdio.h>
int main()
{
	int i,j,a[3][3],sum=0;
	
	printf("Enter the Array Element: ");
	for(i=0;i<3;i++)
	{
		for(j=0 ; j<3 ; j++)
		{
			scanf("%d",&a[i][j]);
			
		}
	}

	for(i=0 ; i<3 ; i++)
	{
		
		sum=sum+a[i][2-i];
	}
			printf("Sum of left Diagonals is %d:\n",sum);
		}
		
