package lnterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
	public final static Image LOGO = Toolkit.getDefaultToolkit()
			.createImage("./images/logos/SEARCH.png");
	   final static String ADD = "ADD"; 
	   final static String SEARCH = ""; 

	   final static String REMOVE = "REMOVE";   

	
	private JComboBox criteriaCombo;
	private JLabel search;
	private JTextField searchTxt;
	private JList listSearch;
	private JButton add;
	private JButton remove;
	private AddWindow window;
	private JButton buttonSearch;
	
	
	public OptionsPanel() {
		
		
		setLayout(null);
		TitledBorder border1 = new TitledBorder("");
         setBorder(border1);
		
         window= new AddWindow(this);
		String[] data = new String[13];
		data[0]= "Add Criteria";
		data[1]= "Name";
		data[2]= "Year";
		data[3]= "Team";
		data[4]=  "Age";
		data[5]= "Usg";
		data[6]= "Ast";
		data[7]= "Drb";
		data[8]= "Defense";
		data[9]= "Offense";
		data[10]= "Salary";
		data[11]= "Weight";
		data[12]= "Height";
		criteriaCombo = new JComboBox<String>(data);
		criteriaCombo.addActionListener(this);

		
		
		search = new JLabel("Search:");
		searchTxt = new JTextField();
		
		buttonSearch = new JButton(SEARCH);
		buttonSearch.addActionListener(this);
		buttonSearch.setActionCommand(SEARCH);

		
		
	//	DefaultListModel<Player> listModel = new DefaultListModel<Player>();
		listSearch = new JList<Player>();
		//listSearch.setFixedCellHeight(40);
		//listSearch.setFixedCellWidth(400);
		//listSearch.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		//listSearch.setLayoutOrientation(JList.VERTICAL_WRAP);	
		//listSearch.setBackground(Color.GRAY);
		//listSearch.setFont(new Font("Garamond", 1, 24));
		//listSearch.setForeground(Color.WHITE);
	//	JScrollPane myScrollList = new JScrollPane(listSearch);

		
		add= new JButton(ADD);
		add.addActionListener(this);
		add.setActionCommand(ADD);
		
		remove = new JButton(REMOVE);
		remove.addActionListener(this);
		remove.setActionCommand(REMOVE);
		
		 
		components();
	}
	
	public void components() {
		 
		 
		  criteriaCombo.setBounds(40, 20, 200, 60);
		  criteriaCombo.setFont(new Font("Garamond", 1, 20));
	      criteriaCombo.setBackground(new Color(85,85,85,85));

		  
		  search.setBounds(200, 29, 200, 40);
		  search.setFont(new Font("Garamond", 1, 20));
		  search.setForeground(Color.WHITE);
	      search.setBackground(new Color(85,85,85,85));
	      search.setHorizontalAlignment(JLabel.CENTER);

		  
		  searchTxt.setBounds(340,29,200,40);
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
			  
		      ImageIcon icon = new ImageIcon(LOGO);
		      buttonSearch.setIcon(icon);
		      buttonSearch.setBounds(560, 25, 50, 50);
		  
		  add(criteriaCombo);
		  add(search);
		  add(searchTxt);
		  add(listSearch);
		  
		  add(add);
		  add(remove);
		  add(buttonSearch);

	}




	public JComboBox getCriteriaCombo() {
		return criteriaCombo;
	}

	public void setCriteriaCombo(JComboBox criteriaCombo) {
		this.criteriaCombo = criteriaCombo;
	}

	public JTextField getSearchTxt() {
		return searchTxt;
	}

	public void setSearchTxt(JTextField searchTxt) {
		this.searchTxt = searchTxt;
	}

	public JList getListSearch() {
		return listSearch;
	}

	public void setListSearch(JList listSearch) {
		this.listSearch = listSearch;
	}

	public AddWindow getWindow() {
		return window;
	}

	public void setWindow(AddWindow window) {
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        String a = e.getActionCommand();
          
        if(a.equals(ADD)) {
        	window.setVisible(true);
        }
        
        
	}
	

}
