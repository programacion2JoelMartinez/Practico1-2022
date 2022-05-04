package ejer2;
import java.util.Scanner;
import java.util.Random;
public class Programa {
	void iniciar(){
		
		int valor=generarAleatorio();
		int num;
		int resul;
		
		do {
			num=pedirNumero();
			resul=compararNumeros(num, valor);
			//System.out.println(valor);
			
			if (resul<0) 
				System.out.println("El numero es demasiado chico");
			else if (resul>0) 
				System.out.println("El numero es demasiado grande");
			
			
			
			
		}while(resul!=0);
			System.out.println("Felicitaciones acertaste!!");
	}
	int generarAleatorio() {
				Random numero=new Random();
				int devuelto = numero.nextInt(1000)+1;
				return devuelto;
			
			}
		
	int pedirNumero() {
				int num;
				Scanner entrada=new Scanner(System.in);
				System.out.print("Ingrese un Número:");
				num=entrada.nextInt();
				return num;
		
		}
		
	int compararNumeros(int a, int b) {
				int resultado;
				if (a>b)
					resultado=1;
				else if (a<b)
					resultado=-1;
				else
					resultado=0;
				return resultado;
			
	}
}
