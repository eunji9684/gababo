package gababo.sql;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File_Writer {
	
	File file = null;
	FileWriter pw = null;
	
	public File_Writer() {};
	
	public void file_writer(String id,String pass,String server) {
		
		try {
			file = new File("src/id.txt");
			
			pw = new FileWriter(file,true);	
			
			pw.write(id + "," + pass + "," + server + ",0" + ",0" + ",0" + "\n");
			
			pw.flush();
			
			pw.close();
		} 
		
		catch (Exception e) {System.out.println(e.getMessage());}
	}
}
