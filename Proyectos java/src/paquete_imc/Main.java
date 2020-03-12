package paquete_imc;
import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		double imc;
		
		System.out.println("Ingrese su estatura(mts)");
        double estatura1 = teclado.nextDouble();
        
        System.out.println("Ingrese su peso(kg)");
        double peso = teclado.nextDouble();
        
        
        imc =peso/(estatura1*estatura1);
        
        System.out.println("SU IMC ES: "+ imc);
        
        
        if (imc<18.5) {
            System.out.println("BAJO PESO");
        } else if (imc<=24.9) {
            System.out.println("NORMAL");
        } else if (imc<=29.9) {
            System.out.println("SOBREPESO");
        } else {
            System.out.println("OBESIDAD");
        }
        
        
	}
}
