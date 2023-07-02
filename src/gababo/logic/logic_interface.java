package gababo.logic;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;

import gababo.sql.File_Reader;
import gababo.swing.frame.All_Interface;

public interface logic_interface {
	
	public static ArrayList<String[]> id_pass 		= new ArrayList<>();
	
	public static String[] id = new String[6];
	
	// show User_interface // call
	public static void 메인페이지(){	
		
		if (id[0] == "0") {
		
			All_Interface.Two_panel.setVisible(false);
			All_Interface.Three_panel.setVisible(false);
			All_Interface.four_panel.setVisible(false);
			All_Interface.Five_panel.setVisible(false);
			All_Interface.Six_panel.setVisible(false);	
			All_Interface.Seven_panel.setVisible(false);	
			
			All_Interface.one_panel.setVisible(true);			
		}
		
		else {
			로그인후화면();
		}
		
	};
	
	public static void 회원가입(){
		All_Interface.one_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(false);
		All_Interface.four_panel.setVisible(false);
		All_Interface.Five_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(false);
		All_Interface.Seven_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(true);
		
		All_Interface.Two_중복검사.setVisible(false);
		All_Interface.text.setText("");
		All_Interface.text.setEditable(true);
		All_Interface.Two_설명.set_Text("아이디 또는 이메일을 입력해주세요");
		All_Interface.pass1.setVisible(false);
		All_Interface.pass2.setVisible(false);
		
		All_Interface.Two_button_회원가입.setVisible(false);
		
		All_Interface.Two_label_check1.setVisible(false);
		All_Interface.Two_label_check2.setVisible(false);
		All_Interface.Two_label_check3.setVisible(false);
		
		All_Interface.Two_label_writer.setVisible(true);
		All_Interface.Two_label_inputnon.setVisible(false);
	
		All_Interface.Two_lavel_writer2.setVisible(true);
		All_Interface.Two_label_inputnon2.setVisible(false);
	
		All_Interface.Two_lavel_writer3.setVisible(true);
		All_Interface.Two_label_inputnon3.setVisible(false);
	
		
	};
	
	public static void 로그인하기(){
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.four_panel.setVisible(false);
		All_Interface.Five_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(false);
		All_Interface.Seven_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(true);
		
		All_Interface.three_설명.set_Text("아이디와 패스워드를 입력해 주세요");
		All_Interface.Three_text.setText("");
		All_Interface.Three_pass.setText("");
		
	};

	public static void 인원별승률보기(){
		
		//플레이 횟수 순위를 해당 인터페이스에서 볼수 있도록 개조
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(false);
		All_Interface.Five_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(false);	
		All_Interface.Seven_panel.setVisible(false);
		All_Interface.four_panel.setVisible(true);
	};
	
	public static void 전투모션(){

		All_Interface.main_frame.setVisible(true);
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(false);
		All_Interface.four_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(false);
		All_Interface.Seven_panel.setVisible(false);
		
		All_Interface.Five_panel.setVisible(true);
		
		All_Interface.Five_panel.repaint();
		
		Runnable run = new Runnable(){public void run() {게임텍스트();}};
		
		Thread a = new Thread(run);
		
		a.start();
	};


	public static void 유윈_로즈(){

		All_Interface.main_frame.setVisible(true);
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(false);
		All_Interface.four_panel.setVisible(false);
		All_Interface.Five_panel.setVisible(false);
		All_Interface.Seven_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(true);
	}

	public static void 로그아웃() {
		
		logic_interface.id[0] = "0";
		메인페이지();
	}
	
	
	
	public static void 로그인후화면(){ 
		
		All_Interface.main_frame.setVisible(true);
		All_Interface.Seven_panel.setVisible(true);
		All_Interface.one_panel.setVisible(false);
		All_Interface.Two_panel.setVisible(false);
		All_Interface.Three_panel.setVisible(false);
		All_Interface.four_panel.setVisible(false);
		All_Interface.Five_panel.setVisible(false);
		All_Interface.Six_panel.setVisible(false);
		
	}

	public static void 게임종료(){System.exit(0);};
	
	public static void 가입전아이디중복조회() {
		
		Iterator<String[]> id_iter = id_pass.iterator();
		
		boolean a;
		
		do {
			a = id_iter.next()[0].equals(new Name_server(All_Interface.text.getText()).name());
			if(a == true) {break;}
		}
		
		while(id_iter.hasNext());
		
		if(a == false) {
			All_Interface.Two_설명.set_Text("비밀번호를 입력해 주세요");
			All_Interface.text.setEditable(false);
			All_Interface.pass1.setVisible(true);
			All_Interface.pass2.setVisible(true);
			All_Interface.Two_중복검사.setVisible(false);
		}
		else {All_Interface.Two_설명.set_Text("중복된 아이디가 있습니다.");}
	}
	
