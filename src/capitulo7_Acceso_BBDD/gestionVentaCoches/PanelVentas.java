package capitulo7_Acceso_BBDD.gestionVentaCoches;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class PanelVentas extends JPanel {

	Ventas actual = null;
	
	private JTextField jtfId;
	private JLabel lblidCliente;
	private JLabel lblidConcesionario;
	private JLabel lblPrecioVenta;
	private JLabel lblidCoche;
	private JLabel lblFecha;
	private JFormattedTextField jtfFecha;
	

	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnBorrar;

	private SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	private JTextField jtfPrecioVenta;
	private JComboBox<Cliente> jcbCliente;
	private JComboBox<Concesionario> jcbConcesionario;
	private JComboBox<Coche> jcbCoche;

	/**
	 * Create the application.
	 */
	public PanelVentas() {
		super();
		initialize();
		cargarDatos();
		this.actual = ControladorVentas.getInstance().findPrimero();
		cargarActualEnPantalla();
	}

	
	private void cargarDatos() {
		List<Coche> coches = ControladorCoche.getInstance().findAll();
		List<Cliente> clientes = ControladorCliente.getInstance().findAll();
		List<Concesionario> concesionarios = ControladorConcesionario.getInstance().findAll();

		for (Coche f : coches) {
			this.jcbCoche.addItem(f);
		}
		for (Cliente c : clientes) {
			this.jcbCliente.addItem(c);
		}
		for (Concesionario c : concesionarios) {
			this.jcbConcesionario.addItem(c);
		}
	}
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfFecha.setText(this.formatoFecha.format(this.actual.getFecha()));
			this.jtfPrecioVenta.setText("" + this.actual.getPrecioVenta());
			
			// para mostrar los clientes
			for (int j = 0; j < jcbCliente.getItemCount(); j++) {
				if (this.actual.getidCliente() == this.jcbCliente.getItemAt(j).getId()) {
					this.jcbCliente.setSelectedIndex(j);
				}

			}

			//para mostrar los concesionarios
			for (int j = 0; j < jcbConcesionario.getItemCount(); j++) {
				if (this.actual.getidConcesionario() == this.jcbConcesionario.getItemAt(j).getId()) {
					this.jcbConcesionario.setSelectedIndex(j);
				}

			}
			//para mostrar los coches
			for (int j = 0; j < jcbCoche.getItemCount(); j++) {
				if (this.actual.getidCoche() == this.jcbCoche.getItemAt(j).getId()) {
					this.jcbCoche.setSelectedIndex(j);
				}
			}
		}
	}
	
	private void guardar () {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificación
			int regsAfec = ControladorVentas.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorVentas.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
			}
		}
	}
	

	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setPrecioVenta(Float.parseFloat(jtfPrecioVenta.getText()));
		try {
			this.actual.setFecha(this.formatoFecha.parse(jtfFecha.getText()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.actual.setidCliente(((Cliente)jcbCliente.getSelectedItem()).getId());
		this.actual.setidConcesionario(((Concesionario)jcbConcesionario.getSelectedItem()).getId());
		this.actual.setidCoche(((Coche)jcbCoche.getSelectedItem()).getId());
		
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jcbCliente.setSelectedItem(null);
		this.jcbConcesionario.setSelectedItem(null);
		this.jcbCoche.setSelectedItem(null);
		this.jtfFecha.setText("");
		this.jtfPrecioVenta.setText("");
	}
	

	/**
	 * 
	 */
	private void borrar() {
		String posiblesRespuestas[] = {"SI","NO"};
		// En esta opciï¿½n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = ControladorVentas.getInstance().borrar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		this.setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		this.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		this.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		lblidCliente = new JLabel("idCliente:");
		GridBagConstraints gbc_lblIdCliente = new GridBagConstraints();
		gbc_lblIdCliente.anchor = GridBagConstraints.EAST;
		gbc_lblIdCliente.fill = GridBagConstraints.VERTICAL;
		gbc_lblIdCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdCliente.gridx = 0;
		gbc_lblIdCliente.gridy = 1;
		this.add(lblidCliente, gbc_lblIdCliente);
		
		jcbCliente = new JComboBox();
		GridBagConstraints gbc_cbidCliente = new GridBagConstraints();
		gbc_cbidCliente.insets = new Insets(0, 0, 5, 0);
		gbc_cbidCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbidCliente.gridx = 1;
		gbc_cbidCliente.gridy = 1;
		add(jcbCliente, gbc_cbidCliente);
		
		lblidConcesionario = new JLabel("idConcesionario");
		GridBagConstraints gbc_lblIdConcesionario = new GridBagConstraints();
		gbc_lblIdConcesionario.anchor = GridBagConstraints.EAST;
		gbc_lblIdConcesionario.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdConcesionario.gridx = 0;
		gbc_lblIdConcesionario.gridy = 2;
		add(lblidConcesionario, gbc_lblIdConcesionario);
		
		jcbConcesionario = new JComboBox();
		GridBagConstraints gbc_cbidConcesionario = new GridBagConstraints();
		gbc_cbidConcesionario.insets = new Insets(0, 0, 5, 0);
		gbc_cbidConcesionario.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbidConcesionario.gridx = 1;
		gbc_cbidConcesionario.gridy = 2;
		add(jcbConcesionario, gbc_cbidConcesionario);
		
		lblidCoche = new JLabel("idCoche:");
		GridBagConstraints gbc_lblIdCoche = new GridBagConstraints();
		gbc_lblIdCoche.anchor = GridBagConstraints.EAST;
		gbc_lblIdCoche.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdCoche.gridx = 0;
		gbc_lblIdCoche.gridy = 3;
		add(lblidCoche, gbc_lblIdCoche);
		
		jcbCoche = new JComboBox();
		GridBagConstraints gbc_cbidCoche = new GridBagConstraints();
		gbc_cbidCoche.insets = new Insets(0, 0, 5, 0);
		gbc_cbidCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbidCoche.gridx = 1;
		gbc_cbidCoche.gridy = 3;
		add(jcbCoche, gbc_cbidCoche);
		
		lblFecha = new JLabel("Fecha:");
		GridBagConstraints gbc_lblFecha = new GridBagConstraints();
		gbc_lblFecha.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblFecha.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha.gridx = 0;
		gbc_lblFecha.gridy = 4;
		this.add(lblFecha, gbc_lblFecha);
		
		jtfFecha = new JFormattedTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 4;
		this.add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		lblPrecioVenta = new JLabel("Precio venta:");
		GridBagConstraints gbc_lblPrecioVenta = new GridBagConstraints();
		gbc_lblPrecioVenta.anchor = GridBagConstraints.EAST;
		gbc_lblPrecioVenta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioVenta.gridx = 0;
		gbc_lblPrecioVenta.gridy = 5;
		add(lblPrecioVenta, gbc_lblPrecioVenta);
		
		jtfPrecioVenta = new JTextField();
		GridBagConstraints gbc_jtfPrecioVenta = new GridBagConstraints();
		gbc_jtfPrecioVenta.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPrecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrecioVenta.gridx = 1;
		gbc_jtfPrecioVenta.gridy = 5;
		add(jtfPrecioVenta, gbc_jtfPrecioVenta);
		jtfPrecioVenta.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 7;
		this.add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVentas.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVentas.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVentas.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVentas.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		panel.add(btnBorrar);
	}
}
