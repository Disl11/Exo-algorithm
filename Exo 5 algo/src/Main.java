import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //  Écrire un programme en Java permettant d’afficher le mois en lettre selon le numéro saisi au clavier.
      //(  Si l’utilisateur tape 1 le programme affiche janvier,  si 2  affiche  février , si 3 affiche mars... )

        Scanner scanner = new Scanner(System.in);

        System.out.println("Taper le mois en chiffre que vous souhaitez : ");
        int mois = scanner.nextInt();

        switch (mois){
            case 1 :
                System.out.println("Janvier");
                break;
            case 2 :
                System.out.println("Fevrier");
                break;
            case 3 :
                System.out.println("Mars");
                break;
            case 4 :
                System.out.println("Avril");
                break;
            case 5 :
                System.out.println("Mai");
                break;
            case 6 :
                System.out.println("juin");
                break;
            case 7 :
                System.out.println("Juillet");
                break;
            case 8 :
                System.out.println("Aout");
                break;
            case 9 :
                System.out.println("Septembre");
                break;
            case 10 :
                System.out.println("Octobre");
                break;
            case 11 :
                System.out.println("Novembre");
                break;
            case 12 :
                System.out.println("Decembre");
                break;
            default :
                System.out.println("Mois invalide");

        }
    }
}