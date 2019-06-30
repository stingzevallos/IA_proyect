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
		setBounds(100, 100, 298, 376);
		getContentPane().setLayout(null);
		
		JLabel lblTienda = new JLabel(Tienda.NOMBRE_TIENDA);
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTienda.setBounds(95, 43, 100, 50);
		getContentPane().add(lblTienda);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAutores.setBounds(41, 117, 70, 14);
		getContentPane().add(lblAutores);
		
		JLabel lblNewLabel = new JLabel(Tienda.desarrollador1);
		lblNewLabel.setBounds(62, 166, 191, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMarisabel = new JLabel(Tienda.desarrollador2);
		lblMarisabel.setBounds(62, 191, 191, 20);
		getContentPane().add(lblMarisabel);
		
		JLabel lblNewLabel_1 = new JLabel(Tienda.desarrollador3);
		lblNewLabel_1.setBounds(62, 222, 191, 14);
		getContentPane().add(lblNewLabel_1);

	}

}
