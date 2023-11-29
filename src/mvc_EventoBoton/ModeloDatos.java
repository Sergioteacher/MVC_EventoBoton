package mvc_EventoBoton;

/**
 * La clase Modelo
 * @author Sergio Teacher
 *
 */
public class ModeloDatos {

	/**
	 * Propiedad Nombre del título
	 */
	private String NombreVentana;

	/**
	 * método que obtiene el {@link NombreVentana}
	 * @return {@link NombreVentana}
	 */
	public String getNombreVentana() {
		return NombreVentana;
	}

	/**
	 * método que define el {@link NombreVentana}
	 * @param nombreVentana - tipo {@link NombreVentana}
	 */
	public void setNombreVentana(String nombreVentana) {
		NombreVentana = nombreVentana;
	}
	
}