	public static void 패스워드길이및중복조회() {
		
		boolean 일차 = new Pass_Filter(All_Interface.pass1.getText()).is_length();
		boolean 이차 = new Pass_Filter(All_Interface.pass2.getText()).is_length();
		
		if(!일차) {
			All_Interface.Two_설명.setText("패스워드 길이는 8~12자로 입력해주세요"); 
			All_Interface.Two_button_회원가입.setVisible(false);
			return;
		}
		
		if(!이차) {
			All_Interface.Two_설명.setText("패스워드 길이는 8~12자로 입력해주세요"); 
			All_Interface.Two_button_회원가입.setVisible(false);
			return;
		}
		
		if(All_Interface.pass1.getText().equals(All_Interface.pass2.getText())){
			All_Interface.Two_설명.setText("각 패스워드가 일치합니다.");
			All_Interface.Two_button_회원가입.setVisible(true);
			return;
		}
		
		else {
			All_Interface.Two_설명.setText("각 패스워드가 일치하지 않습니다.");
			All_Interface.Two_button_회원가입.setVisible(false);
			return;
		}
		
	}
	
	public static boolean 로그인() {
		
		new File_Reader().File_reread();
		
		Iterator<String[]> id_iter = id_pass.iterator();
		
		String[] inter;
		boolean a = false;
		boolean b = false;
		
		do {
			inter = id_iter.next();
				
			if(a == false) { a = inter[0].equals(All_Interface.Three_text.getText());};
			if(a == false) { b = inter[1].equals(All_Interface.Three_pass.getText());};
			
			if(a == true) {break;}
			
		}
			
		while(id_iter.hasNext());
		
		
		if(a == false) {
			
			All_Interface.three_설명.set_Text("아이디 빈 공간이거나 틀렸습니다.");
			return false;	
		}
		
		else {
			
			if(b == false) {
				All_Interface.three_설명.set_Text("비밀번호가 틀렸습니다.");
				
				return false;
				
			}
			
			else {
				
				logic_interface.id[0] = inter[0];
				logic_interface.id[1] = inter[1];
				logic_interface.id[2] = inter[2];
				logic_interface.id[3] = inter[3];
				logic_interface.id[4] = inter[4];
				logic_interface.id[5] = inter[5];
				
				
				All_Interface.three_설명.set_Text("로그인 처리중입니다.");
				return true;
			}
		
		}
			
			
		}

		public static void 게임텍스트() {
			
			All_Interface.Five_Label_text.setText("");
			
			String 텍스트1 = " 컴퓨터와 가위바위보를 시작합니다.";
			String 텍스트3 = " 카드를 눌러주세요.";
			String 텍스트2 = "";
			
			for (int i = 0; i < 텍스트1.length(); i++) {
			
				try {Thread.sleep(50);
				
					텍스트2 += 텍스트1.charAt(i);
					All_Interface.Five_Label_text.setText(텍스트2);
				
				} 
				catch (InterruptedException e) {e.printStackTrace();}
				
			}
			
			텍스트2 = "";
			
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {};
			
			for (int i = 0; i < 텍스트3.length(); i++) {
				
				try {Thread.sleep(50);
				
					텍스트2 += 텍스트3.charAt(i);
					All_Interface.Five_Label_text.setText(텍스트2);
				
				} 
				catch (InterruptedException e) {e.printStackTrace();}
				
			}
			
		}
	
		public static void 가위(){
			String com = new String_Filter(Integer.toString((new Computer_Select().comnum()))).Filter(); 
			String user = "가위";
			String 결과 = new Comparison().message(user,com);
			
			All_Interface.Six_label_lose.setText("유저: " + user +", 컴퓨터: "+ com +", "+ 결과);
			
			if(결과.equals("비겼어요!")) {id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));};
			
			if(결과.equals("사용자가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[4] = Integer.toString((Integer.parseInt(id[4]) + 1));
			};
			
			if(결과.equals("컴퓨터가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[5] = Integer.toString((Integer.parseInt(id[5]) + 1));	
			};
		}
		public static void 바위(){
			String com = new String_Filter(Integer.toString((new Computer_Select().comnum()))).Filter(); 
			String user = "바위";
			String 결과 = new Comparison().message(user,com);
			
			All_Interface.Six_label_lose.setText("유저: " + user +", 컴퓨터: "+ com +", "+ 결과);
			
			if(결과.equals("비겼어요!")) {id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));};
			
			if(결과.equals("사용자가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[4] = Integer.toString((Integer.parseInt(id[4]) + 1));
			};
			
			if(결과.equals("컴퓨터가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[5] = Integer.toString((Integer.parseInt(id[5]) + 1));	
			};
		}
		public static void 보(){
			String com = new String_Filter(Integer.toString((new Computer_Select().comnum()))).Filter(); 
			String user = "보";
			String 결과 = new Comparison().message(user,com);
			
			All_Interface.Six_label_lose.setText("유저: " + user +", 컴퓨터: "+ com +", "+ 결과);	
			
			if(결과.equals("비겼어요!")) {id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));};
			
			if(결과.equals("사용자가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[4] = Integer.toString((Integer.parseInt(id[4]) + 1));
			};
			
			if(결과.equals("컴퓨터가 이겼네요!")) {
				id[3] = Integer.toString((Integer.parseInt(id[3]) + 1));
				id[5] = Integer.toString((Integer.parseInt(id[5]) + 1));	
			};
		
		}
		
	}
	
