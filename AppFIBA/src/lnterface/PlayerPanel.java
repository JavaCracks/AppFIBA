package lnterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PlayerPanel extends JPanel implements ActionListener {
	
     
	final static String MODIFY = "MODIFICAR";
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
	
	private JButton modify;
	
	public PlayerPanel() {
		
		setBackground(Color.BLACK);
		setLayout(new GridLayout(12, 2));
		TitledBorder border1 = new TitledBorder("");
        setBorder(border1);
        
        name = new JLabel("Nombre:");
        name.setHorizontalAlignment(JLabel.CENTER);
        name.setFont(new Font("Garamond", 1, 25));
		name.setForeground(Color.WHITE);
        
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

        yearTxt = new JTextField();
        yearTxt.setBackground(new Color(85,85,85,85));
        
        teamTxt = new JTextField();
        teamTxt.setBackground(new Color(85,85,85,85));
      
        ageTxt = new JTextField();
        ageTxt.setBackground(new Color(85,85,85,85));
        
        usgTxt = new JTextField();
        usgTxt.setBackground(new Color(85,85,85,85));
        
        astTxt = new JTextField();
        astTxt.setBackground(new Color(85,85,85,85));
        
        drbTxt = new JTextField();
        drbTxt.setBackground(new Color(85,85,85,85));
        
        defenseTxt = new JTextField();
        defenseTxt.setBackground(new Color(85,85,85,85));
        
        offenseTxt = new JTextField();
        offenseTxt.setBackground(new Color(85,85,85,85));
        
        salaryTxt = new JTextField();
        salaryTxt.setBackground(new Color(85,85,85,85));
        
        weightTxt = new JTextField();
        weightTxt.setBackground(new Color(85,85,85,85));
        
        heightTxt = new JTextField();
        heightTxt.setBackground(new Color(85,85,85,85));
        
        modify = new JButton(MODIFY);
        modify.addActionListener(this);
        modify.setActionCommand(MODIFY);

		
        components();
	}
	
	public void components() {
		
		add(name); add(nameTxt);
		add(year); add(yearTxt);
		add(team); add(teamTxt);
		add(age); add(ageTxt);
		add(usg); add(usgTxt);
		add(ast); add(astTxt);
		add(drb); add(drbTxt);
		add(defense); add(defenseTxt);
		add(offense); add(offenseTxt);
		add(salary); add(salaryTxt);
		add(weight); add(weightTxt);
		add(height); add(heightTxt);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
