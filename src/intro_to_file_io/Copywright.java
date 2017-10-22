package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Copywright {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
			fw.write("Copywright Zach");
			fw.close();
			FileWriter gw = new FileWriter("src/intro_to_file_io/test2.txt");
			gw.write("Copywright Zach");
			gw.close();
			FileWriter hw = new FileWriter("src/intro_to_file_io/test.txt");
			hw.write("Copywright Zach");
			hw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
