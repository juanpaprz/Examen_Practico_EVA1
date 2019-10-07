
public class Principal {

    public static void main(String[] args) {
     int[]arreglo= new int[15];
        for (int i = 0; i <arreglo.length; i++) {
            if (i%2!=0) {
                arreglo[i]=(int)(Math.random()*99)+1;  
            }else{
            arreglo[i]=2*((int)(Math.random()*49)+1);
            }
        }
        Imprimir(arreglo);
    }//main
    public static void Imprimir(int[]args){
        for (int i = 0; i <args.length; i++) {
            System.out.print("[" + args[i]+ "]");
        }
    }
}//class
    
    

