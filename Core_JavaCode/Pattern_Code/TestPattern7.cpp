#include<stdio.h>
int main()
{
	int i,j,k=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5;j++)
		{
		if(j==1 || j==5 || i==5)
		{
		printf("*");
	}
			else{
				printf(" ");
			}
		}
		

	printf("\n");


}
}