package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class NewResource extends JFrame implements ActionListener {
	 JFrame fr = new JFrame("enter details here");
	 Button b = new Button("Add resource"); 
	 JButton back = new JButton("back");
	 JTextArea names=new JTextArea("");
	 Label l1 = new Label("name");
	 
	 JTextArea quant = new JTextArea("");
	 Label l2 = new Label("quant");
	 
	 JTextArea i = new JTextArea();
	 Label l4 = new Label("id");
	 
	 Label l3 = new Label("date");
	 JTextArea date = new JTextArea("");
	 

	 
	 Label l = new Label("no data yet");
	 
	 public NewResource() {
       
		 fr.setLayout(new BorderLayout());
			fr.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\medical.jpg")));
		   fr.setLayout(new FlowLayout());
		 l1.setBounds(10,30,100,20);
	   fr.add(l1);
	   names.setBounds(130,30, 100,20);  
       fr.add(names);
       
       
	   l2.setBounds(10,70,100,20);
	   fr.add(l2);
	   quant.setBounds(130,70, 100,20);  
       fr.add(quant);
       
       
	   l3.setBounds(10,110,100,20);
	   fr.add(l3);
	   date.setBounds(130,110, 100,20);  
       fr.add(date);
       
	   l4.setBounds(10,150,100,20);
	   fr.add(l4);
	   i.setBounds(130,150, 100,20);  
       fr.add(i);
       
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
	   fr.setSize(500,500);
	   fr.setLayout(null);
	   fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new NewResource();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String name = names.getText();
		String quantity = quant.getText();
		String dat = date.getText();
		String id = i.getText();
		System.out.println(name);
		server s = new server();
		s.addResource(id,name,quantity);
		}
}
