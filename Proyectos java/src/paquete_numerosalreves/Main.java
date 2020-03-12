package paquete_numerosalreves;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int invertido = 0, resto;
		
		System.out.println("Ingrese un numero entre o y 9999");
        int numero = teclado.nextInt();
        
        if( numero <= 9999 && numero >= 0) {
        	while(numero > 0) {
            	resto = numero % 10;
            	invertido = invertido * 10 + resto;
            	numero /= 10;
            }
            System.out.println("Numero invertido: " + invertido);
        }else {
        	System.out.println("Numero fuera de rango");
        }
        
        
        
	}
}
