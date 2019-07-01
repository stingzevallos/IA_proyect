package cibertec;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class DialogAcercaTienda extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		getContentPane().setBackground(new Color(204, 255, 255));
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 511, 342);
		getContentPane().setLayout(null);
		
		JLabel lblTienda = new JLabel(Tienda.NOMBRE_TIENDA);
		lblTienda.setForeground(new Color(0, 51, 204));
		lblTienda.setFont(new Font("Berlin Sans FB", Font.BOLD, 34));
		lblTienda.setBounds(193, 45, 158, 73);
		getContentPane().add(lblTienda);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAutores.setBounds(209, 114, 111, 27);
		getContentPane().add(lblAutores);
		
		JLabel lblNewLabel = new JLabel(Tienda.desarrollador1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(143, 154, 191, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMarisabel = new JLabel(Tienda.desarrollador2);
		lblMarisabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarisabel.setBounds(143, 181, 208, 27);
		getContentPane().add(lblMarisabel);
		
		JLabel lblNewLabel_1 = new JLabel(Tienda.desarrollador3);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(143, 209, 246, 27);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("imagenes/fondo-celeste-trans.png"));
		lblNewLabel_2.setBounds(99, 45, 313, 234);
		getContentPane().add(lblNewLabel_2);
		
		Image iconoImagen = new ImageIcon("imagenes/dormir.jpg").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(500, 700, Image.SCALE_SMOOTH));
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(icono);
		lblNewLabel_3.setBounds(0, 0, 493, 298);
		getContentPane().add(lblNewLabel_3);

	}
}
