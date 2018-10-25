package lnterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import model.Player;

public class OptionsPanel extends JPanel implements ActionListener {
      
	   final static String ADD = "ADD"; 
	   final static String REMOVE = "REMOVE";   

	
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
		String[] data = new String[12];
		data[0]= "name";
		data[1]= "year";
		data[2]= "team";
		data[3]=  "age";
		data[4]= "usg";
		data[5]= "ast";
		data[6]= "drb";
		data[7]= "defense";
		data[8]= "offense";
		data[9]= "salary";
		data[10]= "weight";
		data[11]= "height";
		criteriaCombo = new JComboBox<String>(data);
		

		
		
		search = new JLabel("Buscar:");
		searchTxt = new JTextField();
		
		DefaultListModel<Player> listModel = new DefaultListModel<Player>();
		listSearch = new JList<Player>();
		listSearch.setFixedCellHeight(40);
		listSearch.setFixedCellWidth(400);
		listSearch.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listSearch.setLayoutOrientation(JList.VERTICAL_WRAP);	
		listSearch.setBackground(Color.GRAY);
		listSearch.setFont(new Font("Garamond", 1, 24));
		listSearch.setForeground(Color.WHITE);
		JScrollPane myScrollList = new JScrollPane(listSearch);

		
		add= new JButton(ADD);
		add.addActionListener(this);
		add.setActionCommand(ADD);
		
		remove = new JButton(REMOVE);
		remove.addActionListener(this);
		remove.setActionCommand(REMOVE);
		
		 
		components();
	}
	
	public void components() {
		 
		  criteria.setBounds(20, 20, 200, 40);
		  criteria.setFont(new Font("Garamond", 1, 20));
		  criteria.setForeground(Color.WHITE);
	      criteria.setBackground(new Color(85,85,85,85));

		  
		  criteriaCombo.setBounds(220, 13, 200, 60);
		  criteriaCombo.setFont(new Font("Garamond", 1, 20));
	      criteriaCombo.setBackground(new Color(85,85,85,85));

		  
		  search.setBounds(20, 60, 200, 40);
		  search.setFont(new Font("Garamond", 1, 20));
		  search.setForeground(Color.WHITE);
	      search.setBackground(new Color(85,85,85,85));
	      search.setHorizontalAlignment(JLabel.CENTER);

		  
		  searchTxt.setBounds(220,60,200,40);
		  searchTxt.setFont(new Font("Garamond", 1, 20));
		  searchTxt.setForeground(Color.WHITE);
		  searchTxt.setBackground(new Color(85,85,85,85));
		  
		 listSearch.setBounds(20,120,600,500);
		 listSearch.setFont(new Font("Garamond", 1, 20));
		 listSearch.setForeground(Color.WHITE);
		 listSearch.setBackground(new Color(85,85,85,85));
		 
		 add.setBounds(180, 680, 100, 30);
		 add.setFont(new Font("Garamond", 1, 20));
	      add.setBackground(new Color(85,85,85,85));
		  
	      remove.setBounds(300, 680, 150, 30);
			 remove.setFont(new Font("Garamond", 1, 20));
		      remove.setBackground(new Color(85,85,85,85));
			  
		  
		  add(criteria);
		  add(criteriaCombo);
		  add(search);
		  add(searchTxt);
		  add(listSearch);
		  
		  add(add);
		  add(remove);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
