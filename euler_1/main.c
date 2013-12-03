#include <stdio.h>
#include <stdlib.h>
#define ENDNUM 1000

int temp[ENDNUM];
int index =0;
int total =0;

int main(int argc, char **argv){

	int start,start2;

	for(start=1;start != ENDNUM;start++)
	{
		if( (start %3 == 0) || ( start %5 ==0) ){

			temp[index] = start;
			index++;
		}
	}

	for(start2=0;start2 != index;start2++)
	{
		total+=temp[start2];
	}
	printf("\n%d\n",total);
	return 0;
}
