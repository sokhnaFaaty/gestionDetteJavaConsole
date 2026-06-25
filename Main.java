import java.util.Scanner;

import entity.Client;
import entity.Dette;
import entity.Paiement;
import service.ClientService;
import service.DetteService;
import service.PaiementService;
import view.ClientView;
import view.DetteView;
import view.PaiementView;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ClientService cls = new ClientService();
    private static ClientView clv = new ClientView();
    private static DetteView dv = new DetteView();
    private static DetteService ds = new DetteService();
    private static PaiementView pv = new PaiementView();
    private static PaiementService ps = new PaiementService();

    public static void main(String[] args) {

        int choix = -1;
        while (choix != 0) {
            System.out.println("\n=== Gestion Dettes ===");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher les clients");
            System.out.println("3. Ajouter un dette a un client :");
            System.out.println("4. Afficher les dettes d'un client :");
            System.out.println("5. Afficher tout les dettes :");
            System.out.println("6. Ajouter un paiement a une dette :");
            System.out.println("7. Afficher tous les paiements :");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    Client client = clv.saisirClient();
                    cls.ajouterClient(client);
                    break;

                case 2:
                    clv.afficherAllClient(cls.listerClients());
                    break;

                case 3:
                    String num = clv.saisieTelephone();
                    Client cli = cls.findClientByTel(num);
                    if (cli != null) {
                        Dette dette = dv.saisieDette();
                        dette.setClient(cli);
                        cli.ajoutDette(dette);
                        ds.ajouterDette(dette);
                    } else {
                        System.out.println("ki ngay weur nekou fi !!!");
                    }
                    break;

                case 4:
                    String nume = clv.saisieTelephone();
                    Client clie = cls.findClientByTel(nume);
                    if (clie != null) {
                        dv.afficherDette(clie.getDettes());
                    } else {
                        System.out.println("ki ngay weur nekou fi !!!");
                    }
                    break;

                case 5:
                    dv.afficherDette(ds.listerDettes());
                    break;
                case 6:
                    if (ds.listerDettes().isEmpty()) {
                        System.out.println("Aucune dette enregistree.");
                        break;
                    }
                    dv.afficherDette(ds.listerDettes());
                    System.out.println("Entrer la date de la dette concernee :");
                    String dateDette = sc.nextLine();

                    Dette detteChoisie = null;
                    for (Dette d : ds.listerDettes()) {
                        if (d.getDate().equals(dateDette)) {
                            detteChoisie = d;
                            break;
                        }
                    }
                    if (detteChoisie != null) {
                        Paiement paiement = pv.saisiePaiement();
                        paiement.setDette(detteChoisie);
                        detteChoisie.ajoutPaiement(paiement);
                        ps.ajouterPaiement(paiement);
                        System.out.println("Solde restant : " + detteChoisie.getSolde());
                    } else {
                        System.out.println("Dette introuvable.");
                    }
                    break;

                case 7:
                    pv.afficherPaiements(ps.listerPaiements());
                    break;

                case 0:
                    System.out.println("Au revoir.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

    }
}