
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sLeer = new Scanner(System.in);
        int aiValores[] = new int[15];
        for (int i = 0; i < aiValores.length; i++) {
            aiValores[i] = (int) (Math.random() * 100) + 1;
        }
        ImprimirArreglo(aiValores);
        System.out.println("Introduzca un valor");
        int iBorrar = sLeer.nextInt();
        sLeer.nextLine();
        for (int i = 0; i < aiValores.length; i++) {
            if (i != aiValores.length -1) {
                if (iBorrar == aiValores[i]) {
                    for (int j = i; j < aiValores.length; j++) {
                        if (j != aiValores.length - 1) {
                            aiValores[j] = aiValores[j + 1];
                        } else {
                            aiValores[j] = 0;
                        }
                    }
                }
            } else {
                if (iBorrar == aiValores[i]){
                    aiValores[i] = 0;
                }
            }
        }
        ImprimirArreglo(aiValores);
    }
    
    public static void ImprimirArreglo(int[] iArreglo){
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.print("[" + iArreglo[i] + "]");
        }
        System.out.println("");
    }
    
}
