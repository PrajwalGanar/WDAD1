import java.util.*;
public class reversestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        String temp="";
        int k = str.length();
        for(int i=k-1;i>=0;i--){
            temp=temp+ch[i];
        }
        System.out.println(temp);
    }
    
}
