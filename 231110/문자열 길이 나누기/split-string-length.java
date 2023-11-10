import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = "";
        for(int i=1; i<=n; i++){
            str += br.readLine();
        }

        System.out.println(str.substring(0, (int)str.length()/2));
        System.out.println(str.substring((int) str.length()/2, str.length()));
    }
}