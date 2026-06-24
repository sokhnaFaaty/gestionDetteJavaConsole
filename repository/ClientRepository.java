package repository;

import entity.Client;
import java.util.ArrayList;
import java.util.List;


public class ClientRepository {
    
    private static List<Client> clients = new ArrayList<>();


    public static void ajouterClient(Client client){
        clients.add(client);
    }

    public static void supprimerClient(Client client){
        clients.remove(client);
    }

    public static List<Client> getClients() {
        return clients;
    }

    public static Client getClientByTelephone(String telephone){
        for (Client client : clients) {
            if(client.getTelephone().equals(telephone)){
                return client;
            }
        }
        return null;
    }

}
