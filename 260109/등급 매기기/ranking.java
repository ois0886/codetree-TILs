import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 90) Sysetm.out.println("A");
        else if(num >= 80) Sysetm.out.println("B");
        else if(num >= 70) Sysetm.out.println("C");
        else if(num >= 60) Sysetm.out.println("D");
        else Sysetm.out.println("F");
    }
}