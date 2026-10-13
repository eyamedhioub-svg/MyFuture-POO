import java.util.Scanner;

class Voiture {
    private String marque;
    private int vitesse;
    private String couleur;

    public Voiture(String marque, int vitesse, String couleur) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    public void accelerer() {
        vitesse = vitesse + 10;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getVitesse() {
        return vitesse;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("
         la marque : ");
        String marque = scanner.nextLine();

        System.out.print("Donner la vitesse : ");
        int vitesse = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Donner la couleur : ");
        String couleur = scanner.nextLine();

        Voiture v1 = new Voiture(marque, vitesse, couleur);

        System.out.println("\nInformations de la voiture :");
        System.out.println("Marque : " + v1.getMarque());
        System.out.println("Vitesse : " + v1.getVitesse());
        System.out.println("Couleur : " + v1.getCouleur());

        v1.accelerer();

        System.out.println("Nouvelle vitesse : " + v1.getVitesse());

        scanner.close();
    }
}