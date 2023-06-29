package gababo.swing.frame;
import gababo.logic.*;

public class Gababo_Main {

	public static void main(String[] args) {

		All_Interface.panel_add();
		All_Interface.label_add();
		All_Interface.button_add();
		All_Interface.icon_add();
		
		All_Interface.main_frame.setVisible(true);
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(true);
		All_Interface.four_panel.setVisible(false);
		
	}
}
