import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;

public class interfata extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitlu;
	private JTextField textFieldAutor;
	private JTextField textFieldEditura;
	private JFormattedTextField textFieldPret;
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList list;
	private boolean is_modified = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfata frame = new interfata();
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
	public interfata() throws ParseException {
		
		setTitle("Lista Carti");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		JScrollPane scrollPane = new JScrollPane();
		list = new JList(model);
//		scrollPane.setViewportView(list);
		
		list.setValueIsAdjusting(true);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		list.setBounds(10, 11, 154, 240);
		contentPane.add(list);
//		contentPane.add(scrollPane);

		JLabel lblTitlu = new JLabel("Titlu");
		lblTitlu.setBounds(216, 34, 46, 14);
		contentPane.add(lblTitlu);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(216, 59, 46, 14);
		contentPane.add(lblAutor);

		JLabel lblCategorie = new JLabel("Categorie");
		lblCategorie.setBounds(216, 84, 64, 14);
		contentPane.add(lblCategorie);

		JLabel lblNewLabel = new JLabel("Editura");
		lblNewLabel.setBounds(216, 109, 64, 14);
		contentPane.add(lblNewLabel);

		JLabel lblPret = new JLabel("Pret");
		lblPret.setBounds(216, 134, 46, 14);
		contentPane.add(lblPret);

		textFieldTitlu = new JTextField();
		textFieldTitlu.setBounds(272, 31, 86, 20);
		contentPane.add(textFieldTitlu);
		textFieldTitlu.setColumns(10);

		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(272, 56, 86, 20);
		contentPane.add(textFieldAutor);
		textFieldAutor.setColumns(10);

		textFieldEditura = new JTextField();
		textFieldEditura.setBounds(272, 106, 86, 20);
		contentPane.add(textFieldEditura);
		textFieldEditura.setColumns(10);

		JComboBox Categorie = new JComboBox();
		Categorie.setModel(new DefaultComboBoxModel(new String[] {"tehnica", "beletristica", "manual educational"}));
		Categorie.setBounds(272, 81, 86, 20);
		contentPane.add(Categorie);
		
		
		    
		JTextField textFieldPret = new JTextField();
		textFieldPret.setText("");
		textFieldPret.setBounds(272, 134, 86, 20);
		contentPane.add(textFieldPret);
		
		
		JButton btnAdaugaCartea = new JButton("Adauga carte");
		btnAdaugaCartea.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String titlu = textFieldTitlu.getText();
				String autor = textFieldAutor.getText();
				
				String editura = textFieldEditura.getText();
				String pret = (String) textFieldPret.getText();
				titlu = titlu.trim();
				autor = autor.trim();
				
				editura = editura.trim();
				pret = pret.trim();

				

				String lista = titlu + " -  " + autor;
				model.addElement(lista);

			}
		});
		btnAdaugaCartea.setBounds(226, 167, 125, 23);
		contentPane.add(btnAdaugaCartea);

		JButton btnDetaliiCarte = new JButton("Detalii carte");
		btnDetaliiCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String titlu = textFieldTitlu.getText();
				String autor = textFieldAutor.getText();
				String categorie = Categorie.getSelectedItem().toString();
			    String editura = textFieldEditura.getText();
				String pret = textFieldPret.getText();
			
				String detalii =  titlu + "" + autor + "" + ""
						+ editura + "" + pret;
				
//				model.addElement(detalii);

				detalii newFrame = new detalii();
				newFrame.getTitlu().setText(titlu);
				newFrame.getAutor().setText(autor);
				newFrame.getCategorie().setText(categorie);
				newFrame.getEditura().setText(editura);
				newFrame.getPret().setText(pret);
				newFrame.setVisible(true);
				
				
//				JOptionPane.showMessageDialog(null, detalii);
			}
			});
		
		btnDetaliiCarte.setBounds(191, 203, 114, 23);
		contentPane.add(btnDetaliiCarte);

		JButton btnStergeCarte = new JButton("Sterge carte");
		btnStergeCarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				if (index >= 0) {

					String numeSelectat = model.elementAt(index);

					model.removeElement(numeSelectat);
				}
			}

		});
		btnStergeCarte.setBounds(191, 228, 114, 23);
		contentPane.add(btnStergeCarte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 146, -33, -61);
		contentPane.add(scrollPane);
		

	
	}
}
