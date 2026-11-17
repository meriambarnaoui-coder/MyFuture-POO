import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {
        double[] moyenne = {10.50, 11.50, 14};
        for (int i = 0; i < 3; i++) {
            System.out.println(moyenne[i]);
        }
        System.out.println(moyenne.length);

        

        Scanner sc = new Scanner(System.in);
        double[] notes = new double[3];
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez le réel n°" + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }
        System.out.println("Valeurs saisies :");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i]);
        }
        sc.close();
        System.out.println("apres modification du tableau numero 1");
        moyenne[1] = 0;
        for (int i = 0; i < moyenne.length; i++) {
            System.out.println(moyenne[i]);
        }

        System.out.println("Somme des deux tableaux case par case :");
        for (int i = 0; i < moyenne.length; i++) {
            System.out.println( (moyenne[i] + notes[i]));
        }
    }
}
