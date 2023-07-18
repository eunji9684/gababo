package gababo.swing.frame;

import java.awt.Color;

import gababo.logic.Name_server;
import gababo.logic.RankSystem;
import gababo.logic.logic_interface;
import gababo.sql.Crypt;
import gababo.sql.File_Writer;
import gababo.sql.File_modify;
import gababo.swing.panel_01.OneLabel;
import gababo.swing.panel_01.OnePanel;
import gababo.swing.panel_02.TwoLabel_String;
import gababo.swing.panel_02.TwoLabel_png;
import gababo.swing.panel_02.TwoPanel;
import gababo.swing.panel_02.TwoPassFieid;
import gababo.swing.panel_02.TwoTextFieid;
import gababo.swing.panel_03.ThreeLabel;
import gababo.swing.panel_03.ThreePanel;
import gababo.swing.panel_03.ThreePassFieid;
import gababo.swing.panel_03.ThreeTextFieid;
import gababo.swing.panel_04.FourLabel;
import gababo.swing.panel_04.FourLabel_String;
import gababo.swing.panel_04.FourPanel;
import gababo.swing.panel_05.FiveLabel;
import gababo.swing.panel_05.FiveLabel_String;
import gababo.swing.panel_05.FivePanel;
import gababo.swing.panel_06.SixLabel;
import gababo.swing.panel_06.SixLabel_String;
import gababo.swing.panel_06.SixPanel;
import gababo.swing.panel_07.SevenLabel;
import gababo.swing.panel_07.SevenPanel;
import gababo.swing.panel_08.EightLabel;
import gababo.swing.panel_08.EightPanel;
import gababo.swing.panel_08.EightPassFieid;
import gababo.swing.panel_08.Eight_String;

public interface All_Interface {

	public static MainFrame main_frame 					= new MainFrame();
	
	public static OnePanel one_panel 					= new OnePanel(new Color(245,245,245));
	public static OneLabel one_label 					= new OneLabel(new Runnable(){public void run(){}},All_img.panel1_function,720,400,35,25);
	public static OneLabel one_button_회원가입 			= new OneLabel(new Runnable(){public void run(){logic_interface.회원가입();}},All_img.panel1_button_회원가입,130,60,45,460);
	public static OneLabel one_button_로그인				= new OneLabel(new Runnable(){public void run(){logic_interface.로그인하기();}},All_img.panel1_button_로그인,130,60,235,460);
	public static OneLabel one_button_승률보기 			= new OneLabel(new Runnable(){public void run(){logic_interface.인원별승률보기();}},All_img.panel1_button_승률보기,130,60,415,460);
	
