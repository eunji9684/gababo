package gababo.swing.panel_05;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FiveLabel extends JLabel{

	public FiveLabel(ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(255,255,0,0));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
