import java.util.Scanner;

public class Notas {
	
	public static void main(String [] args){ 
		
	
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	Scanner in= new Scanner(System.in);
	
	//Va desplegando el ingreso de notas cuando ingresa la primera
	
	for (int i=1; i<7; i++){
		
		if (i==1){
			System.out.print("Ingrese nota 1: \t");
			n1=in.nextInt();}
			else if(i==2){
				System.out.print("Ingrese nota 2: \t");
				n2=in.nextInt();}
			else if(i==3){
				System.out.print("Ingrese nota 3: \t");
				n3=in.nextInt();}
			else if(i==4){
				System.out.print("Ingrese nota 4: \t");
				n4=in.nextInt();}
			else if(i==5){
				System.out.print("Ingrese nota 5: \t");
				n5=in.nextInt();}
			else if(i==6){
				System.out.print("Ingrese nota 6: \t");
				n6=in.nextInt();}
				
			}
	
	System.out.println();
	System.out.println();
	System.out.println("---------------------------");
	System.out.println();
	System.out.println();		
		
	
	//Promedio
	
	int prom=(n1+n2+n3+n4+n5+n6)/6;
	System.out.print("Su promedio es: " + " "+ prom);
	
	System.out.println();
	System.out.println();
	System.out.println("---------------------------");
	System.out.println();
	System.out.println();		
	//Clasificación
	System.out.println("Clasificación");
	System.out.println();
	System.out.println();
	System.out.println("Notas"+"     " + "Puntuación");
	
	//Para nota 1
	if(n1>=90 ){
		System.out.println(n1 +"           "+ "A");}
	else if(n1<=89 && n1>=80){
		System.out.println(n1 +"           "+ "B");}
	else if(n1<=79 && n1>=70){
		System.out.println(n1 +"           "+ "C");}
	else if (n1<=69 && n1>=60){
		System.out.println(n1 +"           "+ "D");}
	else if(n1<59){
		System.out.println(n1 +"           "+ "E");}
	
	//Para nota 2
		if(n2>=90 ){
			System.out.println(n2 +"           "+ "A");}
		else if(n2<=89 && n2>=80){
			System.out.println(n2 +"           "+ "B");}
		else if(n2<=79 && n2>=70){
			System.out.println(n2 +"           "+ "C");}
		else if (n2<=69 && n2>=60){
			System.out.println(n2 +"           "+ "D");}
		else if(n2<59){
			System.out.println(n2 +"           "+ "E");}
		
		//Para nota 3
		if(n3>=90 ){
			System.out.println(n3 +"           "+ "A");}
		else if(n3<=89 && n3>=80){
			System.out.println(n3 +"           "+ "B");}
		else if(n3<=79 && n3>=70){
			System.out.println(n3 +"           "+ "C");}
		else if (n3<=69 && n3>=60){
			System.out.println(n3 +"	       "+ "D");}
		else if(n3<59){
			System.out.println(n3 +"           "+ "E");}
	
		//Para nota 4
		if(n4>=90 ){
			System.out.println(n4 +"           "+ "A");}
		else if(n4<=89 && n4>=80){
			System.out.println(n4 +"           "+ "B");}
		else if(n4<=79 && n4>=70){
			System.out.println(n4 +"           "+ "C");}
		else if (n4<=69 && n4>=60){
			System.out.println(n4 +"           "+ "D");}
		else if(n4<59){
			System.out.println(n4 +"           "+ "E");}
	
		//Para nota 5
		if(n5>=90 ){
			System.out.println(n5 +"           "+ "A");}
		else if(n5<=89 && n5>=80){
			System.out.println(n5 +"           "+ "B");}
		else if(n5<=79 && n5>=70){
			System.out.println(n5 +"           "+ "C");}
		else if (n5<=69 && n5>=60){
			System.out.println(n5 +"           "+ "D");}
		else if(n5<59){
			System.out.println(n5 +"           "+ "E");}
		
		//Para nota 6
		if(n6>=90 ){
			System.out.println(n6 +"           "+ "A");}
		else if(n6<=89 && n6>=80){
			System.out.println(n6 +"           "+ "B");}
		else if(n6<=79 && n6>=70){
			System.out.println(n6 +"           "+ "C");}
		else if (n6<=69 && n6>=60){
			System.out.println(n6 +"           "+ "D");}
		else if(n6<59){
			System.out.println(n6 +"           "+ "E");}
	}	
	
}	
	

