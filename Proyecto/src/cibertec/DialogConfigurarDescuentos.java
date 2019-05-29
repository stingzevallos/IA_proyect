package cibertec;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogConfigurarDescuentos extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblA;
	private JLabel lblA_1;
	private JLabel lblA_2;
	private JLabel lblMsDe;
	private JTextField txtP1;
	private JTextField txtP2;
	private JTextField txtP3;
	private JTextField txtP4;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnAceptar;
	private JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarDescuentos dialog = new DialogConfigurarDescuentos();
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
	public DialogConfigurarDescuentos() {
		setModal(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 478, 204);
		getContentPane().setLayout(null);
		
		lblA = new JLabel("1 a 5 unidades");
		lblA.setBounds(12, 13, 91, 16);
		getContentPane().add(lblA);
		
		lblA_1 = new JLabel("6 a 10 unidades");
		lblA_1.setBounds(12, 42, 91, 16);
		getContentPane().add(lblA_1);
		
		lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setBounds(12, 71, 103, 16);
		getContentPane().add(lblA_2);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setBounds(12, 100, 114, 16);
		getContentPane().add(lblMsDe);
		
		txtP1 = new JTextField();
		txtP1.setBounds(141, 10, 116, 22);
		getContentPane().add(txtP1);
		txtP1.setColumns(10);
		
		txtP2 = new JTextField();
		txtP2.setBounds(141, 97, 116, 22);
		getContentPane().add(txtP2);
		txtP2.setColumns(10);
		
		txtP3 = new JTextField();
		txtP3.setBounds(141, 68, 116, 22);
		getContentPane().add(txtP3);
		txtP3.setColumns(10);
		
		txtP4 = new JTextField();
		txtP4.setBounds(141, 39, 116, 22);
		getContentPane().add(txtP4);
		txtP4.setColumns(10);
		
		label = new JLabel("%");
		label.setBounds(269, 13, 56, 16);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setBounds(269, 42, 56, 16);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setBounds(269, 71, 56, 16);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setBounds(269, 100, 56, 16);
		getContentPane().add(label_3);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(355, 9, 97, 25);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(355, 38, 97, 25);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
		if (arg0.getSource() == btnAceptar ) {
			actionPerformedBtnAceptar(arg0);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent arg0) {
		double p1,p2,p3,p4;
		p1 = Double.parseDouble(txtP1.getText());
		p2 = Double.parseDouble(txtP2.getText());
		p3 = Double.parseDouble(txtP3.getText());
		p4 = Double.parseDouble(txtP4.getText());
		Tienda.porcentaje1 = p1;
		Tienda.porcentaje2 = p2;
		Tienda.porcentaje3 = p3;
		Tienda.porcentaje4 = p4;
		dispose();
	}
}
