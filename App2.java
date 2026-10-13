
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        double m;
        System.out.println("veuillez saisir un nombre n");
        System.out.println("veuillez saisir un nombre m");
        n=scanner.nextDouble();
        m=scanner.nextDouble();
        if (n>m){
            System.out.println(n);
        
        }else{
            System.out.println(m);
        }
    }
}
