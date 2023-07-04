package gababo.sql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import gababo.logic.logic_interface;
import gababo.swing.frame.All_Interface;

public class File_modify {

	public File_modify(){};

	public void modify() {
		
		File Path = new File("src/id.txt"); 
        String target = logic_interface.id[0];
        
        if (target == "0") {}
        else {
	        try {
	       
	        	FileReader read = new FileReader(Path);
	        	BufferedReader buff = new BufferedReader(read);
	    		
	        	FileWriter Writer = new FileWriter(Path + ".tmp");
	        	BufferedWriter bufferedWriter = new BufferedWriter(Writer);
	    	
	        	String line;
	    		
	    		while ((line = buff.readLine()) != null ) {
				
	    			if(line.contains(target)) {
	    				line = logic_interface.id[0]+","+logic_interface.id[1]+","+logic_interface.id[2]+","+logic_interface.id[3]+","+logic_interface.id[4]+","+logic_interface.id[5]+","+logic_interface.id[6]+","+logic_interface.id[7]+","+logic_interface.id[8]+","+logic_interface.id[9];
	    				bufferedWriter.write(line);
	    				bufferedWriter.newLine();
	    				System.out.println(line);
	    			}
	    			
	    			else {
	    				bufferedWriter.write(line);
	    				bufferedWriter.newLine();
	    				
	    			}
	    		
	    		}
	    		bufferedWriter.flush();
	    		bufferedWriter.close();
	    		buff.close();
	    		read.close();
	    		Writer.close();
	        
	    		Path.delete();
	    		
	    		new File(Path + ".tmp").renameTo(new File(Path.getAbsolutePath()));
	    		
	        } 
	        catch (Exception e) {}
        
        	}
	};
	
	public void 아이디삭제(String pass) {
		
		File Path = new File("src/id.txt"); 
        String target = logic_interface.id[1];
        
        System.out.println(target);
        System.out.println(pass);
        
        if (!pass.equals(target)) { All_Interface.Eight_설명라벨.setText("비밀번호가 다릅니다. 제대로 입력하세요");}
        else {
	        try {
	       
	        	FileReader read = new FileReader(Path);
	        	BufferedReader buff = new BufferedReader(read);
	    		
	        	FileWriter Writer = new FileWriter(Path + ".tmp");
	        	BufferedWriter bufferedWriter = new BufferedWriter(Writer);
	    	
	        	String line;
	    		
	    		while ((line = buff.readLine()) != null ) {
				
	    			if(line.contains(logic_interface.id[0])) {
	    				//bufferedWriter.write(line);
	    				//bufferedWriter.newLine();
	    				System.out.println(line);
	    			}
	    			
	    			else {
	    				bufferedWriter.write(line);
	    				bufferedWriter.newLine();
	    				
	    			}
	    		
	    		}
	    		bufferedWriter.flush();
	    		bufferedWriter.close();
	    		buff.close();
	    		read.close();
	    		Writer.close();
	        
	    		Path.delete();
	    		
	    		new File(Path + ".tmp").renameTo(new File(Path.getAbsolutePath()));
	    		
	    		logic_interface.id[0] = "0";
	    		
	    		
	    		new File_Reader().File_reread();
	    		
	    		modify();
	    		
	    		logic_interface.메인페이지();
	    		
	        } 
	        catch (Exception e) {}
        
        	}
	};
		   
	        
	        
}
