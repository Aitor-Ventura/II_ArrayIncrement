import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nº de elementos: ");
        int n = input.nextInt();
        System.out.print("Valor inicial: ");
        int ini = input.nextInt();
        System.out.print("Incremento: ");
        int inc = input.nextInt();
        int[] vector = Excercise.init(n, ini, inc);

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);

        }        
        /* Otra poisble forma de escribir un for:
        for (int item : vector){
            System.out.println(item);
        }
        */
    }
}