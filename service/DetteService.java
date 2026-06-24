package service;

import java.util.List;

import entity.Dette;
import repository.DetteRepository;

public class DetteService {
    
    public static void ajouterDette(Dette dette){
        DetteRepository.ajouterDette(dette);
    }

    public static List<Dette> listerDettes(){
        return DetteRepository.getDettes();
    }


}
