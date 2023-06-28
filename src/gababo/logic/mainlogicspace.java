package gababo.logic;

public class mainlogicspace {

	/*
	int ueraddcount = 0;
	String email;
	String id;
	String server;
	String 검증;
	String password;
	Email_Filter aa;
	String num;
	String com;
	String user;
	
	String input_id = null;
	String input_ps = null;
	
	
	
	Comparison total = new Comparison();
	
	System.out.println("게임을 시작하기전에 회원가입을 해야 합니다. 콘솔창에 이메일을 입력해 주세요");
	
		do {	
			if(ueraddcount >= 1) {System.out.println("@가 빠졌습니다. 이메일을 다시 입력해주세요");}
			ueraddcount ++;
			
			email = Scaner_Input.scan.next();
			
			id = new Name_server(email).name();
			server = new Name_server(email).server();
			검증 = new Name_server(email).이메일검증();
	
		}
		while(검증 == "@가 없습니다.");
	
	ueraddcount = 0;
	
	aa = new Email_Filter(id);
	
		do {
			
			if(aa == null) {}
			if(!aa.id_filter()) {	
				System.out.println(aa.getmessage());
				System.out.println("아이디를 콘솔창에 다시 입력해 주세요");
				id = new Name_server(Scaner_Input.scan.next()).name();
			
			}
			
			aa = new Email_Filter(id);
			
		}
		
		while(!aa.id_filter());
	

	System.out.println("패스워드를 입력해 주세요");	
	
		do {
			password = Scaner_Input.scan.next();
		}
		while(password.length() == -1);
	
	
	System.out.println("회원가입 완료\n\n" + "아이디  : " +id + "\n패스워드 : " + password+ "\n");	
	
	
			do { 
				 if( input_id == null) { System.out.println("로그인할 계정을 입력해 주세요");}
				 else {
					 if(!input_id.equals(id)) {System.out.println( "\n해당 계정이 없습니다. 다시 입력해 주세요\n");}
				 }
				 
				 input_id = Scaner_Input.scan.next();
				 
				 
			} while (input_id == null || !input_id.equals(id));
	
			
			do { 
				 if( input_ps == null) { System.out.println("패스워드를 입력해 주세요");}
				 else {
					 if(!input_ps.equals(password)) {System.out.println( id + " 계정의 패스워드를 다시 입력해 주세요\n");}
				 }
				 
				 input_ps = Scaner_Input.scan.next();
				 
				 
			} while (input_ps == null || !input_ps.equals(password));
	
			
			
			System.out.println("\n환영합니다. " + id + "님\n");
	
	do { 
		System.out.println("\n콘솔에 아래 선택하기와 관련된 번호를 입력해 주세요 \n 선택하기 1.게임을 한다 2. 게임을 끈다. 3. 랭킹시스템을 확인한다.");
		
		num = Scaner_Input.scan.next();
		
			switch(num) {
				
				case "1":
					System.out.println("게임을 시작합니다. 콘솔에 가위(1), 바위(2), 보(3)를 입력해 주세요");
					
					com =  new String_Filter(Integer.toString(new Computer_Select().comnum())).Filter();
					user = new String_Filter(Scaner_Input.scan.next()).Filter();
					
					System.out.println("\n컴퓨터 : " + com);
					System.out.println("유저 : " + user + "\n");
					
					System.out.println(total.message(user, com));
					
					System.out.println("게임이 종료되었습니다.");
				
					break;
					
				case "2":
					System.out.println("안녕히가세요.");
					System.exit(0);
					break;	
					
				case "3":
					total.myScore();
					break;
					
				default:
					System.out.println("1, 2 , 3만 입력해 주세요");
				
			}

	} while (true);
	
			

	*/
}
