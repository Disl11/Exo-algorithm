import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Écrire un programme en Java permettant de  calculer la somme   S=1+2+3+...+ N,  où N saisi par l’utilisateur.  Utilisant la  boucle while.

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Veuillez saisir le chiffre que vous souhaiter pour calculer sa somme : " );
        int chiffre = scanner.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= chiffre){
           somme += i ;
           ++i;
        }
        System.out.println(" le resulta  de la somme " + chiffre +  " est " + somme);

        scanner.close();
    }
}