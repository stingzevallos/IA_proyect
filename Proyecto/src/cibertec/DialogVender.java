package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogVender extends JDialog implements ActionListener {
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblCantidad;
	private JTextField textFieldPrecio;
	private JTextField textFieldCantidad;
	private JComboBox comboBox;
	private JTextArea textArea;
	private JButton btnCerrar;
	private JButton btnVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogVender dialog = new DialogVender();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogVender() {
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 11, 77, 14);
		getContentPane().add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setBounds(10, 36, 77, 14);
		getContentPane().add(lblPrecios);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 77, 14);
		getContentPane().add(lblCantidad);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setText(Tienda.precio0+"");
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(97, 33, 116, 20);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(97, 58, 116, 20);
		getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		comboBox.setBounds(97, 8, 116, 20);
		getContentPane().add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 86, 414, 164);
		getContentPane().add(textArea);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(335, 7, 89, 23);
		getContentPane().add(btnVender);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == comboBox) {
			actionPerformedComboBox(e);
		}
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		int opcionMarca = comboBox.getSelectedIndex();
		switch (opcionMarca) {
			case 0:
				textFieldPrecio.setText(Tienda.precio0+"");
				break;
			case 1:
				textFieldPrecio.setText(Tienda.precio1+"");
				break;
			case 2:
				textFieldPrecio.setText(Tienda.precio2+"");
				break;
			case 3:
				textFieldPrecio.setText(Tienda.precio3+"");
				break;
			case 4:
				textFieldPrecio.setText(Tienda.precio4+"");
				break;
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad;
		double precio, descuento;
		double importeCompra, importeDescuento, importePagar;
		String obsequio = "No corresponde obsequio";
		
		cantidad = Integer.parseInt( textFieldCantidad.getText());
		precio = Double.parseDouble( textFieldPrecio.getText());
		
		if ( cantidad > 15 )
			descuento = Tienda.porcentaje4/100;
		else if ( cantidad >= 11 )
			descuento = Tienda.porcentaje3/100;
		else if ( cantidad >= 6 )
			descuento = Tienda.porcentaje2/100;
		else
			descuento = Tienda.porcentaje1/100;
		
		if ( cantidad >= Tienda.cantidadMinimaObsequiable )
			obsequio = Tienda.obsequio;
		
		importeCompra = cantidad * precio;
		importeDescuento = importeCompra * descuento;
		importePagar = importeCompra - importeDescuento;
		
		textArea.setText("BOLETA DE VENTA\n");
		textArea.append("Marca\t\t\t: " + comboBox.getSelectedItem().toString() + "\n"
				+ "Precio Unitario\t\t: S/. " + precio + "\n"
				+ "Cantidad de unidades\t: " + cantidad + "\n"
				+ "Importe de Compra\t: S/." + importeCompra + "\n"
				+ "Importe de descuento\t: S/." + importeDescuento + "\n"
				+ "Importe a pagar\t\t: S/." + importePagar + "\n"
				+ "Obsequio\t\t: " + obsequio + "\n"
				+ "Premio Sorpresa\t\t: " );
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
