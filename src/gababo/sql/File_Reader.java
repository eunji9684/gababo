package gababo.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.text.DecimalFormat;

import gababo.logic.logic_interface;

//이클래스는 주어진 파일에서 데이터를 읽어와서 각 데이터를 처리하여
//배열에 저장하고, 이를 다시 리스트에 추가하는 역할을 합니다.
public class File_Reader {

	//File 객체를 선언합니다. 이 객체는 파일을 나타내는데 사용됩니다.
	File read; 
	//Reader 객체를 선언합니다. 파일에서 문자 단위로 읽을 때 사용됩니다.
	Reader reader;
	//BufferedReader 객체를 선언합니다. BufferedReader는 텍스트 파일에서 
	//효율적으로 문자열을 읽을 때 사용됩니다.
	BufferedReader bufferedReader;
	//문자열을 담기 위한 line 변수를 선언합니다. 파일에서 한 줄씩 읽을 때 사용됩니다.
	String line;
	
	//File_Reader 클래스의 생성자를 정의합니다. 현재는 빈 생성자로 구현되어 있습니다.
	public File_Reader(){};
	
	//File_read 메서드를 정의합니다. 파일을 읽고 데이터를 처리하는 로직이 이 메서드에 포함됩니다.
	public void File_read() {
		
		//read 객체를 생성하여 "src/id.txt" 경로의 파일을 나타냅니다. 이 파일을 읽을 것입니다.
		read = new File("src/id.txt");
		
		
		//파일 읽기 시도를 위한 try 블록을 시작합니다. 예외 처리를 위한 코드가 이어집니다.
		try {
			//FileReader 객체를 생성하여 read 파일을 읽을 준비를 합니다. 
			//getAbsolutePath() 메서드는 파일의 절대 경로를 가져옵니다.
			reader = new FileReader(read.getAbsolutePath());

			//BufferedReader 객체를 생성하여 reader로부터 읽을 준비를 합니다.
			//이렇게 함으로써 파일을 읽을 준비가 완료됩니다.
			bufferedReader = new BufferedReader(reader);
			
			//파일에서 한 줄씩 읽으면서 루프를 실행합니다.
			//bufferedReader.readLine()은 파일에서 한 줄씩 읽어옵니다.
			//null이 아닌 동안 계속 반복합니다. 
			while ((line = bufferedReader.readLine()) != null) {
				
				//길이가 10인 문자열 배열인 배열을 생성합니다.
				String[] 배열 = new String[10];
				
				//line 문자열을 쉼표(,)로 분리하고, 세 번째([3]), 네 번째([4]), 다섯 번째([5])
				//요소를 정수로 변환하여 연산합니다.
				//그 결과를 문자열로 변환하여 무승부 변수에 할당합니다.
				String 무승부 = Integer.toString((Integer.parseInt(line.split(",")[3]) - Integer.parseInt(line.split(",")[4]) -Integer.parseInt(line.split(",")[5])));
				
				//line 문자열을 쉼표(,)로 분리하고, 첫 번째([0]) 요소를 
				//배열의 첫 번째 요소에 할당합니다.
				//이후의 코드도 동일한 방식으로 나머지 요소들을 할당합니다.
				double 승률 =  ((Double.parseDouble((line.split(",")[4])) / Double.parseDouble(line.split(",")[3])));
						
				배열[0] = line.split(",")[0];
				배열[1] = line.split(",")[1];
				배열[2] = line.split(",")[2];
				배열[3] = line.split(",")[3];
				배열[4] = line.split(",")[4];
				배열[5] = line.split(",")[5];
				배열[6] = 무승부;
				
				//만약 승률 값이 NaN(Not-a-Number)이면, 배열의 일곱 번째 요소를 "0.00"으로 설정합니다.
				//그렇지 않으면 승률 값을 소수점 둘째 자리까지 포맷팅하여 배열의 일곱 번째 요소에 할당합니다.
				if(Double.isNaN(승률)) {배열[7] = "0.00"; } else {배열[7] = new DecimalFormat("0.00").format(승률);} 
				
				//line 문자열을 쉼표(,)로 분리하고, 아홉 번째([8]) 요소를 배열의 아홉 번째 요소에 할당합니다.
				배열[8] = line.split(",")[8];
				
				//logic_interface라는 객체의 id_pass 리스트에 배열을 추가합니다.
				logic_interface.id_pass.add(배열);		
				
			}//end of while
			
		//line 변수가 null인지 확인합니다. 파일을 모두 읽은 경우에 해당합니다.	
		if(line == null) {
			
			//bufferedReader를 닫습니다.
			//파일 읽기를 마친 후에는 항상 파일을 닫아야 합니다. 반.드.시
			bufferedReader.close();
			
			//reader를 닫습니다.
			//파일 읽기를 마친 후에는 항상 파일을 닫아야 합니다.반.드.시
			reader.close();
		};	
		
		} 
		catch (Exception e) {
			
			System.out.println("여기는 class file_Reader 입니다. " +e.getMessage());
		}	
	}
	
