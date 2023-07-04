package gababo.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.text.DecimalFormat;

import gababo.logic.logic_interface;

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
				
				String[] 배열 = new String[10];		
				
				String 무승부 = Integer.toString((Integer.parseInt(line.split(",")[3]) - Integer.parseInt(line.split(",")[4]) -Integer.parseInt(line.split(",")[5])));
				
				double 승률 =  ((Double.parseDouble((line.split(",")[4])) / Double.parseDouble(line.split(",")[3])));
						
				배열[0] = line.split(",")[0];
				배열[1] = line.split(",")[1];
				배열[2] = line.split(",")[2];
				배열[3] = line.split(",")[3];
				배열[4] = line.split(",")[4];
				배열[5] = line.split(",")[5];
				배열[6] = 무승부;
				
				if(Double.isNaN(승률)) {배열[7] = "0.00"; } else {배열[7] = new DecimalFormat("0.00").format(승률);} 
				
				배열[8] = line.split(",")[8];

				logic_interface.id_pass.add(배열);		
				
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
				
				String[] 배열 = new String[10];
				
				String 무승부 = Integer.toString((Integer.parseInt(line.split(",")[3]) - Integer.parseInt(line.split(",")[4]) -Integer.parseInt(line.split(",")[5])));
				
				double 승률 =  ((Double.parseDouble((line.split(",")[4])) / Double.parseDouble(line.split(",")[3])));
						
				배열[0] = line.split(",")[0];
				배열[1] = line.split(",")[1];
				배열[2] = line.split(",")[2];
				배열[3] = line.split(",")[3];
				배열[4] = line.split(",")[4];
				배열[5] = line.split(",")[5];
				배열[6] = 무승부;
				
				if(Double.isNaN(승률)) {배열[7] = "0.00"; } else {배열[7] = new DecimalFormat("0.00").format(승률);} 
				
				배열[8] = line.split(",")[8];

				logic_interface.id_pass.add(배열);		
				
			}
			
		if(line == null) {
			bufferedReader.close();
			reader.close();
		};	
		
		} 
		catch (Exception e) {
			
			
			System.out.println("여기는 class file_Reader 2입니다. " +e.getMessage());
		}	
	}
}
