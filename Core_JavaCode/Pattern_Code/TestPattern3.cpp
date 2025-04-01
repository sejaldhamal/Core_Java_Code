#include<stdio.h>
int main()
{

	int i,j;
	char start;
	for(i=0;i<=4;i++)
	{
	
		start='A'+i;
		for(j=0;j<=4;j++)
		{
		printf("%c ",start+j);
		}
	
	printf("\n");
	}
}