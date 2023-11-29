package mvc_EventoBoton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controle {
	
	private ModeloDatos Mi_ModeloDatos;
	private VentanaEventoBoton Mi_VentanaEventoBoton;

	/**
	 * El constructor de "Controle"
	 * @param mi_ModeloDatos         - tipo {@link ModeloDatos}
	 * @param mi_VentanaEventoBoton  - tipo {@link VentanaEventoBoton}
	 */
	public Controle(ModeloDatos mi_ModeloDatos, VentanaEventoBoton mi_VentanaEventoBoton) {
		super();
		Mi_ModeloDatos = mi_ModeloDatos;
		Mi_VentanaEventoBoton = mi_VentanaEventoBoton;
		
		Mi_VentanaEventoBoton.bBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Hola");
			}
		});
	}
	
	/**
	 * M�todo iniciador del interfaz
	 */
	public void iniciarVista() {
		Mi_ModeloDatos.setNombreVentana("Ventanita Principal");
		
		Mi_VentanaEventoBoton.setTitle(Mi_ModeloDatos.getNombreVentana() );
		Mi_VentanaEventoBoton.setVisible(true);
		Mi_VentanaEventoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
