package cibertec;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogListarColchon extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JButton btnListar;
	private JButton btnCerrar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogListarColchon dialog = new DialogListarColchon();
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
	public DialogListarColchon() {
		setModal(true);
		setTitle("Listado de colchones");
		setBounds(100, 100, 482, 323);
		getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 446, 218);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 240, 446, 33);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			btnListar = new JButton("Listar");
			btnListar.addActionListener(this);
			buttonPane.add(btnListar);
			
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			buttonPane.add(btnCerrar);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		textArea.setText("Listado de colchones" +"\n\n");
		imprimirColchon( Tienda.marca0, Tienda.precio0, Tienda.garantia0, Tienda.tamaño0, Tienda.material0);
		imprimirColchon( Tienda.marca1, Tienda.precio1, Tienda.garantia1, Tienda.tamaño1, Tienda.material1);
		imprimirColchon( Tienda.marca2, Tienda.precio2, Tienda.garantia2, Tienda.tamaño2, Tienda.material2);
		imprimirColchon( Tienda.marca3, Tienda.precio3, Tienda.garantia3, Tienda.tamaño3, Tienda.material3);
		imprimirColchon( Tienda.marca4, Tienda.precio4, Tienda.garantia4, Tienda.tamaño4, Tienda.material4);
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void imprimirColchon( String marca, double precio, int garantia, String tamaño, String material) {
		textArea.append("Marca\t: " + marca + "\n" +
				"Precio\t: " + precio + "\n" +
				"Garantia: " + garantia + "\n" +
				"Tamaño\t: " + tamaño + "\n" +
				"Material: " + material + "\n" +
				"\n" );
	}
	
}
