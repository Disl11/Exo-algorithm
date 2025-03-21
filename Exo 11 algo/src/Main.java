import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Écrire un programme en Java permettant de saisir 10 entiers et de les stocker dans un tableau nommé Tableau, puis les afficher


        Scanner scanner = new Scanner(System.in);

        int [] tableau = new int[10];
        System.out.println("Veuillez saisir 10 entiers :");
        for (int i = 0; i < 10; i++) {
            System.out.print("Entier " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("\nLes entiers saisis sont :");
        for (int i = 0; i < 10; i++) {
            System.out.println("Entier " + (i + 1) + ": " + tableau[i]);
        }


        scanner.close();

    }
}