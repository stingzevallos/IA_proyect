package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class DialogConfigurarCantidadOptimaColchones extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldCOCV;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarCantidadOptimaColchones dialog = new DialogConfigurarCantidadOptimaColchones();
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
	public DialogConfigurarCantidadOptimaColchones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		getContentPane().setBackground(new Color(255, 255, 153));
		setModal(true);
		setTitle(" Configurar cantidad \u00F3ptima de colchones vendidos ");
		setBounds(100, 100, 576, 149);
		getContentPane().setLayout(null);
		
		JLabel lblConfigurarCantidadptima = new JLabel(" Cantidad \u00F3ptima de colchones vendidos ");
		lblConfigurarCantidadptima.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfigurarCantidadptima.setBounds(12, 15, 266, 20);
		getContentPane().add(lblConfigurarCantidadptima);
		
		textFieldCOCV = new JTextField();
		textFieldCOCV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCOCV.setBackground(new Color(255, 255, 204));
		textFieldCOCV.setText(Tienda.cantidadOptima+"");
		textFieldCOCV.setBounds(279, 13, 86, 25);
		getContentPane().add(textFieldCOCV);
		textFieldCOCV.setColumns(10);
		
		Image iconoImagen = new ImageIcon("imagenes/check.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setIcon(icono);
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(420, 8, 127, 30);
		getContentPane().add(btnAceptar);
		
		Image img= new ImageIcon("imagenes/cancel.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setIcon(img2);
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(420, 51, 127, 30);
		getContentPane().add(btnCancelar);

	}
	
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == btnAceptar ) {
			actionPerformerBtnProcesar(e);
		}
		else if ( e.getSource() == btnCancelar ) {
			actionPerfomerBtnCerrar(e);
		}
	}

	private void actionPerformerBtnProcesar(ActionEvent e) {
		int nuevacantidadoptima;
		
		try {
			nuevacantidadoptima= Integer.parseInt(textFieldCOCV.getText());
			Tienda.cantidadOptima=nuevacantidadoptima;
			dispose();	
		}
		catch ( NumberFormatException exception ) {
			JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos.", "ERROR!", JOptionPane.WARNING_MESSAGE);
		}
	}

	private void actionPerfomerBtnCerrar(ActionEvent e) {
		dispose();
	}
	//falta validar
}
