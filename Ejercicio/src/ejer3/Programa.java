package ejer3;
import java.util.Scanner;
public class Programa {
	Scanner entrada=new Scanner(System.in);
	
	void iniciar(){
		String or1, or2;
		or1=cargarString();
		or2=cargarString();
		menu(or1,or2);

}
	String cargarString(){
		
	}

	void menu(String a, String b){
		int opcion;
		do {
			System.out.println("1. Imprimir cadenas y su largo");
			System.out.println("2. Comparar igualdad de cadenas");
			System.out.println("3. Modificar cadena a mayúscula o minúscula");
			System.out.println("4. Cargar nuevamente ambos string");
			System.out.println("5. Salir");
			System.out.println("Elija una opción: ");
			opcion=entrada.nextInt();
		}while(opcion<0 || opcion>5){
			switch(opcion) {
			case 1:
				int largo = a.length();
			System.out.println("El largo es:"+ a);
				
			}
			
		}
		
		
		
	}
}