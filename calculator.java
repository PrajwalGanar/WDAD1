import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
 
 Scanner sc = new Scanner(System.in);
 int ch , a, b;
 do{
    System.out.println("\n 1) Add \n 2) Subtract \n 3) Multiply \n 4) Divide \n 5) Exit");
    ch =sc.nextInt();

   switch(ch){
    case 1:
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println(a+b);
         break;
    case 2:
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println(a-b);
         break;
     case 3:
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println(a*b);
         break;

    case 4:
         a = sc.nextInt();
         b = sc.nextInt();
         System.out.println(a/b);
         break;

     case 5:
         System.out.println("Thankyou");
         break;
   }
    
     }while(ch!=5);
}
}