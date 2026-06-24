package view;

import java.util.List;
import java.util.Scanner;

import entity.Dette;

public class DetteView {

    public Scanner sc = new Scanner(System.in);
    
    public Dette saisieDette(){
        System.out.println("Entrer la date :");
        String date = sc.nextLine();
        System.out.println("Entrer le montant de la dette :");
        double montant = sc.nextDouble();

        return new Dette(date, montant);
    }

    public void afficherDette(List<Dette> dettes){
        for (Dette dette : dettes) {
            dette.toChiane();
        }
    }

    

}

