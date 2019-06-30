package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setModal(true);
		setTitle(" Configurar cantidad \u00F3ptima de colchones vendidos ");
		setBounds(100, 100, 450, 111);
		getContentPane().setLayout(null);
		
		JLabel lblConfigurarCantidadptima = new JLabel(" Cantidad \u00F3ptima de colchones vendidos ");
		lblConfigurarCantidadptima.setBounds(10, 11, 202, 14);
		getContentPane().add(lblConfigurarCantidadptima);
		
		textFieldCOCV = new JTextField();
		textFieldCOCV.setText(Tienda.cantidadOptima+"");
		textFieldCOCV.setBounds(222, 8, 86, 20);
		getContentPane().add(textFieldCOCV);
		textFieldCOCV.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 31, 89, 23);
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
