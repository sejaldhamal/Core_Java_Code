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
	printf("Display lower Triangular array:\n");
	for(i=0 ; i<3 ; i++)
	{
		for(j=0 ; j<3 ; j++)
		{
	if(j<i)
	{
		printf("0");
		}
		else
		{
			printf("%d",a[i][j]);
			
		}
			}
			printf("\n");

}
}
