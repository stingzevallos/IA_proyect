package cibertec;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// Nombre de la Tienda
	public static String NOMBRE_TIENDA = "DREAM";

	// Datos de los desarrolladores de la aplicacion
	public static String desarrollador1 = "Sting Luis Zevallos Baca";
	public static String desarrollador2 = "Merisabel Ruelas Quenaya";
	public static String desarrollador3 = "Loida Elizabeth Cubas Romero";

	// Datos m�nimos del primer colch�n
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tama�o0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";
	public static int ventas0 = 0;
	public static int unidadesVendidas0 = 0;

	// Datos m�nimos del segundo colch�n
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia1 = 10;
	public static String tama�o1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algod�n Org�nico";
	public static int ventas1 = 0;
	public static int unidadesVendidas1 = 0;

	// Datos m�nimos del tercer colch�n
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tama�o2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";
	public static int ventas2 = 0;
	public static int unidadesVendidas2 = 0;

	// Datos m�nimos del cuarto colch�n
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tama�o3 = "Queen";
	public static String material3 = "Jacquard";
	public static int ventas3 = 0;
	public static int unidadesVendidas3 = 0;

	// Datos m�nimos del quinto colch�n
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tama�o4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";
	public static int ventas4 = 0;
	public static int unidadesVendidas4 = 0;

	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;

	// Cantidad �ptima de colchones vendidos
	public static int cantidadOptima = 10;

	// Cantidad m�nima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;

	// Obsequio por cantidad m�nima de colchones adquiridos
	public static String obsequio = "USB";

	// N�mero de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;

	// Premio sorpresa
	public static String premioSorpresa = "Un polo";

	// Cantidad de clientes atendidos
	public static int numeroCliente = 0;

	// Usuario y contrase�a
	private static String usuario1 = "admin", contrase�a1 = "12345";
	private static String usuario2 = "vendedor", contrase�a2 = "123456";

	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenu mnConfiguracion;
	private JMenu mnAyuda;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarColchon;
	private JMenuItem mntmModificarColchon;
	private JMenuItem mntmListarColchones;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequio;
	private JMenuItem mntmConfigurarCantidadOptima;
	private JMenuItem mntmConfigurarPremioSorpresa;
	private JMenuItem mntmAcercaDeTienda;
	private JLabel lblContrase�a;
	private JTextField txtUsuario;
	private JButton btnProcesar;
	private JButton btnBorrar;
	private JPasswordField pswContrase�a;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel label;
	private JMenuItem mntmCerrarSesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setBackground(Color.WHITE);
		setFont(new Font("Dialog", Font.PLAIN, 24));
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes/dream.png"));
		setTitle(NOMBRE_TIENDA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 450);

		menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		menuBar.setBackground(Color.CYAN);
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		mnArchivo.setBackground(Color.WHITE);
		mnArchivo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnArchivo.setEnabled(false);
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setBackground(Color.WHITE);
		mntmSalir.addActionListener(this);
		
		mntmCerrarSesion = new JMenuItem("Cerrar Sesion");
		mntmCerrarSesion.addActionListener(this);
		mnArchivo.add(mntmCerrarSesion);
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnMantenimiento.setEnabled(false);
		menuBar.add(mnMantenimiento);

		mntmConsultarColchon = new JMenuItem("Consultar colch\u00F3n");
		mntmConsultarColchon.addActionListener(this);
		mnMantenimiento.add(mntmConsultarColchon);

		mntmModificarColchon = new JMenuItem("Modificar colch\u00F3n");
		mntmModificarColchon.addActionListener(this);
		mnMantenimiento.add(mntmModificarColchon);

		mntmListarColchones = new JMenuItem("Listar colchones");
		mntmListarColchones.addActionListener(this);
		mnMantenimiento.add(mntmListarColchones);

		mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnVentas.setEnabled(false);
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);

		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);

		mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnConfiguracion.setEnabled(false);
		menuBar.add(mnConfiguracion);

		mntmConfigurarDescuentos = new JMenuItem("Configurar descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarDescuentos);

		mntmConfigurarObsequio = new JMenuItem("Configurar obsequio");
		mntmConfigurarObsequio.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarObsequio);

		mntmConfigurarCantidadOptima = new JMenuItem("Configurar cantidad optima de colchones vendidos");
		mntmConfigurarCantidadOptima.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarCantidadOptima);

		mntmConfigurarPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmConfigurarPremioSorpresa.addActionListener(this);
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);

		mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnAyuda.setBackground(Color.WHITE);
		mnAyuda.setEnabled(false);
		menuBar.add(mnAyuda);

		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtUsuario.setBounds(273, 84, 133, 36);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		btnProcesar = new JButton("Procesar");
		btnProcesar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnProcesar.setIcon(new ImageIcon("imagenes/procesar.gif"));
		btnProcesar.addActionListener(this);

		Image img = new ImageIcon("imagenes/locked.png").getImage();
		ImageIcon img2 = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

		lblContrase�a = new JLabel("");
		lblContrase�a.setIcon(img2);
		lblContrase�a.setBounds(195, 142, 75, 67);
		contentPane.add(lblContrase�a);
		btnProcesar.setBounds(446, 84, 133, 35);
		contentPane.add(btnProcesar);

		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBorrar.setIcon(new ImageIcon("imagenes/borrar.gif"));
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(446, 130, 133, 31);
		contentPane.add(btnBorrar);

		pswContrase�a = new JPasswordField();
		pswContrase�a.setFont(new Font("Tahoma", Font.PLAIN, 17));
		pswContrase�a.setBounds(273, 158, 133, 36);
		contentPane.add(pswContrase�a);

		// imagen
		Image iconoImagen = new ImageIcon("imagenes/user.png").getImage();
		ImageIcon icono = new ImageIcon(iconoImagen.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

		label = new JLabel("");
		label.setIcon(icono);
		label.setBounds(195, 74, 66, 55);
		contentPane.add(label);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Trajan Pro", Font.PLAIN, 15));
		lblNewLabel.setIcon(new ImageIcon("imagenes/fondo-blanco.jpg"));
		lblNewLabel.setBounds(142, 43, 460, 196);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes/fondo-celeste-trans.png"));
		lblNewLabel_1.setBounds(0, 0, 732, 377);
		contentPane.add(lblNewLabel_1);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
		else if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		else if (e.getSource() == mntmListarColchones) {
			actionPerformedMntmListarColchones(e);
		}
		else if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		else if (e.getSource() == mntmModificarColchon) {
			actionPerformedMntmModificarColchon(e);
		}
		else if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		else if (e.getSource() == mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(e);
		}
		else if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		else if (e.getSource() == mntmConfigurarObsequio) {
			actionPerformedMntmConfigurarObsequio(e);
		}
		else if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		else if (e.getSource() == mntmConsultarColchon) {
			actionPerformedMntmConsultarColchon(e);
		}
		else if (e.getSource() == mntmConfigurarCantidadOptima) {
			actionPerformedMntmConfigurarCantidaOptima(e);
		}
		else if (e.getSource() == mntmConfigurarPremioSorpresa) {
			actionPerformedMntmConfigurarPremioSorpresa(e);
		}
		else if (e.getSource() == mntmCerrarSesion) {
			actionPerformedMntnCerrarSesion(e);
		}
	}

	private void actionPerformedMntnCerrarSesion(ActionEvent e) {
		mnArchivo.setEnabled(false);
		mnMantenimiento.setEnabled(false);
		mnVentas.setEnabled(false);
		mnConfiguracion.setEnabled(false);
		mnAyuda.setEnabled(false);
		txtUsuario.setText("");
		txtUsuario.setEnabled(true);
		pswContrase�a.setText("");
		pswContrase�a.setEnabled(true);
		btnProcesar.setEnabled(true);
		btnBorrar.setEnabled(true);
	}

	private void actionPerformedMntmConfigurarPremioSorpresa(ActionEvent e) {
		DialogConfigurarPremioSorpresa viewConfigurarPremioSorpresa = new DialogConfigurarPremioSorpresa();
		viewConfigurarPremioSorpresa.setVisible(true);
	}

	private void actionPerformedMntmConsultarColchon(ActionEvent e) {
		DialogConsultarColchon viewConsultarColchon = new DialogConsultarColchon();
		viewConsultarColchon.setVisible(true);
	}

	protected void actionPerformedMntmSalir(ActionEvent e) {
		int salir = JOptionPane.showConfirmDialog(this, "Exit Tienda 1.0 ?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
		if (salir == 0)
			System.exit(0);
	}

	protected void actionPerformedMntmModificarColchon(ActionEvent e) {
		DialogModificarColchon viewModificarColchon = new DialogModificarColchon();
		viewModificarColchon.setVisible(true);
	}

	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogVender viewVender = new DialogVender();
		viewVender.setVisible(true);
	}

	protected void actionPerformedMntmListarColchones(ActionEvent e) {
		DialogListarColchon viewListar = new DialogListarColchon();
		viewListar.setVisible(true);
	}

	protected void actionPerformedMntmGenerarReportes(ActionEvent e) {
		DialogGenerarReportes viewGenerarReportes = new DialogGenerarReportes();
		viewGenerarReportes.setVisible(true);
	}

	private void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		DialogConfigurarDescuentos viewConfigurarDescuentos = new DialogConfigurarDescuentos();
		viewConfigurarDescuentos.setVisible(true);
	}

	private void actionPerformedMntmConfigurarObsequio(ActionEvent e) {
		DialogConfigurarObsequio viewConfigurarObsequio = new DialogConfigurarObsequio();
		viewConfigurarObsequio.setVisible(true);
	}

	private void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		DialogAcercaTienda viewAcercaTienda = new DialogAcercaTienda();
		viewAcercaTienda.setVisible(true);
	}

	private void actionPerformedMntmConfigurarCantidaOptima(ActionEvent e) {
		DialogConfigurarCantidadOptimaColchones viewConfigurarCantidadOptima = new DialogConfigurarCantidadOptimaColchones();
		viewConfigurarCantidadOptima.setVisible(true);
	}

	protected void actionPerformedBtnProcesar(ActionEvent e) {
		String xUsuario = leerUsuario();
		if (xUsuario.equals(usuario1)) {
			String xContrase�a = leerContrasenia();
			if (xContrase�a.equals(contrase�a1))
				mensaje("BIENVENIDO ADMINISTRADOR");
			else {
				mensaje1("CONTRASE�A incorrecta");
				pswContrase�a.setText("");
				pswContrase�a.requestFocus();
			}
		}
		else if (xUsuario.equals(usuario2)) {
			String xContrase�a = leerContrasenia();
			if (xContrase�a.equals(contrase�a2))
				mensaje("BIENVENIDO VENDEDOR");
			else {
				mensaje1("CONTRASE�A incorrecta");
				pswContrase�a.setText("");
				pswContrase�a.requestFocus();
			}
		}
		else if (xUsuario.isEmpty()) {
			mensaje1("Los campos est�n vac�os");
			txtUsuario.setText("");
			txtUsuario.requestFocus();
		}
		else {
			mensaje1("USUARIO incorrecto");
			txtUsuario.setText("");
			pswContrase�a.setText("");
			txtUsuario.requestFocus();
		}
	}

	// M�todos tipo void (con par�metros)
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
		mnArchivo.setEnabled(true);
		mnMantenimiento.setEnabled(true);
		mnVentas.setEnabled(true);
		mnConfiguracion.setEnabled(true);
		mnAyuda.setEnabled(true);
		txtUsuario.setText("");
		txtUsuario.setEnabled(false);
		pswContrase�a.setText("");
		pswContrase�a.setEnabled(false);
		btnProcesar.setEnabled(false);
		btnBorrar.setEnabled(false);
	}

	void mensaje1(String s) {
		JOptionPane.showMessageDialog(this, s);
		mnArchivo.setEnabled(false);
		mnMantenimiento.setEnabled(false);
		mnVentas.setEnabled(false);
		mnConfiguracion.setEnabled(false);
		mnAyuda.setEnabled(false);
	}

	// M�todos que retornan valor (sin par�metros)
	String leerUsuario() {
		return txtUsuario.getText().trim();
	}

	String leerContrasenia() {
		return new String(pswContrase�a.getPassword());
	}

	protected void actionPerformedBtnBorrar(ActionEvent e) {
		txtUsuario.setText("");
		pswContrase�a.setText("");
		txtUsuario.requestFocus();
	}
}
