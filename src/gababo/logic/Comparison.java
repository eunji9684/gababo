//making 정석 강, 강정석

package gababo.logic;

public class Comparison extends Total {
	
	public Comparison() {};
	
	public String message(String user, String com) {
		
		if (user.equals(com)) {
			plustotal();
			plusdraw();
			
			return "비겼어요!";
		}
		
		else if (user.equals("가위") && com.equals("바위")) {
			plustotal();
			pluslose();
			
			return "컴퓨터가 이겼네요!";
			
		}

		else if (user.equals("가위") && com.equals("보")) {
			plustotal();
			pluswin();
			
			return "사용자가 이겼네요!";
		} 
		
		else if (user.equals("바위") && com.equals("가위")) {
			plustotal();
			pluswin();
			return "사용자가 이겼네요!";
			
		} 
		
		else if (user.equals("바위") && com.equals("보")) {
			plustotal();
			pluslose();
			return "컴퓨터가 이겼네요!";
		} 
		
		else if (user.equals("보") && com.equals("가위")) {
			plustotal();
			pluslose();
			return "컴퓨터가 이겼네요!";
		} 
		
		else if (user.equals("보") && com.equals("바위")) {
			plustotal();
			pluswin();
			return "사용자가 이겼네요!";
		} 
		
		else {
			return "가위바위보 게임이에요! 가위든 바위든 보든 제대로 내야죠!";
		}
	}
}