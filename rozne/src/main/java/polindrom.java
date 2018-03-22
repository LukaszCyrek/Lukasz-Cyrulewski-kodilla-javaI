import java.util.Scanner;

public class polindrom {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String word = s.nextLine();
        int l = word.length();

        int a=2;
        int backword=(l-1);
        for(int i=0;i<l;i++){

            if(word.charAt(i) != word.charAt(backword))
            { a=1; }
            else
            { a=0; }
            backword--;
        }

        if(a==0)
            System.out.println("Jest palindromem");
        if(a==1)
            System.out.println("Nie jest palindromem");

    }
}

