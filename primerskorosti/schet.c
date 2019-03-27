#include <stdio.h>
void main()
{
	float num=456;
	for (int i=1; i<100000001; i++)
	{
		num=(437156*num)/437150-i;
		printf("%f\n", num);
	}
}
