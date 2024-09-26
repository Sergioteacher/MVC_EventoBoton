package mvc_EventoBoton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Controle implements ActionListener {
	
	private ModeloDatos Mi_ModeloDatos;
	private VentanaEventoBoton Mi_VentanaEventoBoton;
	private Integer conta;

	/**
	 * El constructor de "Controle"
	 * @param mi_ModeloDatos         - tipo {@link ModeloDatos}
	 * @param mi_VentanaEventoBoton  - tipo {@link VentanaEventoBoton}
	 */
	public Controle(ModeloDatos mi_ModeloDatos, VentanaEventoBoton mi_VentanaEventoBoton) {
		super();
		this.Mi_ModeloDatos = mi_ModeloDatos;
		this.Mi_VentanaEventoBoton = mi_VentanaEventoBoton;
		conta=0;
		
		//Mi_VentanaEventoBoton
		this.Mi_VentanaEventoBoton.getbBoton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//System.out.println("Hola");
				conta++;
				Mi_VentanaEventoBoton.getLblHola().setText("Hola "+ conta.toString()   +" veces");
				System.out.println("Hola "+ conta.toString()   +" veces");
			}
		}); 
	}
	
	/**
	 * Método iniciador del interfaz
	 */
	public void iniciarVista() {
		Mi_ModeloDatos.setNombreVentana("Ventanita Principal");
		
		Mi_VentanaEventoBoton.setTitle(Mi_ModeloDatos.getNombreVentana() );
		Mi_VentanaEventoBoton.setVisible(true);
		Mi_VentanaEventoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
