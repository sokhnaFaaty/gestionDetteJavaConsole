package view;
 
import java.util.List;
import java.util.Scanner;
 
import entity.Paiement;
 
public class PaiementView {
 
    public Scanner sc = new Scanner(System.in);
 
    public Paiement saisiePaiement(){
        System.out.println("Entrer la date du paiement :");
        String date = sc.nextLine();
        System.out.println("Entrer le montant paye :");
        double montant = sc.nextDouble();
        sc.nextLine();
 
        return new Paiement(date, montant);
    }
 
    public void afficherPaiements(List<Paiement> paiements){
        for (Paiement paiement : paiements) {
            paiement.toChaine();
        }
    }
 
}
