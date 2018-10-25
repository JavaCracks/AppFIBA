package lnterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AddWindow extends JDialog implements ActionListener{
	
	public static final Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/background.jpg");

	final static String SAVE = "SAVE";

	private JLabel name; // Criteria 1
	private JLabel year; // Criteria 2
	private JLabel team; // Criteria 3
	private JLabel age; // Criteria 4
	private JLabel usg; // Criteria 5
	private JLabel ast; // Criteria 6
	private JLabel drb; // Criteria 7
	private JLabel defense; // Criteria 8
	private JLabel offense; // Criteria 9
	private JLabel salary; // Criteria 10
	private JLabel weight; // Criteria 11
	private JLabel height; // Criteria 12
	private JTextField nameTxt; // Criteria 1
	private JTextField yearTxt; // Criteria 2
	private JTextField teamTxt; // Criteria 3
	private JTextField ageTxt; // Criteria 4
	private JTextField usgTxt; // Criteria 5
	private JTextField astTxt; // Criteria 6
	private JTextField drbTxt; // Criteria 7
	private JTextField defenseTxt; // Criteria 8
	private JTextField offenseTxt; // Criteria 9
	private JTextField salaryTxt; // Criteria 10
	private JTextField weightTxt; // Criteria 11
	private JTextField heightTxt; // Criteria 12
	private JPanel AuxOne;
	private JPanel AuxTwo;
	
	private JButton save;
	
	private OptionsPanel window;
	
	public AddWindow(OptionsPanel window) {
		this.window= window;
		
		
		setTitle("Add player");
		setSize(600, 500);
		setLayout(new BorderLayout());
		AuxOne = new JPanel();
		AuxOne.setBackground(new Color(45,45,45,150));

		
		AuxTwo = new JPanel();
		AuxTwo.setBackground(new Color(45,45,45,195));

		AuxOne.setLayout(new GridLayout(12, 2));
		AuxTwo.setLayout (new BorderLayout());
        
		
		 name = new JLabel("Name:");
	        name.setHorizontalAlignment(JLabel.CENTER);
	        name.setFont(new Font("Garamond", 1, 25));
			name.setForeground(Color.WHITE);
			name.setBackground(new Color(35,51,64));
	        
	        year = new JLabel("Year:");
	        year.setHorizontalAlignment(JLabel.CENTER);
	        year.setFont(new Font("Garamond", 1, 25));
			year.setForeground(Color.WHITE);

	        team = new JLabel("Team:");
	        team.setHorizontalAlignment(JLabel.CENTER);
	        team.setFont(new Font("Garamond", 1, 25));
			team.setForeground(Color.WHITE);

	        age = new JLabel("Age:");
	        age.setHorizontalAlignment(JLabel.CENTER);
	        age.setFont(new Font("Garamond", 1, 25));
			age.setForeground(Color.WHITE);

	        usg = new JLabel("Usg:");
	        usg.setHorizontalAlignment(JLabel.CENTER);
	        usg.setFont(new Font("Garamond", 1, 25));
			usg.setForeground(Color.WHITE);

	        ast = new JLabel("Ast:");
	        ast.setHorizontalAlignment(JLabel.CENTER);
	        ast.setFont(new Font("Garamond", 1, 25));
			ast.setForeground(Color.WHITE);

	        drb = new JLabel("Drb:");
	        drb.setHorizontalAlignment(JLabel.CENTER);
	        drb.setFont(new Font("Garamond", 1, 25));
			drb.setForeground(Color.WHITE);

	        defense = new JLabel("Defense:");
	        defense.setHorizontalAlignment(JLabel.CENTER);
	        defense.setFont(new Font("Garamond", 1, 25));
			defense.setForeground(Color.WHITE);

	        offense = new JLabel("Offense:");
	        offense.setHorizontalAlignment(JLabel.CENTER);
	        offense.setFont(new Font("Garamond", 1, 25));
			offense.setForeground(Color.WHITE);

	        salary = new JLabel("Salary:");
	        salary.setHorizontalAlignment(JLabel.CENTER);
	        salary.setFont(new Font("Garamond", 1, 25));
			salary.setForeground(Color.WHITE);

	        weight = new JLabel("Weight:");
	        weight.setHorizontalAlignment(JLabel.CENTER);
	        weight.setFont(new Font("Garamond", 1, 25));
			weight.setForeground(Color.WHITE);

	        height = new JLabel("Height:");
	        height.setHorizontalAlignment(JLabel.CENTER);
	        height.setFont(new Font("Garamond", 1, 25));
			height.setForeground(Color.WHITE);

	        
	        
	        nameTxt = new JTextField();
	        nameTxt.setBackground(new Color(85,85,85,85));
	        nameTxt.setForeground(Color.WHITE);
	        nameTxt.setFont(new Font("Garamond", 1, 25));

	        yearTxt = new JTextField();
	        yearTxt.setBackground(new Color(85,85,85,85));
	        yearTxt.setForeground(Color.WHITE);
	        yearTxt.setFont(new Font("Garamond", 1, 25));
	        
	        teamTxt = new JTextField();
	        teamTxt.setBackground(new Color(85,85,85,85));
	        teamTxt.setForeground(Color.WHITE);
	        teamTxt.setFont(new Font("Garamond", 1, 25));
	      
	        ageTxt = new JTextField();
	        ageTxt.setBackground(new Color(85,85,85,85));
	        ageTxt.setForeground(Color.WHITE);
	        ageTxt.setFont(new Font("Garamond", 1, 25));
	        
	        usgTxt = new JTextField();
	        usgTxt.setBackground(new Color(85,85,85,85));
	        usgTxt.setForeground(Color.WHITE);
	        usgTxt.setFont(new Font("Garamond", 1, 25));
	        
	        astTxt = new JTextField();
	        astTxt.setBackground(new Color(85,85,85,85));
	        astTxt.setForeground(Color.WHITE);
	        astTxt.setFont(new Font("Garamond", 1, 25));
	        
	        drbTxt = new JTextField();
	        drbTxt.setBackground(new Color(85,85,85,85));
	        drbTxt.setForeground(Color.WHITE);
	        drbTxt.setFont(new Font("Garamond", 1, 25));
	        
	        defenseTxt = new JTextField();
	        defenseTxt.setBackground(new Color(85,85,85,85));
	        defenseTxt.setForeground(Color.WHITE);
	        defenseTxt.setFont(new Font("Garamond", 1, 25));
	        
	        offenseTxt = new JTextField();
	        offenseTxt.setBackground(new Color(85,85,85,85));
	        offenseTxt.setForeground(Color.WHITE);
	        offenseTxt.setFont(new Font("Garamond", 1, 25));
	        
	        salaryTxt = new JTextField();
	        salaryTxt.setBackground(new Color(85,85,85,85));
	        salaryTxt.setForeground(Color.WHITE);
	        salaryTxt.setFont(new Font("Garamond", 1, 25));
	        
	        weightTxt = new JTextField();
	        weightTxt.setBackground(new Color(85,85,85,85));
	        weightTxt.setForeground(Color.WHITE);
	        weightTxt.setFont(new Font("Garamond", 1, 25));
	        
	        heightTxt = new JTextField();
	        heightTxt.setBackground(new Color(85,85,85,85));
	        heightTxt.setForeground(Color.WHITE);
	        heightTxt.setFont(new Font("Garamond", 1, 25));
	        
	        save = new JButton(SAVE);
	        save.addActionListener(this);
	        save.setActionCommand(SAVE);
		
	        components();
	}
	
	
public void components() {
		
		AuxOne.add(name); 	AuxOne.add(nameTxt);
		AuxOne.add(year); 	AuxOne.add(yearTxt);
		AuxOne.add(team); 	AuxOne.add(teamTxt);
		AuxOne.add(age); 	AuxOne.add(ageTxt);
		AuxOne.add(usg); 	AuxOne.add(usgTxt);
		AuxOne.add(ast);	AuxOne. add(astTxt);
		AuxOne.add(drb);	AuxOne. add(drbTxt);
		AuxOne.add(defense); 	AuxOne.add(defenseTxt);
		AuxOne.add(offense); 	AuxOne.add(offenseTxt);
		AuxOne.add(salary); 	AuxOne.add(salaryTxt);
		AuxOne.add(weight); 	AuxOne.add(weightTxt);
		AuxOne.add(height);	AuxOne. add(heightTxt);
         
		AuxTwo.add(save, BorderLayout.CENTER);
		 add(AuxOne, BorderLayout.CENTER);
		 add(AuxTwo, BorderLayout.SOUTH);
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
     
}