	public static OneLabel one_button_게임종료하기			= new OneLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel1_button_게임종료하기,130,60,605,460);	
	
	public static TwoPanel 	   Two_panel 		  		= new TwoPanel(new Color(255,255,205));
	public static TwoLabel_png Two_label 		  		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_function,750,510,15,25);
	public static TwoLabel_png Two_중복검사 		  		= new TwoLabel_png(new Runnable(){public void run(){logic_interface.가입전아이디중복조회();}},All_img.panel2_label_png_중복검사,130,60,475,220);
	public static TwoLabel_String Two_설명 		  		= new TwoLabel_String("",340,60,120,200);
	
	public static TwoTextFieid text 					= new TwoTextFieid(480,60,120,150);
	public static TwoPassFieid pass1					= new TwoPassFieid(480,60,120,250);
	public static TwoPassFieid pass2 					= new TwoPassFieid(480,60,120,320);
	
	public static TwoLabel_png Two_label_check1    		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_check,34,34,610,160);
	public static TwoLabel_png Two_label_check2    		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_check,34,34,610,260);
	public static TwoLabel_png Two_label_check3    		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_check,34,34,610,330);
	
	public static TwoLabel_png Two_label_writer	  		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon 		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_lavel_writer2		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon2 		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_lavel_writer3		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon3 		= new TwoLabel_png(new Runnable(){public void run(){}},All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_button_회원가입 		= new TwoLabel_png(new Runnable(){public void run(){new File_Writer().file_writer(new Name_server(text.getText()).name(), pass1.getText(), new Name_server(text.getText()).server()); logic_interface.로그인하기();}},All_img.panel1_button_회원가입,130,60,480,410);
	public static TwoLabel_png Two_button_종료하기 		= new TwoLabel_png(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel2_label_png_게임종료하기,130,60,350,410);
	public static TwoLabel_png Two_button_메인가기 		= new TwoLabel_png(new Runnable(){public void run(){logic_interface.메인페이지();}},All_img.panel2_label_png_메인화면가기,130,60,220,410);
	
	public static ThreePanel   Three_panel 	 	 		= new ThreePanel(new Color(255,255,205));
	public static ThreeLabel   Three_label 	  			= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel3_function,800,570,0,0);
	public static TwoLabel_String three_설명 		  		= new TwoLabel_String("",360,60,120,320);
	
	public static ThreeTextFieid Three_text 			= new ThreeTextFieid(480,60,120,170);
	public static ThreePassFieid Three_pass				= new ThreePassFieid(480,60,120,270);
	public static ThreeLabel 	 Three_label_login  	= new ThreeLabel(new Runnable(){public void run(){if(logic_interface.로그인()) {logic_interface.로그인후화면();}}},All_img.panel3_로그인버튼,130,120,610,185);
	
	public static ThreeLabel Three_label_check1  		= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_png_check,34,34,610,185);
	public static ThreeLabel Three_label_check2  		= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_png_check,34,34,610,285);
	
	public static ThreeLabel Three_label_writer			= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_gif_fill,34,34,430,14);
	public static ThreeLabel Three_label_inputnon 		= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_png_null,34,34,430,14);	

	public static ThreeLabel Three_label_writer2		= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_gif_fill,34,34,430,14);
	public static ThreeLabel Three_label_inputnon2		= new ThreeLabel(new Runnable(){public void run(){}},All_img.panel2_label_png_null,34,34,430,14);	

	public static ThreeLabel Three_button_종료하기 		= new ThreeLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel2_label_png_게임종료하기,130,60,480,410);
	public static ThreeLabel Three_button_메인가기 		= new ThreeLabel(new Runnable(){public void run(){logic_interface.메인페이지();}},All_img.panel2_label_png_메인화면가기,130,60,350,410);
	public static ThreeLabel Three_button_회원가입 		= new ThreeLabel(new Runnable(){public void run(){logic_interface.회원가입();}},All_img.panel1_button_회원가입,130,60,220,410);
	
	public static FourPanel  four_panel 		  		= new FourPanel(new Color(255,255,205));
	public static FourLabel  four_label 		  		= new FourLabel(new Runnable(){public void run(){}},All_img.panel4_function,810,570,-10,0);
	
	public static FourLabel_String  four_rank1 			= new FourLabel_String("",600,20,65,195);
	public static FourLabel_String  four_rank2 			= new FourLabel_String("",600,20,65,225);
	public static FourLabel_String  four_rank3 			= new FourLabel_String("",600,20,65,255);
	public static FourLabel_String  four_rank4 			= new FourLabel_String("",600,20,65,285);
	public static FourLabel_String  four_rank5 			= new FourLabel_String("",600,20,65,315);
	public static FourLabel_String  four_rank6 			= new FourLabel_String("",600,20,65,345);
	public static FourLabel_String  four_rank7 			= new FourLabel_String("",600,20,65,375);
	public static FourLabel_String  four_rank8 			= new FourLabel_String("",600,20,65,405);
	public static FourLabel_String  four_rank9 			= new FourLabel_String("",600,20,65,435);
	public static FourLabel_String  four_rank10 		= new FourLabel_String("",600,20,65,465);
	
	public static FourLabel  four_label_종료하기 			= new FourLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel2_label_png_게임종료하기,130,60,660,480);
	public static FourLabel  four_label_내림차순 			= new FourLabel(new Runnable(){public void run(){new RankSystem().playRank();}},All_img.panel4_내림차순,130,60,660,340);
	public static FourLabel  four_label_오름차순 			= new FourLabel(new Runnable(){public void run(){new RankSystem().playRank_reversed();}},All_img.panel4_오름차순,130,60,660,270);
	
	public static FourLabel  four_label_퍼센테이지오름		= new FourLabel(new Runnable(){public void run(){new RankSystem().playRank_ASC();}},All_img.panel4_승률올림,130,60,660,200);
	public static FourLabel  four_label_퍼센테이지내림 		= new FourLabel(new Runnable(){public void run(){new RankSystem().playRank_DESC();}},All_img.panel4_승률내림,130,60,660,130);
	public static FourLabel  four_label_메인가기 			= new FourLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.메인페이지();}},All_img.panel2_label_png_메인화면가기,130,60,660,410);
	
	public static FivePanel  Five_panel 		  		= new FivePanel(new Color(255,255,205));
	public static FiveLabel  Five_label 		  		= new FiveLabel(new Runnable(){public void run(){}},All_img.panel5_function,810,570,-10,0);
	
	public static FiveLabel  Five_label_user 			= new FiveLabel(new Runnable(){public void run(){}},All_img.panel5_label_user,320,310,50,80);
	public static FiveLabel  Five_label_com 			= new FiveLabel(new Runnable(){public void run(){}},All_img.panel5_label_com ,221,55,520,100);
	public static FiveLabel  Five_Label_chat 			= new FiveLabel(new Runnable(){public void run(){}},All_img.panel5_label_chat,780,170,12,390);
	public static FiveLabel  Five_Label_주먹 				= new FiveLabel(new Runnable(){public void run(){logic_interface.바위(); logic_interface.유윈_로즈();}},All_img.panel5_label_바위,90,140,472,15);
	public static FiveLabel  Five_Label_가위 				= new FiveLabel(new Runnable(){public void run(){logic_interface.가위(); logic_interface.유윈_로즈();}},All_img.panel5_label_가위,90,140,572,15);
	public static FiveLabel  Five_Label_보 				= new FiveLabel(new Runnable(){public void run(){logic_interface.보(); logic_interface.유윈_로즈();}},All_img.panel5_label_보,90,140,672,15);
	public static FiveLabel_String  Five_Label_text 	= new FiveLabel_String("",425,140,20,0);
	
	public static SixPanel   Six_panel 		  			= new SixPanel(new Color(255,255,205));
	public static SixLabel   Six_label	 	 			= new SixLabel(new Runnable(){public void run(){}},All_img.panel6_label,810,570,-10,0);
	public static SixLabel   Six_label_box   	  		= new SixLabel(new Runnable(){public void run(){}},All_img.panel1_button_박스,350,100,440,470);
	
	public static SixLabel_String Six_label_lose   		= new SixLabel_String("",600,200,110,20);
	
	public static SixLabel   Six_button_종료하기 	    	= new SixLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel2_label_png_게임종료하기,130,50,20,23);
	public static SixLabel   Six_button_메인가기 	    	= new SixLabel(new Runnable(){public void run(){logic_interface.메인페이지();}},All_img.panel2_label_png_메인화면가기,130,50,190,23);
	public static SixLabel   Six_button_계속하기 	    	= new SixLabel(new Runnable(){public void run(){logic_interface.thread_stop[0] = true; logic_interface.전투모션(); }},All_img.panel7_label_게임시작,130,130,45,430);
	
	public static SevenPanel Seven_panel 		  		= new SevenPanel(new Color(255,255,255,255));
	public static SevenLabel Seven_label	 	 		= new SevenLabel(new Runnable(){public void run(){}},All_img.panel1_function,720,400,35,25);
	
	public static SevenLabel Seven_button_로그아웃 		= new SevenLabel(new Runnable(){public void run(){logic_interface.id[0] = "0";if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.메인페이지();}},All_img.panel7_label_로그아웃,130,60,190,480);
	public static SevenLabel Seven_button_승률보기 		= new SevenLabel(new Runnable(){public void run(){logic_interface.인원별승률보기();}},All_img.panel1_button_승률보기,130,60,491,480);
	public static SevenLabel Seven_button_게임종료하기		= new SevenLabel(new Runnable(){public void run(){if(logic_interface.id[0] == "0"){}else {new File_modify().modify();}logic_interface.게임종료();}},All_img.panel1_button_게임종료하기,130,60,340,480);	
	public static SevenLabel Eight_탈퇴이동				= new SevenLabel(new Runnable(){public void run(){logic_interface.회원탈퇴화면();}},All_img.panel8_label_회원탈퇴,130,60,640,480);	
	public static SevenLabel Seven_button_상자			= new SevenLabel(new Runnable(){public void run(){logic_interface.전투모션();}},All_img.panel7_label_게임시작,130,130,45,425);	
	
	public static EightPanel Eight_패널					= new EightPanel(new Color(255,255,255,255));
	public static EightLabel Eight_회원탈퇴배경				= new EightLabel(new Runnable(){public void run(){}},null,800,670,0,0);	
	public static Eight_String Eight_설명라벨 		  		= new Eight_String("회원탈퇴가 필요하시면 버튼을 누른후 패스워드를 입력해 주세요",700,60,10,10);
	public static EightLabel Eight_탈퇴버튼				= new EightLabel(new Runnable(){public void run(){ All_Interface.Eight_탈퇴버튼.setVisible(false); All_Interface.Eight_pass.setVisible(true); All_Interface.Eight_진짜탈퇴합니까.setVisible(true);}},All_img.panel8_label_회원탈퇴,130,60,300,80);	
	public static EightLabel Eight_진짜탈퇴합니까   		= new EightLabel(new Runnable(){public void run() {new File_modify().아이디삭제(new Crypt().encryptPass(Eight_pass.getText()).toString());		}},All_img.panel8_label_삭제,370,60,180,350);
	public static EightLabel  Eight_메인가기 	 			= new EightLabel(new Runnable(){public void run(){logic_interface.메인페이지();}},All_img.panel2_label_png_메인화면가기,130,60,100,80);
	public static EightPassFieid Eight_pass        		= new EightPassFieid(480,60,120,250);
	
	
	public static void panel_add() {
		main_frame.add(one_panel);
		main_frame.add(Two_panel);
		main_frame.add(Three_panel);
		main_frame.add(four_panel);
		main_frame.add(Five_panel);
		main_frame.add(Six_panel);
		main_frame.add(Seven_panel);
		main_frame.add(Eight_패널);
	}
	
	public static void label_add() {
		one_panel.add(one_label);
		Two_panel.add(Two_label);
		Three_panel.add(Three_label);	
		four_panel.add(four_label);	
		Five_panel.add(Five_label);
		Six_panel.add(Six_label);
		Seven_panel.add(Seven_label);
		Eight_패널.add(Eight_회원탈퇴배경);
	}
	
	public static void button_add() {
		
		one_panel.add(one_button_회원가입);
		one_panel.add(one_button_로그인);
		one_panel.add(one_button_승률보기);
		one_panel.add(one_button_게임종료하기);
		
		Two_label.add(Two_중복검사);
		Two_label.add(Two_설명);
	
		Two_label.add(text);
		Two_label.add(pass1);
		Two_label.add(pass2);
		
		Two_label.add(Two_label_check1);
		Two_label.add(Two_label_check2);
		Two_label.add(Two_label_check3);
	
		Two_label.add(Two_button_회원가입);
		Two_label.add(Two_button_메인가기);
		Two_label.add(Two_button_종료하기);
		
		Three_label.add(three_설명);
		Three_label.add(Three_text);
		Three_label.add(Three_pass);
		Three_label.add(Three_label_login);
	
		Three_label.add(Three_button_메인가기);
		Three_label.add(Three_button_종료하기);
		Three_label.add(Three_button_회원가입);
		
		four_label.add(four_label_메인가기);
		four_label.add(four_label_종료하기);
		
		four_label.add(four_rank1);
		four_label.add(four_rank2);
		four_label.add(four_rank3);
		four_label.add(four_rank4);
		four_label.add(four_rank5);
		four_label.add(four_rank6);
		four_label.add(four_rank7);
		four_label.add(four_rank8);
		four_label.add(four_rank9);
		four_label.add(four_rank10);
		
		four_label.add(four_label_오름차순); 
		four_label.add(four_label_내림차순);
		four_label.add(four_label_퍼센테이지오름);
		four_label.add(four_label_퍼센테이지내림);
		
		Five_label.add(Five_label_user);
		Five_label.add(Five_label_com);
		Five_label.add(Five_Label_chat);
		
		Five_Label_chat.add(Five_Label_주먹); 	
		Five_Label_chat.add(Five_Label_가위);
		Five_Label_chat.add(Five_Label_보);
		Five_Label_chat.add(Five_Label_text);
		
		Six_label.add(Six_label_box);
		Six_label.add(Six_label_lose);
		Six_label.add(Six_button_계속하기);
		
		Seven_panel.add(Seven_button_로그아웃);
		Seven_panel.add(Seven_button_게임종료하기);
		Seven_panel.add(Seven_button_승률보기);
		Seven_panel.add(Seven_button_상자);
		Seven_panel.add(Eight_탈퇴이동);
		
		Eight_회원탈퇴배경.add(Eight_설명라벨 );
		Eight_회원탈퇴배경.add(Eight_탈퇴버튼 );
		Eight_회원탈퇴배경.add(Eight_진짜탈퇴합니까);
		Eight_회원탈퇴배경.add(Eight_pass); 
		Eight_회원탈퇴배경.add(Eight_메인가기);
		
	}
	
	public static void icon_add(){
	
		text.add(Two_label_writer);
		text.add(Two_label_inputnon);
		
		pass1.add(Two_lavel_writer2);
		pass1.add(Two_label_inputnon2);
		
		pass2.add(Two_lavel_writer3);
		pass2.add(Two_label_inputnon3);
		
		Six_label_box.add(Six_button_종료하기);
		Six_label_box.add(Six_button_메인가기);
		
	}
	
	
	
	
	
}
