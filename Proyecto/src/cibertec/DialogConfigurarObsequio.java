package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		setModal(true);
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 641, 171);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(152, 251, 152));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad m\u00EDnima de colchones adquiridos");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(12, 13, 282, 25);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Obsequio");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(12, 56, 97, 25);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtCantidad.setText(String.valueOf(Tienda.cantidadMinimaObsequiable));
			txtCantidad.setBackground(new Color(240, 248, 255));
			txtCantidad.setBounds(288, 13, 116, 25);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			txtObsequio = new JTextField();
			txtObsequio.setFont(new Font("Tahoma", Font.PLAIN, 15));}
		    txtObsequio.setText(Tienda.obsequio);		
			txtObsequio.setBackground(new Color(240, 248, 255));
			txtObsequio.setBounds(288, 51, 116, 25);
			contentPanel.add(txtObsequio);
			txtObsequio.setColumns(10);
		}
		{
			Image img= new ImageIcon("imagenes/cancel.png").getImage();
			ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCancelar.setIcon(img2);
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(463, 51, 137, 34);
			contentPanel.add(btnCancelar);
		}
		{
			Image iconoImagen = new ImageIcon("imagenes/check.png").getImage();
			ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
			btnAceptar = new JButton("Aceptar");
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnAceptar.setIcon(icono);
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(463, 9, 137, 34);
			contentPanel.add(btnAceptar);
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
