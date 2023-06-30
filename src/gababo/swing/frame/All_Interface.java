package gababo.swing.frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import gababo.swing.panel_01.*;
import gababo.swing.panel_02.*;
import gababo.swing.panel_03.*;
import gababo.swing.panel_04.*;
import gababo.swing.panel_05.*;

public interface All_Interface {

	public static MainFrame main_frame = new MainFrame();
	
	public static OnePanel one_panel 				= new OnePanel(new Color(245,245,245));
	public static OneLabel one_label 				= new OneLabel(All_img.panel1_function,720,400,35,25);
	public static OneLabel one_button_회원가입 		= new OneLabel(All_img.panel1_button_회원가입,130,60,45,460);
	public static OneLabel one_button_로그인			= new OneLabel(All_img.panel1_button_로그인,130,60,185,460);
	public static OneLabel one_button_승률보기 		= new OneLabel(All_img.panel1_button_승률보기,130,60,325,460);
	public static OneLabel one_button_플레이순위		= new OneLabel(All_img.panel1_button_플레이순위,130,60,465,460);	
	public static OneLabel one_button_게임종료하기		= new OneLabel(All_img.panel1_button_게임종료하기,130,60,605,460);	
	
	public static TwoPanel 	   Two_panel 		  	= new TwoPanel(new Color(255,255,205));
	public static TwoLabel_png Two_label 		  	= new TwoLabel_png(All_img.panel2_function,750,510,15,25);
	
	public static TwoTextFieid text 				= new TwoTextFieid(480,60,120,150);
	public static TwoPassFieid pass1				= new TwoPassFieid(480,60,120,250);
	public static TwoPassFieid pass2 				= new TwoPassFieid(480,60,120,320);
	
	public static TwoLabel_png Two_lavel_check1    	= new TwoLabel_png(All_img.panel2_label_png_check,34,34,610,160);
	public static TwoLabel_png Two_lavel_check2    	= new TwoLabel_png(All_img.panel2_label_png_check,34,34,610,260);
	public static TwoLabel_png Two_lavel_check3    	= new TwoLabel_png(All_img.panel2_label_png_check,34,34,610,330);
	
	public static TwoLabel_png Two_lavel_writer	  	= new TwoLabel_png(All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon 	= new TwoLabel_png(All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_lavel_writer2	= new TwoLabel_png(All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon2 	= new TwoLabel_png(All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_lavel_writer3	= new TwoLabel_png(All_img.panel2_label_gif_fill,34,34,430,14);
	public static TwoLabel_png Two_label_inputnon3 	= new TwoLabel_png(All_img.panel2_label_png_null,34,34,430,14);	

	public static TwoLabel_png Two_button_종료하기 	= new TwoLabel_png(All_img.panel2_label_png_게임종료하기,130,60,480,410);
	public static TwoLabel_png Two_button_메인가기 	= new TwoLabel_png(All_img.panel2_label_png_메인화면가기,130,60,350,410);
	
	public static ThreePanel   Three_panel 	 	 	= new ThreePanel(new Color(255,255,205));
	public static ThreeLabel   Three_label 	  		= new ThreeLabel(All_img.panel2_function,750,510,15,25);
	
	public static ThreeTextFieid Three_text 		= new ThreeTextFieid(480,60,120,170);
	public static ThreePassFieid Three_pass			= new ThreePassFieid(480,60,120,270);
	
	public static ThreeLabel Three_lavel_check1  	= new ThreeLabel(All_img.panel2_label_png_check,34,34,610,185);
	public static ThreeLabel Three_lavel_check2  	= new ThreeLabel(All_img.panel2_label_png_check,34,34,610,285);
	
	public static ThreeLabel Three_lavel_writer		= new ThreeLabel(All_img.panel2_label_gif_fill,34,34,430,14);
	public static ThreeLabel Three_label_inputnon 	= new ThreeLabel(All_img.panel2_label_png_null,34,34,430,14);	

	public static ThreeLabel Three_lavel_writer2	= new ThreeLabel(All_img.panel2_label_gif_fill,34,34,430,14);
	public static ThreeLabel Three_label_inputnon2	= new ThreeLabel(All_img.panel2_label_png_null,34,34,430,14);	

	public static ThreeLabel Three_button_종료하기 	= new ThreeLabel(All_img.panel2_label_png_게임종료하기,130,60,480,410);
	public static ThreeLabel Three_button_메인가기 	= new ThreeLabel(All_img.panel2_label_png_메인화면가기,130,60,350,410);
	public static ThreeLabel Three_button_회원가입 	= new ThreeLabel(All_img.panel1_button_회원가입,130,60,220,410);
	
	public static FourPanel  four_panel 		  	= new FourPanel(new Color(255,255,205));
	public static FourLabel  four_label 		  	= new FourLabel(All_img.panel4_function,810,570,-10,0);
	
	public static FivePanel  Five_panel 		  	= new FivePanel(new Color(255,255,205));
	public static FiveLabel  Five_label 		  	= new FiveLabel(All_img.panel5_function,810,570,-10,0);
	
	public static FiveLabel  Five_label_user 		= new FiveLabel(All_img.panel5_label_user,320,310,50,125);
	public static FiveLabel  Five_label_com 		= new FiveLabel(All_img.panel5_label_com ,221,55,520,130);
	public static FiveLabel  Five_Label_chat 		= new FiveLabel(All_img.panel5_label_chat,780,170,12,390);
	
	public static void panel_add() {
		main_frame.add(one_panel);
		main_frame.add(Two_panel);
		main_frame.add(Three_panel);
		main_frame.add(four_panel);
		main_frame.add(Five_panel);
	
	}
	
	public static void label_add() {
		one_panel.add(one_label);
		Two_panel.add(Two_label);
		Three_panel.add(Three_label);	
		four_panel.add(four_label);	
		Five_panel.add(Five_label);	
	}
	
	public static void button_add() {
		
		one_panel.add(one_button_회원가입);
		one_panel.add(one_button_로그인);
		one_panel.add(one_button_승률보기);
		one_panel.add(one_button_플레이순위);
		one_panel.add(one_button_게임종료하기);
		
		Two_panel.add(Two_label);
		
		Two_label.add(text);
		Two_label.add(pass1);
		Two_label.add(pass2);
		
		Two_label.add(Two_lavel_check1);
		Two_label.add(Two_lavel_check2);
		Two_label.add(Two_lavel_check3);
	
		Two_label.add(Two_button_메인가기);
		Two_label.add(Two_button_종료하기);
		
		Three_panel.add(Three_label);
		
		Three_label.add(Three_text);
		Three_label.add(Three_pass);
		
		Three_label.add(Three_lavel_check1);
		Three_label.add(Three_lavel_check2);
	
		Three_label.add(Three_button_메인가기);
		Three_label.add(Three_button_종료하기);
		Three_label.add(Three_button_회원가입);
		
		Five_label.add(Five_label_user);
		Five_label.add(Five_label_com);
		Five_label.add(Five_Label_chat);
		
	}
	
	public static void icon_add(){
		
		
		text.add(Two_lavel_writer);
		text.add(Two_label_inputnon);
		
		pass1.add(Two_lavel_writer2);
		pass1.add(Two_label_inputnon2);
		
		pass2.add(Two_lavel_writer3);
		pass2.add(Two_label_inputnon3);
		
	}
	
	
	
}
