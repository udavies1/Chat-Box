package chatBox;
import javax.swing.*;
import java.awt.*;


public class chatBox {

	public static void main(String[] args) {
	// creating the frame. 	
	JFrame  frame =	new JFrame("chat frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 400);
	
	// creating the menu bar and adding components.
	JMenuBar mb  = new JMenuBar();
	JMenu m1 = new JMenu("File");
	JMenu m2 = new JMenu("Help");
	mb.add(m1);
	mb.add(m2);
	JMenuItem m11 = new JMenuItem("Open");
	JMenuItem m22 = new JMenuItem( "Save as");
	m1.add(m11);
	m1.add(m22);

	
	// Creating the Panel at the botton and adding components.
	JPanel panel = new JPanel();
	JLabel le = new JLabel("Enter text");
	JTextField  tf = new JTextField(10);
	JButton send = new JButton("Send");
	JButton reset = new JButton("reset");
	panel.add(le);
	panel.add(tf);
	panel.add(send);
	panel.add(reset);
	
	
	// text area at the center
	JTextArea tx= new JTextArea();
	
	// Adding Components to frame.
	frame.getContentPane().add(BorderLayout.SOUTH, panel);
	frame.getContentPane().add(BorderLayout.NORTH, mb);
	frame.getContentPane().add(BorderLayout.CENTER, tx);
	frame.setVisible(true);
	
	
	
	
	
	
	
	
	}

}
