package arreglos_00;
/**
 * Programa que solicita, almacena y visualiza 100 numeros.
 * 04 programa -- Martes 12/09/2023
 * @author Ricardo Daniel Hernandez Sosa G301
 */
import java.util.Scanner;
public class Arreglos_00 {
        public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        float [] num = new float [101];
        for(int i=1;i<=101;i++){
            System.out.print(i+".- Numero: ");
            num[i] = sn.nextFloat();
        }
        System.out.println();
        System.out.println("Estos son los numeros que ingreso...");
        for(int i=1;i<=101;i++){
            System.out.println(i+".- Numero: "+num[i]);
        }
    }
    
}
