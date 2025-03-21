import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Écrire un programme en Java qui demande l'âge d'un enfant et permet d'informer de sa catégorie sachant que les catégories sont les suivantes:
        //"poussin de 6 a 7 ans"
        //"pupille de 8 a 9 ans "
        //"minime de 10 a 11 ans "
        //" cadet après 12 ans ".

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est votre age ? ");
        int age = scanner.nextInt();


            if(age >= 6 && age <= 7) {
                System.out.println("Vous êtes en catégorie poussin ");
            } else if (age >= 8 && age <= 9) {
                System.out.println("Vous êtes en catégorie pupille ");
            } else if (age >= 10 && age <= 11) {
                System.out.println("Vous êtes en catégorie minime ");
            } else if (age <= 12 &&  age >= 17) {
                System.out.println("Vous êtes en catégorie cadet ");
            } else {
                System.out.println("Vous avez pas de categorie car vous etes Adulte. ");
        }
    }
}

