package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
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
		setTitle("Configurar premio sorpresa ");
		setBounds(100, 100, 374, 149);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDeCliente = new JLabel("Numero de cliente");
		lblNumeroDeCliente.setBounds(23, 30, 123, 14);
		getContentPane().add(lblNumeroDeCliente);
		
		JLabel lblNewLabel = new JLabel("Premio sorpresa");
		lblNewLabel.setBounds(23, 67, 96, 14);
		getContentPane().add(lblNewLabel);
		
		textFieldCliente = new JTextField();
		textFieldCliente.setText(Tienda.cantidadMinimaObsequiable+"");
		textFieldCliente.setBounds(123, 27, 86, 20);
		textFieldCliente.setText(Tienda.cantidadMinimaObsequiable+"");
		getContentPane().add(textFieldCliente);
		textFieldCliente.setColumns(10);
		
		textFieldPremio = new JTextField();
		textFieldPremio.setText(Tienda.obsequio);
		textFieldPremio.setBounds(123, 64, 86, 20);
		getContentPane().add(textFieldPremio);
		textFieldPremio.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cMinima;
				String nuevoObsequio;
				cMinima=Integer.parseInt(textFieldCliente.getText());
				nuevoObsequio=textFieldPremio.getText();
				Tienda.cantidadMinimaObsequiable=cMinima;
				Tienda.obsequio=nuevoObsequio;
				dispose();				
			}
					});
		btnProcesar.setBounds(239, 26, 89, 23);
		getContentPane().add(btnProcesar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(239, 63, 89, 23);
		getContentPane().add(btnCancelar);

	}

}
