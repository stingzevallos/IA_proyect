package cibertec;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogAcercaTienda extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogAcercaTienda dialog = new DialogAcercaTienda();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogAcercaTienda() {
		setModal(true);
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 429, 418);
		getContentPane().setLayout(null);
		
		JLabel lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTienda.setBounds(120, 27, 146, 50);
		getContentPane().add(lblTienda);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAutores.setBounds(153, 133, 70, 14);
		getContentPane().add(lblAutores);
		
		JLabel lblNewLabel = new JLabel("Sting Luis Zevallos Baca");
		lblNewLabel.setBounds(65, 185, 191, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMarisabel = new JLabel("Merisabel Ruelas Quenaya");
		lblMarisabel.setBounds(65, 210, 191, 20);
		getContentPane().add(lblMarisabel);
		
		JLabel lblNewLabel_1 = new JLabel("Loida Elizabeth Cubas Romero");
		lblNewLabel_1.setBounds(65, 244, 191, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Leidy Danitza Larico Alvarez");
		lblNewLabel_2.setBounds(65, 269, 191, 14);
		getContentPane().add(lblNewLabel_2);

	}

}
