import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(1 <= input && input <= 100){
            System.out.println(input);
        }else{
            System.out.println("Your score is " + input + " point.");
        }
    }
}