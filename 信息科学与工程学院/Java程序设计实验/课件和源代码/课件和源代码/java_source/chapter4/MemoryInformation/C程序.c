#include <stdio.h>
int Pi=3.1415926;
int GetMax(int x,int y){
	int z;
	z= x>y?x:y;
	return z;
 }
int main(int argc, char *argv[]){
	int a,b,c;
	int *p1,*p2;
	a=1;
	b=2;
	c=GetMax(a,b);
	p1=(int *)malloc(sizeof(int));
	(*p1)=5;
	p2=p1;
	printf("C:%d",c);	
	printf("*p2:%d",*p2);
	return 0;
}
