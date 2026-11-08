import java.util.Scanner;

public class voiture {

    private String marque;
    private String couleur;
    private double kilometrage;

    public voiture(String marque, String couleur, double kilometrage) {
        this.marque = marque;
        this.couleur = couleur;
        this.kilometrage = kilometrage;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void afficher() {
        System.out.println("Marque : " + marque);
        System.out.println("Couleur : " + couleur);
        System.out.println("Kilometrage : " + kilometrage + " km");
    }

    // Demande a l'utilisateur de saisir les donnees d'une voiture
    public static voiture saisir(Scanner sc, int numero) {
        System.out.println("--- Saisie de la voiture " + numero + " ---");
        System.out.print("Marque : ");
        String marque = sc.nextLine();
        System.out.print("Couleur : ");
        String couleur = sc.nextLine();
        System.out.print("Kilometrage : ");
        double kilometrage = sc.nextDouble();
        sc.nextLine(); // vider le retour a la ligne
        return new voiture(marque, couleur, kilometrage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        voiture v1 = saisir(sc, 1);
        voiture v2 = saisir(sc, 2);

        System.out.println();
        System.out.println("1 - Afficher voitures");
        System.out.println("2 - Calculer kilometrage");
        System.out.print("Votre choix : ");
        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                System.out.println("\n--- Voiture 1 ---");
                v1.afficher();
                System.out.println("\n--- Voiture 2 ---");
                v2.afficher();
                break;
            case 2:
                double somme = v1.getKilometrage() + v2.getKilometrage();
                System.out.println("Somme des kilometrages : " + somme + " km");
                break;
            default:
                System.out.println("Choix invalide !");
        }

        sc.close();
    }
}
