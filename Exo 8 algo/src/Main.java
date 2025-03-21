import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Écrire un programme en Java qui permet de calculer la somme   S=1+2+3+4+….+ N.
        // où N saisi au clavier par l'utilisateur.Utilisant la boucle for .

        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la valeur N : ");
        int N = scanner.nextInt();

        int somme = 0;
        for ( int i = 1 ; i <= N ; ++i ){
            somme += i ;
        }
        System.out.println("La somme de le la valeur " + N + " est " + somme);
    }
}