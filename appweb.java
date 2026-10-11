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
                    System.out.println("Client : " + nom + " " + prenom + " (CIN : " + cin + ")");
                    System.out.println("N° de compte : " + nCompte);
                    System.out.println("Solde actuel : " + solde + " TND");
                    System.out.println("Plafond max : " + PLAFOND_RETRAIT + " TND");
                    break;

                case 2:
                    System.out.println("Effectuer un dépôt");
                    break;

                case 3:
                    System.out.println("Effectuer un retrait");
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

        
    
