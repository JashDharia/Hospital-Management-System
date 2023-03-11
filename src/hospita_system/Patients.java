package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class Patients extends JFrame{
	
	JFrame jf3 = new JFrame();
	JButton back = new JButton("Back");
	JButton pastPatients = new JButton("past Patients");
	JButton patients = new JButton("new patient");
	JButton reports = new JButton("reports");
	Patients() {
		jf3.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf3.setSize(500,500);
		jf3.setVisible(true);
		
		back.setBounds(10,20,100,30);	
		reports.setBounds(10,55,100,30);
		patients.setBounds(10,90,100,30);
		pastPatients.setBounds(10,125,100,30);
		
		jf3.setLayout(new BorderLayout());
		jf3.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\doc2.jpg")));
        jf3.setLayout(new FlowLayout());
        
        
		//jf3.add(reports);
        jf3.add(back);
        jf3.add(patients);
        jf3.add(pastPatients);
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
            	new Insert();
            	jf3.dispose();
            }
        });
        pastPatients.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new PatSearch();
            	jf3.dispose();
            }
        });
	}
	public static void main(String[] args) {
		new Patients();
	}
}

