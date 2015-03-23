import java.util.*;

public class cadena {


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String nuestraPalabra = null;
		
		
		System.out.println("Ingrese cadena de texto: ");
		nuestraPalabra=in.nextLine();
		
		System.out.println("-----------------------------------");
		muestraCaracteres(nuestraPalabra);
		System.out.println();
		cantAsteriscos(nuestraPalabra);

	}


	public static void muestraCaracteres(String palabra) {

		char[] caracteres = new char[palabra.length()];
		
		for (int i = 0; i < palabra.length(); i++) {

			caracteres[i] = (char)palabra.charAt(i);
			
			System.out.print(caracteres[i]);
			
			
		}
		
		
		
	}
	
	public static void cantAsteriscos(String asteriscos){
char[] caracteres = new char[asteriscos.length()];
		
		for (int i = 0; i < asteriscos.length(); i++) {

			caracteres[i] = (char)asteriscos.charAt(i);
			
			System.out.print("*");
			
			
		}
		
	}
	
}
