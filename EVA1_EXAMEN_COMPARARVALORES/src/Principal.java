
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[]arreglo =new int[10];
        int[]arreglo2 =new int[10];
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i <arreglo.length; i++) {
            System.out.println("Introduce el valor " + (i+1));
            arreglo[i]=scan.nextInt();
        }
        System.out.println("");
        System.out.println("Arreglo 2:");
        for (int i = 0; i <arreglo2.length; i++) {
            System.out.println("Introduce el valor " + (i+1));
            arreglo2[i]=scan.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==arreglo2[i]) {
                if(i == arreglo.length - 1){
                    Imprimir(arreglo);
                    System.out.println("");
                    Imprimir(arreglo2);
                    System.out.println("");
                    System.out.println("Son iguales");
                }
            } else{
                Imprimir(arreglo);
                System.out.println("");
                Imprimir(arreglo2);
                System.out.println("");
                System.out.println("No son iguales");
                break;
            }
        }
    }
    public static void Imprimir(int[]args){
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" +args[i]+ "]");

        }
    }
    }

