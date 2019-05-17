package cibertec;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class DialogGenerarReportes extends JDialog implements ActionListener {
	private JLabel lblTipoDeReporte;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnCerrar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogGenerarReportes dialog = new DialogGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogGenerarReportes() {
		setTitle("Generar reportes");
		setModal(true);
		setBounds(100, 100, 483, 300);
		getContentPane().setLayout(null);
		
		lblTipoDeReporte = new JLabel("Tipo de reporte");
		lblTipoDeReporte.setBounds(10, 11, 98, 14);
		getContentPane().add(lblTipoDeReporte);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ventas por marca", "Marcas con venta optima", "Precios en relacion al promedio", "Precio promedio, mayor y menor"}));
		comboBox.setBounds(118, 8, 200, 20);
		getContentPane().add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 447, 214);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(368, 7, 89, 23);
		getContentPane().add(btnCerrar);
	}

	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == comboBox ) {
			actionPerformerComboBox(e);
		}
		if ( e.getSource() == btnCerrar ) {
			actionPerformerBtnCerrar(e);
		}
	}
	protected void actionPerformerBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformerComboBox(ActionEvent e) {
		int tipo = comboBox.getSelectedIndex();
		switch (tipo) {
			case 0:
				mostrarVentasPorMarca();
				break;
			case 1:
				mostrarMarcasVentaOptima();
				break;
			case 2:
				mostrarRelacionPrecios();
				break;
			case 3:
				mostrarPreciosMenorMayor();
				break;
		}
	}
	protected void mostrarVentasPorMarca() {
		double importe0, importe1, importe2, importe3, importe4, importeTotal;
		int ventasTotal;
		
		importe0 = Tienda.unidadesVendidas0 * Tienda.precio0;
		importe1 = Tienda.unidadesVendidas1 * Tienda.precio1;
		importe2 = Tienda.unidadesVendidas2 * Tienda.precio2;
		importe3 = Tienda.unidadesVendidas3 * Tienda.precio3;
		importe4 = Tienda.unidadesVendidas4 * Tienda.precio4;
		importeTotal = importe0 + importe1 + importe2 + importe3 + importe4;
		ventasTotal = Tienda.ventas0 + Tienda.ventas1 + Tienda.ventas2 + Tienda.ventas3 + Tienda.ventas4;
		
		textArea.setText("Ventas por colchon\n\n"
				+ "Marca \t\t\t\t\t: " + Tienda.marca0 + "\n" 
				+ "Cantidad de Ventas \t\t\t: " + Tienda.ventas0 + "\n"
				+ "Cantidad total de unidades vendidas \t: " + Tienda.unidadesVendidas0 + "\n"
				+ "Importe total acumulado \t\t: " + importe0 + "\n"
				+ "\n"
				+ "Marca \t\t\t\t\t: " + Tienda.marca1 + "\n" 
				+ "Cantidad de Ventas \t\t\t: " + Tienda.ventas1 + "\n"
				+ "Cantidad total de unidades vendidas \t: " + Tienda.unidadesVendidas1 + "\n"
				+ "Importe total acumulado \t\t: " + importe1 + "\n"
				+ "\n"
				+ "Marca \t\t\t\t\t: " + Tienda.marca2 + "\n" 
				+ "Cantidad de Ventas \t\t\t: " + Tienda.ventas2 + "\n"
				+ "Cantidad total de unidades vendidas \t: " + Tienda.unidadesVendidas2 + "\n"
				+ "Importe total acumulado \t\t: " + importe2 + "\n"
				+ "\n"
				+ "Marca \t\t\t\t\t: " + Tienda.marca3 + "\n" 
				+ "Cantidad de Ventas \t\t\t: " + Tienda.ventas3 + "\n"
				+ "Cantidad total de unidades vendidas \t: " + Tienda.unidadesVendidas3 + "\n"
				+ "Importe total acumulado \t\t: " + importe3 + "\n"
				+ "\n"
				+ "Marca \t\t\t\t\t: " + Tienda.marca4 + "\n" 
				+ "Cantidad de Ventas \t\t\t: " + Tienda.ventas4 + "\n"
				+ "Cantidad total de unidades vendidas \t: " + Tienda.unidadesVendidas4 + "\n"
				+ "Importe total acumulado \t\t: " + importe4 + "\n"
				+ "\n"
				+ "Importe Total general acumulado \t: " + importeTotal +"\n"
				+ "Cantidad Total general de ventas \t: " + ventasTotal);
	}
	protected void mostrarMarcasVentaOptima() {
		String colchonesOptimos = "";
		
		colchonesOptimos+=esColchonOptimo( Tienda.marca0, Tienda.unidadesVendidas0);
		colchonesOptimos+=esColchonOptimo( Tienda.marca1, Tienda.unidadesVendidas1);
		colchonesOptimos+=esColchonOptimo( Tienda.marca2, Tienda.unidadesVendidas2);
		colchonesOptimos+=esColchonOptimo( Tienda.marca3, Tienda.unidadesVendidas3);
		colchonesOptimos+=esColchonOptimo( Tienda.marca4, Tienda.unidadesVendidas4);
		if ( colchonesOptimos.isEmpty() )
			colchonesOptimos = "No existen marcas con venta optima";
		
		textArea.setText("Colchones con venta optima\n");
		textArea.append( colchonesOptimos);
		
	}
	protected String esColchonOptimo( String marca, int unidades ) {
		String colchonOptimo = "";
		if ( unidades >= Tienda.cantidadOptima ) {
			int dif = unidades - Tienda.cantidadOptima;
			colchonOptimo = "\nMarca \t\t\t\t\t: " + marca +
							"\nCantidad total de unidades vendidas \t: " + unidades + " ("+dif+" mas que la cantidad optima)\n";
		}
		return colchonOptimo;
	}
	protected void mostrarRelacionPrecios() {
		String colchonesPromedio = "";
		double precioPromedio;
		
		precioPromedio = (Tienda.precio0+Tienda.precio1+Tienda.precio2+Tienda.precio3+Tienda.precio4)/5;
		colchonesPromedio += colchonPromedio( Tienda.marca0, Tienda.precio0, precioPromedio);
		colchonesPromedio += colchonPromedio( Tienda.marca1, Tienda.precio1, precioPromedio);
		colchonesPromedio += colchonPromedio( Tienda.marca2, Tienda.precio2, precioPromedio);
		colchonesPromedio += colchonPromedio( Tienda.marca3, Tienda.precio3, precioPromedio);
		colchonesPromedio += colchonPromedio( Tienda.marca4, Tienda.precio4, precioPromedio);
		
		textArea.setText("Precios en relacion al promedio\n\n"
						+ colchonesPromedio
						+ "Precio promedio \t: S/. " + precioPromedio);
	}
	protected String colchonPromedio( String marca, double precio, double promedio ) {
		String colchon, relacion;
		
		if ( precio < promedio )
			relacion = "menor al promedio";
		else if ( precio > promedio )
			relacion = "mayor al promedio";
		else
			relacion = "igual al promedio";
		colchon = "Marca \t: " + marca + "\nPrecio \t: " + precio + " ("+relacion+")"+"\n\n";
		return colchon;
	}
	protected void mostrarPreciosMenorMayor() {
		double promedio, mayor, menor;
		
		promedio = (Tienda.precio0+Tienda.precio1+Tienda.precio2+Tienda.precio3+Tienda.precio4)/5;
		mayor = Math.max( Tienda.precio0, Math.max( Tienda.precio1, Math.max( Tienda.precio2, Math.max( Tienda.precio3, Tienda.precio4))));
		menor = Math.min( Tienda.precio0, Math.min( Tienda.precio1, Math.min( Tienda.precio2, Math.min( Tienda.precio3, Tienda.precio4))));
		
		textArea.setText("Precio promedio, menor y mayor\n\n"
						+ "Precio promedio\t: S/." + promedio + "\n"
						+ "Precio menor\t: S/." + menor + "\n"
						+ "Precio mayor\t: S/." + mayor );
	}
}
