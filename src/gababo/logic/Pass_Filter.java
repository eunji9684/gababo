//making 티비잇꿀, 황은지

package gababo.logic;

public class Pass_Filter {

	private String pw1 = null;
	
	public Pass_Filter(){};
	public Pass_Filter(String pw1) {this.pw1 = pw1;}
	
	public Boolean is_length() {
		if (pw1.length() < 8 || pw1.length() > 12) {return false;}
		return true;
	}
	
	public String set_pw() {return pw1;}

	
}
	
