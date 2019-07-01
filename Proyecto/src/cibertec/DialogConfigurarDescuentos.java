package cibertec;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		getContentPane().setBackground(new Color(204, 255, 153));
		setModal(true);
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 640, 211);
		getContentPane().setLayout(null);
		
		lblA = new JLabel("1 a 5 unidades");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA.setBounds(12, 13, 172, 21);
		getContentPane().add(lblA);
		
		lblA_1 = new JLabel("6 a 10 unidades");
		lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA_1.setBounds(12, 45, 172, 21);
		getContentPane().add(lblA_1);
		
		lblA_2 = new JLabel("11 a 15 unidades");
		lblA_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA_2.setBounds(12, 83, 172, 21);
		getContentPane().add(lblA_2);
		
		lblMsDe = new JLabel("M\u00E1s de 15 unidades");
		lblMsDe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMsDe.setBounds(12, 116, 172, 21);
		getContentPane().add(lblMsDe);
		
		txtP1 = new JTextField();
		txtP1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtP1.setBackground(new Color(250, 250, 210));
		txtP1.setText(String.valueOf(Tienda.porcentaje1));
		txtP1.setBounds(194, 10, 116, 24);
		getContentPane().add(txtP1);
		txtP1.setColumns(10);
		
		txtP2 = new JTextField();
		txtP2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtP2.setBackground(new Color(250, 250, 210));
		txtP2.setText(String.valueOf(Tienda.porcentaje2));
		txtP2.setBounds(194, 45, 116, 24);
		getContentPane().add(txtP2);
		txtP2.setColumns(10);
		
		txtP3 = new JTextField();
		txtP3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtP3.setBackground(new Color(250, 250, 210));
		txtP3.setText(String.valueOf(Tienda.porcentaje3));
		txtP3.setBounds(194, 79, 116, 24);
		getContentPane().add(txtP3);
		txtP3.setColumns(10);
		
		txtP4 = new JTextField();
		txtP4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtP4.setBackground(new Color(250, 250, 210));
		txtP4.setText(String.valueOf(Tienda.porcentaje4));
		txtP4.setBounds(194, 113, 116, 24);
		getContentPane().add(txtP4);
		txtP4.setColumns(10);
		
		label = new JLabel("%");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(322, 12, 56, 21);
		getContentPane().add(label);
		
		label_1 = new JLabel("%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(322, 46, 56, 21);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("%");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(322, 79, 56, 22);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("%");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(322, 114, 56, 21);
		getContentPane().add(label_3);
		
		Image iconoImagen = new ImageIcon("imagenes/check.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setIcon(icono);
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(468, 9, 141, 36);
		getContentPane().add(btnAceptar);
		
		Image img= new ImageIcon("imagenes/cancel.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setIcon(img2);
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(468, 61, 141, 36);
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
		
		try {
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
		catch ( NumberFormatException exception ) {
			JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos en todos los campos", "ERROR!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
