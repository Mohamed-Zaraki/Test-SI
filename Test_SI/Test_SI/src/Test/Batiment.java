package Test;

import java.util.ArrayList;
import java.util.List;

class Batiment {
    private String nom;
    public List<Salle> salles;

    public Batiment(String nom) {

        this.nom = nom;
        this.salles = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void ajouterSalle(Salle salle) {
        salles.add(salle);
    }
}
