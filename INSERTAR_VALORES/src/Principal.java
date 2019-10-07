
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
            aiValores[aiValores.length - 1] = iDato;
            for (int j = aiValores.length - 1; j >= 0; j--) {
                if (j != 0) {
                    if (aiValores[j] < aiValores[j - 1]) {
                        int iTemp = aiValores[j];
                        aiValores[j] = aiValores[j - 1];
                        aiValores[j - 1] = iTemp;
                    } else {
                        break;
                    }
                }
            }
            for (int j = 0; j < aiValores.length; j++) {
                System.out.print("[" + aiValores[j] + "]");
            }
            System.out.println("");
            for (int j = 0; j < aiValores.length; j++) {
                if (j != aiValores.length - 1) {
                    aiValores[j] = aiValores[j + 1];
                } else {
                    aiValores[j] = 0;
                }
            }
        }
    }
    
}
