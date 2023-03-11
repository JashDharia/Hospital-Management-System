package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class Login extends JFrame{
	
	JFrame jf2 = new JFrame();
	JButton back = new JButton("back");
	JButton new_details = new JButton("add/edit details");
	JButton timeTable = new JButton("timeTable");
    JPanel buttonPanel = new JPanel();
	Login() {
		jf2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf2.setSize(500,500);
		jf2.setVisible(true);
		
		back.setBounds(10,20,100,30);	
		new_details.setBounds(10,55,100,30);
		timeTable.setBounds(10,90,50,30);
		        
		buttonPanel.add(back);
        buttonPanel.add(new_details);
        buttonPanel.add(timeTable);
        jf2.add(buttonPanel);
        setSize(399,399);
        jf2.setSize(500,500);
        
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            new launcher();
            jf2.dispose();
            }
        });
        timeTable.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new DocSearch();
        		jf2.dispose();
        	}
        });
	}
	public static void main(String[] args) {
		new Login();
	}
}