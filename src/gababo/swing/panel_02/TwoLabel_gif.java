package gababo.swing.panel_02;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TwoLabel_gif extends JLabel{

	public TwoLabel_gif(ImageIcon img , int width , int height, int locationX, int locationY){
	
		ImageIcon resizedIcon = new ImageIcon(img.getImage().getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH));
		
		setVisible(true);
		setBackground(new Color(0,0,0));
		setIcon(resizedIcon);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
	}
}
