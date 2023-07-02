package gababo.swing.panel_02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TwoLabel_png extends JLabel{

	Runnable run;
	
	public TwoLabel_png(Runnable run,ImageIcon img , int width , int height, int locationX, int locationY){
		
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
