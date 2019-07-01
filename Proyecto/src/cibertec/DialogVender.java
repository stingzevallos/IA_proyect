package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollPane;

public class DialogVender extends JDialog implements ActionListener {
	
	private double importeCompra, importeDescuento, importePagar;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblCantidad;
	private JTextField textFieldPrecio;
	private JTextField textFieldCantidad;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private JButton btnCerrar;
	private JButton btnVender;
	private JScrollPane scrollPane;

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
		getContentPane().setBackground(new Color(175, 238, 238));
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 518, 382);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(10, 11, 77, 19);
		getContentPane().add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecios.setBounds(10, 43, 77, 17);
		getContentPane().add(lblPrecios);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCantidad.setBounds(10, 70, 77, 20);
		getContentPane().add(lblCantidad);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrecio.setBackground(new Color(240, 248, 255));
		textFieldPrecio.setText(String.valueOf(Tienda.precio0+""));
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(97, 40, 116, 22);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCantidad.setBackground(new Color(240, 248, 255));
		textFieldCantidad.setBounds(97, 70, 116, 22);
		getContentPane().add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBackground(new Color(240, 248, 255));
		comboBox.addActionListener(this);
		comboBox.setModel((ComboBoxModel<String>) new DefaultComboBoxModel<String>(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		comboBox.setBounds(97, 11, 116, 22);
		getContentPane().add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 478, 219);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setBackground(new Color(240, 248, 255));
		
		Image img= new ImageIcon("imagenes/cerrar.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCerrar.setIcon(img2);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(349, 52, 122, 29);
		getContentPane().add(btnCerrar);
		
		Image iconoImagen = new ImageIcon("imagenes/coins.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVender.setIcon(icono);
		btnVender.addActionListener(this);
		btnVender.setBounds(349, 10, 122, 29);
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
			textFieldPrecio.setText(String.valueOf(Tienda.precio0));
			break;
		case 1:
			textFieldPrecio.setText(String.valueOf(Tienda.precio1));
			break;
		case 2:
			textFieldPrecio.setText(String.valueOf(Tienda.precio2));
			break;
		case 3:
			textFieldPrecio.setText(String.valueOf(Tienda.precio3));
			break;
		case 4:
			textFieldPrecio.setText(String.valueOf(Tienda.precio4));
			break;
		}
	}
	protected void actionPerformedBtnVender(ActionEvent e) {
		int cantidad;
		double precio, descuento;
		String obsequio = "No corresponde obsequio", premioSorpresa = "No corresponde premio";
		
		try {
			cantidad = Integer.parseInt( textFieldCantidad.getText());
			precio = Double.parseDouble( textFieldPrecio.getText());
			
			actualizarInventario(cantidad);		// Actualiza el n° de clientes, unidades vendidas, etc
			descuento = generarDescuento(cantidad);		// Generamos el descuento en base a la cantidad
			
			generarImportes( cantidad, precio, descuento);		// Generamos los importes
			
			if ( cantidad >= Tienda.cantidadMinimaObsequiable )
				obsequio = Tienda.obsequio;
			if ( Tienda.numeroCliente == Tienda.numeroClienteSorpresa ) 
				premioSorpresa = Tienda.premioSorpresa;
			
			textArea.setText("BOLETA DE VENTA\n");
			imprimir("Marca\t\t\t: " + comboBox.getSelectedItem().toString());
			imprimir("Precio Unitario\t\t: S/. " + precio);
			imprimir("Cantidad de unidades\t: " + cantidad);
			imprimir("Importe de Compra\t: S/." + importeCompra);
			imprimir("Importe de descuento\t: S/." + importeDescuento);
			imprimir("Importe a pagar\t\t: S/." + importePagar);
			imprimir("Obsequio\t\t: " + obsequio);
			imprimir("Premio Sorpresa\t\t: " + premioSorpresa);
		}
		catch ( NumberFormatException exception ) {
			JOptionPane.showMessageDialog( null, "Ingrese solo valores numericos en \"Cantidad\".", "ERROR!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	protected double generarDescuento( int cantidad ) {
		double des;
		if ( cantidad > 15 )
			des = Tienda.porcentaje4/100;
		else if ( cantidad >= 11 )
			des = Tienda.porcentaje3/100;
		else if ( cantidad >= 6 )
			des = Tienda.porcentaje2/100;
		else
			des = Tienda.porcentaje1/100;
		return des;
	}
	
	protected void generarImportes( int cantidad, double precio, double descuento ) {
		importeCompra = cantidad * precio;
		importeDescuento = importeCompra * descuento;
		importePagar = importeCompra - importeDescuento;
	}
	protected void actualizarInventario( int c ) {
		switch (comboBox.getSelectedIndex()) {
		case 0:
			Tienda.unidadesVendidas0 += c;
			Tienda.ventas0++;
			break;
		case 1:
			Tienda.unidadesVendidas1 += c;
			Tienda.ventas1++;
			break;
		case 2:
			Tienda.unidadesVendidas2 += c;
			Tienda.ventas2++;
			break;
		case 3:
			Tienda.unidadesVendidas3 += c;
			Tienda.ventas3++;
			break;
		case 4:
			Tienda.unidadesVendidas4 += c;
			Tienda.ventas4++;
			break;
		}
		Tienda.numeroCliente++;
	}
	
	protected void imprimir( String cad ) {
		textArea.append( cad + "\n");
	}
}
