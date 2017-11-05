package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.soap.Text;

public class toDoList implements ActionListener {

	JFrame fram;
	JPanel pan;
	JButton add;
	JButton remove;
	JButton load;
	JButton save;
	public String tet;
	ArrayList<String> names;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toDoList a = new toDoList();
		a.activate();
	}

	void activate() {
		names = new ArrayList<String>();
		fram = new JFrame();
		pan = new JPanel();
		add = new JButton();
		remove = new JButton();
		load = new JButton();
		save = new JButton();
		fram.add(pan);
		pan.add(save);
		pan.add(add);
		pan.add(remove);
		pan.add(load);
		add.setText("add");
		remove.setText("remove");
		load.setText("load");
		fram.pack();
		save.setText("save");
		fram.setVisible(true);
		save.addActionListener(this);
		add.addActionListener(this);
		remove.addActionListener(this);
		load.addActionListener(this);
		fram.setDefaultCloseOperation(3);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == add) {
			tet = JOptionPane.showInputDialog("Type some text");
			names.add(tet);
			System.out.println(names);
		} else if (e.getSource() == remove) {
			if (names != null) {
				names.remove(names.size() - 1);
				System.out.println(names);
			}
		} else if (e.getSource() == save) {
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/test4.txt");
			for (int i = 0; i < names.size(); i++) {
				fw.write(names.get(i) + "\n");
			}	
				
			
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (e.getSource() == load) {
			String file = JOptionPane.showInputDialog("What is the file you want to load");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = br.readLine();
				while(line != null) {
					
					names.add(line);
					line = br.readLine();
				}
				
				
				br.close();
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
	}
}
