package gababo.swing.panel_02;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TwoLabel_png extends JLabel{

	public TwoLabel_png(ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(0,0,0));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
