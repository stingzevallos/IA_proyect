package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class DialogModificarColchon extends JDialog implements ActionListener {
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
	private JComboBox<String> comboBox;
	private JButton btnCerrar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogModificarColchon dialog = new DialogModificarColchon();
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
	public DialogModificarColchon() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		getContentPane().setBackground(new Color(224, 255, 255));
		setModal(true);
		setTitle("Modificar colch\u00F3n");
		setBounds(100, 100, 581, 308);
		getContentPane().setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBackground(Color.WHITE);
		lblMarca.setBounds(10, 11, 102, 20);
		getContentPane().add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/.)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecios.setBounds(10, 43, 102, 20);
		getContentPane().add(lblPrecios);
		
		lblGarantaaos = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantaaos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGarantaaos.setBounds(10, 76, 102, 18);
		getContentPane().add(lblGarantaaos);
		
		lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTamao.setBounds(10, 107, 102, 20);
		getContentPane().add(lblTamao);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterial.setBounds(10, 140, 102, 20);
		getContentPane().add(lblMaterial);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrecio.setBackground(new Color(255, 255, 204));
		textFieldPrecio.setText(String.valueOf(Tienda.precio0));
		textFieldPrecio.setBounds(124, 42, 255, 23);
		getContentPane().add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldGarantia = new JTextField();
		textFieldGarantia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldGarantia.setBackground(new Color(255, 255, 204));
		textFieldGarantia.setText(String.valueOf(Tienda.garantia0));
		textFieldGarantia.setBounds(124, 73, 255, 25);
		getContentPane().add(textFieldGarantia);
		textFieldGarantia.setColumns(10);
		
		textFieldSize = new JTextField();
		textFieldSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldSize.setBackground(new Color(255, 255, 204));
		textFieldSize.setText(Tienda.tamaño0);
		textFieldSize.setBounds(124, 106, 255, 23);
		getContentPane().add(textFieldSize);
		textFieldSize.setColumns(10);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMaterial.setBackground(new Color(255, 255, 204));
		textFieldMaterial.setText(Tienda.material0);
		textFieldMaterial.setBounds(124, 139, 255, 23);
		getContentPane().add(textFieldMaterial);
		textFieldMaterial.setColumns(10);
		
		comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.addActionListener(this);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] 
				{Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4} ));
		comboBox.setBounds(124, 10, 255, 23);
		getContentPane().add(comboBox);
		
		Image img= new ImageIcon("imagenes/cerrar.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCerrar.setIcon(img2);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(427, 11, 124, 29);
		getContentPane().add(btnCerrar);
		
		Image iconoImagen = new ImageIcon("imagenes/save.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardar.setIcon(icono);
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(427, 43, 124, 29);
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
			textFieldPrecio.setText(String.valueOf(Tienda.precio0));
			textFieldGarantia.setText(String.valueOf(Tienda.garantia0));
			textFieldSize.setText(Tienda.tamaño0);
			textFieldMaterial.setText(Tienda.material0);
			break;
		case 1:
			textFieldPrecio.setText(String.valueOf(Tienda.precio1));
			textFieldGarantia.setText(String.valueOf(Tienda.garantia1));
			textFieldSize.setText(Tienda.tamaño1);
			textFieldMaterial.setText(Tienda.material1);
			break;
		case 2:
			textFieldPrecio.setText(String.valueOf(Tienda.precio2));
			textFieldGarantia.setText(String.valueOf(Tienda.garantia2));
			textFieldSize.setText(Tienda.tamaño2);
			textFieldMaterial.setText(Tienda.material2);
			break;
		case 3:
			textFieldPrecio.setText(String.valueOf(Tienda.precio3));
			textFieldGarantia.setText(String.valueOf(Tienda.garantia3));
			textFieldSize.setText(Tienda.tamaño3);
			textFieldMaterial.setText(Tienda.material3);
			break;
		case 4:
			textFieldPrecio.setText(String.valueOf(Tienda.precio4));
			textFieldGarantia.setText(String.valueOf(Tienda.garantia4));
			textFieldSize.setText(Tienda.tamaño4);
			textFieldMaterial.setText(Tienda.material4);
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		int garantia, opcionMarca;
		double precio;
		String size, material;
		
		try {
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
		catch ( NumberFormatException exception ) {
			JOptionPane.showMessageDialog( null, "Ingrese valores numericos en \"Precio y/o Garantia\".", "ERROR!", JOptionPane.WARNING_MESSAGE);
		}		
 	}
	
}