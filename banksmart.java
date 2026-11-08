import java.util.Scanner;

public class BankSmartPrep {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables pour le client et le compte
        String cin;
        String nom;
        String prenom;
        String numeroCompte;
        double solde;
        final double PLAFOND_RETRAIT = 500.0;

        // Saisie des données initiales
        System.out.print("Entrez le CIN : ");
        cin = scanner.nextLine();

        System.out.print("Entrez le Nom : ");
        nom = scanner.nextLine();

        System.out.print("Entrez le Prénom : ");
        prenom = scanner.nextLine();

        System.out.print("Entrez le Numéro de Compte : ");
        numeroCompte = scanner.nextLine();

        System.out.print("Entrez le Solde Initial (TND) : ");
        solde = scanner.nextDouble();

        int choix;

        // Boucle principale du menu
        do {
            System.out.println("\n--- MENU BANKSMART ---");
            System.out.println("1. Consulter le compte");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.print("Votre choix (1-4) : ");
            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("\nClient : " + nom + " " + prenom + " (CIN: " + cin + ")");
                    System.out.println("N° de Compte : " + numeroCompte);
                    System.out.println("Solde Actuel : " + solde + " TND");
                    System.out.println("Plafond Max : " + PLAFOND_RETRAIT + " TND");
                    break;

                case 2:
                    System.out.print("\nMontant du dépôt (TND) : ");
                    double montantDepot = scanner.nextDouble();
                    if (montantDepot > 0) {
                        solde += montantDepot;
                        System.out.println("Dépôt réussi. Nouveau solde : " + solde + " TND");
                    } else {
                        System.out.println("Erreur : Le montant doit être supérieur à 0.");
                    }
                    break;

                case 3:
                    System.out.print("\nMontant du retrait (TND) : ");
                    double montantRetrait = scanner.nextDouble();
                    if (montantRetrait <= 0) {
                        System.out.println("Erreur : Le montant doit être supérieur à 0.");
                    } else if (montantRetrait > PLAFOND_RETRAIT) {
                        System.out.println("Retrait refusé : Dépassement du plafond de " + PLAFOND_RETRAIT + " TND.");
                    } else if (montantRetrait > solde) {
                        System.out.println("Retrait refusé : Solde insuffisant (" + solde + " TND disponibles).");
                    } else {
                        solde -= montantRetrait;
                        System.out.println("Retrait réussi. Nouveau solde : " + solde + " TND");
                    }
                    break;

                case 4:
                    System.out.println("\nMerci d'avoir utilisé BankSmart App. Au revoir !");
                    break;

                default:
                    System.out.println("Choix incorrect, veuillez choisir entre 1 et 4.");
            }

        } while (choix != 4);

        scanner.close();
    }
}