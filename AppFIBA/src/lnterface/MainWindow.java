package lnterface;

import java.awt.*;
import javax.swing.*;

import model.FibaApplication;

public class MainWindow extends JFrame {

	private InitialPanel initial;
	private FibaApplication fiba;

	public MainWindow() {

		setTitle("FIBA Application");
		setLayout(new BorderLayout());
		setSize(1280, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);

		//setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("./images/logos/ball.png").getImage(),
		//		new Point(0, 0), "Ball Cursor"));

		Image icon = Toolkit.getDefaultToolkit().createImage("./images/logos/ball.png");

		setIconImage(icon);

		fiba = new FibaApplication();
		
		
		initial = new InitialPanel(this);

		add(initial, BorderLayout.CENTER);

		setVisible(true);

	}

	public FibaApplication getFiba() {
		return fiba;
	}

	public void setFiba(FibaApplication fiba) {
		this.fiba = fiba;
	}

	public static void main(String[] args) {

		MainWindow window = new MainWindow();

	}

}
