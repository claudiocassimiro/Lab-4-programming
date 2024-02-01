import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main (String[] args) {
        Random random = new Random();
        int[] result = new int[4];

        int[] array1 = {
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100)
        };
        int[] array2 = {
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100)
        };

        for (int i = 0; i < array1.length; i++) {
            int multiply = array1[i] * array2[i];
            result[i] = multiply;
        }

        System.out.println("Array 1 " + Arrays.toString(array1));
        System.out.println("Array 2 " + Arrays.toString(array2));

        System.out.println("O array resultante com a multiplicação entre os elementos de array 1 e array 2 é: ");

        System.out.println("Result" + Arrays.toString(result));
    }
}
