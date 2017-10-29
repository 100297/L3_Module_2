package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
	public String tet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toDoList a = new toDoList();
		a.activate();
	}

	void activate() {
		fram = new JFrame();
		pan = new JPanel();
		add = new JButton();
		remove = new JButton();
		load = new JButton();
		fram.add(pan);
		pan.add(add);
		pan.add(remove);
		pan.add(load);
		add.setText("add");
		remove.setText("remove");
		load.setText("load");
		fram.pack();
		fram.setVisible(true);
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
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/test4.txt", true);
				fw.write("\n" + tet);
				fw.close();
			} catch (IOException e1) {
			}
		} else if(e.getSource()==remove){
			for (int i = 0; i < tet.length(); i++) {
				try {
					FileReader fr = new FileReader("src/intro_to_file_io/test4.txt");
					int c = fr.read();
					String newf = "";
					boolean hasread = false;
					while(c != -1){
						if((char)c == '\n') {
							hasread = true;
							//c = fr.read();
						}
						//System.out.print((char)c);
						c = fr.read();
						
					}
					fr.close();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				}
			}
		}
	}


