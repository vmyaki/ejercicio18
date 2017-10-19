import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaramos variables
		int num;
		
		//Mensaje
		System.out.println("Introduce un número");
		
		do {
		
		Scanner teclado=new Scanner (System.in);
		num=teclado.nextInt();
		
		}
		while(num<0 || num>100);
		System.out.println("Terminamos");
		
		
		
	}

}
