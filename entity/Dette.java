package entity;

public class Dette {

    private String date;
    private double montant;
    private Client client;

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

    public void toChiane() {
        System.out.println("Date :" + this.date + " " +"Montant :" + this.montant + " " + this.client.getNom() + " " + this.client.getTelephone());
    }
    
}
