package hospita_system;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ResSearch {
	private static final int EXIT_ON_CLOSE = 0;
	JFrame jf5 = new JFrame();
	JTextArea s = new JTextArea(1,20);
	JButton back = new JButton("back");
	JButton new_details = new JButton("add/edit details");
	JButton timeTable = new JButton("timeTable");
    JButton searc = new JButton("search");
	JPanel buttonPanel = new JPanel();
    JPanel searchPanel = new JPanel();
    JTable table = new JTable(new DefaultTableModel(new Object[]{"id","name","quant"}, 0));
    JScrollPane scrollPane = new JScrollPane(table);
    ResSearch() {
		jf5.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf5.setSize(500,500);
		jf5.setVisible(true);
		
		back.setBounds(10,20,100,30);	
		new_details.setBounds(10,55,100,30);
		timeTable.setBounds(10,90,50,30);
		        
		buttonPanel.add(s);
		buttonPanel.add(searc);
		buttonPanel.add(back);
        
        jf5.add(buttonPanel);
        
        
        //jf5.add(table);
        scrollPane.getViewport().setViewPosition(new Point(30,30));
        jf5.add(scrollPane, BorderLayout.SOUTH);
        s.setBounds(100,40,100,10);
        //searchPanel.add(s);
        //jf5.add(searchPanel);
        //setSize(399,399);
        jf5.setSize(500,500);
        
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            new Resources();
            jf5.dispose();
            }
        });
        searc.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		String name=s.getText();
        		try{
        			Class.forName("com.mysql.jdbc.Driver");
        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_name","root","");
        			Statement stmt=con.createStatement(); 
        			ResultSet rs;
        			if(name==" ") {
        			rs=stmt.executeQuery("select * from resources where name='"+name+"'");  
        			}
        			else {
        			 rs=stmt.executeQuery("select * from resources");  
        			}
        			DefaultTableModel model = (DefaultTableModel) table.getModel();
        		//"id","aadhar no", "name","in date","out date"}
        			while(rs.next())  
        			{     
        				System.out.println(rs.getString(1));
        				String id=rs.getString(2);
        				String namesa=rs.getString(1);
        				String quant=rs.getString(3);
        			
        				model.addRow(new Object[] {id,namesa,quant});
        			}
        			System.out.println("Success");
        			con.close();
        		}
        		catch(Exception e) {
        			System.out.println(e);
        		}
	
        	}
        });
	}
	public static void main(String[] args) {
		new ResSearch();
	}
}
