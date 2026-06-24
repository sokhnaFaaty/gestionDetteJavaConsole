package repository;

import entity.Dette;
import java.util.ArrayList;
import java.util.List;


public class DetteRepository {
    
    private static List<Dette> dettes = new ArrayList<>();


    public static void ajouterDette(Dette dette){
        dettes.add(dette);
    }

    public static void supprimerDette(Dette dette){
        dettes.remove(dette);
    }

    public static List<Dette> getDettes() {
        return dettes;
    }
}
