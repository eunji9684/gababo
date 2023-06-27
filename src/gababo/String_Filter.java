//making 정우김, 김정우

package gababo;

public class String_Filter {
	String name;
	
	public String_Filter(String user_input){this.name = user_input;}
	
	public String Filter() {
		switch(this.name) {
			case "1":
				return "가위";
			case "2":
				return "바위";
			case "3":
				return "보";
			case "가위":
			case "바위":
			case "보":
				return (String)this.name;
			default:
				return "0";
		}
	};
}