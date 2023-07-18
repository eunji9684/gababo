//making 정석 강, 강정석 

package gababo.logic;

public class Name_verification {


	public static String enterEmail = "이메일을 입력해주세요.";
	public static String enterPw = "비밀번호를 입력해주세요.";
	public static String incorrectAt = "@를 포함시켜 주세요.";
	public static String incorrectLength = "올바른 길이가 아닙니다. ";
	public static String incorrectCappital = "대문자를 하나 이상 포함시켜 주세요.";
	public static String incorrectNumber = "숫자를 하나 이상 포함시켜 주세요.";


	private String registerdId;
	private String registerdPw;


	public void enterEmail() {
		System.out.println(Name_verification.enterEmail);
	}


	public void enterPw() {
		System.out.println(Name_verification.enterPw);
	}


	// 대문자 검증로직  
	public Boolean hasNum(String id) {
		int dcount = 0;
		for (char c : id.toCharArray()) {
			if (Character.isDigit(c))
				dcount++;
			if (dcount > 0)
				return true;
		}
		return false;
	}


	//숫자 검증로직 
	public Boolean hasCap(String id) {
		int ccount = 0;
		for (char c : id.toCharArray()) {
			if (Character.isUpperCase(c))
				ccount++;
			if (ccount > 0)
				return true;
		}
		return false;


	}


	public Boolean checkEmail(String id) {
		if (id.length() >= 8 && id.length() <= 16) { // id 길이 검증
			if (this.hasNum(id)) {// 숫자 있는지 검증
				if (this.hasCap(id)) {// 대문자 있는지 검증
					System.out.println("회원가입 성공!");
					return true;
				} else {
					System.out.println(Name_verification.incorrectCappital);
				}
			} else {
				System.out.println(Name_verification.incorrectNumber);
			}
		} else {
			System.out.println(Name_verification.incorrectLength);
		}
		return false;
	}


	public void setRegisterdId(String registerdId) {
		this.registerdId = registerdId;
	}


	public void setRegisterdPw(String registerdPw) {
		this.registerdPw = registerdPw;
	}


	public Boolean name_verification(String userEmail) {
		if (registerdId.equals(userEmail)) {
			return true;
		} else {
			System.out.println("회원가입된 사용자가 아닙니다.");
			return false;
		}
	}
	
	public Boolean pw_verification(String userPw) {
		if(registerdPw.equals(userPw)) {
			return true;
		}else {
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		}
	}


}
