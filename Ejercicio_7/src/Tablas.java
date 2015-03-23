import java.util.*;

public class Tablas {
	

	public static void main(String [] args){
		
		int x=1,b=11,resultado=0;
		Scanner in=new Scanner(System.in);
		System.out.println("El siguiente programa calcula las tablas de multiplicar");
		System.out.println("del 1 al 10, del número que usted ingrese");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Ingrese el número el cual usted desee saber las tablas de multiplicar: ");
		x=in.nextInt();
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		System.out.println("Tabla de multiplicar del "+ x + " :");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		for (int i=10;i>0; i--){
			
			--b;
			resultado=x*b;
			System.out.println( x + " x " +b +" = "+resultado);
			
		}
	}
	
	
}
