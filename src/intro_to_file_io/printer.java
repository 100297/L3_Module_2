package intro_to_file_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("src/intro_to_file_io/test3.txt");
			int c = fr.read();
			while(c != -1){
				System.out.print((char)c);
				c = fr.read();
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
