//making 정우 김, 김정우

package gababo.logic;

public class Name_server {
	
	String email;
	String id, server;
	
	private Name_server() {}
	
	public  Name_server(String email){
		
		this.email = email;
	
	}
	
	public String 이메일검증() {
		
		if (email.indexOf("@") == -1) {return "@가 없습니다.";}
		
		return "";
	}
	
	public String name() {
		
		if (email.indexOf("@") == -1) {return email;}
		else {id = email.substring(0,email.indexOf("@"));}
		
		return id;
	
	}
	
	
	public String server() {
		if (email.indexOf("@") == -1) {return email;}
		else {server = email.substring((email.indexOf("@")+1),email.length());}
		
		return  server;
		
	}
	
	
}