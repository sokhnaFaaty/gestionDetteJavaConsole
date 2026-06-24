package view;

import java.util.Scanner;
import entity.Client;
import java.util.List;

public class ClientView {
    public static Scanner sc = new Scanner(System.in);
    private static int idGen = 1;

    public static Client saisirClient(){
        System.out.println("Entrer le nom du client :");
        String nom = sc.nextLine();
        System.out.println("Entrer le telephone du client");
        String tel = sc.nextLine();
        System.out.println("Entrer l'age du client :");
        int age = sc.nextInt();
        sc.nextLine();
        return new Client(idGen++,tel,nom,age);
    }


    public static void afficherAllClient(List<Client> clients){
        for (Client client : clients) {
            client.toChaine();
        }
    }

    public static String saisieTelephone(){
        System.out.println("Entrer le telephone du client");
        String tel = sc.nextLine();
        return tel;
    }

}
