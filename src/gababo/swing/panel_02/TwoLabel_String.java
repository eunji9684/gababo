package gababo.swing.panel_02;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TwoLabel_String extends JLabel{

	String text;
	
	public TwoLabel_String(String text , int width , int height, int locationX, int locationY){
		
		this.text = text;
		
		setVisible(true);
		setBackground(new Color(255,255,255,255));
		setText(text);
		setFont(getFont().deriveFont(Font.PLAIN, 17));
		setForeground(Color.black);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
	
	
	public void set_Text(String a) {
		
		this.setText(a);
	};
}
