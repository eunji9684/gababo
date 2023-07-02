package gababo.swing.panel_05;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FiveLabel_String extends JLabel{

	public FiveLabel_String(String text , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(0,0,0,255));
		setText(text);
		setFont(getFont().deriveFont(Font.PLAIN, 25));
		setForeground(getBackground());
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
