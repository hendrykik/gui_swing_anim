package figury;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnimatorApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final AnimatorApp frame = new AnimatorApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param delay 
	 */
	public AnimatorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int ww = 450, wh = 300;
		setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		AnimPanel kanwa = new AnimPanel();
		kanwa.setBounds(10, 11, 422, 219);
		contentPane.add(kanwa);
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				kanwa.initialize();
			}
		});

		JButton btnAdd = new JButton("Kwadrat");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.addFig();
			}
		});
		btnAdd.setBounds(90, 239, 80, 23);
		contentPane.add(btnAdd);
		
		JButton btnAnimate = new JButton("Animate");
		btnAnimate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kanwa.animate();
			}
		});
		btnAnimate.setBounds(10, 239, 80, 23);
		contentPane.add(btnAnimate);

		JButton third = new JButton("Elipsa");
		third.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {kanwa.makeKwadrat();
			}
		});
		third.setBounds(180, 239, 80, 23);
		contentPane.add(third);

		JButton oval = new JButton("Owal");
		oval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {kanwa.makeOval();
			}
		});
		oval.setBounds(270, 239, 80, 23);
		contentPane.add(oval);

		JButton prost = new JButton("Prostokąt");
		prost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {kanwa.makeProstokat();
			}
		});
		prost.setBounds(350, 239, 100, 23);
		contentPane.add(prost);
		
	}

}
