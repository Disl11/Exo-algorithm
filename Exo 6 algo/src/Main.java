public class Main {
    public static void main(String[] args) {

       // Écrire un programme en Java qui permet  d'afficher  le message   "Bonsoir"  10 fois. Utilisant la boucle while.

        int i = 1;
        int nbr = 1;
        while (i <= 10 &&  nbr <= 10){
            System.out.println( nbr + " : Bonsoir" );
            ++i;
            ++nbr;
        }
    }
}