import java.util.Scanner;  

public class AppBanque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        int solde;
        int choix;
        String nom;
        String prenom;
        int cin;
        int ncompte;
        final double plafond_retrait = 500.00;
        //saisie manuelle des champs
        System.out.println("veuillez saisir votre nom :");
        nom = scanner.nextLine(); 

        System.out.println("veuillez saisir votre prenom :");
        prenom = scanner.nextLine();

        System.out.println("veuillez saisir votre cin :");
        cin =scanner.nextInt();

        System.out.println("veuillez saisir votre ncompte :");
        ncompte =scanner.nextInt();

        System.out.println("veuillez saisir votre solde :");
        solde =scanner.nextInt();

        /* 


        System.out.println("NOM :"+ nom);
        System.out.println("PRENOM :"+ prenom);
        System.out.println("CIN :"+cin);
        System.out.println("NUM DE COMPTE :"+ncompte);


        */
    
        do {
    System.out.println("1.consulter compte");
    System.out.println("2.deposer montant");
    System.out.println("3.relier montant");
    System.out.println("4.Quitter");
    choix = scanner.nextInt();

    switch (choix) {
        case 1:
            System.out.println(nom + " " + prenom + " " + cin);
            System.out.println(ncompte);
            System.out.println(plafond_retrait);
            System.out.println(solde);
            break;
        case 2:
            // deposer...
            break;
        case 3:
            // retirer...
            break;
        case 4:
            System.out.println("Au revoir");
            break;
        default:
            System.out.println("Choix invalide");
    }
}while (choix != 4);
        scanner.close();
    }
}

