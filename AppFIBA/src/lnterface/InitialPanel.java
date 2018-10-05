package lnterface;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel {

	public static final Image BACKGROUND = Toolkit.getDefaultToolkit()
			.createImage("./images/backgrounds/background.jpg");

	public InitialPanel() {

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawImage(BACKGROUND, 0, 0, null);

		
		repaint();
	}

}
