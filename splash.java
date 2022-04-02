import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;

public class splash extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		splash mysplash = new splash();
	          mysplash.setTitle("Staionery");
		mysplash.setVisible(true);
		
		try {
			
			for(int i = 0 ;i <= 10 ;i++) {
				
				Thread.sleep(100);
				mysplash.progressBar.setValue(i);
				
			}
			
		}
		catch (Exception e) {
			
			
		}
		Login l = new Login();
		l.setVisible(true);
		mysplash.dispose();
	}

	/**
	 * Create the frame.
	 */
	public splash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 10, 1009, 510);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(209, 137, 559, 235);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stationery Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(165, 50, 296, 125);
		panel_1.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(133, 382, 704, 11);
		panel.add(progressBar);
	}
}
