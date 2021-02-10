public class Excercise {
    public static int[] init(int n, int ini, int inc) {
        int[] IntArray = new int[n]; //creamos un array de n elementos
        IntArray[0] = ini; //el primer elemento del array siempre será ini
        for (int i = 1; i < IntArray.length; i++){
           IntArray[i] = IntArray[i-1] + inc; //sumamos al término anterior el incremento que se habrá definido
        }
    return IntArray;
    }
}