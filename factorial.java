import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int result = 1;

        while(n>0){
           result *=n;
           n--;
        }
        System.out.println(result);
    }
}
