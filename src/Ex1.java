import java.util.Random;

public class Ex1 {
    public static void main (String[] args) {
        Random random = new Random();
        int[] numbers = {
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100),
            random.nextInt(100)
        };

        System.out.println("Lista desordenada");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Bubble Sort
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = aux;
                }
            }
        }

        System.out.println("Lista ordenada");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}