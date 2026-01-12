import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Amath = sc.nextInt();
        int Aenglish = sc.nextInt();
        int Bmath = sc.nextInt();
        int Benglish = sc.nextInt();
        if(Amath > Bmath && Aenglish >Benglish){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}