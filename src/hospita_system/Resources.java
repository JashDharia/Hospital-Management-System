package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class Resources extends JFrame{
	
	JFrame jf3 = new JFrame();
	JButton back = new JButton("Back");
	JButton invent = new JButton("inventory");
	JButton patients = new JButton("new");
	Resources() {
		jf3.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf3.setSize(500,500);
		jf3.setVisible(true);
		
		back.setBounds(10,20,100,30);	
		//.setBounds(10,55,100,30);
		patients.setBounds(10,90,100,30);
		invent.setBounds(10,125,100,30);
		
		jf3.setLayout(new BorderLayout());
		jf3.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\doc2.jpg")));
        jf3.setLayout(new FlowLayout());
        
        
		//jf3.add(reports);
        jf3.add(back);
        jf3.add(patients);
        jf3.add(invent);
        //setSize(399,399);
        jf3.setSize(500,500);
        
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new launcher();
            	jf3.dispose();
            }
        });
        patients.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new NewResource();
            	jf3.dispose();
            }
        });
        invent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new ResSearch();
            	jf3.dispose();
            }
        });
	}
	public static void main(String[] args) {
		new Resources();
	}
}

