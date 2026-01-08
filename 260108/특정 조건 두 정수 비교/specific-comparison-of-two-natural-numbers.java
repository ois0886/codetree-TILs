import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Sysytem.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A < B){
            System.out.println("1 0");
        } else if(A == B){
            System.out.println("0 1");
        } else {
            System.out.println("0 0");
        }
    }
}