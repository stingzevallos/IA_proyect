package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogConfigurarCantidadOptimaColchones extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldCOCV;

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
		setTitle(" Configurar cantidad \u00F3ptima de colchones vendidos ");
		setBounds(100, 100, 450, 122);
		getContentPane().setLayout(null);
		
		JLabel lblConfigurarCantidadptima = new JLabel(" Cantidad \u00F3ptima de colchones vendidos ");
		lblConfigurarCantidadptima.setBounds(10, 21, 202, 14);
		getContentPane().add(lblConfigurarCantidadptima);
		
		textFieldCOCV = new JTextField();
		textFieldCOCV.setText(Tienda.cantidadOptima+"");
		textFieldCOCV.setBounds(222, 18, 86, 20);
		getContentPane().add(textFieldCOCV);
		textFieldCOCV.setColumns(10);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nuevacantidadoptima;
				nuevacantidadoptima= Integer.parseInt(textFieldCOCV.getText());
				Tienda.cantidadOptima=nuevacantidadoptima;
				dispose();				
			}
		});
		btnProcesar.setBounds(322, 17, 89, 23);
		getContentPane().add(btnProcesar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(322, 47, 89, 23);
		getContentPane().add(btnCancelar);

	}
}
