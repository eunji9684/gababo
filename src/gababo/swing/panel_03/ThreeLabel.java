package gababo.swing.panel_03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ThreeLabel extends JLabel{

	Runnable run;
	
	public ThreeLabel(Runnable run,ImageIcon img , int width , int height, int locationX, int locationY){
		
		this.run = run;
		
		setVisible(true);
		setBackground(new Color(0,0,0));
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
