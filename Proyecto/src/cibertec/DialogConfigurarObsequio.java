package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DialogConfigurarObsequio extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = 	new JPanel();
	private JTextField txtCantidad;
	private JTextField txtObsequio;
	private JButton btnCancelar;
	private JButton btnAceptar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarObsequio dialog = new DialogConfigurarObsequio();
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
	public DialogConfigurarObsequio() {
		setModal(true);
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 527, 138);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad m\u00EDnima de colchones adquiridos");
			lblNewLabel.setBounds(12, 13, 220, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Obsequio");
			lblNewLabel_1.setBounds(12, 40, 56, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(242, 10, 116, 22);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setBounds(242, 37, 116, 22);
			contentPanel.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(404, 36, 97, 25);
			contentPanel.add(btnCancelar);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(404, 9, 97, 25);
			contentPanel.add(btnAceptar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		int cantidad;
		String obsequio;
		
		try {
			cantidad = Integer.parseInt(txtCantidad.getText());
			obsequio = txtObsequio.getText();
			
			Tienda.cantidadMinimaObsequiable = cantidad;
			Tienda.obsequio = obsequio;
			dispose();
		}
		catch ( NumberFormatException exception ) {
			JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos en \"Cantidad minima de colchones adquiridos\".", "ERROR!", JOptionPane.WARNING_MESSAGE);
		}
	}

}
