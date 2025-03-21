import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Une boutique propose à ces clients, une réduction de 15% pour les montants d’achat supérieurs à 200 euros.
        //Écrire un programme en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le montant des achats ? ");
        double montantHT = scanner.nextInt();

        double TVA = 0.20;
        double reduction = 0.15;

        double montantTVA = montantHT * TVA;
        double totalTCC = montantHT + montantTVA;

        if (montantHT > 200){
            double montantTHavecReduction = montantHT * (1-reduction);
            double montantTVAavecreduction = montantTHavecReduction * TVA;
            double totalTCCAvecrReduction =  montantTHavecReduction + montantTVAavecreduction ;
            System.out.println("Vous avec une réduction de 15 % car votre montant depasse les 200 euros. Le total a payer est de " + totalTCCAvecrReduction ) ;
            } else {
            System.out.println("Le montant HT est de : " + montantHT + ". Une TVA de 20%. Le total TCC a payer est de " + totalTCC);
        }
    }
}