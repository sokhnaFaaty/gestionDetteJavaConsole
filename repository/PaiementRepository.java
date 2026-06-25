package repository;
 
import entity.Paiement;
import java.util.ArrayList;
import java.util.List;
 
 
public class PaiementRepository {
 
    private static List<Paiement> paiements = new ArrayList<>();
 
 
    public static void ajouterPaiement(Paiement paiement){
        paiements.add(paiement);
    }
 
    public static void supprimerPaiement(Paiement paiement){
        paiements.remove(paiement);
    }
 
    public static List<Paiement> getPaiements() {
        return paiements;
    }
}
