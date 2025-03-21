import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Écrire un programme en Java  permettant de saisir 10 notes et qui affiche la moyenne de ces notes.

        Scanner sc = new Scanner(System.in);

        float[]notes  = new float[11];
        float som = 0;
        for(int i = 1; i <= 10 ; ++i){
            System.out.println("Entre la note " + i + " : ");
            notes[i] = sc.nextFloat();
            som = som + notes[i];
        }
        System.out.println(" La moyenne est " + som/10);
    }
}
