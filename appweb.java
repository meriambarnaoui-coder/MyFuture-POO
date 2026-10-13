import java.util.Scanner;

public class appweb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("entrez le CIN :");
        String cin = scanner.nextLine();

        System.out.println("entrez le nom :");
        String nom = scanner.nextLine();

        System.out.println("entrez le prenom :");
        String prenom = scanner.nextLine();

        System.out.println("entrez le telephone :");
        String telephone = scanner.nextLine();

        Client client = new Client(cin, nom, prenom, telephone);

        System.out.println("entrez le numero de compte :");
        String nCompte = scanner.nextLine();

        System.out.println("entrez le solde initial (tnd)");
        double solde = scanner.nextDouble();

        final double PLAFOND_RETRAIT = 500.00;

        int choix;

        do {
            System.out.println("\n--- Menu banksmart ---");
            System.out.println("1. Consulter le compte");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.println("Votre choix (1-4) :");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    client.afficherClient();
                    System.out.println("N° de compte : " + nCompte);
                    System.out.println("Solde actuel : " + solde + " TND");
                    System.out.println("Plafond max : " + PLAFOND_RETRAIT + " TND");
                    break;

                case 2:
                    System.out.println("Montant du dépôt (tnd) :");
                    double depot = scanner.nextDouble();
                    if (depot <= 0) {
                        System.out.println("Montant invalide !");
                    } else {
                        solde += depot;
                        System.out.println("Dépôt effectué. Nouveau solde : " + solde + " TND");
                    }
                    break;

                case 3:
                    System.out.println("Montant du retrait (tnd) :");
                    double retrait = scanner.nextDouble();
                    if (retrait <= 0) {
                        System.out.println("Montant invalide !");
                    } else if (retrait > PLAFOND_RETRAIT) {
                        System.out.println("Retrait refusé : plafond de " + PLAFOND_RETRAIT + " TND dépassé.");
                    } else if (retrait > solde) {
                        System.out.println("Retrait refusé : solde insuffisant.");
                    } else {
                        solde -= retrait;
                        System.out.println("Retrait effectué. Nouveau solde : " + solde + " TND");
                    }
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");

            }

        } while (choix != 4);

        scanner.close();
    }
}
