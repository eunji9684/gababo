package gababo.swing.panel_04;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FourLabel_String extends JLabel{

	public FourLabel_String(String text , int width , int height, int locationX, int locationY){
		
		setBackground(new Color(255,255,255,255));
		setText(text);
		setFont(getFont().deriveFont(Font.PLAIN, 15));
		setForeground(new Color(0,0,0,255));
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
