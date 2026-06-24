package service;

import java.util.List;

import entity.Client;
import repository.ClientRepository;

public class ClientService {
    
    public static void ajouterClient(Client client){
        ClientRepository.ajouterClient(client);
    }

    public static boolean supprimerClient(Client client){
        if(client != null){
            ClientRepository.supprimerClient(client);
            return true;
        }
        return false;
    }

    public static List<Client> listerClients(){
        return ClientRepository.getClients();
    }

    public static Client findClientByTel(String telephone){
        return ClientRepository.getClientByTelephone(telephone);
    }

}
