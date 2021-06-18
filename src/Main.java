import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		String csvFile = "";
		BufferedReader br = null;
		csvFile = "C:\\Users\\Bilel\\Desktop\\Triskell\\Triskell_Dev\\api\\triskell_int_CAAS\\CAAS_6_2021.CSV";
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream(csvFile), Charset.forName("UTF-8")));
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	}
	}

}
