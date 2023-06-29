package gababo.swing.panel_03;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ThreeLabel extends JLabel{

	public ThreeLabel(ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(0,0,0));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
