import java.util.*; 

public class piramideinvertida { 

	public static void main(String[]args) {

		Scanner leer=new Scanner(System.in); 

		int a, b, c, i, x,z;

		System.out.println("Escribir un numero: ");

		x=leer.nextInt();

		c=x;

		for(i=x;i>=1;i--) {

			for(z=i;z>=1;z--) {

				System.out.print(c); }

			c=c-1; 

			System.out.println(" "); }

	}

}
