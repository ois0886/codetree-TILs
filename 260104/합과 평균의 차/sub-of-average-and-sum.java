import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;
        int avr = sum / 3;
        int diff = sum - avr;
        System.out.println(sum);
        System.out.println(avr);
        System.out.println(diff);
    }
}