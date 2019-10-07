
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sLeer = new Scanner(System.in);
        int aiValores[] = new int[15];
        ArrayList<Integer> alValores = new ArrayList();
        for (int i = 0; i < aiValores.length; i++) {
            aiValores[i] = (int) (Math.random() * 100) + 1;
        }
        ImprimirArreglo(aiValores);
        System.out.println("Introduzca un valor");
        int iBorrar = sLeer.nextInt();
        sLeer.nextLine();
        for (int i = 0; i < aiValores.length; i++) {
            if (iBorrar != aiValores[i]) {
                alValores.add(aiValores[i]);
            } 
        }
        for (int i = 0; i < aiValores.length; i++) {
            try{
                aiValores[i] = alValores.get(i);
            } catch(Exception e) {
                aiValores[i] = 0;
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
