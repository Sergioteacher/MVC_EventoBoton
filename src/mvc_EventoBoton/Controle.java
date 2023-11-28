package mvc_EventoBoton;

import javax.swing.JFrame;

public class Controle {
	
	private ModeloDatos Mi_ModeloDatos;
	private VentanaEventoBoton Mi_VentanaEventoBoton;

	public Controle(ModeloDatos mi_ModeloDatos, VentanaEventoBoton mi_VentanaEventoBoton) {
		super();
		Mi_ModeloDatos = mi_ModeloDatos;
		Mi_VentanaEventoBoton = mi_VentanaEventoBoton;
	}
	
	public void iniciarVista() {
		Mi_ModeloDatos.setNombreVentana("Ventanita Principal");
		
		Mi_VentanaEventoBoton.setTitle(Mi_ModeloDatos.getNombreVentana() );
		Mi_VentanaEventoBoton.setVisible(true);
		Mi_VentanaEventoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
