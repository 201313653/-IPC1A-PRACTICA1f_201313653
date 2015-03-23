import java.util.*;


public class Primos {

	public static void main(String [] args){
		Scanner in=new Scanner (System.in);
		double raiz=0;
		int div=0;
		
		System.out.println("Ingrese el número: ");
		int num=in.nextInt();
		
		
		
		//Imprime los numeros hasta el numero ingresado
		for(int i=1; i<=num; i++){
			div=0;
			raiz=Math.sqrt(i); //Saca la raiz de los numeros que va imprimiendo	
			//Aca ya evalua la raiz, y solo va analizando los numeros de 1 hasta la raiz del 
			//numero que se haya ingresado
			for (int j=1; j<=raiz; j++){
				//Aca analiza analiza que los numeros 
				if (i%j==0)
					div++;
				
			}
					if (div<=1)
						System.out.println(i);
		}
	
			
			
		}
		
		
			
		
	}
	


