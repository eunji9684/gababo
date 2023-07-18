package gababo.swing.frame;

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;
import gababo.logic.logic_interface;
import gababo.sql.File_modify;

public class MainFrame extends JFrame{	
	
	public MainFrame(){
		
		setUndecorated(false);
		setSize(800,600);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		
		WindowAdapter windowAdapter = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // 종료할 때 실행할 메서드 작성
             
            	if(logic_interface.id[0] == "0"){}
        		else {new File_modify().modify();}
            	
                System.exit(0); // 프로그램 종료
            }
        };
	
        addWindowListener(windowAdapter);
	}
	
}
