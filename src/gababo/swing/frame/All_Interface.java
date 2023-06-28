package gababo.swing.frame;

import java.awt.Color;

import gababo.swing.panel_01.*;
import gababo.swing.panel_02.*;
//import gababo.swing.panel_03.*;
//import gababo.swing.panel_04.*;
//import gababo.swing.panel_05.*;

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
	public static TwoLabel_png Two_label 		  	= new TwoLabel_png(All_img.panel2_function,750,510,15,30);
	public static TwoLabel_gif Two_lavel_check    	= new TwoLabel_gif(All_img.panel2_label_gif_check,100,100,0,100);
	public static TwoLabel_gif Two_lavel_writer	  	= new TwoLabel_gif(All_img.panel2_label_gif_write,100,100,0,0);
	public static TwoLabel_gif Two_label_inputnon 	= new TwoLabel_gif(All_img.panel2_label_gif_null,100,100,0,0);	
	public static TwoLabel_gif Two_label_loll 		= new TwoLabel_gif(All_img.panel2_label_gif_loll,100,100,0,0);	
	public static TwoTextFieid text 				= new TwoTextFieid(280,60,150,200);
	public static TwoPassFieid pass 				= new TwoPassFieid(280,60,150,300);
	
	
	public static void panel_add() {
		main_frame.add(one_panel);
		main_frame.add(Two_panel);
	}
	
	public static void label_add() {
		one_panel.add(one_label);
		Two_panel.add(Two_label);
			
	}
	
	public static void button_add() {
		one_panel.add(one_button_회원가입);
		one_panel.add(one_button_로그인);
		one_panel.add(one_button_승률보기);
		one_panel.add(one_button_플레이순위);
		one_panel.add(one_button_게임종료하기);
		
		Two_panel.add(Two_label);
		Two_panel.add(text);
		Two_panel.add(pass);
		Two_panel.add(Two_lavel_check);
		Two_panel.add(Two_lavel_writer);
		Two_panel.add(Two_label_inputnon);
		Two_panel.add(Two_label_loll);
	}
	
	
	
	
}
