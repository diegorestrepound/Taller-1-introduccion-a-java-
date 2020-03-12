package paquete_tablas;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese valor para mostrar la tabla de multiplicar hasta 10");
        int valor = teclado.nextInt();
        
        int i;
        int j;
        
        for(i=1; i<=valor; i++){
        	for(j=1; j<=10; j++){
                System.out.println(j + " x " + i + " = " + (i*j));
            }
        }
	    
	}

}
