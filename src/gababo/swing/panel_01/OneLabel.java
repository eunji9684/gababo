package gababo.swing.panel_01;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OneLabel extends JLabel{

	public OneLabel(ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(0,0,0));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
