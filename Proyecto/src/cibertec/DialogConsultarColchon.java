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
	private JComboBox cbomarca;
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
		
		cbomarca = new JComboBox();
		cbomarca.addActionListener(this);
		cbomarca.setModel(new DefaultComboBoxModel(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		cbomarca.setBounds(109, 10, 116, 22);
		contentPanel.add(cbomarca);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setText(Tienda.precio0+"");
		textFieldPrecio.setEditable(false);
		textFieldPrecio.addActionListener(this);
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
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == textFieldPrecio) {
			actionPerformed(arg0);
		}
		if (arg0.getSource() == cbomarca) {
			actionPerformedComboBox(arg0);
		}
		if (arg0.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent arg0) {
		dispose();
	}
	protected void actionPerformedComboBox(ActionEvent arg0) {
		int opcionColchon = (cbomarca.getSelectedIndex());
		switch (opcionColchon) {
		case 0:
			textFieldPrecio.setText(Tienda.precio0 + "");
			textFieldGarantia.setText(Tienda.garantia0 + "");
			textFieldTamaño.setText(Tienda.tamaño0);
			textFieldMaterial.setText(Tienda.material0);
			break;
		case 1:
			textFieldPrecio.setText(Tienda.precio1 + "");
			textFieldGarantia.setText(Tienda.garantia1 + "");
			textFieldTamaño.setText(Tienda.tamaño1);
			textFieldMaterial.setText(Tienda.material1);
			break;
		case 2:
			textFieldPrecio.setText(Tienda.precio2 + "");
			textFieldGarantia.setText(Tienda.garantia2 + "");
			textFieldTamaño.setText(Tienda.tamaño2);
			textFieldMaterial.setText(Tienda.material2);
			break;
		case 3:
			textFieldPrecio.setText(Tienda.precio3 + "");
			textFieldGarantia.setText(Tienda.garantia3 + "");
			textFieldTamaño.setText(Tienda.tamaño3);
			textFieldMaterial.setText(Tienda.material3);
			break;
		case 4:
			textFieldPrecio.setText(Tienda.precio4 + "");
			textFieldGarantia.setText(Tienda.garantia4 + "");
			textFieldTamaño.setText(Tienda.tamaño4);
			textFieldMaterial.setText(Tienda.material4);
			break;
		}
	}
	
}
