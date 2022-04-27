package ejer1;
import java.util.Scanner;
public class Programa {
	String apellido;
	int cedula, edad;
	double altura;
	
	Scanner entrada=new Scanner(System.in);
	
	void iniciar () {
		
		cargar();
		imprimir();
		
	}

	private void cargar() {
		System.out.print("Ingrese su Apellido: ");
		apellido=entrada.nextLine();
		System.out.print("Ingrese su Cedula: ");
		cedula=entrada.nextInt();
		System.out.print("Ingrese su Edad: ");
		edad=entrada.nextInt();
		System.out.print("Ingrese su Altura: ");
		altura=entrada.nextDouble();
	}

	private void imprimir() {
		System.out.println("Apellido: "+apellido);
		System.out.println("Cedula: "+cedula);
		System.out.println("Edad: "+edad);
		System.out.println("Altura "+altura);
		
	}

}
