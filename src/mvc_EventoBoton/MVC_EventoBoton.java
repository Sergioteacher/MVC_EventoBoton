package mvc_EventoBoton;

public class MVC_EventoBoton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando programa ...");
		ModeloDatos un_ModeloDatos = new ModeloDatos();
		VentanaEventoBoton una_VentanaEventoBoton = new VentanaEventoBoton();
		Controle un_Controle = new Controle(un_ModeloDatos,una_VentanaEventoBoton);
		
		un_Controle.iniciarVista();
	}

}
