#include <stdio.h>
class Parent{
	public :
	   int x,y;
	   virtual  void toString(){  printf("Parent:%d  %d  \n",x,y);		}  //动态绑定
	    void prn(){ 			printf("Parent:%d  %d  \n",x,y);		}//静态绑定
		void setXY(int x1,int y1){	 
			this->x=x1;this->y=y1;		
		} 
}; 
class Child:public Parent{
	public :
		int x,y,z;
	    void toString(){ 	 printf("Child:%d  %d  %d \n",x,y,z);		}
		void prn(){ 		 printf("Child:%d  %d  \n",x,y);		}
		void setXYZ(int x1,int y1,int z1){	 this->x=x1;this->y=y1;this->z=z1;	} 			
};
int main(int argc, char *argv[]){
	Parent p1,*p2;
	Child c1;
	p1.setXY(1,1);
	c1.setXYZ(2,2,2);

	p1.toString();
	c1.toString();
	
	p2=&c1;
    p2->toString();
   // printf("Child:%d  %d  %d \n",p2->x,p2->y,p2->z);
    printf("main:%d  %d   \n",p2->x,p2->y );  //变量，静态绑定

	p1= c1;
    p1.toString(); //对象名，静态绑定
    printf("main:%d  %d   \n",p1.x,p1.y );

	return 0;
}
