package service;
 
import java.util.List;
 
import entity.Paiement;
import repository.PaiementRepository;
 
public class PaiementService {
 
    public static void ajouterPaiement(Paiement paiement){
        PaiementRepository.ajouterPaiement(paiement);
    }
 
    public static List<Paiement> listerPaiements(){
        return PaiementRepository.getPaiements();
    }
 
}
