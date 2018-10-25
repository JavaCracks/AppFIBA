package lnterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class OptionsPanel extends JPanel implements ActionListener {
      
	   final static String ADD = "AGREGAR"; 
	   final static String REMOVE = "ELIMINAR";   

	
	private JLabel criteria;
	private JComboBox criteriaCombo;
	private JLabel search;
	private JTextField searchTxt;
	private JList listSearch;
	private JButton add;
	private JButton remove;
	
	
	public OptionsPanel() {
		
		
		setLayout(null);
		TitledBorder border1 = new TitledBorder("");
         setBorder(border1);
		
		criteria = new JLabel("Agregue Criterio:");
		criteriaCombo = new JComboBox<String>();
		search = new JLabel("Buscar:");
		searchTxt = new JTextField();
		listSearch = new JList<>();
		
		add= new JButton(ADD);
		add.addActionListener(this);
		add.setActionCommand(ADD);
		
		remove = new JButton(REMOVE);
		remove.addActionListener(this);
		remove.setActionCommand(REMOVE);
		
		 
		components();
	}
	
	public void components() {
		 
		//add.setBounds(10, 10, 60	, 60);
		//add(add);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
