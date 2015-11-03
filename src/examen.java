import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.text.ParseException;

import javax.swing.border.CompoundBorder;
import javax.swing.JPasswordField;


public class examen extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JLabel lblParola;
	private JButton btnLogIn;
	private JPasswordField textFieldParola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen frame = new examen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public examen() {
		setTitle("Autentificare");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username ");
		lblNewLabel.setBounds(23, 59, 93, 14);
		contentPane.add(lblNewLabel);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(93, 56, 125, 20);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		lblParola = new JLabel("Parola");
		lblParola.setBounds(23, 93, 58, 14);
		contentPane.add(lblParola);
		
		btnLogIn = new JButton("Login");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textFieldUsername.getText();
				 String parola = textFieldParola.getText();
				 if (username.equals("muntean")){
					 if (parola.equals("marcu")){
						
						 try {
							 interfata frame = new interfata();
								frame.setVisible(true);
								setVisible (false); 
						 } catch (ParseException e) {
							 
						 }
 

					 }
				
					 
				 }
				 else {
					 JOptionPane.showMessageDialog(null, "Date invalide");
				 }
			}
		});
		btnLogIn.setBounds(170, 135, 89, 23);
		contentPane.add(btnLogIn);
		
		JLabel lblNewLabel_1 = new JLabel("Autentificare");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(76, 11, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldParola = new JPasswordField();
		textFieldParola.setBounds(93, 87, 127, 20);
		contentPane.add(textFieldParola);
	}
}
