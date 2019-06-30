package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setModal(true);
		setTitle("Configurar premio sorpresa ");
		setBounds(100, 100, 428, 124);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDeCliente = new JLabel("Numero de cliente");
		lblNumeroDeCliente.setBounds(10, 11, 110, 14);
		getContentPane().add(lblNumeroDeCliente);
		
		JLabel lblNewLabel = new JLabel("Premio sorpresa");
		lblNewLabel.setBounds(10, 36, 110, 14);
		getContentPane().add(lblNewLabel);
		
		textFieldCliente = new JTextField();
		textFieldCliente.setText(Tienda.cantidadMinimaObsequiable+"");
		textFieldCliente.setBounds(130, 8, 86, 20);
		textFieldCliente.setText(Tienda.cantidadMinimaObsequiable+"");
		getContentPane().add(textFieldCliente);
		textFieldCliente.setColumns(10);
		
		textFieldPremio = new JTextField();
		textFieldPremio.setText(Tienda.obsequio);
		textFieldPremio.setBounds(130, 33, 86, 20);
		getContentPane().add(textFieldPremio);
		textFieldPremio.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cMinima;
				String nuevoObsequio;
				
				try {
					cMinima=Integer.parseInt(textFieldCliente.getText());
					nuevoObsequio=textFieldPremio.getText();
					Tienda.cantidadMinimaObsequiable=cMinima;
					Tienda.obsequio=nuevoObsequio;

					dispose();	
				}
				catch ( NumberFormatException exception ) {
					JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos en \"Numero de Clientes\".", "ERROR!", JOptionPane.WARNING_MESSAGE);
				}
			}
					});
		btnAceptar.setBounds(313, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(313, 32, 89, 23);
		getContentPane().add(btnCancelar);

	}
	
}
