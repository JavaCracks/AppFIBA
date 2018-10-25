package lnterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

import model.Player;

public class OptionsPanel extends JPanel implements ActionListener {
	public final static Image LOGO = Toolkit.getDefaultToolkit().createImage("./images/logos/searchLogo.png");
	final static String ADD = "ADD";
	final static String SEARCH = "";

	final static String REMOVE = "REMOVE";

	private JPanel up;
	private JPanel down;
	private JPanel center;
	private JComboBox criteriaCombo;
	private JLabel search;
	private JTextField searchTxt;
	private JList<Player> listSearch;
	private DefaultListModel<Player> listModel;
	private JButton add;
	private JButton remove;
	private AddWindow window;
	private JButton buttonSearch;
	private InitialPanel initial;

	public OptionsPanel(InitialPanel initial) {

		this.initial = initial;

		up = new JPanel();
		down = new JPanel();
		center = new JPanel();

		up.setLayout(new GridLayout(1, 4));
		up.setBackground(new Color(125, 125, 125, 125));

		up.setLayout(new GridLayout(1, 4));
		up.setBackground(new Color(125, 125, 125, 125));

		down.setLayout(new GridLayout(1, 2));
		down.setBackground(new Color(0, 0, 0, 0));

		center.setLayout(new GridLayout(1, 1));
		center.setBackground(new Color(0, 0, 0, 0));

		setLayout(new BorderLayout());
		TitledBorder border1 = new TitledBorder("");
		setBorder(border1);

		window = new AddWindow(this);
		String[] data = new String[13];
		data[0] = "Add Criteria";
		data[1] = "Name";
		data[2] = "Year";
		data[3] = "Team";
		data[4] = "Age";
		data[5] = "USG";
		data[6] = "AST";
		data[7] = "DRB";
		data[8] = "Defense";
		data[9] = "Offense";
		data[10] = "Salary";
		data[11] = "Weight";
		data[12] = "Height";
		criteriaCombo = new JComboBox<String>(data);
		criteriaCombo.addActionListener(this);
		criteriaCombo.setBackground(new Color(0, 0, 0, 125));
		criteriaCombo.setForeground(Color.white);

		search = new JLabel("Search:");
		searchTxt = new JTextField();

		buttonSearch = new JButton("SEARCH");
		buttonSearch.addActionListener(this);
		buttonSearch.setActionCommand(SEARCH);
		buttonSearch.setBackground(new Color(125, 125, 125, 125));
		buttonSearch.setForeground(Color.WHITE);

		listModel = new DefaultListModel<Player>();
		listSearch = new JList<Player>(listModel);
		listSearch.setFixedCellHeight(40);
		listSearch.setFixedCellWidth(620);
		listSearch.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listSearch.setBackground(Color.GRAY);
		listSearch.setFont(new Font("Garamond", 1, 36));
		listSearch.setForeground(Color.WHITE);
		listSearch.setLayoutOrientation(JList.VERTICAL);
		JScrollPane myScrollList = new JScrollPane(listSearch);
		myScrollList.setVerticalScrollBar(new JScrollBar(JScrollBar.VERTICAL));
		myScrollList.setBackground(new Color(0, 0, 0, 100));
		

		add = new JButton(ADD);
		add.addActionListener(this);
		add.setActionCommand(ADD);
		add.setBackground(new Color(0, 0, 0, 125));
		add.setForeground(Color.white);

		remove = new JButton(REMOVE);
		remove.addActionListener(this);
		remove.setActionCommand(REMOVE);
		remove.setBackground(new Color(0, 0, 0, 125));
		remove.setForeground(Color.white);

		components();

		up.add(criteriaCombo);
		up.add(search);
		up.add(searchTxt);
		up.add(buttonSearch);

		down.add(add);
		down.add(remove);

		center.add(myScrollList);

		add(up, BorderLayout.NORTH);

		add(center, BorderLayout.CENTER);

		add(down, BorderLayout.SOUTH);

	}

	public void components() {

		criteriaCombo.setBounds(40, 20, 200, 60);
		criteriaCombo.setFont(new Font("Garamond", 1, 20));
		criteriaCombo.setBackground(new Color(85, 85, 85, 85));

		search.setBounds(200, 29, 200, 40);
		search.setFont(new Font("Garamond", 1, 20));
		search.setForeground(Color.WHITE);
		search.setBackground(new Color(85, 85, 85, 85));
		search.setHorizontalAlignment(JLabel.CENTER);

		searchTxt.setBounds(340, 29, 200, 40);
		searchTxt.setFont(new Font("Garamond", 1, 20));
		searchTxt.setForeground(Color.WHITE);
		searchTxt.setBackground(new Color(85, 85, 85, 85));

		listSearch.setBounds(20, 120, 600, 500);
		listSearch.setFont(new Font("Garamond", 1, 20));
		listSearch.setForeground(Color.WHITE);
		listSearch.setBackground(new Color(85, 85, 85, 85));

		add.setBounds(180, 680, 100, 30);
		add.setFont(new Font("Garamond", 1, 20));
		add.setBackground(new Color(85, 85, 85, 85));

		remove.setBounds(300, 680, 150, 30);
		remove.setFont(new Font("Garamond", 1, 20));
		remove.setBackground(new Color(85, 85, 85, 85));

//		ImageIcon icon = new ImageIcon(LOGO);
//		buttonSearch.setIcon(icon);
		buttonSearch.setBackground(new Color(0, 0, 0, 125));
		buttonSearch.setBounds(560, 20, 60, 60);

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

		if (a.equals(ADD)) {
			window.setVisible(true);
		}

		if (a.equals(SEARCH)) {

			int c = criteriaCombo.getSelectedIndex();

			if (c == 0) {

				JOptionPane.showMessageDialog(null, "Please first select a criteria to search", "No criteria specified",
						JOptionPane.ERROR_MESSAGE);

			} else {

				if (searchTxt.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Put data that you want to search in the text field",
							"No data to search", JOptionPane.ERROR_MESSAGE);
				} else {
					switch (c) {

					case 1:

						ArrayList<Player> players = initial.getMainWindow().getFiba()
								.searchByCriteriaName(searchTxt.getText());
						
						for(int i = 0; i<players.size(); i++) {
							
						listModel.addElement(players.get(i));	
							
							
						}

						break;

					}

				}
			}
		}

	}

}
