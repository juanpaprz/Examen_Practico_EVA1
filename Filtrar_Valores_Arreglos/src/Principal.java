
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hotel Don Ruben
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner pum = new Scanner(System.in);
    int aiNumeros [] = new int [15];
    for( int i = 0 ;  i <  aiNumeros.length ; i++) {
    aiNumeros [i] = (int) (Math.random() * 50) +1;
    aiNumeros[i] = (aiNumeros[i] * 2);
    for ( int j =0; j<i; j++){
        if (aiNumeros[i] == aiNumeros[j] ) {
            i --;
        }
    }
    
}
    System.out.print("[");
    for (int k =0; k<aiNumeros.length; k++){
    System.out.print(aiNumeros[k] + ",");
    
}
     System.out.print("]"); 
    }
    
    
    
}
