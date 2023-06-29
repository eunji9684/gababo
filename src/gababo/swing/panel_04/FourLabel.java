package gababo.swing.panel_04;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FourLabel extends JLabel{

	public FourLabel(ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(255,255,0,0));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
