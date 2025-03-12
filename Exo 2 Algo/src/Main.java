import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.print("Veuillez saisir un nombre (ou tapez 'exit' pour quitter) : ");
            String saisie = scanner.nextLine();


            if (saisie.equalsIgnoreCase("exit")) {
                System.out.println("Fin du programme.");
                break;
            }

            try {

                int nombre = Integer.parseInt(saisie);


                System.out.println("Vous avez saisi le nombre : " + nombre);

                if (nombre > 0) {
                    System.out.println("Le nombre est positif.");
                } else if (nombre < 0) {
                    System.out.println("Le nombre est négatif.");
                } else {
                    System.out.println("Le nombre est zéro.");
                }

                if (nombre % 2 == 0) {
                    System.out.println("Le nombre est pair.");
                } else {
                    System.out.println("Le nombre est impair.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : La saisie n'est pas un nombre entier valide.");
            }
        }

            scanner.close();
    }
}
