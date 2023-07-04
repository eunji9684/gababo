package gababo.sql;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class File_Writer {
	
	File file = null;
	FileWriter pw = null;
	
	public File_Writer() {};
	
	public void file_writer(String id,String pass,String server) {
		
		
		try {
			file = new File("src/id.txt");
			
			pw = new FileWriter(file,true);	
			
			pw.write(id + "," + new Crypt().encryptPass(pass) + "," + server + ",0" + ",0" + ",0"+ ",0"+ ",0," + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss"))+ ",null"  + "\n");
			
			pw.flush();
			
			pw.close();
		} 
		
		catch (Exception e) {System.out.println(e.getMessage());}
	}
}
