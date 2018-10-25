package lnterface;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel {

	public static final Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/background.jpg");

    private OptionsPanel options;
    private PlayerPanel player;
    private MainWindow window;
    
	public InitialPanel(MainWindow window) {
      
		this.window = window;
		
		setLayout(new GridLayout(1, 2));
		options = new OptionsPanel(this);
		player = new PlayerPanel(this);
		
		options.setBackground(new Color(125,125,125,125));
		player.setBackground(new Color(45,45,45,195));
		add(options);
		add(player);
		 
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);

		
		repaint();
	}
	
	public MainWindow getMainWindow() {
		
	return window;	
		
	}

}
