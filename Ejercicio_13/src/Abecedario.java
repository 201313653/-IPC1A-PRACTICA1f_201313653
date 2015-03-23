import java.util.*;

public class Abecedario {

	public static void main(String [] args){
		Scanner in=new Scanner (System.in);
		String letra=null;
		String  abec[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
				"ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		int valor[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		String almacenar=null;
		int posicion=0;
		String ubicacion=null;
		
		
		System.out.println("Ingrese una letra del abecedario: ");
		letra=in.nextLine();
		
		
	for(int i=0; i<valor.length; i++){
		almacenar=abec[i];
		
		if (letra.compareToIgnoreCase(almacenar)==0){
			
			System.out.println("Esta despues de " + abec[i-1]);
			System.out.println("Esta antes de " + abec[i+1]);
			System.out.println("---------------------------------");
			System.out.println("Ingrese la letra correcta: ");
			letra=in.nextLine();{
				if (letra.compareToIgnoreCase(almacenar)<= 0){
					System.out.println("Usted ha adivinado la letra");{
						if (letra.compareToIgnoreCase(almacenar)!=0){
							System.out.println("Esta no es la palabra correcta");
						}
					}
					
				}
			}
			
		}
		
	}
	
	}
	
}

	
