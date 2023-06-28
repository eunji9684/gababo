//making 한규 김, 김한규

package gababo.logic;

public class Email_Filter {

	
		String id;
		
		private Email_Filter(){};
		
		public Email_Filter(String id){this.id = id;}	
		
		public boolean id_filter() {
			
			boolean num = false;
			
			if(8 > this.id.length()) { return false;}
			else if (this.id.length() > 12) { return false;}
			else {}
			
			for(int i = 0; i < this.id.length(); i++) {
				num = false;
				if (Character.isDigit(this.id.charAt(i))) {
					num = true;
					break;
				}
			}
			
			if (!num){
		
				return false;
			}
			
			if (Character.isUpperCase(this.id.charAt(0))){
				}
			else {
			
				return false;
				}
			
			return true;
		}
		
		public String getmessage() {
			
			boolean num = false;
			
			if(8 > this.id.length()) {return "아이디의 길이가 7자 미만입니다.";}
			else if (this.id.length() > 12) {return "아이디의 길이가 12자 초과입니다.";}
			else {}
			
			for(int i = 0; i < this.id.length(); i++) {
				num = false;
				if (Character.isDigit(this.id.charAt(i))) {
					num = true;
					break;
				}
			}
			
			if (!num){
				return "아이디에는 숫자가 1개이상 포함되어야 합니다.";
			}
			
			if (Character.isUpperCase(this.id.charAt(0))){
				}
			else {
				return "아이디의 첫 글자는 대문자만 가능합니다.";
				}	
			
			return "";	
			}
	

	
}
