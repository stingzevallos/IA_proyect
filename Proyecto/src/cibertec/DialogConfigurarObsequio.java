package cibertec;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DialogConfigurarObsequio extends JDialog implements ActionListener {
	private final JPanel contentPanel = new JPanel();
	private JTextField txtC;
	private JTextField txtO;
	private JButton btnCancelar; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogConfigurarObsequio dialog = new DialogConfigurarObsequio();
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
	public DialogConfigurarObsequio() {
		setModal(true);
		setTitle("Configurar Obsequio");
		setBounds(100, 100, 527, 138);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Cantidad m\u00EDnima de colchones adquiridos");
			lblNewLabel.setBounds(12, 13, 220, 16);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Obsequio");
			lblNewLabel_1.setBounds(10, 40, 56, 16);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtC = new JTextField();
			txtC.setBounds(242, 10, 116, 22);
			contentPanel.add(txtC);
			txtC.setColumns(10);
		}
		{
			txtO = new JTextField();
			txtO.setBounds(242, 37, 116, 22);
			contentPanel.add(txtO);
			txtO.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(404, 9, 97, 25);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(404, 36, 97, 25);
			contentPanel.add(btnCancelar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

}
