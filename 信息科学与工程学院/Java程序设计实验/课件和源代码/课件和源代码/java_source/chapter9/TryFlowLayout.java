//file name：TryFlowLayout.java
import java.awt.*;
import javax.swing.*;
public class TryFlowLayout extends JFrame   {  //顶层窗口类
	JButton[] button = new JButton[9];  //声明9个按钮类对象
	FlowLayout layout;    //声明布局管理器对象
	public TryFlowLayout()  {  
        super("FlowLayout 应用举例");  //设置顶层窗口标题
        String label;   
        
	    //创建布局管理器对象    
        layout = new FlowLayout(FlowLayout.LEFT,10,10);   
        getContentPane().setLayout(layout);      //设置布局管理器
        	
        for (int i = 0; i < 9; i++) {               //创建9个按钮对象并添加到窗口中
           	label = "Button #" + ( i + 1 ) + " ";
		button[i] = new JButton(label);
		getContentPane().add(button[i]);
         }
         setSize(320,160);                 	//将显示窗口设置为320×160
         setVisible(true);		//显示窗口
         setResizable(false);               	//让窗口不能调节大小
	}
	public static void main(String[] args){
	    TryFlowLayout frame = new TryFlowLayout();   //创建顶层窗口对象
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

