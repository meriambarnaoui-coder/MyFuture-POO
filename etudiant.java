import java.util.Scanner;

public class etudiant {
    private String codeE;
    private String nom;
    private String prenom;
    private int age;
    private String ville;

    static Scanner sc = new Scanner(System.in);
    public etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void saisirE() {
        System.out.print("Code : ");
        codeE = sc.nextLine();
        System.out.print("Nom : ");
        nom = sc.nextLine();
        System.out.print("Prénom : ");
        prenom = sc.nextLine();
        System.out.print("Age : ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Ville : ");
        ville = sc.nextLine();
    }

    public void afficherE() {
        System.out.println("Code : " + codeE + " | Nom : " + nom + " | Prénom : " + prenom
                + " | Age : " + age + " | Ville : " + ville);
    }

    public static void afficherMax(double[] tab) {
        double max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println("La plus grande note est : " + max);
    }

    public static void main(String[] args) {
        etudiant[] etudiants = new etudiant[3];
        for (int i = 0; i < etudiants.length; i++) {
            etudiants[i] = new etudiant("", "", "", 0, "");
        }
        double[] notes = new double[3];
        boolean saisi = false;

        int choix;
        do {
            System.out.println("\n===== Menu gestion étudiant =====");
            System.out.println("1) Saisir et affichage");
            System.out.println("2) Création et affichage des notes des étudiants");
            System.out.println("3) Quitter");
            System.out.print("Votre choix : ");
            choix = Integer.parseInt(sc.nextLine());

            switch (choix) {
                case 1:
                    for (int i = 0; i < etudiants.length; i++) {
                        System.out.println("\n--- Étudiant n°" + (i + 1) + " ---");
                        etudiants[i].saisirE();
                    }
                    saisi = true;
                    etudiants[0].setNom(etudiants[0].getNom().toUpperCase());
                    System.out.println("\nTest getter/setter : " + etudiants[0].getNom() + " " + etudiants[0].getPrenom());

                    System.out.println("\n--- Liste des étudiants ---");
                    for (int i = 0; i < etudiants.length; i++) {
                        etudiants[i].afficherE();
                    }
                    break;

                case 2:
                    if (!saisi) {
                        System.out.println("Veuillez d'abord saisir les étudiants (choix 1).");
                        break;
                    }
                    for (int i = 0; i < notes.length; i++) {
                        System.out.print("Note de " + etudiants[i].getNom() + " " + etudiants[i].getPrenom() + " : ");
                        notes[i] = Double.parseDouble(sc.nextLine());
                    }
                    System.out.println("\n--- Notes des étudiants ---");
                    for (int i = 0; i < notes.length; i++) {
                        System.out.println(etudiants[i].getNom() + " " + etudiants[i].getPrenom() + " : " + notes[i]);
                    }
                    afficherMax(notes);
                    break;

                case 3:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 3);

        sc.close();
    }
}

