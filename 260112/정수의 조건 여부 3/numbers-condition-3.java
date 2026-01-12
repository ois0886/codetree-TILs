import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num % 13 == 0 || num % 19 == 0){
            System.out.println("True");
        } else{
            System.out.println("False");
        }

    }
}