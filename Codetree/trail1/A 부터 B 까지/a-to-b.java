import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a + " ");
        int i = a;
        while(true){
            if(i%2==0){
                i +=3;
                if(i>b) {
                break;
            }
                System.out.print(i + " ");
            }
            else if(i%2 != 0){
                i*=2;
                if(i>b) {
                break;
            }
                System.out.print(i + " ");
            }
            if(i>b) {
                break;
            }
        }
    }
}