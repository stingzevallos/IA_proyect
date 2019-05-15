package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class DialogConfigurarDescuentos extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarDescuentos dialog = new DialogConfigurarDescuentos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogConfigurarDescuentos() {
		setTitle("Configurar descuentos");
		setBounds(100, 100, 450, 300);

	}

}
