import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JAction2 extends JFrame implements ActionListener{
	JLabel label=new JLabel("Enter your name");
	JTextField field=new JTextField(12);
	JButton button=new JButton("OK");
	
	public JAction2(){
		super("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(label);
		add(field);
		add(button);
		button.addActionListener(this);
		field.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event){
		Object source=event.getSource();
		if(source==button)
			label.setText("You clicked the button.");
		else
			label.setText("You pressed Enter.");
	}
	
	public static void main(String[]args){
		JAction2 aFrame=new JAction2();
		final int WIDTH=250;
		final int HEIGHT=100;
		aFrame.setBounds(450,275,WIDTH,HEIGHT);
		aFrame.setVisible(true);
	}
}