import java.util.Scanner;

class Voiture {
    private String marque;
    private int vitesse;
    private String couleur;

    // Constructeur
    public Voiture(String marque, int vitesse, String couleur) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.couleur = couleur;
    }

    // Accélérer la voiture
    public void accelerer(int valeur) {
        vitesse = vitesse + valeur;
    }

    // Getter marque
    public String getMarque() {
        return marque;
    }

    // Getter couleur
    public String getCouleur() {
        return couleur;
    }

    // Setter couleur
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Getter vitesse
    public int getVitesse() {
        return vitesse;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Saisie des informations
        System.out.print("Donner la marque : ");
        String marque = sc.nextLine();

        System.out.print("Donner la vitesse : ");
        int vitesse = sc.nextInt();
        sc.nextLine();

        System.out.print("Donner la couleur : ");
        String couleur = sc.nextLine();

        // Création de l'objet
        Voiture v1 = new Voiture(marque, vitesse, couleur);

        // Affichage des informations
        System.out.println("\n--- Informations de la voiture ---");
        System.out.println("Marque : " + v1.getMarque());
        System.out.println("Vitesse : " + v1.getVitesse());
        System.out.println("Couleur : " + v1.getCouleur());

        // Accélération
        System.out.print("\nDonner la valeur d'accélération : ");
        int valeur = sc.nextInt();
        v1.accelerer(valeur);

        System.out.println("Nouvelle vitesse : " + v1.getVitesse());

        // Modification de la couleur
        sc.nextLine();
        System.out.print("Donner la nouvelle couleur : ");
        String nouvelleCouleur = sc.nextLine();

        v1.setCouleur(nouvelleCouleur);

        System.out.println("Nouvelle couleur : " + v1.getCouleur());

        sc.close();
    }}

