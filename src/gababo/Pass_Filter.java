//making 티비잇꿀, 황은지

package gababo;

public class Pass_Filter {

	private String pw1;
	private String pw2;
	
	public Pass_Filter(String pw1, String pw2) {
		this.pw1 = pw1;
		this.pw2 = pw2;
	}
	
	public void setpw(String pw1) {
		this.pw1 = pw1;
	}
	
	public String getpw() {
		return pw1;
	}
	
	public void setpw2(String pw2) {
		this.pw2 = pw2;
	}
	
	public String getpw2() {
		return pw2;
	}
	
	public Boolean checkpw() {
		
		if (this.pw2.equals(pw1)) {
			
			return true;
		
			}
		
		return false;
	}
	
	public Boolean lengthpw(String a) {
			
		if (a.length() < 8 && a.length() > 12) {
	
			return false;
		}
	
		return true;
	}
	
}
	
