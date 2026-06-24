package entity;

import java.util.ArrayList;
import java.util.List;


public class Client {
    
    private int id;
    private String telephone;
    private String nom;
    private int age;
    private List<Dette> dettes = new ArrayList<>();

    public Client(int id, String telephone, String nom, int age) {
        this.id = id;
        this.telephone = telephone;
        this.nom = nom;
        this.age = age;
    }

    public Client(){

    }

    public int getId()             { return id; }
    public String getTelephone() {
        return telephone;
    }
    public String getNom()         { return nom; }
    public int getAge()            { return age; }

    public List<Dette> getDettes() {
        return this.dettes;
    }

    public void ajoutDette(Dette dette) {
        this.dettes.add(dette);
    }

    public void setId(int id)              { this.id = id; }
    public void setMatricule(String m)     { this.telephone = m; }
    public void setNom(String nom)         { this.nom = nom; }
    public void setAge(int age)            { this.age = age; }

    public void toChaine() {
        System.out.println("id=" + this.id + ", telephone=" + this.telephone + ", nom=" + this.nom + ", age=" + this.age);
    }


}
