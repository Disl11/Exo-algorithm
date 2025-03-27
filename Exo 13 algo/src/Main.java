import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Écrire un programme en Java qui  permet de saisir 10 entiers dans un tableau.
        // puis compter combien y a-t-il  d'éléments pairs et  impairs

        System.out.println("Entre les valeurs N :");

        Scanner sc = new Scanner(System.in);

        int [] tableau = new int [10];

        for(int i = 0 ; i < tableau.length; ++i){
            System.out.println("Valeur " + (i + 1) + " :");
             tableau[i] =  sc.nextInt();
        }

        int nbrPair = 0;
        int nbrImpair = 0;

        for (int j = 0; j < tableau.length ; ++j) {
            if (tableau[j] % 2 == 0) {
                nbrPair++;
            } else {
                nbrImpair++;
            }
        }

        System.out.println("Il y a : " + nbrPair +  " Nombres Pairs");
        System.out.println("Il y a  " + nbrImpair + " Nombres impairs ");

        sc.close();
    }
}

