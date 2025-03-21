public class Main {
    public static void main(String[] args) {


        // Écrire un programme en Java qui affiche la table de multiplication de 8. Utilisant la boucle  Do While.

        int i = 1;
        int table = 8;

        do{
            System.out.println(table + " x " + i + " = " + i * table);
            i++;
        } while (i <= 10);
    }
}