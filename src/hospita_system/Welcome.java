package hospita_system;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome {
	JFrame jf1 = new JFrame();
	JPanel buts = new JPanel();
	JLabel l = new JLabel("WELCOME!");
	JButton doctors = new JButton("next");
	Welcome() {
		//jf1.setDefaultCloseOperation(E);
		jf1.setSize(500,500);
		jf1.setVisible(true);
		
		doctors.setBounds(10,20,100,30);	
		/*reports.setBounds(10,55,100,30);
		patients.setBounds(10,90,100,30);
		resources.setBounds(10,125,100,30);
		*/
		
		jf1.setLayout(new BorderLayout());
		jf1.setContentPane(new JLabel(new ImageIcon("c:\\pics\\b.jpg")));
        jf1.setLayout(new FlowLayout());
        
		//buts.add(reports);
        buts.add(doctors);
        //buts.add(patients);
        //buts.add(resources);
        jf1.add(l);
        jf1.add(buts);
        jf1.setSize(500,500);
        
        doctors.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new launcher();
            	jf1.dispose();
            }
        });
        /*patients.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new Patients();
            	jf1.dispose();
            }
        });
        resources.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new Resources();
            	jf1.dispose();
            }
        });
        */
	}
	public static void main(String[] args) {
		new Welcome();
	}
}
