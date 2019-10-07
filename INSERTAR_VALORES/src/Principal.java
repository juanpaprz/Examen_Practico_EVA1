
import java.util.Arrays;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sLeer = new Scanner(System.in);
        int aiValores[] = new int[15];
        int iDato;
        for (int i = aiValores.length - 1; i >= 0; i--) {
            System.out.println("Introduzca un numero");
            iDato = sLeer.nextInt();
            sLeer.nextLine();
            aiValores[i] = iDato;
            Arrays.sort(aiValores);
            for (int j = 0; j < aiValores.length; j++) {
                System.out.print("[" + aiValores[j] + "]");
            }
            System.out.println("");
        }
    }
    
}
