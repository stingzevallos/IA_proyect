package cibertec;

import java.awt.EventQueue;
import java.awt.Image;

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
import java.awt.Toolkit;

public class DialogConfigurarPremioSorpresa extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldCliente;
	private JTextField textFieldPremio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarPremioSorpresa dialog = new DialogConfigurarPremioSorpresa();
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
	public DialogConfigurarPremioSorpresa() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		getContentPane().setBackground(new Color(135, 206, 250));
		setModal(true);
		setTitle("Configurar premio sorpresa ");
		setBounds(100, 100, 430, 166);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDeCliente = new JLabel("Numero de cliente");
		lblNumeroDeCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNumeroDeCliente.setBounds(10, 11, 139, 23);
		getContentPane().add(lblNumeroDeCliente);
		
		JLabel lblNewLabel = new JLabel("Premio sorpresa");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 47, 137, 23);
		getContentPane().add(lblNewLabel);
		
		textFieldCliente = new JTextField();
		textFieldCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCliente.setBackground(new Color(240, 255, 255));
		textFieldCliente.setText(String.valueOf(Tienda.numeroClienteSorpresa));
		textFieldCliente.setBounds(148, 12, 86, 26);		
		getContentPane().add(textFieldCliente);
		textFieldCliente.setColumns(10);
		
		textFieldPremio = new JTextField();
		textFieldPremio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPremio.setBackground(new Color(240, 255, 255));
		textFieldPremio.setText(Tienda.premioSorpresa);
		textFieldPremio.setBounds(148, 48, 86, 26);
		getContentPane().add(textFieldPremio);
		textFieldPremio.setColumns(10);
		
		Image iconoImagen = new ImageIcon("imagenes/check.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setIcon(icono);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ncliente;
				String sorpresa;
				
				try {
					ncliente=Integer.parseInt(textFieldCliente.getText());
					sorpresa=textFieldPremio.getText();
					Tienda.numeroClienteSorpresa=ncliente;
					Tienda.premioSorpresa=sorpresa;

					dispose();	
				}
				catch ( NumberFormatException exception ) {
					JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos en \"Numero de Clientes\".", "ERROR!", JOptionPane.WARNING_MESSAGE);
				}
			}
					});
		
		btnAceptar.setBounds(285, 7, 117, 31);
		getContentPane().add(btnAceptar);
		
		Image img= new ImageIcon("imagenes/cancel.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setIcon(img2);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(285, 47, 117, 31);
		getContentPane().add(btnCancelar);

	}
	
}
