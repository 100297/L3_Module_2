package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class fileIO {
public static void main(String[] args) {
	String text = JOptionPane.showInputDialog("Type some text");
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
		fw.write(text);
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	
}
}
