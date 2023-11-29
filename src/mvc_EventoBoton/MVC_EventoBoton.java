package mvc_EventoBoton;

/**
 * Clase principal del proyecto
 * @author Sergio Teacher
 * @version 1.0
 */
public class MVC_EventoBoton {

	/**
	 * Método estático iniciador
	 * @param args - Valores de inicio tipo String.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando programa ...");
		ModeloDatos un_ModeloDatos = new ModeloDatos();
		VentanaEventoBoton una_VentanaEventoBoton = new VentanaEventoBoton();
		Controle un_Controle = new Controle(un_ModeloDatos,una_VentanaEventoBoton);
		
		un_Controle.iniciarVista();
	}

}
