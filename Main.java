import java.util.Scanner;

import entity.Client;
import entity.Dette;
import service.ClientService;
import service.DetteService;
import view.ClientView;
import view.DetteView;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ClientService cls = new ClientService();
    private static ClientView clv = new ClientView();
    private static DetteView dv = new DetteView();
    private static DetteService ds = new DetteService();



    public static void main(String[] args) {

        int choix = -1;
        while (choix != 0) {
            System.out.println("\n=== Gestion Dettes ===");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Afficher les clients");
            System.out.println("3. Ajouter un dette a un client :");
            System.out.println("4. Afficher les dettes d'un client :");
            System.out.println("5. Afficher tout les dettes :");
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
                    }else{
                        System.out.println("ki ngay weur nekou fi !!!");
                    }
                break;

                case 4:
                    String nume = clv.saisieTelephone();
                    Client clie = cls.findClientByTel(nume);
                    if (clie != null) {
                        dv.afficherDette(clie.getDettes());
                    }else{
                        System.out.println("ki ngay weur nekou fi !!!");
                    }
                    break;

                    case 5:
                        dv.afficherDette(ds.listerDettes());
                        break;



                case 0: System.out.println("Au revoir."); break;
                default: System.out.println("Choix invalide.");
            }
        }
        
    }
}