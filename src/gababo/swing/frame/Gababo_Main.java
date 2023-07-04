package gababo.swing.frame;
import gababo.logic.RankSystem;
import gababo.logic.logic_interface;
import gababo.sql.File_Reader;

public class Gababo_Main {

	public static void main(String[] args) {
		
		logic_interface.id[0] = "0";
		new File_Reader().File_read();
		
		new RankSystem().playRank_reversed();
		
		All_Interface.panel_add();
		All_Interface.label_add();
		All_Interface.button_add();
		All_Interface.icon_add();
		
		All_Interface.main_frame.setVisible(true);
		
		logic_interface.메인페이지();
		//logic_interface.회원탈퇴화면();
	}
}
