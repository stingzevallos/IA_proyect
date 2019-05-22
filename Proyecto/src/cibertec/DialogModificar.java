package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogModificar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblGarantaaos;
	private JLabel lblTamao;
	private JLabel lblMaterial;
	private JTextField textFieldPrecio;
	private JTextField textFieldGarantia;
	private JTextField textFieldSize;
	private JTextField textFieldMaterial;
	private JComboBox comboBox;
	private JButton btnCerrar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogModificar dialog = new DialogModificar();
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
	public DialogModificar() {
		setModal(true);
		setTitle("Modificar colch\u00F3n");
		setBounds(100, 100, 447, 202);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 11, 102, 14);
		getContentPane().add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setBounds(10, 36, 102, 14);
		getContentPane().add(lblPrecios);
		
		lblGarantaaos = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantaaos.setBounds(10, 61, 102, 14);
		getContentPane().add(lblGarantaaos);
		
		lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setBounds(10, 86, 102, 14);
		getContentPane().add(lblTamao);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(10, 111, 102, 14);
		getContentPane().add(lblMaterial);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setText(Tienda.precio0+"");
		textFieldPrecio.setBounds(122, 33, 138, 20);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldGarantia = new JTextField();
		textFieldGarantia.setText(Tienda.garantia0+"");
		textFieldGarantia.setBounds(122, 58, 138, 20);
		getContentPane().add(textFieldGarantia);
		textFieldGarantia.setColumns(10);
		
		textFieldSize = new JTextField();
		textFieldSize.setText(Tienda.tamaño0);
		textFieldSize.setBounds(122, 83, 138, 20);
		getContentPane().add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setText(Tienda.material0);
		textFieldMaterial.setBounds(122, 108, 138, 20);
		getContentPane().add(textFieldMaterial);
		textFieldMaterial.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		comboBox.setBounds(122, 8, 138, 20);
		getContentPane().add(comboBox);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(332, 7, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(332, 32, 89, 23);
		getContentPane().add(btnGuardar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == comboBox) {
			actionPerformedComboBox(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedComboBox(ActionEvent e) {
		int opcionMarca = comboBox.getSelectedIndex();
		switch (opcionMarca) {
			case 0:
				textFieldPrecio.setText(Tienda.precio0+"");
				textFieldGarantia.setText(Tienda.garantia0+"");
				textFieldSize.setText(Tienda.tamaño0);
				textFieldMaterial.setText(Tienda.material0);
				break;
			case 1:
				textFieldPrecio.setText(Tienda.precio1+"");
				textFieldGarantia.setText(Tienda.garantia1+"");
				textFieldSize.setText(Tienda.tamaño1);
				textFieldMaterial.setText(Tienda.material1);
				break;
			case 2:
				textFieldPrecio.setText(Tienda.precio2+"");
				textFieldGarantia.setText(Tienda.garantia2+"");
				textFieldSize.setText(Tienda.tamaño2);
				textFieldMaterial.setText(Tienda.material2);
				break;
			case 3:
				textFieldPrecio.setText(Tienda.precio3+"");
				textFieldGarantia.setText(Tienda.garantia3+"");
				textFieldSize.setText(Tienda.tamaño3);
				textFieldMaterial.setText(Tienda.material3);
				break;
			case 4:
				textFieldPrecio.setText(Tienda.precio4+"");
				textFieldGarantia.setText(Tienda.garantia4+"");
				textFieldSize.setText(Tienda.tamaño4);
				textFieldMaterial.setText(Tienda.material4);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		int garantia, opcionMarca;
		double precio;
		String size, material;
		
		opcionMarca = comboBox.getSelectedIndex();
		precio = Double.parseDouble( textFieldPrecio.getText());
		garantia = Integer.parseInt( textFieldGarantia.getText());
		size = textFieldSize.getText();
		material = textFieldMaterial.getText();
		
		switch (opcionMarca) {
			case 0:
				Tienda.precio0 = precio;
				Tienda.garantia0 = garantia;
				Tienda.tamaño0 = size;
				Tienda.material0 = material;
				break;
			case 1:
				Tienda.precio1 = precio;
				Tienda.garantia1 = garantia;
				Tienda.tamaño1 = size;
				Tienda.material1 = material;
				break;
			case 2:
				Tienda.precio2 = precio;
				Tienda.garantia2 = garantia;
				Tienda.tamaño2 = size;
				Tienda.material2 = material;
				break;
			case 3:
				Tienda.precio3 = precio;
				Tienda.garantia3 = garantia;
				Tienda.tamaño3 = size;
				Tienda.material3 = material;
				break;
			case 4:
				Tienda.precio4 = precio;
				Tienda.garantia4 = garantia;
				Tienda.tamaño4 = size;
				Tienda.material4 = material;
				break;
		}
		dispose();
 	}
}
