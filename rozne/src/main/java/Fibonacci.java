public class Fibonacci {
    public static void main(String[] args) {
        int numbers[] = new int[23];
        numbers[1]=1;
        numbers[0]=1;
        for (int i=2; i<numbers.length; i++)
            numbers[i]=numbers[i-2]+numbers[i-1];

        for (int i=0; i<numbers.length; i++)
            System.out.println(i+1 + " liczba = " + numbers[i]);
    }
}

