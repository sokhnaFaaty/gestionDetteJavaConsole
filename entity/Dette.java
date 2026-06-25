package entity;

import java.util.ArrayList;
import java.util.List;

public class Dette {

    private String date;
    private double montant;
    private Client client;
        private List<Paiement> paiements = new ArrayList<>();

    public Dette (String date, double montant){
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public List<Paiement> getPaiements() {
        return this.paiements;
    }
 
    public void ajoutPaiement(Paiement paiement) {
        this.paiements.add(paiement);
    }
 
    public double getSolde() {
        double totalPaye = 0;
        for (Paiement paiement : this.paiements) {
            totalPaye += paiement.getMontant();
        }
        return this.montant - totalPaye;
    }

    public void toChiane() {
        System.out.println("Date :" + this.date + " " +"Montant :" + this.montant + " " + this.client.getNom() + " " + this.client.getTelephone()+ " " + "Solde :" + this.getSolde());
    }
    
}
