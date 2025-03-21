import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Écrire un programme en Java qui permet d'afficher la table de multiplication d’un
        // entier saisie par l’utilisateur,  Utilisant la boucle For.

        Scanner sc = new Scanner(System.in);

        System.out.println(" Veuillez saisir la table de multiplication que vous souhaiter : ");
        int N = sc.nextInt();


        for(int i = 1 ; i <= 10 ; ++i){
            System.out.println( N + " x " + i + " = " +  N * i);
        }


    }
}