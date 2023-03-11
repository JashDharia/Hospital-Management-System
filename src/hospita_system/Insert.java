package hospita_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class Insert extends JFrame implements ActionListener {
	 JFrame fr = new JFrame("enter details here");
	 Button b = new Button("Add patient"); 
	 JButton back = new JButton("back");
			 
	 JTextArea names=new JTextArea("");
	 Label l1 = new Label("name");
	 
	 JTextArea aadhar = new JTextArea("");
	 Label l2 = new Label("aadhar_no");
	 
	 JTextArea in = new JTextArea();
	 Label l4 = new Label("in");
	 
	 Label l3 = new Label("date");
	 JTextArea date = new JTextArea("");
	 
	 Label l = new Label("no data yet");
	 
	 public Insert() {
	   fr.setLayout(new BorderLayout());
	   fr.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\70344.jpg")));
	   fr.setLayout(new FlowLayout());
	   l1.setBounds(10,30,100,20);
	   fr.add(l1);
	   names.setBounds(130,30, 100,20);  
       fr.add(names);
       
       
	   l2.setBounds(10,70,100,20);
	   fr.add(l2);
	   aadhar.setBounds(130,70, 100,20);  
       fr.add(aadhar);
       
       
	   l3.setBounds(10,110,100,20);
	   fr.add(l3);
	   date.setBounds(130,110, 100,20);  
       fr.add(date);
       
	   l4.setBounds(10,150,100,20);
	   fr.add(l4);
	   in.setBounds(130,150, 100,20);  
       fr.add(in);
       
	   b.setBounds(10,185,95,30);
	   fr.add(b);
	   b.addActionListener(this);
	   back.setBounds(10,220,95,30);
	   fr.add(back);
	   back.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               //your actions
           new launcher();
           fr.dispose();
           }
       });
	   fr.add(l);
	   fr.setSize(500,500);
	   fr.setLayout(null);
	   fr.setVisible(true);
	   fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	 new Insert();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String name = names.getText();
		int aadhar_no = Integer.parseInt(aadhar.getText());
		String dat = date.getText();
		String in_date = in.getText();
		System.out.println(name);
		server s = new server();
		s.newPatient(name,aadhar_no,in_date,dat);
		}
}
