package cibertec;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		setModal(true);
		setTitle("Consultar colch\u00F3n");
		setBounds(100, 100, 583, 299);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(224, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(12, 13, 56, 24);
		contentPanel.add(lblMarca);
		
		lblPrecios = new JLabel("Precio (S/)");
		lblPrecios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecios.setBounds(12, 50, 74, 24);
		contentPanel.add(lblPrecios);
		
		lblGarantaaos = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantaaos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGarantaaos.setBounds(12, 93, 102, 24);
		contentPanel.add(lblGarantaaos);
		
		lblTamao = new JLabel("Tama\u00F1o");
		lblTamao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTamao.setBounds(12, 133, 56, 24);
		contentPanel.add(lblTamao);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMaterial.setBounds(12, 173, 56, 24);
		contentPanel.add(lblMaterial);
		
		cbomarca = new JComboBox<String>();
		cbomarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cbomarca.setBackground(new Color(250, 250, 210));
		cbomarca.addActionListener(this);
		cbomarca.setModel(new DefaultComboBoxModel<String>(new String[] {Tienda.marca0, Tienda.marca1, Tienda.marca2, Tienda.marca3, Tienda.marca4}));
		cbomarca.setBounds(124, 11, 264, 31);
		contentPanel.add(cbomarca);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPrecio.setBackground(new Color(250, 250, 210));
		textFieldPrecio.setText(String.valueOf(Tienda.precio0));
		textFieldPrecio.setEditable(false);
		textFieldPrecio.setBounds(124, 50, 264, 31);
		contentPanel.add(textFieldPrecio);
		textFieldPrecio.setColumns(10);
		
		textFieldGarantia = new JTextField();
		textFieldGarantia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldGarantia.setBackground(new Color(250, 250, 210));
		textFieldGarantia.setText(String.valueOf(Tienda.garantia0));
		textFieldGarantia.setEditable(false);
		textFieldGarantia.setBounds(124, 90, 264, 31);
		contentPanel.add(textFieldGarantia);
		textFieldGarantia.setColumns(10);
		
		textFieldTamaño = new JTextField();
		textFieldTamaño.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldTamaño.setBackground(new Color(250, 250, 210));
		textFieldTamaño.setText(String.valueOf(Tienda.tamaño0));
		textFieldTamaño.setEditable(false);
		textFieldTamaño.setBounds(124, 130, 264, 31);
		contentPanel.add(textFieldTamaño);
		textFieldTamaño.setColumns(10);
		
		textFieldMaterial = new JTextField();
		textFieldMaterial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldMaterial.setBackground(new Color(250, 250, 210));
		textFieldMaterial.setText(Tienda.material0+"");
		textFieldMaterial.setEditable(false);
		textFieldMaterial.setBounds(124, 170, 264, 31);
		contentPanel.add(textFieldMaterial);
		textFieldMaterial.setColumns(10);
		
		Image img= new ImageIcon("imagenes/cerrar.png").getImage();
		ImageIcon img2=new ImageIcon(img.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCerrar.setIcon(img2);
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(455, 14, 97, 25);
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
