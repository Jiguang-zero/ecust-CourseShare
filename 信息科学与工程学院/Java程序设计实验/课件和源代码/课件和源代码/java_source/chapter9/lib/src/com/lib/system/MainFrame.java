package com.lib.system;
 import  javax.swing.*;
 
 
//import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class  MainFrame{
	JFrame  SystemMainFrame=null;
	public MainFrame(){
		super();
	} 

	public MainFrame(String title){
		SystemMainFrame=new JFrame();
		SystemMainFrame.setTitle(title);
		SystemMainFrame.setBounds(100,100,550,550); 
		SystemMainFrame.setVisible(true); 
		SystemMainFrame.addWindowListener(  //Ϊ�˹رմ���
		   new WindowAdapter()   {
               public void windowClosing(WindowEvent e)  {
                   System.exit(0);
               }
           }
	  );
	}

	public static void main(String[] args) { 
		 
	}
}

 