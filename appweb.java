import java.util.Scanner;

public class appweb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cin;
        String nom;
        String prenom;
        int nCompte;
        final double plafond_retrait = 500.00;

        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();
        System.out.println(cin);

        scanner.nextLine();

        System.out.println("Veuillez saisir le nom :");
        nom = scanner.nextLine();
        System.out.println(nom);

        System.out.println("Veuillez saisir le prenom :");
        prenom = scanner.nextLine();
        System.out.println(prenom);

        System.out.println("Veuillez saisir le numero de compte :");
        nCompte = scanner.nextInt();
        System.out.println(nCompte);

        int choix;

        do {

            System.out.println("1. Consulter compte");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Nom : " + nom);
                    System.out.println("Prenom : " + prenom);
                    System.out.println("CIN : " + cin);
                    System.out.println("N° compte : " + nCompte);
                    break;
            }

        } while (choix != 1);

        scanner.close();
    }
}