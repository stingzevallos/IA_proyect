package cibertec;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogConsultarColchon extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JLabel lblPrecios;
	private JLabel lblGarantaaos;
	private JLabel lblTamao;
	private JLabel lblMaterial;
	private JComboBox<String> cbomarca;
	private JButton btnCerrar;
	private JTextField textFieldPrecio;
	private JTextField textFieldGarantia;
	private JTextField textFieldTamaño;
	private JTextField textFieldMaterial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogConsultarColchon dialog = new DialogConsultarColchon();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogConsultarColchon() {
		setModal(true);
		setTitle("Consultar colch\u00F3n");
		setBounds(100, 100, 450, 238);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(12, 13, 56, 16);
		contentPanel.add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setBounds(12, 42, 74, 16);
		contentPanel.add(lblPrecios);
		
		lblGarantaaos = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantaaos.setBounds(12, 71, 89, 16);
		contentPanel.add(lblGarantaaos);
		
		lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setBounds(12, 100, 56, 16);
		contentPanel.add(lblTamao);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(12, 135, 56, 16);
		contentPanel.add(lblMaterial);
		
		cbomarca = new JComboBox<String>();
		cbomarca.addActionListener(this);
		cbomarca.setModel(new DefaultComboBoxModel<String>(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		cbomarca.setBounds(109, 10, 116, 22);
		contentPanel.add(cbomarca);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setText(Tienda.precio0+"");
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(109, 39, 116, 22);
		contentPanel.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldGarantia = new JTextField();
		textFieldGarantia.setText(Tienda.garantia0+"");
		textFieldGarantia.setEditable(false);
		textFieldGarantia.setBounds(109, 68, 116, 22);
		contentPanel.add(textFieldGarantia);
		textFieldGarantia.setColumns(10);
		
		textFieldTamaño = new JTextField();
		textFieldTamaño.setText(Tienda.tamaño0+"");
		textFieldTamaño.setEditable(false);
		textFieldTamaño.setBounds(109, 97, 116, 22);
		contentPanel.add(textFieldTamaño);
		textFieldTamaño.setColumns(10);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setText(Tienda.material0+"");
		textFieldMaterial.setEditable(false);
		textFieldMaterial.setBounds(109, 129, 116, 22);
		contentPanel.add(textFieldMaterial);
		textFieldMaterial.setColumns(10);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(323, 9, 97, 25);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbomarca) {
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
		int opcionColchon = cbomarca.getSelectedIndex();
		switch (opcionColchon) {
		case 0:
			mostrarDatosColchon( Tienda.precio0, Tienda.garantia0, Tienda.tamaño0, Tienda.material0);
			break;
		case 1:
			mostrarDatosColchon( Tienda.precio1, Tienda.garantia1, Tienda.tamaño1, Tienda.material1);
			break;
		case 2:
			mostrarDatosColchon( Tienda.precio2, Tienda.garantia2, Tienda.tamaño2, Tienda.material2);
			break;
		case 3:
			mostrarDatosColchon( Tienda.precio3, Tienda.garantia3, Tienda.tamaño3, Tienda.material3);
			break;
		case 4:
			mostrarDatosColchon( Tienda.precio4, Tienda.garantia4, Tienda.tamaño4, Tienda.material4);
			break;
		}
	}
	
	protected void mostrarDatosColchon( double precio, int garantia, String tamaño, String material ) {
		textFieldPrecio.setText(String.valueOf(precio));
		textFieldGarantia.setText(String.valueOf(garantia));
		textFieldTamaño.setText(tamaño);
		textFieldMaterial.setText(material);
	}
	
}
