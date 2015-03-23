
import java.util.*;

public class Calculadora {
		
	public static void main (String [] args){
		String sumar="s",restar="r",mult="m",div="d";
		Scanner in=new Scanner (System.in);
		ingreso desp=new ingreso();
		Funcion realizar=new Funcion ();
		
		
		
		
		System.out.println("El siguiente programa simula una calculadora simple,");
		System.out.println("donde usted ingresa dos numeros y luego le despliega");
		System.out.println("la opcion que usted desea realizar.");
		System.out.println();	
		System.out.println();
		System.out.println("-----------------------------------------------------");
		
		desp.ingresar();
		System.out.println();	
		System.out.println("-----------------------------------------------------");
		System.out.println("Para realizar la acción que ustede desee, primero debe");	
		System.out.println("ingresar la letra inicial de las siguientes opciones.");
		System.out.println();	
		System.out.println();
		System.out.println("Sumar");
		System.out.println("Restar");
		System.out.println("Multiplicar");
		System.out.println("Dividir");
		System.out.print("Opción: ");
		String Accion=in.nextLine();
		realizar.establecerAccion(Accion);
		
		
		
		if (Accion.equalsIgnoreCase("S")){
			System.out.println();	
			System.out.println();
			System.out.println("-----------------------------------------------------");
			desp.suma();}
			else if (Accion.equalsIgnoreCase("R")){
				System.out.println();	
				System.out.println();
				System.out.println("-----------------------------------------------------");
				desp.resta();}
			else if(Accion.equalsIgnoreCase("M")){
				System.out.println();	
				System.out.println();
				System.out.println("-----------------------------------------------------");
				desp.multiplicar();}
			else if(Accion.equalsIgnoreCase("D")){
				System.out.println();	
				System.out.println();
				System.out.println("-----------------------------------------------------");
				desp.division();
				
			}
		
		
		
		
		
		
		
		
		
			}
		
		
	}
	

	
	

