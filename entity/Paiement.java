package entity;
 
public class Paiement {
 
    private String date;
    private double montant;
    private Dette dette;
 
    public Paiement(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }
 
    public String getDate() {
        return date;
    }
 
    public double getMontant() {
        return montant;
    }
 
    public Dette getDette() {
        return dette;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
 
    public void setMontant(double montant) {
        this.montant = montant;
    }
 
    public void setDette(Dette dette) {
        this.dette = dette;
    }
 
    public void toChaine() {
        System.out.println("Date :" + this.date + " " + "Montant paye :" + this.montant);
    }
 
}
