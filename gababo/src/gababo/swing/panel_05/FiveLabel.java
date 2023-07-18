package gababo.swing.panel_05;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FiveLabel extends JLabel{

	Runnable run;
	
	public FiveLabel(Runnable run,ImageIcon img , int width , int height, int locationX, int locationY){
		
		setVisible(true);
		setBackground(new Color(255,255,255,255));
		setIcon(img);
		setSize(width, height);
		setLocation(locationX,locationY);
		setBorder(getBorder());
		addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {run.run();}
        });	
	}
}
