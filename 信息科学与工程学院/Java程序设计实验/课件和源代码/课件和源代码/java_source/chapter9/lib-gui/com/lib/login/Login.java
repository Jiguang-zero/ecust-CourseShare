package com.lib.login;
import  java.awt.*;
 
class  Login{
	Frame LoginFrame;
	Panel  LoginPanel;
	public Login(){
		super();
	}
	public Login(String title){
		LoginFrame=new Frame();
		LoginPanel=new Panel();
		BorderLayout LoginFrameLayout=new BorderLayout(); 
		LoginFrame.setLayout(LoginFrameLayout);
		LoginFrame.add(LoginPanel,"north"); 
		LoginFrame.show();
	}

	public static void main(String[] args) { 
		Login login=new Login("��¼����");		 
	}
}
