package cibertec;

import java.awt.EventQueue;

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

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Datos de los desarrolladores de la aplicacion
	public static String desarrollador1 = "Sting Luis Zevallos Baca";
	public static String desarrollador2 = "Merisabel Ruelas Quenaya";
	public static String desarrollador3 = "Loida Elizabeth Cubas Romero";
	public static String desarrollador4 = "Leidy Danitza Larico Alvarez";
			
	
	// Datos mínimos del primer colchón
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;                                          
	public static int garantia0 = 7;                                               
	public static String tamaño0 = "1 1/2 Plaza";                                  
	public static String material0 = "Tela Tricot Acolchada";                      
	public static int ventas0 = 0;                                                 
	public static int unidadesVendidas0 = 0;

	// Datos mínimos del segundo colchón
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia1 = 10;
	public static String tamaño1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algodón Orgánico";                      
	public static int ventas1 = 0;                                                 
	public static int unidadesVendidas1 = 0;
	
	// Datos mínimos del tercer colchón
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tamaño2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";                      
	public static int ventas2 = 0;                                                 
	public static int unidadesVendidas2 = 0;
	
	// Datos mínimos del cuarto colchón
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tamaño3 = "Queen";
	public static String material3 = "Jacquard";                      
	public static int ventas3 = 0;                                                 
	public static int unidadesVendidas3 = 0;
	
	// Datos mínimos del quinto colchón
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tamaño4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";                      
	public static int ventas4 = 0;                                                 
	public static int unidadesVendidas4 = 0;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Cantidad óptima de colchones vendidos
	public static int cantidadOptima = 10;
	
	// Cantidad mínima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;
		
	// Obsequio por cantidad mínima de colchones adquiridos
	public static String obsequio = "USB";
	
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	
	// Cantidad de clientes atendidos
	public static int numeroCliente = 0;
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
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
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfiguracion = new JMenu("Configuraci\u00F3n");
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
		mntmConfigurarPremioSorpresa.addActionListener(this) ;
		mnConfiguracion.add(mntmConfigurarPremioSorpresa);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnAyuda.add(mntmAcercaDeTienda);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == mntmListarColchones ) {
			actionPerformedMntmListarColchones(e);
		}
		if ( e.getSource() == mntmVender ) {
			actionPerformedMntmVender(e);
		}
		if ( e.getSource() == mntmModificarColchon ) {
			actionPerformedMntmModificarColchon(e);
		}
		if (e.getSource() == mntmSalir ) {
			actionPerformedMntmSalir(e);
		}
		if ( e.getSource() == mntmGenerarReportes ) {
			actionPerformedMntmGenerarReportes(e);
		}
		if ( e.getSource() == mntmConfigurarDescuentos ) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
		if ( e.getSource() == mntmConfigurarObsequio ) {
			actionPerformedMntmConfigurarObsequio(e);
		}
		if ( e.getSource() == mntmAcercaDeTienda ) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		if ( e.getSource() == mntmConsultarColchon ) {
			actionPerformedMntmConsultarColchon(e);
		}
		if ( e.getSource() == mntmConfigurarCantidadOptima ) {
			actionPerformedMntmConfigurarCantidaOptima(e);
		}
		if( e.getSource() == mntmConfigurarPremioSorpresa ) {
			actionPerformedMntmConfigurarPremioSorpresa(e);
		}
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
		if ( salir == 0 )
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
	
}
