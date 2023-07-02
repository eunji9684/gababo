package gababo.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

import gababo.logic.logic_interface;
import gababo.swing.frame.All_Interface;

public class File_Reader {

	File read; 
	Reader reader;
	BufferedReader bufferedReader;
	String line;
	
	public File_Reader(){};
	
	public void File_read() {
		
		read = new File("src/id.txt");
		
		try {
			reader = new FileReader(read.getAbsolutePath());
			
			bufferedReader = new BufferedReader(reader);
			
			while ((line = bufferedReader.readLine()) != null) {
							
				logic_interface.id_pass.add(line.split(","));					
				
			}
			
		if(line == null) {
			bufferedReader.close();
			reader.close();
		};	
		
		} 
		catch (Exception e) {
			
			System.out.println("여기는 class file_Reader 입니다. " +e.getMessage());
		}	
	}
	
	public void File_reread() {
		
		logic_interface.id_pass.clear();
		
		read = new File("src/id.txt");
		
		try {
			reader = new FileReader(read.getAbsolutePath());
			
			bufferedReader = new BufferedReader(reader);
			
			while ((line = bufferedReader.readLine()) != null) {
							
				logic_interface.id_pass.add(line.split(","));					
				
			}
			
		if(line == null) {
			bufferedReader.close();
			reader.close();
		};	
		
		} 
		catch (Exception e) {
			
			System.out.println("여기는 class file_Reader 입니다. " +e.getMessage());
		}	
	}
}
