import java.util.*;


public class Operaciones {
protected int x=0;
Scanner ingresar= new Scanner(System.in);

//En esta sección estan escritos los metodos que va a realizar el programa
//Segun el usuario lo indique

public void circulo(){
	System.out.println("Ingrese el radio del circulo: ");
	x=ingresar.nextInt();
	
	double pi =3.1592;
	double area= (pi*(x*x));
	double perimetro= (2*(pi)*(x));
	System.out.println();
	System.out.println("El area del circulo es: " + area);
	System.out.println("El perimetro del circulo es: " + perimetro);
	
		
}

public void cuadrado(){
	
	System.out.println("Ingrese un lado del cuadrado: ");
	x=ingresar.nextInt();
	double area= x*x;
	double perimetro=(4*x);
	System.out.println();
	System.out.println("El area del cuadrado es: "+ area);	
	System.out.println("El perimetro del cuadrado es: "+ perimetro);
	
	
}

public void triangulo(){
	
	System.out.println("Ingrese un lado del triángulo: ");
	x=ingresar.nextInt();
	System.out.println();
	double area= (x*x)*(1.732050808/4);
	double perimetro=(3*x);
	System.out.println();
	
	System.out.println("El area del triángulo es: "+ area);	
	System.out.println("El perimetro del triángulo es: "+ perimetro);

	
	
}




	
	
}
