import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String word = s.nextLine();
        int wordLength = word.length();

        boolean isPalindrom = true;
        int backword = (wordLength - 1);
        for (int i = 0; i < wordLength; i++) {

            if (word.charAt(i) != word.charAt(backword)) {
                isPalindrom = false;
            }
            backword--;
        }

        if (isPalindrom) {
            System.out.println("Jest palindromem");
        } else {
            System.out.println("Nie jest palindromem");
        }

    }
}

