package ejer2;
import java.util.Scanner;
public class Programa {
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
		
		do {
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			System.out.println(resul);
		}
			while(resul!=0);
			System.out.println("Felicitaciones acertaste!!");
	}
			int generarAleatorio() {
			
		}
		
			int pedirNumero() {
			Scanner entrada=new Scanner(System.in);
			System.out.print("Ingrese un Número:");
			num=entrada.nextInt();
		
		}
		
			int compararNumeros(int a, int b) {
			
	}
}
