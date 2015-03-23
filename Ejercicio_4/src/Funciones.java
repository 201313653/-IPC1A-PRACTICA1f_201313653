//Función que sirve para almacenar la acción que el usuario desee realizar


public class Funciones {
	private String AccionARealizar;
	
public void establecerAccion(String accion){
		
		AccionARealizar=accion;
		
	}
	
	public String obtenerAccion(){
		
		return AccionARealizar;
	}
	

}
