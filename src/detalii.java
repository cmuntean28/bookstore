import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class detalii extends JFrame {

	private JPanel contentPane;
	private JTextField titlu;
	private JTextField autor;
	private JTextField Categorie;
	private JTextField Editura;
	private JTextField Pret;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detalii frame = new detalii();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTextField getTitlu() {
		return titlu;
	}
	

	public JTextField getAutor() {
		return autor;
	}
	public JTextField getCategorie() {
		return Categorie;
	}
	public JTextField getEditura() {
		return Editura;
	}
	public JTextField getPret() {
		return Pret;
	}
	/**
	 * Create the frame.
	 */
	public detalii() {
		setTitle("Detalii");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Detalii");
		lblNewLabel.setBounds(28, 11, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Titlu");
		lblNewLabel_1.setBounds(28, 51, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(28, 76, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Categorie");
		lblNewLabel_3.setBounds(28, 104, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		titlu = new JTextField();
		titlu.setEditable(false);
		titlu.setBounds(87, 48, 86, 20);
		contentPane.add(titlu);
		titlu.setColumns(10);
		
		autor = new JTextField();
		autor.setEditable(false);
		autor.setBounds(87, 73, 86, 20);
		contentPane.add(autor);
		autor.setColumns(10);
		
		Categorie = new JTextField();
		Categorie.setEditable(false);
		Categorie.setBounds(87, 101, 86, 20);
		contentPane.add(Categorie);
		Categorie.setColumns(10);
		
		JLabel lblEditura = new JLabel("Editura");
		lblEditura.setBounds(28, 138, 46, 14);
		contentPane.add(lblEditura);
		
		Editura = new JTextField();
		Editura.setEditable(false);
		Editura.setBounds(87, 132, 86, 20);
		contentPane.add(Editura);
		Editura.setColumns(10);
		
		JLabel lblOret = new JLabel("Pret");
		lblOret.setBounds(28, 163, 46, 14);
		contentPane.add(lblOret);
		
		Pret = new JTextField();
		Pret.setEditable(false);
		Pret.setBounds(87, 160, 86, 20);
		contentPane.add(Pret);
		Pret.setColumns(10);
	}
}
