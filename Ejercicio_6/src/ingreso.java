import java.util.*;


public class ingreso {
	double n1=0,n2=0;
	
	public void ingresar(){
	Scanner in=new Scanner (System.in);
	
	
	System.out.print("Ingrese el primer número: \t");
	n1=in.nextInt();
	System.out.println();
	System.out.print("Ingrese el segundo número: \t");
	n2=in.nextInt();
	System.out.println();

	}
	
	public void suma(){
		double resultado=n1+n2;
		System.out.println("La suma es: "+ resultado);
		
	}
	
	public void resta(){
		double resultado=n1-n2;
		System.out.println("La resta es: "+ resultado);
	}
	
	public void multiplicar(){
		double resultado=n1*n2;
		System.out.println("La multiplicación es: "+ resultado);
	}
	public void division(){
		double resultado=n1/n2;
		System.out.println("La división es: "+ resultado);
	}
}
