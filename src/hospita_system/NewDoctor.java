package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class NewDoctor extends JFrame implements ActionListener {
	 JFrame fr = new JFrame("enter details here");
	 Button b = new Button("Add doctor"); 
	 JButton back = new JButton("back");
	 JTextArea names=new JTextArea("");
	 Label l1 = new Label("doc name");
	 
	 JTextArea day = new JTextArea("");
	 Label l2 = new Label("day");
	 
	 JTextArea startTime = new JTextArea();
	 Label l4 = new Label("");
	 
	 Label l3 = new Label("EndTime");
	 JTextArea endTime = new JTextArea("");
	 
	 Label l = new Label("no data yet");
	 
	 public NewDoctor() {
       
		 fr.setLayout(new BorderLayout());
			fr.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\g.jpg")));
		   fr.setLayout(new FlowLayout());
	   l1.setBounds(10,30,100,20);
	   fr.add(l1);
	   names.setBounds(130,30, 100,20);  
       fr.add(names);
       
       
	   l2.setBounds(10,70,100,20);
	   fr.add(l2);
	   day.setBounds(130,70, 100,20);  
       fr.add(day);
       
       
	   l3.setBounds(10,110,100,20);
	   fr.add(l3);
	   startTime.setBounds(130,110, 100,20);  
       fr.add(startTime);
       
	   l4.setBounds(10,150,100,20);
	   fr.add(l4);
	   endTime.setBounds(130,150, 100,20);  
       fr.add(endTime);
       
	   b.setBounds(10,185,95,30);
	   fr.add(b);
	   b.addActionListener(this);
	   
       
	   back.setBounds(10,210,95,30);
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
	   fr.setSize(600,600);
	   fr.setLayout(null);
	   fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new NewDoctor();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String name = names.getText();
		String days = day.getText();
		String start_time = startTime.getText();
		String end_time = endTime.getText();
		System.out.println(name);
		server s = new server();
		s.addDoctor(name,days,start_time,end_time);
		}
}