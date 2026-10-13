import java.util.Scanner;
public class Application1{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("donner un nombre");
        double n=scanner.nextDouble(); 
        System.out.println("donner un autre nombre");
        double m=scanner.nextDouble();
        if (m<n){
            System.out.println(n+"est superieur a"+m);

        }else{
            System.out.println(m+" est superieur a "+n);
        }

    }
}