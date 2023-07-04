package gababo.swing.panel_08;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class EightPassFieid extends JPasswordField{

	public EightPassFieid(int width , int height, int locationX, int locationY){
		
		setFont(getFont().deriveFont(Font.PLAIN, 30));
		setBorder(new EmptyBorder(10, 20, 10, 50));
		//setBackground(new Color(0, 0, 0, 0));
		setVisible(true);
		setOpaque(false);
		setForeground(Color.black);
		setSize(width, height);
		setLocation(locationX,locationY);
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