	//File_reread 메서드를 정의합니다.
	//파일을 다시 읽고 데이터를 처리하는 로직이 이 메서드에 포함됩니다.
	public void File_reread() {
		
		//logic_interface 객체의 id_pass 리스트를 초기화합니다. 
		//이전에 읽었던 데이터를 제거합니다.
		logic_interface.id_pass.clear();
		
		//read 객체를 생성하여 "src/id.txt" 경로의 파일을 나타냅니다.
		//이 파일을 다시 읽기.
			read = new File("src/id.txt");
		
		//파일 읽기 시도를 위한 try 블록을 시작합니다. 예외 처리를 위한 코드
		try {
			//FileReader 객체를 생성하여 read 파일을 읽을 준비를 합니다.
			//getAbsolutePath() 메서드는 파일의 절대 경로를 가져옵니다.
			reader = new FileReader(read.getAbsolutePath());
			
			//BufferedReader 객체를 생성하여 reader로부터 읽을 준비를 합니다.
			//이렇게 함으로써 파일을 읽을 준비가 완료됩니다.
			bufferedReader = new BufferedReader(reader);
			
			//파일에서 한 줄씩 읽으면서 루프를 실행합니다. 
			//bufferedReader.readLine()은 파일에서 한 줄씩 읽어옵니다.
			//null이 아닌 동안 계속 반복합니다.
			while ((line = bufferedReader.readLine()) != null) {
				
				//길이가 10인 문자열 배열인 배열을 생성합니다.
				String[] 배열 = new String[10];
				
				//line 문자열을 쉼표(,)로 분리하고, 세 번째([3]), 네 번째([4]), 다섯 번째([5]) 요소를
				//정수로 변환하여 연산합니다.
				//그 결과를 문자열로 변환하여 무승부 변수에 할당합니다.
				String 무승부 = Integer.toString((Integer.parseInt(line.split(",")[3]) - Integer.parseInt(line.split(",")[4]) -Integer.parseInt(line.split(",")[5])));
				
				//line 문자열을 쉼표(,)로 분리하고, 네 번째([4])와 세 번째([3])
				//요소를 실수로 변환하여 나누기 연산합니다.
				//그 결과를 승률 변수에 할당합니다.
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
		
		//line 변수가 null인지 확인합니다. 파일을 모두 읽은 경우에 해당합니다.	
		if(line == null) {
			
			//bufferedReader를 닫습니다.
			//파일 읽기를 마친 후에는 항상 파일을 닫아야 합니다. 반.드.시!!!!!!!
			bufferedReader.close();
			
			//reader를 닫습니다.
			//파일 읽기를 마친 후에는 항상 파일을 닫아야 합니다. 반.드.시!!!!!
			reader.close();
		};	
		
		} 
		//예외가 발생할 경우를 처리하는 catch 블록을 시작합니다.
		catch (Exception e) {
			
			//예외메세지 출력하기
			System.out.println("여기는 class file_Reader 2입니다. " +e.getMessage());
		}	
	}
}
