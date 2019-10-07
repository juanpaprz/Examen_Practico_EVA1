
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        char[][] Palabras = new char [5][];
        char vacio[];
        Scanner sLeer = new Scanner(System.in);
        Palabras [0] = new char[5];
        Palabras [1] = new char[4];
        Palabras [2] = new char[3];
        Palabras [3] = new char[6];
        Palabras [4] = new char[5];

        Palabras[0][0] = 'p';
        Palabras[0][1] = 'e';
        Palabras[0][2] = 'r';
        Palabras[0][3] = 'r';
        Palabras[0][4] = 'o';

        Palabras[1][0] = 'g';
        Palabras[1][1] = 'a';
        Palabras[1][2] = 't';
        Palabras[1][3] = 'o';

        Palabras[2][0] = 'p';
        Palabras[2][1] = 'e';
        Palabras[2][2] = 'z';

        Palabras[3][0] = 'p';
        Palabras[3][1] = 'e';
        Palabras[3][2] = 'r';
        Palabras[3][3] = 'i';
        Palabras[3][4] = 'c';
        Palabras[3][5] = 'o';

        Palabras[4][0] = 'p';
        Palabras[4][1] = 'o';
        Palabras[4][2] = 'l';
        Palabras[4][3] = 'l';
        Palabras[4][4] = 'o';

        System.out.println("Bienvenido al ahorcado, cuentas con 4 opotunidades para adivinar la palabra");
        System.out.println("La palabra es la siguiente");
        
        int select =(int) (Math.random()*5) +1 ;
        int oportunidades = 4;
        
        vacio = new char[Palabras[select - 1].length];
        LlenarVacio(vacio);
        ImprimirArreglo(vacio);
        Jugar(oportunidades, sLeer, vacio, Palabras[select - 1]);
    }
    
    public static void ImprimirArreglo(char args[]){
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        }
        System.out.println("");
    }
    
    public static void LlenarVacio(char args[]){
        for (int i = 0; i < args.length; i++) {
            args[i] = '_';
        }
    }
    
    public static void Jugar(int oportunidades, Scanner sLeer, char[] vacio, char[] palabra){
        int iGanar = 0;
        while (oportunidades > 0){
            System.out.println("¿Quieres adivinar la palabra? [si/no]");
                String r = sLeer.next();
                if (r.equals("si")) {
                    System.out.println("Teclea la palabra");
                    String pl = sLeer.next();
                    char[] p = pl.toCharArray();
                    int cont = 0;
                    for (int i = 0; i < p.length; i++) {
                        if(palabra[i]==p[i]){
                            cont++;
                        }
                    }
                    if (cont==p.length){
                        System.out.println("Correcto");
                        iGanar = 0;
                        oportunidades = 0;
                    } else if (cont!=p.length){
                        System.out.println("Incorrecto, has perdido");
                        iGanar = 1;
                        oportunidades = 0;
                    }
                } else if (r.equals("no")){
                    System.out.println("Ingrese una letra");
                    String cLetra = sLeer.next();
                    int iCorreto = 0;
                    for (int i = 0; i < vacio.length; i++) {
                        if (cLetra.charAt(0) == palabra[i]) {
                            vacio[i] = cLetra.charAt(0);
                            iCorreto++;
                        } else{
                            if (i == vacio.length - 1 && iCorreto == 0){
                                oportunidades--;
                                System.out.println("Letra incorreta");
                            }
                        }
                    }
                    ImprimirArreglo(vacio);
                    System.out.println("Te quedan " + oportunidades + " oportunidades");
                    iGanar = 0;
                    for (int i = 0; i < vacio.length; i++) {
                        if (vacio[i] == '_'){
                            iGanar++;
                        }
                    }
                    if (iGanar == 0) {
                        oportunidades = 0;
                    }
                }
        }
        if (iGanar == 0) {
            for (int i = 0; i < vacio.length; i++) {
                vacio[i] = palabra[i];
            }
            ImprimirArreglo(vacio);
            System.out.println("Has ganado!");;
        } else{
            for (int i = 0; i < vacio.length; i++) {
                vacio[i] = palabra[i];
            }
            System.out.print("La palabra era ");
            ImprimirArreglo(vacio);
            System.out.println("Has perdido");
        }
    }
    
}
