import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;
        System.out.println("veuillez saisir un nombre");
        n=scanner.nextDouble();
        n=n*2;
        System.out.println(n);
        scanner.close();
    }

}