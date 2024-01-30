import java.util.Arrays;

public class Ex3 {
    public static void main (String[] args) {
        int countConsonants = 0;
        int countVowels = 0;
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] stringsToVerify = {"a", "b", "e", "i", "c", "d", "i", "D", "A"};

        for (String string : stringsToVerify) {
            boolean containsVowels = Arrays.asList(vowels).contains(string.toLowerCase());
            if (containsVowels) {
                countVowels++;
                continue;
            }
            countConsonants++;
        }

        System.out.println("Quantidade de vogais: " + countVowels);
        System.out.println("Quantidade de consoantes: " + countConsonants);
    }
}
