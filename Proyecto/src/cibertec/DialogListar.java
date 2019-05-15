package cibertec;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogListar extends JDialog implements ActionListener {
	private JScrollPane scrollPane;
	private JButton btnListar;
	private JButton btnCerrar;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogListar dialog = new DialogListar();
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
	public DialogListar() {
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
		imprimirColchones();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void imprimirColchones() {
		textArea.append("Marca\t: " + Tienda.marca0 + "\n" +
				"Precio\t: " + Tienda.precio0 + "\n" +
				"Garantia: " + Tienda.garantia0 + "\n" +
				"Tamaño\t: " + Tienda.tamaño0 + "\n" +
				"Material: " + Tienda.material0 + "\n" +
				"\n" + 
				"Marca\t: " + Tienda.marca1 + "\n" +
				"Precio\t: " + Tienda.precio1 + "\n" +
				"Garantia: " + Tienda.garantia1 + "\n" +
				"Tamaño\t: " + Tienda.tamaño1 + "\n" +
				"Material: " + Tienda.material1 + "\n" +
				"\n" + 
				"Marca\t: " + Tienda.marca2 + "\n" +
				"Precio\t: " + Tienda.precio2 + "\n" +
				"Garantia: " + Tienda.garantia2 + "\n" +
				"Tamaño\t: " + Tienda.tamaño2 + "\n" +
				"Material: " + Tienda.material2 + "\n" +
				"\n" + 
				"Marca\t: " + Tienda.marca3 + "\n" +
				"Precio\t: " + Tienda.precio3 + "\n" +
				"Garantia: " + Tienda.garantia3 + "\n" +
				"Tamaño\t: " + Tienda.tamaño3 + "\n" +
				"Material: " + Tienda.material3 + "\n" +
				"\n" + 
				"Marca\t: " + Tienda.marca4 + "\n" +
				"Precio\t: " + Tienda.precio4 + "\n" +
				"Garantia: " + Tienda.garantia4 + "\n" +
				"Tamaño\t: " + Tienda.tamaño4 + "\n" +
				"Material: " + Tienda.material4 + "\n" );
	}
}
