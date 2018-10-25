package lnterface;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame {

	private InitialPanel initial;

	public MainWindow() {

		setTitle("FIBA Application");
		setLayout(new BorderLayout());
		setSize(1280, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		//setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("./images/logos/ball.png").getImage(),
		//		new Point(0, 0), "Ball Cursor"));

		Image icon = Toolkit.getDefaultToolkit().createImage("./images/logos/ball.png");

		setIconImage(icon);

		initial = new InitialPanel();

		add(initial, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();

	}

}
