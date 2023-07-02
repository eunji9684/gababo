package gababo.swing.panel_02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import gababo.logic.Email_Filter;
import gababo.logic.Name_server;
import gababo.swing.frame.All_Interface;

public class TwoTextFieid extends JTextField{

	int width;
	int height;
	
	public TwoTextFieid(int width , int height, int locationX, int locationY){
		
		this.width = width;
		this.height = height;
		
		setForeground(Color.black);
		setFont(getFont().deriveFont(Font.BOLD, 30));
		setBorder(new EmptyBorder(10, 20, 10, 50));
		//setBackground(new Color(0, 0, 0, 0));
		setVisible(true);
		setOpaque(false);
		setSize(width, height);
		setLocation(locationX,locationY);
		
		addKeyListener(new KeyAdapter() {
			   @Override
	            public void keyReleased(KeyEvent e) {
				  if(new Email_Filter(new Name_server(getText()).name()).id_filter()){
					  
					  All_Interface.Two_중복검사.setVisible(true); 
					  
					  if(isEditable()) {
						
						  All_Interface.Two_설명.set_Text("중복검사 버튼을 눌러주세요");

					  }
					   
				  }
				  else {
					  
					  All_Interface.Two_중복검사.setVisible(false); 					  
	
					  if(getText().length() == 0) {}
					  else {All_Interface.Two_설명.set_Text(new Email_Filter(new Name_server(getText()).name()).getmessage());
					  
					  }
				  }
				  
				  
			}
     	});
	}
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
	

		Graphics2D g2 = (Graphics2D) g.create();
		
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	    int width = getWidth();
	    int height = getHeight();

	    // 텍스트 필드 내부 색상 설정
	    g2.setColor(new Color(255,255,255,255));
	    g2.fillRoundRect(0, 0, width, height, 30, 30);
	
	    // 텍스트 필드 테두리 그리기
	    g2.setColor(new Color(180,180,180,255));
	    Shape border = new RoundRectangle2D.Double(0, 0, width - 1, height - 1, 30, 30);
	    
	    g2.draw(border);
	    g2.dispose();
	      
	    super.paintComponent(g);
		}
	
}
