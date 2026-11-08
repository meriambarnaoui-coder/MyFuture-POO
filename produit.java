import java.util.Scanner;

public class produit {

    private String reference;
    private String designation;
    private double prixHT;
    private int quantiteStock;

    public produit(String reference, String designation, double prixHT, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.quantiteStock = quantiteStock;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void afficherProduit() {
        System.out.println("[Réf: " + reference + "] " + designation
                + " | Prix HT: " + prixHT + " | Stock: " + quantiteStock);
    }

    public double calculerValeurStock() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrez le prix HT :");
        prixHT = scanner.nextDouble();

        System.out.println("entrez la quantite en stock :");
        quantiteStock = scanner.nextInt();

        return prixHT * quantiteStock;
    }

    public void appliquerRemise(double pourcentage) {
        if (pourcentage < 0 || pourcentage > 100) {
            System.out.println("Pourcentage invalide : il doit etre entre 0 et 100.");
            return;
        }
        prixHT = prixHT - (prixHT * pourcentage / 100);
    }

    public double calculerPrixTTC() {
        return prixHT * 1.20;
    }

    public static void main(String[] args) {
        produit p = new produit("P001", "Clavier", 45.5, 20);
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Afficher le produit");
            System.out.println("2 - Calculer le prix TTC");
            System.out.println("3 - Appliquer une remise");
            System.out.println("4 - Quitter");
            System.out.println("Votre choix :");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    p.afficherProduit();
                    break;
                case 2:
                    System.out.println("Prix TTC : " + p.calculerPrixTTC());
                    break;
                case 3:
                    System.out.println("entrez le pourcentage de remise :");
                    double pourcentage = scanner.nextDouble();
                    p.appliquerRemise(pourcentage);
                    System.out.println("Prix HT apres remise : " + p.getPrixHT());
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, tapez un nombre entre 1 et 4.");
            }
        } while (choix != 4);

        scanner.close();
    }
}
